// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Periodic timer event source. */
@Fluent
public final class PeriodicTimerSourceInfo {
    /*
     * The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified
     * upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will
     * always be returned as UTC time.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     */
    @JsonProperty(value = "schedule", required = true)
    private String schedule;

    /*
     * Topic where periodic events are published to IoT device.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /** Creates an instance of PeriodicTimerSourceInfo class. */
    public PeriodicTimerSourceInfo() {
    }

    /**
     * Get the startTime property: The time of the day that results in a valid trigger. Schedule is computed with
     * reference to the time specified upto seconds. If timezone is not specified the time will considered to be in
     * device timezone. The value will always be returned as UTC time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The time of the day that results in a valid trigger. Schedule is computed with
     * reference to the time specified upto seconds. If timezone is not specified the time will considered to be in
     * device timezone. The value will always be returned as UTC time.
     *
     * @param startTime the startTime value to set.
     * @return the PeriodicTimerSourceInfo object itself.
     */
    public PeriodicTimerSourceInfo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the schedule property: Periodic frequency at which timer event needs to be raised. Supports daily, hourly,
     * minutes, and seconds.
     *
     * @return the schedule value.
     */
    public String schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Periodic frequency at which timer event needs to be raised. Supports daily, hourly,
     * minutes, and seconds.
     *
     * @param schedule the schedule value to set.
     * @return the PeriodicTimerSourceInfo object itself.
     */
    public PeriodicTimerSourceInfo withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the topic property: Topic where periodic events are published to IoT device.
     *
     * @return the topic value.
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Set the topic property: Topic where periodic events are published to IoT device.
     *
     * @param topic the topic value to set.
     * @return the PeriodicTimerSourceInfo object itself.
     */
    public PeriodicTimerSourceInfo withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property startTime in model PeriodicTimerSourceInfo"));
        }
        if (schedule() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schedule in model PeriodicTimerSourceInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PeriodicTimerSourceInfo.class);
}
