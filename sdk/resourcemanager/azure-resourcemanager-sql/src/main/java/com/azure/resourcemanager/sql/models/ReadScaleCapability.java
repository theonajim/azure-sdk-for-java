// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The read scale capability. */
@Fluent
public final class ReadScaleCapability {
    /*
     * The maximum number of read scale replicas.
     */
    @JsonProperty(value = "maxNumberOfReplicas", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxNumberOfReplicas;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /** Creates an instance of ReadScaleCapability class. */
    public ReadScaleCapability() {
    }

    /**
     * Get the maxNumberOfReplicas property: The maximum number of read scale replicas.
     *
     * @return the maxNumberOfReplicas value.
     */
    public Integer maxNumberOfReplicas() {
        return this.maxNumberOfReplicas;
    }

    /**
     * Get the status property: The status of the capability.
     *
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     *
     * @param reason the reason value to set.
     * @return the ReadScaleCapability object itself.
     */
    public ReadScaleCapability withReason(String reason) {
        this.reason = reason;
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
