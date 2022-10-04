// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Lookup activity properties. */
@Fluent
public final class LookupActivityTypeProperties {
    /*
     * Dataset-specific source properties, same as copy activity source.
     */
    @JsonProperty(value = "source", required = true)
    private CopySource source;

    /*
     * Lookup activity dataset reference.
     */
    @JsonProperty(value = "dataset", required = true)
    private DatasetReference dataset;

    /*
     * Whether to return first row or all rows. Default value is true. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "firstRowOnly")
    private Object firstRowOnly;

    /**
     * Get the source property: Dataset-specific source properties, same as copy activity source.
     *
     * @return the source value.
     */
    public CopySource source() {
        return this.source;
    }

    /**
     * Set the source property: Dataset-specific source properties, same as copy activity source.
     *
     * @param source the source value to set.
     * @return the LookupActivityTypeProperties object itself.
     */
    public LookupActivityTypeProperties withSource(CopySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the dataset property: Lookup activity dataset reference.
     *
     * @return the dataset value.
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Lookup activity dataset reference.
     *
     * @param dataset the dataset value to set.
     * @return the LookupActivityTypeProperties object itself.
     */
    public LookupActivityTypeProperties withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the firstRowOnly property: Whether to return first row or all rows. Default value is true. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the firstRowOnly value.
     */
    public Object firstRowOnly() {
        return this.firstRowOnly;
    }

    /**
     * Set the firstRowOnly property: Whether to return first row or all rows. Default value is true. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param firstRowOnly the firstRowOnly value to set.
     * @return the LookupActivityTypeProperties object itself.
     */
    public LookupActivityTypeProperties withFirstRowOnly(Object firstRowOnly) {
        this.firstRowOnly = firstRowOnly;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property source in model LookupActivityTypeProperties"));
        } else {
            source().validate();
        }
        if (dataset() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataset in model LookupActivityTypeProperties"));
        } else {
            dataset().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LookupActivityTypeProperties.class);
}
