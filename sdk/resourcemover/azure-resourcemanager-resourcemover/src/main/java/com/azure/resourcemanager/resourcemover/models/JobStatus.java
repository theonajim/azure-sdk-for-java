// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the job status. */
@Immutable
public final class JobStatus {
    /*
     * Defines the job name.
     */
    @JsonProperty(value = "jobName", access = JsonProperty.Access.WRITE_ONLY)
    private JobName jobName;

    /*
     * Gets or sets the monitoring job percentage.
     */
    @JsonProperty(value = "jobProgress", access = JsonProperty.Access.WRITE_ONLY)
    private String jobProgress;

    /** Creates an instance of JobStatus class. */
    public JobStatus() {
    }

    /**
     * Get the jobName property: Defines the job name.
     *
     * @return the jobName value.
     */
    public JobName jobName() {
        return this.jobName;
    }

    /**
     * Get the jobProgress property: Gets or sets the monitoring job percentage.
     *
     * @return the jobProgress value.
     */
    public String jobProgress() {
        return this.jobProgress;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
