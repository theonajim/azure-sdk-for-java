// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The performance level capability. */
@Immutable
public final class PerformanceLevelCapability {
    /*
     * Performance level value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Double value;

    /*
     * Unit type used to measure performance level.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelUnit unit;

    /** Creates an instance of PerformanceLevelCapability class. */
    public PerformanceLevelCapability() {
    }

    /**
     * Get the value property: Performance level value.
     *
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Get the unit property: Unit type used to measure performance level.
     *
     * @return the unit value.
     */
    public PerformanceLevelUnit unit() {
        return this.unit;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
