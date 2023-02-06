// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Data Explorer sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataExplorerSink")
@Fluent
public final class AzureDataExplorerSink extends CopySink {
    /*
     * A name of a pre-created csv mapping that was defined on the target Kusto table. Type: string.
     */
    @JsonProperty(value = "ingestionMappingName")
    private Object ingestionMappingName;

    /*
     * An explicit column mapping description provided in a json format. Type: string.
     */
    @JsonProperty(value = "ingestionMappingAsJson")
    private Object ingestionMappingAsJson;

    /*
     * If set to true, any aggregation will be skipped. Default is false. Type: boolean.
     */
    @JsonProperty(value = "flushImmediately")
    private Object flushImmediately;

    /** Creates an instance of AzureDataExplorerSink class. */
    public AzureDataExplorerSink() {}

    /**
     * Get the ingestionMappingName property: A name of a pre-created csv mapping that was defined on the target Kusto
     * table. Type: string.
     *
     * @return the ingestionMappingName value.
     */
    public Object getIngestionMappingName() {
        return this.ingestionMappingName;
    }

    /**
     * Set the ingestionMappingName property: A name of a pre-created csv mapping that was defined on the target Kusto
     * table. Type: string.
     *
     * @param ingestionMappingName the ingestionMappingName value to set.
     * @return the AzureDataExplorerSink object itself.
     */
    public AzureDataExplorerSink setIngestionMappingName(Object ingestionMappingName) {
        this.ingestionMappingName = ingestionMappingName;
        return this;
    }

    /**
     * Get the ingestionMappingAsJson property: An explicit column mapping description provided in a json format. Type:
     * string.
     *
     * @return the ingestionMappingAsJson value.
     */
    public Object getIngestionMappingAsJson() {
        return this.ingestionMappingAsJson;
    }

    /**
     * Set the ingestionMappingAsJson property: An explicit column mapping description provided in a json format. Type:
     * string.
     *
     * @param ingestionMappingAsJson the ingestionMappingAsJson value to set.
     * @return the AzureDataExplorerSink object itself.
     */
    public AzureDataExplorerSink setIngestionMappingAsJson(Object ingestionMappingAsJson) {
        this.ingestionMappingAsJson = ingestionMappingAsJson;
        return this;
    }

    /**
     * Get the flushImmediately property: If set to true, any aggregation will be skipped. Default is false. Type:
     * boolean.
     *
     * @return the flushImmediately value.
     */
    public Object getFlushImmediately() {
        return this.flushImmediately;
    }

    /**
     * Set the flushImmediately property: If set to true, any aggregation will be skipped. Default is false. Type:
     * boolean.
     *
     * @param flushImmediately the flushImmediately value to set.
     * @return the AzureDataExplorerSink object itself.
     */
    public AzureDataExplorerSink setFlushImmediately(Object flushImmediately) {
        this.flushImmediately = flushImmediately;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
