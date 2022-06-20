// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySink;
import com.azure.resourcemanager.datafactory.models.PowerQuerySinkMapping;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Execute power query data flow activity properties. */
@Fluent
public final class ExecutePowerQueryActivityTypeProperties extends ExecuteDataFlowActivityTypeProperties {
    /*
     * (Deprecated. Please use Queries). List of Power Query activity sinks
     * mapped to a queryName.
     */
    @JsonProperty(value = "sinks")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, PowerQuerySink> sinks;

    /*
     * List of mapping for Power Query mashup query to sink dataset(s).
     */
    @JsonProperty(value = "queries")
    private List<PowerQuerySinkMapping> queries;

    /**
     * Get the sinks property: (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a
     * queryName.
     *
     * @return the sinks value.
     */
    public Map<String, PowerQuerySink> sinks() {
        return this.sinks;
    }

    /**
     * Set the sinks property: (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a
     * queryName.
     *
     * @param sinks the sinks value to set.
     * @return the ExecutePowerQueryActivityTypeProperties object itself.
     */
    public ExecutePowerQueryActivityTypeProperties withSinks(Map<String, PowerQuerySink> sinks) {
        this.sinks = sinks;
        return this;
    }

    /**
     * Get the queries property: List of mapping for Power Query mashup query to sink dataset(s).
     *
     * @return the queries value.
     */
    public List<PowerQuerySinkMapping> queries() {
        return this.queries;
    }

    /**
     * Set the queries property: List of mapping for Power Query mashup query to sink dataset(s).
     *
     * @param queries the queries value to set.
     * @return the ExecutePowerQueryActivityTypeProperties object itself.
     */
    public ExecutePowerQueryActivityTypeProperties withQueries(List<PowerQuerySinkMapping> queries) {
        this.queries = queries;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withDataFlow(DataFlowReference dataFlow) {
        super.withDataFlow(dataFlow);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withStaging(DataFlowStagingInfo staging) {
        super.withStaging(staging);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withIntegrationRuntime(
        IntegrationRuntimeReference integrationRuntime) {
        super.withIntegrationRuntime(integrationRuntime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withCompute(ExecuteDataFlowActivityTypePropertiesCompute compute) {
        super.withCompute(compute);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withTraceLevel(Object traceLevel) {
        super.withTraceLevel(traceLevel);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withContinueOnError(Object continueOnError) {
        super.withContinueOnError(continueOnError);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withRunConcurrently(Object runConcurrently) {
        super.withRunConcurrently(runConcurrently);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecutePowerQueryActivityTypeProperties withSourceStagingConcurrency(Object sourceStagingConcurrency) {
        super.withSourceStagingConcurrency(sourceStagingConcurrency);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sinks() != null) {
            sinks()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (queries() != null) {
            queries().forEach(e -> e.validate());
        }
    }
}
