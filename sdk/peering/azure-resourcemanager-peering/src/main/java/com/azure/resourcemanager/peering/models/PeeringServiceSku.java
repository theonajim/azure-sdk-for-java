// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SKU that defines the type of the peering service. */
@Fluent
public final class PeeringServiceSku {
    /*
     * The name of the peering service SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of PeeringServiceSku class. */
    public PeeringServiceSku() {
    }

    /**
     * Get the name property: The name of the peering service SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the peering service SKU.
     *
     * @param name the name value to set.
     * @return the PeeringServiceSku object itself.
     */
    public PeeringServiceSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
