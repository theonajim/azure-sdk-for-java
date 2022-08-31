// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The brand associated with the POI. */
@Immutable
public final class Brand {
    /*
     * Name of the brand
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Get the name property: Name of the brand.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
