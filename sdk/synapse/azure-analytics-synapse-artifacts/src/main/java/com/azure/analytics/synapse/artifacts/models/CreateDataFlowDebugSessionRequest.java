// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request body structure for creating data flow debug session. */
@Fluent
public final class CreateDataFlowDebugSessionRequest {
    /*
     * Compute type of the cluster. The value will be overwritten by the same setting in integration runtime if
     * provided.
     */
    @JsonProperty(value = "computeType")
    private String computeType;

    /*
     * Core count of the cluster. The value will be overwritten by the same setting in integration runtime if provided.
     */
    @JsonProperty(value = "coreCount")
    private Integer coreCount;

    /*
     * Time to live setting of the cluster in minutes.
     */
    @JsonProperty(value = "timeToLive")
    private Integer timeToLive;

    /*
     * Set to use integration runtime setting for data flow debug session.
     */
    @JsonProperty(value = "integrationRuntime")
    private IntegrationRuntimeDebugResource integrationRuntime;

    /** Creates an instance of CreateDataFlowDebugSessionRequest class. */
    public CreateDataFlowDebugSessionRequest() {}

    /**
     * Get the computeType property: Compute type of the cluster. The value will be overwritten by the same setting in
     * integration runtime if provided.
     *
     * @return the computeType value.
     */
    public String getComputeType() {
        return this.computeType;
    }

    /**
     * Set the computeType property: Compute type of the cluster. The value will be overwritten by the same setting in
     * integration runtime if provided.
     *
     * @param computeType the computeType value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get the coreCount property: Core count of the cluster. The value will be overwritten by the same setting in
     * integration runtime if provided.
     *
     * @return the coreCount value.
     */
    public Integer getCoreCount() {
        return this.coreCount;
    }

    /**
     * Set the coreCount property: Core count of the cluster. The value will be overwritten by the same setting in
     * integration runtime if provided.
     *
     * @param coreCount the coreCount value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * Get the timeToLive property: Time to live setting of the cluster in minutes.
     *
     * @return the timeToLive value.
     */
    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * Set the timeToLive property: Time to live setting of the cluster in minutes.
     *
     * @param timeToLive the timeToLive value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Get the integrationRuntime property: Set to use integration runtime setting for data flow debug session.
     *
     * @return the integrationRuntime value.
     */
    public IntegrationRuntimeDebugResource getIntegrationRuntime() {
        return this.integrationRuntime;
    }

    /**
     * Set the integrationRuntime property: Set to use integration runtime setting for data flow debug session.
     *
     * @param integrationRuntime the integrationRuntime value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setIntegrationRuntime(IntegrationRuntimeDebugResource integrationRuntime) {
        this.integrationRuntime = integrationRuntime;
        return this;
    }
}
