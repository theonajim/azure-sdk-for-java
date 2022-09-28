// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Common Data Service for Apps sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CommonDataServiceForAppsSink")
@Fluent
public final class CommonDataServiceForAppsSink extends CopySink {
    /*
     * The write behavior for the operation.
     */
    @JsonProperty(value = "writeBehavior", required = true)
    private DynamicsSinkWriteBehavior writeBehavior;

    /*
     * The flag indicating whether to ignore null values from input dataset (except key fields) during write operation.
     * Default is false. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "ignoreNullValues")
    private Object ignoreNullValues;

    /*
     * The logical name of the alternate key which will be used when upserting records. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "alternateKeyName")
    private Object alternateKeyName;

    /**
     * Get the writeBehavior property: The write behavior for the operation.
     *
     * @return the writeBehavior value.
     */
    public DynamicsSinkWriteBehavior writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: The write behavior for the operation.
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the CommonDataServiceForAppsSink object itself.
     */
    public CommonDataServiceForAppsSink withWriteBehavior(DynamicsSinkWriteBehavior writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * Get the ignoreNullValues property: The flag indicating whether to ignore null values from input dataset (except
     * key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the ignoreNullValues value.
     */
    public Object ignoreNullValues() {
        return this.ignoreNullValues;
    }

    /**
     * Set the ignoreNullValues property: The flag indicating whether to ignore null values from input dataset (except
     * key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param ignoreNullValues the ignoreNullValues value to set.
     * @return the CommonDataServiceForAppsSink object itself.
     */
    public CommonDataServiceForAppsSink withIgnoreNullValues(Object ignoreNullValues) {
        this.ignoreNullValues = ignoreNullValues;
        return this;
    }

    /**
     * Get the alternateKeyName property: The logical name of the alternate key which will be used when upserting
     * records. Type: string (or Expression with resultType string).
     *
     * @return the alternateKeyName value.
     */
    public Object alternateKeyName() {
        return this.alternateKeyName;
    }

    /**
     * Set the alternateKeyName property: The logical name of the alternate key which will be used when upserting
     * records. Type: string (or Expression with resultType string).
     *
     * @param alternateKeyName the alternateKeyName value to set.
     * @return the CommonDataServiceForAppsSink object itself.
     */
    public CommonDataServiceForAppsSink withAlternateKeyName(Object alternateKeyName) {
        this.alternateKeyName = alternateKeyName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (writeBehavior() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property writeBehavior in model CommonDataServiceForAppsSink"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommonDataServiceForAppsSink.class);
}
