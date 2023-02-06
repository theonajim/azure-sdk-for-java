// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The pricing tier of the web application firewall policy. */
@Fluent
public final class Sku {
    /*
     * Name of the pricing tier.
     */
    @JsonProperty(value = "name")
    private SkuName name;

    /** Creates an instance of Sku class. */
    public Sku() {
    }

    /**
     * Get the name property: Name of the pricing tier.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the pricing tier.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
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
