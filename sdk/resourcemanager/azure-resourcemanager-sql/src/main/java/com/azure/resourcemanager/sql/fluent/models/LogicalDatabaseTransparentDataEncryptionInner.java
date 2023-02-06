// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A logical database transparent data encryption state. */
@Fluent
public final class LogicalDatabaseTransparentDataEncryptionInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private TransparentDataEncryptionProperties innerProperties;

    /** Creates an instance of LogicalDatabaseTransparentDataEncryptionInner class. */
    public LogicalDatabaseTransparentDataEncryptionInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private TransparentDataEncryptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: Specifies the state of the transparent data encryption.
     *
     * @return the state value.
     */
    public TransparentDataEncryptionState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the transparent data encryption.
     *
     * @param state the state value to set.
     * @return the LogicalDatabaseTransparentDataEncryptionInner object itself.
     */
    public LogicalDatabaseTransparentDataEncryptionInner withState(TransparentDataEncryptionState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TransparentDataEncryptionProperties();
        }
        this.innerProperties().withState(state);
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
