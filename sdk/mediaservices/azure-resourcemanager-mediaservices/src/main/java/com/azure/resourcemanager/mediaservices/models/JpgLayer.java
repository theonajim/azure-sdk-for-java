// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the settings to produce a JPEG image from the input video. */
@Fluent
public final class JpgLayer extends Layer {
    /*
     * The compression quality of the JPEG output. Range is from 0-100 and the
     * default is 70.
     */
    @JsonProperty(value = "quality")
    private Integer quality;

    /**
     * Get the quality property: The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     *
     * @return the quality value.
     */
    public Integer quality() {
        return this.quality;
    }

    /**
     * Set the quality property: The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     *
     * @param quality the quality value to set.
     * @return the JpgLayer object itself.
     */
    public JpgLayer withQuality(Integer quality) {
        this.quality = quality;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgLayer withWidth(String width) {
        super.withWidth(width);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgLayer withHeight(String height) {
        super.withHeight(height);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgLayer withLabel(String label) {
        super.withLabel(label);
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
    }
}
