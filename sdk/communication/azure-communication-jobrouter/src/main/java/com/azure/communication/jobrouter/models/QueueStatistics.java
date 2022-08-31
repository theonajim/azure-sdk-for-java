// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Statistics for the queue. */
@Fluent
public final class QueueStatistics {
    /*
     * Id of the queue these details are about.
     */
    @JsonProperty(value = "queueId", required = true)
    private String queueId;

    /*
     * Length of the queue: total number of enqueued jobs.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /*
     * The estimated wait time of this queue rounded up to the nearest minute,
     * grouped by job priority
     */
    @JsonProperty(value = "estimatedWaitTimeMinutes")
    private Map<String, Double> estimatedWaitTimeMinutes;

    /*
     * The wait time of the job that has been enqueued in this queue for the
     * longest.
     */
    @JsonProperty(value = "longestJobWaitTimeMinutes")
    private Double longestJobWaitTimeMinutes;

    /**
     * Get the queueId property: Id of the queue these details are about.
     *
     * @return the queueId value.
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Id of the queue these details are about.
     *
     * @param queueId the queueId value to set.
     * @return the QueueStatistics object itself.
     */
    public QueueStatistics setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Get the length property: Length of the queue: total number of enqueued jobs.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: Length of the queue: total number of enqueued jobs.
     *
     * @param length the length value to set.
     * @return the QueueStatistics object itself.
     */
    public QueueStatistics setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Get the estimatedWaitTimeMinutes property: The estimated wait time of this queue rounded up to the nearest
     * minute, grouped by job priority.
     *
     * @return the estimatedWaitTimeMinutes value.
     */
    public Map<String, Double> getEstimatedWaitTimeMinutes() {
        return this.estimatedWaitTimeMinutes;
    }

    /**
     * Set the estimatedWaitTimeMinutes property: The estimated wait time of this queue rounded up to the nearest
     * minute, grouped by job priority.
     *
     * @param estimatedWaitTimeMinutes the estimatedWaitTimeMinutes value to set.
     * @return the QueueStatistics object itself.
     */
    public QueueStatistics setEstimatedWaitTimeMinutes(Map<String, Double> estimatedWaitTimeMinutes) {
        this.estimatedWaitTimeMinutes = estimatedWaitTimeMinutes;
        return this;
    }

    /**
     * Get the longestJobWaitTimeMinutes property: The wait time of the job that has been enqueued in this queue for the
     * longest.
     *
     * @return the longestJobWaitTimeMinutes value.
     */
    public Double getLongestJobWaitTimeMinutes() {
        return this.longestJobWaitTimeMinutes;
    }

    /**
     * Set the longestJobWaitTimeMinutes property: The wait time of the job that has been enqueued in this queue for the
     * longest.
     *
     * @param longestJobWaitTimeMinutes the longestJobWaitTimeMinutes value to set.
     * @return the QueueStatistics object itself.
     */
    public QueueStatistics setLongestJobWaitTimeMinutes(Double longestJobWaitTimeMinutes) {
        this.longestJobWaitTimeMinutes = longestJobWaitTimeMinutes;
        return this;
    }
}
