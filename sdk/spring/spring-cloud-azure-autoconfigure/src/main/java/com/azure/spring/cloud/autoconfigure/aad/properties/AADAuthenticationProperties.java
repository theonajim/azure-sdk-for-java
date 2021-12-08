// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.aad.properties;

import com.nimbusds.jose.jwk.source.RemoteJWKSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.azure.spring.cloud.autoconfigure.aad.implementation.oauth2.AADClientRegistrationRepository.AZURE_CLIENT_REGISTRATION_ID;
import static com.azure.spring.cloud.autoconfigure.aad.properties.AADApplicationType.inferApplicationTypeByDependencies;
import static com.azure.spring.cloud.autoconfigure.aad.properties.AADAuthorizationGrantType.AUTHORIZATION_CODE;
import static com.azure.spring.cloud.autoconfigure.aad.properties.AADAuthorizationGrantType.AZURE_DELEGATED;
import static com.azure.spring.cloud.autoconfigure.aad.properties.AADAuthorizationGrantType.ON_BEHALF_OF;

/**
 * Configuration properties for Azure Active Directory Authentication.
 */
public class AADAuthenticationProperties implements InitializingBean {

    public static final String PREFIX = "spring.cloud.azure.active-directory";

    private static final Logger LOGGER = LoggerFactory.getLogger(AADAuthenticationProperties.class);
    private static final long DEFAULT_JWK_SET_CACHE_LIFESPAN = TimeUnit.MINUTES.toMillis(5);
    private static final long DEFAULT_JWK_SET_CACHE_REFRESH_TIME = DEFAULT_JWK_SET_CACHE_LIFESPAN;

    /**
     * Profile of Azure cloud environment.
     */
    @NestedConfigurationProperty
    private AADProfileProperties profile = new AADProfileProperties();

    /**
     * Properties used for authorize.
     */
    @NestedConfigurationProperty
    private AADCredentialProperties credential = new AADCredentialProperties();


    /**
     * Default UserGroup configuration.
     */
    private UserGroupProperties userGroup = new UserGroupProperties();

    /**
     * Decide which claim to be principal's name.
     */
    private String userNameAttribute;

    /**
     * Redirection Endpoint: Used by the authorization server to return responses containing authorization credentials
     * to the client via the resource owner user-agent.
     */
    private String redirectUriTemplate = "{baseUrl}/login/oauth2/code/";

    /**
     * App ID URI which might be used in the <code>"aud"</code> claim of an <code>id_token</code>.
     */
    private String appIdUri;

    /**
     * Add additional parameters to the Authorization URL.
     */
    private Map<String, Object> authenticateAdditionalParameters;

    /**
     * Connection Timeout for the JWKSet Remote URL call.
     */
    private int jwtConnectTimeout = RemoteJWKSet.DEFAULT_HTTP_CONNECT_TIMEOUT; /* milliseconds */

    /**
     * Read Timeout for the JWKSet Remote URL call.
     */
    private int jwtReadTimeout = RemoteJWKSet.DEFAULT_HTTP_READ_TIMEOUT; /* milliseconds */

    /**
     * Size limit in Bytes of the JWKSet Remote URL call.
     */
    private int jwtSizeLimit = RemoteJWKSet.DEFAULT_HTTP_SIZE_LIMIT; /* bytes */

    /**
     * The lifespan of the cached JWK set before it expires, default is 5 minutes.
     */
    private long jwkSetCacheLifespan = DEFAULT_JWK_SET_CACHE_LIFESPAN;

    /**
     * The refresh time of the cached JWK set before it expires, default is 5 minutes.
     */
    private long jwkSetCacheRefreshTime = DEFAULT_JWK_SET_CACHE_REFRESH_TIME;

    private String postLogoutRedirectUri;

    /**
     * If Telemetry events should be published to Azure AD.
     */
    private boolean allowTelemetry = true;

    /**
     * If true activates the stateless auth filter AADAppRoleStatelessAuthenticationFilter. The
     * default is false which activates AADAuthenticationFilter.
     */
    private Boolean sessionStateless = false;

    private Map<String, AuthorizationClientProperties> authorizationClients = new HashMap<>();

    private AADApplicationType applicationType;

    /**
     *
     * @return The AADProfileProperties.
     */
    public AADProfileProperties getProfile() {
        return profile;
    }

    /**
     *
     * @param profile The AADProfileProperties
     */
    public void setProfile(AADProfileProperties profile) {
        this.profile = profile;
    }

    /**
     *
     * @param credential The AADCredentialProperties
     */
    public void setCredential(AADCredentialProperties credential) {
        this.credential = credential;
    }

    /**
     *
     * @return The AADCredentialProperties.
     */
    public AADCredentialProperties getCredential() {
        return credential;
    }

    /**
     * Gets the AADApplicationType.
     *
     * @return the AADApplicationType
     */
    public AADApplicationType getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the AADApplicationType.
     *
     * @param applicationType the AADApplicationType
     */
    public void setApplicationType(AADApplicationType applicationType) {
        this.applicationType = applicationType;
    }

    /**
     * Gets the list of Active Directory groups.
     *
     * @return the list of Active Directory groups
     */
    @DeprecatedConfigurationProperty(
        reason = "Configuration moved to UserGroup class to keep UserGroup properties together",
        replacement = "spring.cloud.azure.active-directory.user-group.allowed-group-names")
    public List<String> getActiveDirectoryGroups() {
        return userGroup.getAllowedGroups();
    }

    /**
     * Properties dedicated to changing the behavior of how the groups are mapped from the Azure AD response. Depending
     * on the graph API used the object will not be the same.
     */
    public static class UserGroupProperties {

        private final Log logger = LogFactory.getLog(UserGroupProperties.class);

        /**
         * Expected UserGroups that an authority will be granted to if found in the response from the MemberOf Graph
         * API Call.
         */
        private List<String> allowedGroupNames = new ArrayList<>();

        private Set<String> allowedGroupIds = new HashSet<>();

        private Boolean useTransitiveMembers = false;

        /**
         * enableFullList is used to control whether to list all group id, default is false
         */
        private Boolean enableFullList = false;

        /**
         * Gets the set of allowed group IDs.
         *
         * @return the set of allowed group IDs
         */
        public Set<String> getAllowedGroupIds() {
            return allowedGroupIds;
        }

        /**
         * Set the allowed group ids.
         *
         * @param allowedGroupIds Allowed group ids.
         */
        public void setAllowedGroupIds(Set<String> allowedGroupIds) {
            this.allowedGroupIds = allowedGroupIds;
        }

        /**
         * Gets the list of allowed group names.
         *
         * @return the list of allowed group names
         */
        public List<String> getAllowedGroupNames() {
            return allowedGroupNames;
        }

        /**
         * Sets the list of allowed group names.
         *
         * @param allowedGroupNames the list of allowed group names
         */
        public void setAllowedGroupNames(List<String> allowedGroupNames) {
            this.allowedGroupNames = allowedGroupNames;
        }

        /**
         * Whether full list is enabled.
         *
         * @return whether full list is enabled
         * @deprecated Use 'allowed-group-ids: all'
         */
        @Deprecated
        @DeprecatedConfigurationProperty(
            reason = "enable-full-list is not easy to understand.",
            replacement = "allowed-group-ids: all")
        public Boolean getEnableFullList() {
            return enableFullList;
        }

        /**
         * Sets whether full list is enabled.
         *
         * @param enableFullList whether full list is enabled
         * @deprecated Use 'azure.activedirectory.user-group.allowed-group-ids: all'
         */
        @Deprecated
        public void setEnableFullList(Boolean enableFullList) {
            logger.warn(" 'spring.cloud.azure.active-directory.user-group.enable-full-list' property detected! "
                + "Use 'spring.cloud.azure.active-directory.user-group.allowed-group-ids: all' instead!");
            this.enableFullList = enableFullList;
        }

        /**
         * Gets the list of allowed groups.
         *
         * @return the list of allowed groups
         * @deprecated Use 'azure.activedirectory.user-group.allowed-group-names'
         */
        @Deprecated
        @DeprecatedConfigurationProperty(
            reason = "In order to distinguish between allowed-group-ids and allowed-group-names, set allowed-groups "
                + "deprecated.",
            replacement = "spring.cloud.azure.active-directory.user-group.allowed-group-names")
        public List<String> getAllowedGroups() {
            return allowedGroupNames;
        }

        /**
         * Sets the list of allowed groups.
         *
         * @param allowedGroups the list of allowed groups
         * @deprecated Use 'azure.activedirectory.user-group.allowed-group-names'
         */
        @Deprecated
        public void setAllowedGroups(List<String> allowedGroups) {
            logger.warn(" 'spring.cloud.azure.active-directory.user-group.allowed-groups' property detected! "
                + " Use 'azure.activedirectory.user-group.allowed-group-names' instead!");
            this.allowedGroupNames = allowedGroups;
        }

        public Boolean getUseTransitiveMembers() {
            return useTransitiveMembers;
        }

        public void setUseTransitiveMembers(Boolean useTransitiveMembers) {
            this.useTransitiveMembers = useTransitiveMembers;
        }

    }

    /**
     * Whether allowed group names is configured.
     *
     * @return whether allowed group names is configured
     */
    public boolean allowedGroupNamesConfigured() {
        return Optional.of(this.getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupNames)
                       .map(allowedGroupNames -> !allowedGroupNames.isEmpty())
                       .orElse(false);
    }

    /**
     * Whether allowed group IDs is configured.
     *
     * @return whether allowed group IDs is configured
     */
    public boolean allowedGroupIdsConfigured() {
        return Optional.of(this.getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupIds)
                       .map(allowedGroupIds -> !allowedGroupIds.isEmpty())
                       .orElse(false);
    }

    /**
     * Gets the user group properties.
     *
     * @return the user group properties
     */
    public UserGroupProperties getUserGroup() {
        return userGroup;
    }

    /**
     * Sets the user group properties.
     *
     * @param userGroup the user group properties
     */
    public void setUserGroup(UserGroupProperties userGroup) {
        this.userGroup = userGroup;
    }

    /**
     * Gets the username attribute.
     *
     * @return the username attribute
     */
    public String getUserNameAttribute() {
        return userNameAttribute;
    }

    /**
     * Sets the username attribute.
     *
     * @param userNameAttribute the username attribute
     */
    public void setUserNameAttribute(String userNameAttribute) {
        this.userNameAttribute = userNameAttribute;
    }

    /**
     * Gets the redirect URI template.
     *
     * @return the redirect URI template
     */
    public String getRedirectUriTemplate() {
        return redirectUriTemplate;
    }

    /**
     * Sets the redirect URI template.
     *
     * @param redirectUriTemplate the redirect URI template
     */
    public void setRedirectUriTemplate(String redirectUriTemplate) {
        this.redirectUriTemplate = redirectUriTemplate;
    }

    /**
     * Sets the list of Active Directory groups.
     *
     * @param activeDirectoryGroups the list of Active Directory groups
     * @deprecated deprecated
     */
    @Deprecated
    public void setActiveDirectoryGroups(List<String> activeDirectoryGroups) {
        this.userGroup.setAllowedGroups(activeDirectoryGroups);
    }

    /**
     * Gets the App ID URI.
     *
     * @return the App ID URI
     */
    public String getAppIdUri() {
        return appIdUri;
    }

    /**
     * Sets the App ID URI.
     *
     * @param appIdUri the App ID URI
     */
    public void setAppIdUri(String appIdUri) {
        this.appIdUri = appIdUri;
    }

    /**
     * Gets the additional authenticate parameters.
     *
     * @return the additional authenticate parameters
     */
    public Map<String, Object> getAuthenticateAdditionalParameters() {
        return authenticateAdditionalParameters;
    }

    /**
     * Sets the additional authenticate parameters.
     *
     * @param authenticateAdditionalParameters the additional authenticate parameters
     */
    public void setAuthenticateAdditionalParameters(Map<String, Object> authenticateAdditionalParameters) {
        this.authenticateAdditionalParameters = authenticateAdditionalParameters;
    }

    /**
     * Gets the JWT connect timeout.
     *
     * @return the JWT connect timeout
     */
    public int getJwtConnectTimeout() {
        return jwtConnectTimeout;
    }

    /**
     * Sets the JWT connect timeout.
     *
     * @param jwtConnectTimeout the JWT connect timeout
     */
    public void setJwtConnectTimeout(int jwtConnectTimeout) {
        this.jwtConnectTimeout = jwtConnectTimeout;
    }

    /**
     * Gets the JWT read timeout.
     *
     * @return the JWT read timeout
     */
    public int getJwtReadTimeout() {
        return jwtReadTimeout;
    }

    /**
     * Sets the JWT read timeout.
     *
     * @param jwtReadTimeout the JWT read timeout
     */
    public void setJwtReadTimeout(int jwtReadTimeout) {
        this.jwtReadTimeout = jwtReadTimeout;
    }

    /**
     * Gets the JWT size limit.
     *
     * @return the JWT size limit
     */
    public int getJwtSizeLimit() {
        return jwtSizeLimit;
    }

    /**
     * Sets the JWT size limit.
     *
     * @param jwtSizeLimit the JWT size limit
     */
    public void setJwtSizeLimit(int jwtSizeLimit) {
        this.jwtSizeLimit = jwtSizeLimit;
    }

    /**
     * Gets the JWK set cache lifespan.
     *
     * @return the JWK set cache lifespan
     */
    public long getJwkSetCacheLifespan() {
        return jwkSetCacheLifespan;
    }

    /**
     * Sets the JWK set cache lifespan.
     *
     * @param jwkSetCacheLifespan the JWT set cache lifespan
     */
    public void setJwkSetCacheLifespan(long jwkSetCacheLifespan) {
        this.jwkSetCacheLifespan = jwkSetCacheLifespan;
    }

    /**
     * Gets the JWK set cache refresh time.
     *
     * @return the JWK set cache refresh time
     */
    public long getJwkSetCacheRefreshTime() {
        return jwkSetCacheRefreshTime;
    }

    /**
     * Sets the JWK set cache refresh time.
     *
     * @param jwkSetCacheRefreshTime the JWK set cache refresh time
     */
    public void setJwkSetCacheRefreshTime(long jwkSetCacheRefreshTime) {
        this.jwkSetCacheRefreshTime = jwkSetCacheRefreshTime;
    }

    /**
     * Gets the post logout redirect URI.
     *
     * @return the post logout redirect URI
     */
    public String getPostLogoutRedirectUri() {
        return postLogoutRedirectUri;
    }

    /**
     * Set the post logout redirect URI.
     *
     * @param postLogoutRedirectUri the post logout redirect URI
     */
    public void setPostLogoutRedirectUri(String postLogoutRedirectUri) {
        this.postLogoutRedirectUri = postLogoutRedirectUri;
    }

    /**
     * Whether telemetry is allowed.
     *
     * @return whether telemetry is allowed
     * @deprecated Determined by HTTP header User-Agent instead
     */
    @Deprecated
    @DeprecatedConfigurationProperty(
        reason = "Deprecate the telemetry endpoint and use HTTP header User Agent instead.")
    public boolean isAllowTelemetry() {
        return allowTelemetry;
    }

    /**
     * Sets whether telemetry is allowed.
     *
     * @param allowTelemetry whether telemetry is allowed
     */
    public void setAllowTelemetry(boolean allowTelemetry) {
        this.allowTelemetry = allowTelemetry;
    }

    /**
     * Whether the session is stateless.
     *
     * @return whether the session is stateless
     */
    public Boolean getSessionStateless() {
        return sessionStateless;
    }

    /**
     * Sets whether the session is stateless.
     *
     * @param sessionStateless whether the session is stateless
     */
    public void setSessionStateless(Boolean sessionStateless) {
        this.sessionStateless = sessionStateless;
    }

    /**
     *
     * @return Graph membership uri.
     */
    public String getGraphMembershipUri() {
        return getProfile().getEnvironment().getMicrosoftGraphEndpoint()
            + (getUserGroup().getUseTransitiveMembers()
                ? "v1.0/me/transitiveMemberOf"
                : "v1.0/me/memberOf");
    }

    /**
     * Gets the authorization clients.
     *
     * @return the authorization clients
     */
    public Map<String, AuthorizationClientProperties> getAuthorizationClients() {
        return authorizationClients;
    }

    /**
     * Sets the authorization clients.
     *
     * @param authorizationClients the authorization clients
     */
    public void setAuthorizationClients(Map<String, AuthorizationClientProperties> authorizationClients) {
        this.authorizationClients = authorizationClients;
    }

    /**
     * Whether the group is allowed.
     *
     * @param group the group
     * @return whether the group is allowed
     */
    public boolean isAllowedGroup(String group) {
        return Optional.ofNullable(getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupNames)
                       .orElseGet(Collections::emptyList)
                       .contains(group)
            || Optional.ofNullable(getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupIds)
                       .orElseGet(Collections::emptySet)
                       .contains(group);
    }

    @Override
    public void afterPropertiesSet() {
        if (!StringUtils.hasText(getProfile().getTenantId())) {
            this.getProfile().setTenantId("common");
        }
        validateProperties();
    }

    private void validateProperties() {

        Set<String> allowedGroupIds = userGroup.getAllowedGroupIds();
        if (allowedGroupIds.size() > 1 && allowedGroupIds.contains("all")) {
            throw new IllegalStateException("When spring.cloud.azure.active-directory.user-group.allowed-group-ids "
                + "contains 'all', no other group ids can be configured. "
                + "But actually spring.cloud.azure.active-directory.user-group.allowed-group-ids="
                + allowedGroupIds);
        }

        validateTenantId();
        validateApplicationType(); // This must before validateAuthorizationClients().
        validateAuthorizationClients();
    }

    private void validateAuthorizationClients() {
        authorizationClients.forEach(this::validateAuthorizationClientProperties);
    }

    private void validateTenantId() {
        if (isMultiTenantsApplication(getProfile().getTenantId()) && !userGroup.getAllowedGroups().isEmpty()) {
            throw new IllegalStateException("When spring.cloud.azure.active-directory.profile.tenant-id is "
                + "'common/organizations/consumers', "
                + "spring.cloud.azure.active-directory.user-group.allowed-groups/allowed-group-names should be empty. "
                + "But actually spring.cloud.azure.active-directory.profile.tenant-id=" + getProfile().getTenantId()
                + ", and spring.cloud.azure.active-directory.user-group.allowed-groups/allowed-group-names="
                + userGroup.getAllowedGroups());
        }

        if (isMultiTenantsApplication(getProfile().getTenantId()) && !userGroup.getAllowedGroupIds().isEmpty()) {
            throw new IllegalStateException("When spring.cloud.azure.active-directory.profile.tenant-id is "
                + "'common/organizations/consumers', "
                + "spring.cloud.azure.active-directory.user-group.allowed-group-ids should be empty. "
                + "But actually spring.cloud.azure.active-directory.profile.tenant-id=" + getProfile().getTenantId()
                + ", and spring.cloud.azure.active-directory.user-group.allowed-group-ids=" + userGroup.getAllowedGroupIds());
        }
    }

    /**
     * Validate configured application type or set default value.
     *
     * @throws IllegalStateException Invalid property 'spring.cloud.azure.active-directory.application-type'
     */
    private void validateApplicationType() {
        AADApplicationType inferred = inferApplicationTypeByDependencies();
        if (applicationType != null) {
            if (!isValidApplicationType(applicationType, inferred)) {
                throw new IllegalStateException(
                    "Invalid property 'spring.cloud.azure.active-directory.application-type', the configured value is '"
                        + applicationType.getValue() + "', " + "but the inferred value is '"
                        + inferred.getValue() + "'.");
            }
        } else {
            applicationType = inferred;
        }
    }

    private boolean isValidApplicationType(AADApplicationType configured, AADApplicationType inferred) {
        return inferred == configured || inferred == AADApplicationType.RESOURCE_SERVER_WITH_OBO;
    }

    private void validateAuthorizationClientProperties(String registrationId,
                                                       AuthorizationClientProperties properties) {
        String grantType = Optional.of(properties)
                                   .map(AuthorizationClientProperties::getAuthorizationGrantType)
                                   .map(AADAuthorizationGrantType::getValue)
                                   .orElse(null);
        if (null == grantType) {
            // Set default value for authorization grant grantType
            switch (applicationType) {
                case WEB_APPLICATION:
                    if (properties.isOnDemand() || registrationId.equals(AZURE_CLIENT_REGISTRATION_ID)) {
                        properties.setAuthorizationGrantType(AUTHORIZATION_CODE);
                    } else {
                        properties.setAuthorizationGrantType(AZURE_DELEGATED);
                    }
                    LOGGER.debug("The client '{}' sets the default value of AADAuthorizationGrantType to "
                        + "'authorization_code'.", registrationId);
                    break;
                case RESOURCE_SERVER:
                case RESOURCE_SERVER_WITH_OBO:
                    properties.setAuthorizationGrantType(AADAuthorizationGrantType.ON_BEHALF_OF);
                    LOGGER.debug("The client '{}' sets the default value of AADAuthorizationGrantType to "
                        + "'on_behalf_of'.", registrationId);
                    break;
                case WEB_APPLICATION_AND_RESOURCE_SERVER:
                    throw new IllegalStateException("spring.cloud.azure.active-directory.authorization-clients." + registrationId
                        + ".authorization-grant-grantType must be configured. ");
                default:
                    throw new IllegalStateException("Unsupported authorization grantType " + applicationType.getValue());
            }
        } else {
            // Validate authorization grant grantType
            switch (applicationType) {
                case WEB_APPLICATION:
                    if (ON_BEHALF_OF.getValue().equals(grantType)) {
                        throw new IllegalStateException("When 'spring.cloud.azure.active-directory.application-type=web_application',"
                            + " 'spring.cloud.azure.active-directory.authorization-clients." + registrationId
                            + ".authorization-grant-type' can not be 'on_behalf_of'.");
                    }
                    break;
                case RESOURCE_SERVER:
                    if (AUTHORIZATION_CODE.getValue().equals(grantType)) {
                        throw new IllegalStateException("When 'spring.cloud.azure.active-directory.application-type=resource_server',"
                            + " 'spring.cloud.azure.active-directory.authorization-clients." + registrationId
                            + ".authorization-grant-type' can not be 'authorization_code'.");
                    }
                    if (ON_BEHALF_OF.getValue().equals(grantType)) {
                        throw new IllegalStateException("When 'spring.cloud.azure.active-directory.application-type=resource_server',"
                            + " 'spring.cloud.azure.active-directory.authorization-clients." + registrationId
                            + ".authorization-grant-type' can not be 'on_behalf_of'.");
                    }
                    break;
                case RESOURCE_SERVER_WITH_OBO:
                    if (AUTHORIZATION_CODE.getValue().equals(grantType)) {
                        throw new IllegalStateException("When 'spring.cloud.azure.active-directory"
                            + ".application-type=resource_server_with_obo',"
                            + " 'spring.cloud.azure.active-directory.authorization-clients." + registrationId
                            + ".authorization-grant-type' can not be 'authorization_code'.");
                    }
                    break;
                case WEB_APPLICATION_AND_RESOURCE_SERVER:
                default:
                    LOGGER.debug("'spring.cloud.azure.active-directory.authorization-clients." + registrationId
                        + ".authorization-grant-type' is valid.");
            }

            if (properties.isOnDemand()
                && !AUTHORIZATION_CODE.getValue().equals(grantType)) {
                throw new IllegalStateException("onDemand only support authorization_code grant grantType. Please set "
                    + "'spring.cloud.azure.active-directory.authorization-clients." + registrationId
                    + ".authorization-grant-grantType=authorization_code'"
                    + " or 'spring.cloud.azure.active-directory.authorization-clients." + registrationId + ".on-demand=false'.");
            }

            if (AZURE_CLIENT_REGISTRATION_ID.equals(registrationId)
                && !AUTHORIZATION_CODE.equals(properties.getAuthorizationGrantType())) {
                throw new IllegalStateException("spring.cloud.azure.active-directory.authorization-clients."
                    + AZURE_CLIENT_REGISTRATION_ID
                    + ".authorization-grant-type must be configured to 'authorization_code'.");
            }
        }

        // Validate scopes.
        List<String> scopes = properties.getScopes();
        if (scopes == null || scopes.isEmpty()) {
            throw new IllegalStateException(
                "'spring.cloud.azure.active-directory.authorization-clients." + registrationId + ".scopes' must be configured");
        }
        // Add necessary scopes for authorization_code clients.
        // https://docs.microsoft.com/en-us/graph/permissions-reference#remarks-17
        // https://docs.microsoft.com/en-us/azure/active-directory/develop/v2-permissions-and-consent#openid-connect-scopes
        if (properties.getAuthorizationGrantType().getValue().equals(AUTHORIZATION_CODE.getValue())) {
            if (!scopes.contains("openid")) {
                scopes.add("openid"); // "openid" allows to request an ID token.
            }
            if (!scopes.contains("profile")) {
                scopes.add("profile"); // "profile" allows returning additional claims in the ID token.
            }
            if (!scopes.contains("offline_access")) {
                scopes.add("offline_access"); // "offline_access" allows to request a refresh token.
            }
        }
    }

    private boolean isMultiTenantsApplication(String tenantId) {
        return "common".equals(tenantId) || "organizations".equals(tenantId) || "consumers".equals(tenantId);
    }
}
