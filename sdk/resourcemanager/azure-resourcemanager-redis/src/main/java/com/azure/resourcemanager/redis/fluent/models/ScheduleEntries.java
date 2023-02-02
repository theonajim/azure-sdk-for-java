// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.models.ScheduleEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of patch schedules for a Redis cache. */
@Fluent
public final class ScheduleEntries {
    /*
     * List of patch schedules for a Redis cache.
     */
    @JsonProperty(value = "scheduleEntries", required = true)
    private List<ScheduleEntry> scheduleEntries;

    /** Creates an instance of ScheduleEntries class. */
    public ScheduleEntries() {
    }

    /**
     * Get the scheduleEntries property: List of patch schedules for a Redis cache.
     *
     * @return the scheduleEntries value.
     */
    public List<ScheduleEntry> scheduleEntries() {
        return this.scheduleEntries;
    }

    /**
     * Set the scheduleEntries property: List of patch schedules for a Redis cache.
     *
     * @param scheduleEntries the scheduleEntries value to set.
     * @return the ScheduleEntries object itself.
     */
    public ScheduleEntries withScheduleEntries(List<ScheduleEntry> scheduleEntries) {
        this.scheduleEntries = scheduleEntries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scheduleEntries() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property scheduleEntries in model ScheduleEntries"));
        } else {
            scheduleEntries().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScheduleEntries.class);
}
