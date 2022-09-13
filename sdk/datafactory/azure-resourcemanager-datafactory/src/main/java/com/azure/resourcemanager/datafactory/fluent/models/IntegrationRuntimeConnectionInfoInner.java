// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Connection information for encrypting the on-premises data source credentials. */
@Fluent
public final class IntegrationRuntimeConnectionInfoInner {
    /*
     * The token generated in service. Callers use this token to authenticate to integration runtime.
     */
    @JsonProperty(value = "serviceToken", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceToken;

    /*
     * The integration runtime SSL certificate thumbprint. Click-Once application uses it to do server validation.
     */
    @JsonProperty(value = "identityCertThumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String identityCertThumbprint;

    /*
     * The on-premises integration runtime host URL.
     */
    @JsonProperty(value = "hostServiceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String hostServiceUri;

    /*
     * The integration runtime version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The public key for encrypting a credential when transferring the credential to the integration runtime.
     */
    @JsonProperty(value = "publicKey", access = JsonProperty.Access.WRITE_ONLY)
    private String publicKey;

    /*
     * Whether the identity certificate is expired.
     */
    @JsonProperty(value = "isIdentityCertExprired", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isIdentityCertExprired;

    /*
     * Connection information for encrypting the on-premises data source credentials.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the serviceToken property: The token generated in service. Callers use this token to authenticate to
     * integration runtime.
     *
     * @return the serviceToken value.
     */
    public String serviceToken() {
        return this.serviceToken;
    }

    /**
     * Get the identityCertThumbprint property: The integration runtime SSL certificate thumbprint. Click-Once
     * application uses it to do server validation.
     *
     * @return the identityCertThumbprint value.
     */
    public String identityCertThumbprint() {
        return this.identityCertThumbprint;
    }

    /**
     * Get the hostServiceUri property: The on-premises integration runtime host URL.
     *
     * @return the hostServiceUri value.
     */
    public String hostServiceUri() {
        return this.hostServiceUri;
    }

    /**
     * Get the version property: The integration runtime version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the publicKey property: The public key for encrypting a credential when transferring the credential to the
     * integration runtime.
     *
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Get the isIdentityCertExprired property: Whether the identity certificate is expired.
     *
     * @return the isIdentityCertExprired value.
     */
    public Boolean isIdentityCertExprired() {
        return this.isIdentityCertExprired;
    }

    /**
     * Get the additionalProperties property: Connection information for encrypting the on-premises data source
     * credentials.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Connection information for encrypting the on-premises data source
     * credentials.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeConnectionInfoInner object itself.
     */
    public IntegrationRuntimeConnectionInfoInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
