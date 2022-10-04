// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cdn.models.ActivatedResourceReference;
import com.azure.resourcemanager.cdn.models.AfdEndpointProtocols;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.AfdRouteCacheConfiguration;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.EnabledState;
import com.azure.resourcemanager.cdn.models.ForwardingProtocol;
import com.azure.resourcemanager.cdn.models.HttpsRedirect;
import com.azure.resourcemanager.cdn.models.LinkToDefaultDomain;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Friendly Routes name mapping to the any Routes or secret related information. */
@Fluent
public final class RouteInner extends ProxyResource {
    /*
     * The JSON object that contains the properties of the Routes to create.
     */
    @JsonProperty(value = "properties")
    private RouteProperties innerProperties;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the Routes to create.
     *
     * @return the innerProperties value.
     */
    private RouteProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Get the endpointName property: The name of the endpoint which holds the route.
     *
     * @return the endpointName value.
     */
    public String endpointName() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointName();
    }

    /**
     * Get the customDomains property: Domains referenced by this endpoint.
     *
     * @return the customDomains value.
     */
    public List<ActivatedResourceReference> customDomains() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomains();
    }

    /**
     * Set the customDomains property: Domains referenced by this endpoint.
     *
     * @param customDomains the customDomains value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withCustomDomains(List<ActivatedResourceReference> customDomains) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withCustomDomains(customDomains);
        return this;
    }

    /**
     * Get the originGroup property: A reference to the origin group.
     *
     * @return the originGroup value.
     */
    public ResourceReference originGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().originGroup();
    }

    /**
     * Set the originGroup property: A reference to the origin group.
     *
     * @param originGroup the originGroup value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withOriginGroup(ResourceReference originGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withOriginGroup(originGroup);
        return this;
    }

    /**
     * Get the originPath property: A directory path on the origin that AzureFrontDoor can use to retrieve content from,
     * e.g. contoso.cloudapp.net/originpath.
     *
     * @return the originPath value.
     */
    public String originPath() {
        return this.innerProperties() == null ? null : this.innerProperties().originPath();
    }

    /**
     * Set the originPath property: A directory path on the origin that AzureFrontDoor can use to retrieve content from,
     * e.g. contoso.cloudapp.net/originpath.
     *
     * @param originPath the originPath value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withOriginPath(String originPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withOriginPath(originPath);
        return this;
    }

    /**
     * Get the ruleSets property: rule sets referenced by this endpoint.
     *
     * @return the ruleSets value.
     */
    public List<ResourceReference> ruleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSets();
    }

    /**
     * Set the ruleSets property: rule sets referenced by this endpoint.
     *
     * @param ruleSets the ruleSets value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withRuleSets(List<ResourceReference> ruleSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withRuleSets(ruleSets);
        return this;
    }

    /**
     * Get the supportedProtocols property: List of supported protocols for this route.
     *
     * @return the supportedProtocols value.
     */
    public List<AfdEndpointProtocols> supportedProtocols() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedProtocols();
    }

    /**
     * Set the supportedProtocols property: List of supported protocols for this route.
     *
     * @param supportedProtocols the supportedProtocols value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withSupportedProtocols(List<AfdEndpointProtocols> supportedProtocols) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withSupportedProtocols(supportedProtocols);
        return this;
    }

    /**
     * Get the patternsToMatch property: The route patterns of the rule.
     *
     * @return the patternsToMatch value.
     */
    public List<String> patternsToMatch() {
        return this.innerProperties() == null ? null : this.innerProperties().patternsToMatch();
    }

    /**
     * Set the patternsToMatch property: The route patterns of the rule.
     *
     * @param patternsToMatch the patternsToMatch value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withPatternsToMatch(List<String> patternsToMatch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withPatternsToMatch(patternsToMatch);
        return this;
    }

    /**
     * Get the cacheConfiguration property: The caching configuration for this route. To disable caching, do not provide
     * a cacheConfiguration object.
     *
     * @return the cacheConfiguration value.
     */
    public AfdRouteCacheConfiguration cacheConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().cacheConfiguration();
    }

    /**
     * Set the cacheConfiguration property: The caching configuration for this route. To disable caching, do not provide
     * a cacheConfiguration object.
     *
     * @param cacheConfiguration the cacheConfiguration value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withCacheConfiguration(AfdRouteCacheConfiguration cacheConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withCacheConfiguration(cacheConfiguration);
        return this;
    }

    /**
     * Get the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     *
     * @return the forwardingProtocol value.
     */
    public ForwardingProtocol forwardingProtocol() {
        return this.innerProperties() == null ? null : this.innerProperties().forwardingProtocol();
    }

    /**
     * Set the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     *
     * @param forwardingProtocol the forwardingProtocol value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withForwardingProtocol(ForwardingProtocol forwardingProtocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withForwardingProtocol(forwardingProtocol);
        return this;
    }

    /**
     * Get the linkToDefaultDomain property: whether this route will be linked to the default endpoint domain.
     *
     * @return the linkToDefaultDomain value.
     */
    public LinkToDefaultDomain linkToDefaultDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().linkToDefaultDomain();
    }

    /**
     * Set the linkToDefaultDomain property: whether this route will be linked to the default endpoint domain.
     *
     * @param linkToDefaultDomain the linkToDefaultDomain value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withLinkToDefaultDomain(LinkToDefaultDomain linkToDefaultDomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withLinkToDefaultDomain(linkToDefaultDomain);
        return this;
    }

    /**
     * Get the httpsRedirect property: Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this
     * is a easy way to set up this rule and it will be the first rule that gets executed.
     *
     * @return the httpsRedirect value.
     */
    public HttpsRedirect httpsRedirect() {
        return this.innerProperties() == null ? null : this.innerProperties().httpsRedirect();
    }

    /**
     * Set the httpsRedirect property: Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this
     * is a easy way to set up this rule and it will be the first rule that gets executed.
     *
     * @param httpsRedirect the httpsRedirect value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withHttpsRedirect(HttpsRedirect httpsRedirect) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withHttpsRedirect(httpsRedirect);
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withEnabledState(EnabledState enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
