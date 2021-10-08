// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Data flow properties for managed integration runtime. */
@Fluent
public final class IntegrationRuntimeDataFlowProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeDataFlowProperties.class);

    /*
     * Compute type of the cluster which will execute data flow job.
     */
    @JsonProperty(value = "computeType")
    private DataFlowComputeType computeType;

    /*
     * Core count of the cluster which will execute data flow job. Supported
     * values are: 8, 16, 32, 48, 80, 144 and 272.
     */
    @JsonProperty(value = "coreCount")
    private Integer coreCount;

    /*
     * Time to live (in minutes) setting of the cluster which will execute data
     * flow job.
     */
    @JsonProperty(value = "timeToLive")
    private Integer timeToLive;

    /*
     * Cluster will not be recycled and it will be used in next data flow
     * activity run until TTL (time to live) is reached if this is set as
     * false. Default is true.
     */
    @JsonProperty(value = "cleanup")
    private Boolean cleanup;

    /*
     * Data flow properties for managed integration runtime.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the computeType property: Compute type of the cluster which will execute data flow job.
     *
     * @return the computeType value.
     */
    public DataFlowComputeType computeType() {
        return this.computeType;
    }

    /**
     * Set the computeType property: Compute type of the cluster which will execute data flow job.
     *
     * @param computeType the computeType value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withComputeType(DataFlowComputeType computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272.
     *
     * @return the coreCount value.
     */
    public Integer coreCount() {
        return this.coreCount;
    }

    /**
     * Set the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272.
     *
     * @param coreCount the coreCount value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * Get the timeToLive property: Time to live (in minutes) setting of the cluster which will execute data flow job.
     *
     * @return the timeToLive value.
     */
    public Integer timeToLive() {
        return this.timeToLive;
    }

    /**
     * Set the timeToLive property: Time to live (in minutes) setting of the cluster which will execute data flow job.
     *
     * @param timeToLive the timeToLive value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Get the cleanup property: Cluster will not be recycled and it will be used in next data flow activity run until
     * TTL (time to live) is reached if this is set as false. Default is true.
     *
     * @return the cleanup value.
     */
    public Boolean cleanup() {
        return this.cleanup;
    }

    /**
     * Set the cleanup property: Cluster will not be recycled and it will be used in next data flow activity run until
     * TTL (time to live) is reached if this is set as false. Default is true.
     *
     * @param cleanup the cleanup value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withCleanup(Boolean cleanup) {
        this.cleanup = cleanup;
        return this;
    }

    /**
     * Get the additionalProperties property: Data flow properties for managed integration runtime.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Data flow properties for managed integration runtime.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeDataFlowProperties object itself.
     */
    public IntegrationRuntimeDataFlowProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
