// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for TeamDesk. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TeamDesk")
@JsonFlatten
@Fluent
public class TeamDeskLinkedService extends LinkedService {
    /*
     * The authentication type to use.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private TeamDeskAuthenticationType authenticationType;

    /*
     * The url to connect TeamDesk source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * The username of the TeamDesk source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * The password of the TeamDesk source.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The api token for the TeamDesk source.
     */
    @JsonProperty(value = "typeProperties.apiToken")
    private SecretBase apiToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the authenticationType property: The authentication type to use.
     *
     * @return the authenticationType value.
     */
    public TeamDeskAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to use.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService setAuthenticationType(TeamDeskAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the url property: The url to connect TeamDesk source. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The url to connect TeamDesk source. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the userName property: The username of the TeamDesk source. Type: string (or Expression with resultType
     * string).
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The username of the TeamDesk source. Type: string (or Expression with resultType
     * string).
     *
     * @param userName the userName value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The password of the TeamDesk source.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password of the TeamDesk source.
     *
     * @param password the password value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the apiToken property: The api token for the TeamDesk source.
     *
     * @return the apiToken value.
     */
    public SecretBase getApiToken() {
        return this.apiToken;
    }

    /**
     * Set the apiToken property: The api token for the TeamDesk source.
     *
     * @param apiToken the apiToken value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService setApiToken(SecretBase apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
