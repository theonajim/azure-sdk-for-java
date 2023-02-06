// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Linked service debug resource. */
@Fluent
public final class LinkedServiceDebugResource extends SubResourceDebugResource {
    /*
     * Properties of linked service.
     */
    @JsonProperty(value = "properties", required = true)
    private LinkedService properties;

    /** Creates an instance of LinkedServiceDebugResource class. */
    public LinkedServiceDebugResource() {}

    /**
     * Get the properties property: Properties of linked service.
     *
     * @return the properties value.
     */
    public LinkedService getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of linked service.
     *
     * @param properties the properties value to set.
     * @return the LinkedServiceDebugResource object itself.
     */
    public LinkedServiceDebugResource setProperties(LinkedService properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LinkedServiceDebugResource setName(String name) {
        super.setName(name);
        return this;
    }
}
