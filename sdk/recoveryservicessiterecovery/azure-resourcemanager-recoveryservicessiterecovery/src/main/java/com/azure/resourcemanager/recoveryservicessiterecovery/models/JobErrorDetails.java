// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** This class contains the error details per object. */
@Fluent
public final class JobErrorDetails {
    /*
     * The Service error details.
     */
    @JsonProperty(value = "serviceErrorDetails")
    private ServiceError serviceErrorDetails;

    /*
     * The Provider error details.
     */
    @JsonProperty(value = "providerErrorDetails")
    private ProviderError providerErrorDetails;

    /*
     * Error level of error.
     */
    @JsonProperty(value = "errorLevel")
    private String errorLevel;

    /*
     * The creation time of job error.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * The Id of the task.
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /** Creates an instance of JobErrorDetails class. */
    public JobErrorDetails() {
    }

    /**
     * Get the serviceErrorDetails property: The Service error details.
     *
     * @return the serviceErrorDetails value.
     */
    public ServiceError serviceErrorDetails() {
        return this.serviceErrorDetails;
    }

    /**
     * Set the serviceErrorDetails property: The Service error details.
     *
     * @param serviceErrorDetails the serviceErrorDetails value to set.
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withServiceErrorDetails(ServiceError serviceErrorDetails) {
        this.serviceErrorDetails = serviceErrorDetails;
        return this;
    }

    /**
     * Get the providerErrorDetails property: The Provider error details.
     *
     * @return the providerErrorDetails value.
     */
    public ProviderError providerErrorDetails() {
        return this.providerErrorDetails;
    }

    /**
     * Set the providerErrorDetails property: The Provider error details.
     *
     * @param providerErrorDetails the providerErrorDetails value to set.
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withProviderErrorDetails(ProviderError providerErrorDetails) {
        this.providerErrorDetails = providerErrorDetails;
        return this;
    }

    /**
     * Get the errorLevel property: Error level of error.
     *
     * @return the errorLevel value.
     */
    public String errorLevel() {
        return this.errorLevel;
    }

    /**
     * Set the errorLevel property: Error level of error.
     *
     * @param errorLevel the errorLevel value to set.
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
        return this;
    }

    /**
     * Get the creationTime property: The creation time of job error.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: The creation time of job error.
     *
     * @param creationTime the creationTime value to set.
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the taskId property: The Id of the task.
     *
     * @return the taskId value.
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: The Id of the task.
     *
     * @param taskId the taskId value to set.
     * @return the JobErrorDetails object itself.
     */
    public JobErrorDetails withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceErrorDetails() != null) {
            serviceErrorDetails().validate();
        }
        if (providerErrorDetails() != null) {
            providerErrorDetails().validate();
        }
    }
}
