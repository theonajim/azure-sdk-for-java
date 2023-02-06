// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a daily schedule. */
@Fluent
public final class DayDetails {
    /*
     * The time of day the schedule will occur.
     */
    @JsonProperty(value = "time")
    private String time;

    /** Creates an instance of DayDetails class. */
    public DayDetails() {
    }

    /**
     * Get the time property: The time of day the schedule will occur.
     *
     * @return the time value.
     */
    public String time() {
        return this.time;
    }

    /**
     * Set the time property: The time of day the schedule will occur.
     *
     * @param time the time value to set.
     * @return the DayDetails object itself.
     */
    public DayDetails withTime(String time) {
        this.time = time;
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
