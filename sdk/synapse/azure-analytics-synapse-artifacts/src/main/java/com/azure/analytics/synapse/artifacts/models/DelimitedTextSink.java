// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity DelimitedText sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedTextSink")
@Fluent
public final class DelimitedTextSink extends CopySink {
    /*
     * DelimitedText store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /*
     * DelimitedText format settings.
     */
    @JsonProperty(value = "formatSettings")
    private DelimitedTextWriteSettings formatSettings;

    /** Creates an instance of DelimitedTextSink class. */
    public DelimitedTextSink() {}

    /**
     * Get the storeSettings property: DelimitedText store settings.
     *
     * @return the storeSettings value.
     */
    public StoreWriteSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: DelimitedText store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the DelimitedTextSink object itself.
     */
    public DelimitedTextSink setStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: DelimitedText format settings.
     *
     * @return the formatSettings value.
     */
    public DelimitedTextWriteSettings getFormatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: DelimitedText format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the DelimitedTextSink object itself.
     */
    public DelimitedTextSink setFormatSettings(DelimitedTextWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelimitedTextSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
