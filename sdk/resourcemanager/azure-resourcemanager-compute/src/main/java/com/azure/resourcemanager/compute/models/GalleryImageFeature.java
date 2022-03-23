// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A feature for gallery image. */
@Fluent
public final class GalleryImageFeature {
    /*
     * The name of the gallery image feature.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the gallery image feature.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The name of the gallery image feature.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the gallery image feature.
     *
     * @param name the name value to set.
     * @return the GalleryImageFeature object itself.
     */
    public GalleryImageFeature withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the gallery image feature.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the gallery image feature.
     *
     * @param value the value value to set.
     * @return the GalleryImageFeature object itself.
     */
    public GalleryImageFeature withValue(String value) {
        this.value = value;
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
