// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EncryptionProperty model. */
@Fluent
public final class EncryptionProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionProperty.class);

    /*
     * Indicates whether or not the encryption is enabled for container
     * registry.
     */
    @JsonProperty(value = "status")
    private EncryptionStatus status;

    /*
     * Key vault properties.
     */
    @JsonProperty(value = "keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /**
     * Get the status property: Indicates whether or not the encryption is enabled for container registry.
     *
     * @return the status value.
     */
    public EncryptionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates whether or not the encryption is enabled for container registry.
     *
     * @param status the status value to set.
     * @return the EncryptionProperty object itself.
     */
    public EncryptionProperty withStatus(EncryptionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the keyVaultProperties property: Key vault properties.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Key vault properties.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionProperty object itself.
     */
    public EncryptionProperty withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
    }
}
