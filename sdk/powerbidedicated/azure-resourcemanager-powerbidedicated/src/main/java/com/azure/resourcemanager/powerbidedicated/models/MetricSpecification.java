// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Metric specification for exposing performance metrics to shoebox. */
@Fluent
public final class MetricSpecification {
    /*
     * Metric name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Localizable metric name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Localizable description of metric
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * Unit for the metric
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Aggregation type for the metric
     */
    @JsonProperty(value = "aggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private String aggregationType;

    /*
     * Pattern used to filter the metric
     */
    @JsonProperty(value = "metricFilterPattern", access = JsonProperty.Access.WRITE_ONLY)
    private String metricFilterPattern;

    /*
     * For describing multi dimensional metrics
     */
    @JsonProperty(value = "dimensions")
    private List<MetricSpecificationDimensionsItem> dimensions;

    /** Creates an instance of MetricSpecification class. */
    public MetricSpecification() {
    }

    /**
     * Get the name property: Metric name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the displayName property: Localizable metric name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localizable metric name.
     *
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Localizable description of metric.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Localizable description of metric.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: Unit for the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the aggregationType property: Aggregation type for the metric.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Get the metricFilterPattern property: Pattern used to filter the metric.
     *
     * @return the metricFilterPattern value.
     */
    public String metricFilterPattern() {
        return this.metricFilterPattern;
    }

    /**
     * Get the dimensions property: For describing multi dimensional metrics.
     *
     * @return the dimensions value.
     */
    public List<MetricSpecificationDimensionsItem> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: For describing multi dimensional metrics.
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<MetricSpecificationDimensionsItem> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
