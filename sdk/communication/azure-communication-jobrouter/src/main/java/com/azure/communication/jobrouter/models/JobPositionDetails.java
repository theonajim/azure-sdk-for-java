// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Dto for JobPositionDetails. */
@Fluent
public final class JobPositionDetails {
    /*
     * Id of the job these details are about.
     */
    @JsonProperty(value = "jobId", required = true)
    private String jobId;

    /*
     * Position of the job in question within that queue.
     */
    @JsonProperty(value = "position", required = true)
    private int position;

    /*
     * Id of the queue this job is enqueued in.
     */
    @JsonProperty(value = "queueId", required = true)
    private String queueId;

    /*
     * Length of the queue: total number of enqueued jobs.
     */
    @JsonProperty(value = "queueLength", required = true)
    private int queueLength;

    /*
     * Estimated wait time of the job rounded up to the nearest minute
     */
    @JsonProperty(value = "estimatedWaitTimeMinutes", required = true)
    private double estimatedWaitTimeMinutes;

    /**
     * Get the jobId property: Id of the job these details are about.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: Id of the job these details are about.
     *
     * @param jobId the jobId value to set.
     * @return the JobPositionDetails object itself.
     */
    public JobPositionDetails setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the position property: Position of the job in question within that queue.
     *
     * @return the position value.
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Set the position property: Position of the job in question within that queue.
     *
     * @param position the position value to set.
     * @return the JobPositionDetails object itself.
     */
    public JobPositionDetails setPosition(int position) {
        this.position = position;
        return this;
    }

    /**
     * Get the queueId property: Id of the queue this job is enqueued in.
     *
     * @return the queueId value.
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Id of the queue this job is enqueued in.
     *
     * @param queueId the queueId value to set.
     * @return the JobPositionDetails object itself.
     */
    public JobPositionDetails setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Get the queueLength property: Length of the queue: total number of enqueued jobs.
     *
     * @return the queueLength value.
     */
    public int getQueueLength() {
        return this.queueLength;
    }

    /**
     * Set the queueLength property: Length of the queue: total number of enqueued jobs.
     *
     * @param queueLength the queueLength value to set.
     * @return the JobPositionDetails object itself.
     */
    public JobPositionDetails setQueueLength(int queueLength) {
        this.queueLength = queueLength;
        return this;
    }

    /**
     * Get the estimatedWaitTimeMinutes property: Estimated wait time of the job rounded up to the nearest minute.
     *
     * @return the estimatedWaitTimeMinutes value.
     */
    public double getEstimatedWaitTimeMinutes() {
        return this.estimatedWaitTimeMinutes;
    }

    /**
     * Set the estimatedWaitTimeMinutes property: Estimated wait time of the job rounded up to the nearest minute.
     *
     * @param estimatedWaitTimeMinutes the estimatedWaitTimeMinutes value to set.
     * @return the JobPositionDetails object itself.
     */
    public JobPositionDetails setEstimatedWaitTimeMinutes(double estimatedWaitTimeMinutes) {
        this.estimatedWaitTimeMinutes = estimatedWaitTimeMinutes;
        return this;
    }
}
