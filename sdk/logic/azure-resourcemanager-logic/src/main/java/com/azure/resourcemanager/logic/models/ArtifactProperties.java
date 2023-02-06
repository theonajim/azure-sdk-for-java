// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The artifact properties definition. */
@Fluent
public class ArtifactProperties {
    /*
     * The artifact creation time.
     */
    @JsonProperty(value = "createdTime")
    private OffsetDateTime createdTime;

    /*
     * The artifact changed time.
     */
    @JsonProperty(value = "changedTime")
    private OffsetDateTime changedTime;

    /*
     * Anything
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /** Creates an instance of ArtifactProperties class. */
    public ArtifactProperties() {
    }

    /**
     * Get the createdTime property: The artifact creation time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: The artifact creation time.
     *
     * @param createdTime the createdTime value to set.
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the changedTime property: The artifact changed time.
     *
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Set the changedTime property: The artifact changed time.
     *
     * @param changedTime the changedTime value to set.
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withChangedTime(OffsetDateTime changedTime) {
        this.changedTime = changedTime;
        return this;
    }

    /**
     * Get the metadata property: Anything.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Anything.
     *
     * @param metadata the metadata value to set.
     * @return the ArtifactProperties object itself.
     */
    public ArtifactProperties withMetadata(Object metadata) {
        this.metadata = metadata;
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
