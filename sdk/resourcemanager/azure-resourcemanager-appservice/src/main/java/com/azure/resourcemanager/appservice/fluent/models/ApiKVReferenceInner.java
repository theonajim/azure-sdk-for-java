// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ConfigReferenceSource;
import com.azure.resourcemanager.appservice.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.ResolveStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of site key vault references. */
@Fluent
public final class ApiKVReferenceInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiKVReferenceInner.class);

    /*
     * ApiKVReference resource specific properties
     */
    @JsonProperty(value = "properties")
    private ApiKVReferenceProperties innerProperties;

    /**
     * Get the innerProperties property: ApiKVReference resource specific properties.
     *
     * @return the innerProperties value.
     */
    private ApiKVReferenceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ApiKVReferenceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the reference property: The reference property.
     *
     * @return the reference value.
     */
    public String reference() {
        return this.innerProperties() == null ? null : this.innerProperties().reference();
    }

    /**
     * Set the reference property: The reference property.
     *
     * @param reference the reference value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withReference(String reference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withReference(reference);
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public ResolveStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withStatus(ResolveStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the vaultName property: The vaultName property.
     *
     * @return the vaultName value.
     */
    public String vaultName() {
        return this.innerProperties() == null ? null : this.innerProperties().vaultName();
    }

    /**
     * Set the vaultName property: The vaultName property.
     *
     * @param vaultName the vaultName value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withVaultName(String vaultName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withVaultName(vaultName);
        return this;
    }

    /**
     * Get the secretName property: The secretName property.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.innerProperties() == null ? null : this.innerProperties().secretName();
    }

    /**
     * Set the secretName property: The secretName property.
     *
     * @param secretName the secretName value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withSecretName(String secretName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withSecretName(secretName);
        return this;
    }

    /**
     * Get the secretVersion property: The secretVersion property.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().secretVersion();
    }

    /**
     * Set the secretVersion property: The secretVersion property.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withSecretVersion(String secretVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withSecretVersion(secretVersion);
        return this;
    }

    /**
     * Get the identityType property: Managed service identity.
     *
     * @return the identityType value.
     */
    public ManagedServiceIdentity identityType() {
        return this.innerProperties() == null ? null : this.innerProperties().identityType();
    }

    /**
     * Set the identityType property: Managed service identity.
     *
     * @param identityType the identityType value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withIdentityType(ManagedServiceIdentity identityType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withIdentityType(identityType);
        return this;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public String details() {
        return this.innerProperties() == null ? null : this.innerProperties().details();
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withDetails(String details) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withDetails(details);
        return this;
    }

    /**
     * Get the source property: The source property.
     *
     * @return the source value.
     */
    public ConfigReferenceSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: The source property.
     *
     * @param source the source value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withSource(ConfigReferenceSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the activeVersion property: The activeVersion property.
     *
     * @return the activeVersion value.
     */
    public String activeVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().activeVersion();
    }

    /**
     * Set the activeVersion property: The activeVersion property.
     *
     * @param activeVersion the activeVersion value to set.
     * @return the ApiKVReferenceInner object itself.
     */
    public ApiKVReferenceInner withActiveVersion(String activeVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiKVReferenceProperties();
        }
        this.innerProperties().withActiveVersion(activeVersion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
