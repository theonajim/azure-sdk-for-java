// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.PrivateLinkResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private link resource. */
@Immutable
public final class PrivateLinkResourceInner extends ProxyResource {
    /*
     * The private link resource group id.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateLinkResourceProperties properties;

    /** Creates an instance of PrivateLinkResourceInner class. */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the properties property: The private link resource group id.
     *
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
