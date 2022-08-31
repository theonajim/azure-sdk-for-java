// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A log metrics trigger descriptor. */
@Fluent
public final class LogMetricTrigger {
    /*
     * Evaluation operation for Metric -'GreaterThan' or 'LessThan' or 'Equal'.
     */
    @JsonProperty(value = "thresholdOperator")
    private ConditionalOperator thresholdOperator;

    /*
     * The threshold of the metric trigger.
     */
    @JsonProperty(value = "threshold")
    private Double threshold;

    /*
     * Metric Trigger Type - 'Consecutive' or 'Total'
     */
    @JsonProperty(value = "metricTriggerType")
    private MetricTriggerType metricTriggerType;

    /*
     * Evaluation of metric on a particular column
     */
    @JsonProperty(value = "metricColumn")
    private String metricColumn;

    /**
     * Get the thresholdOperator property: Evaluation operation for Metric -'GreaterThan' or 'LessThan' or 'Equal'.
     *
     * @return the thresholdOperator value.
     */
    public ConditionalOperator thresholdOperator() {
        return this.thresholdOperator;
    }

    /**
     * Set the thresholdOperator property: Evaluation operation for Metric -'GreaterThan' or 'LessThan' or 'Equal'.
     *
     * @param thresholdOperator the thresholdOperator value to set.
     * @return the LogMetricTrigger object itself.
     */
    public LogMetricTrigger withThresholdOperator(ConditionalOperator thresholdOperator) {
        this.thresholdOperator = thresholdOperator;
        return this;
    }

    /**
     * Get the threshold property: The threshold of the metric trigger.
     *
     * @return the threshold value.
     */
    public Double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: The threshold of the metric trigger.
     *
     * @param threshold the threshold value to set.
     * @return the LogMetricTrigger object itself.
     */
    public LogMetricTrigger withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the metricTriggerType property: Metric Trigger Type - 'Consecutive' or 'Total'.
     *
     * @return the metricTriggerType value.
     */
    public MetricTriggerType metricTriggerType() {
        return this.metricTriggerType;
    }

    /**
     * Set the metricTriggerType property: Metric Trigger Type - 'Consecutive' or 'Total'.
     *
     * @param metricTriggerType the metricTriggerType value to set.
     * @return the LogMetricTrigger object itself.
     */
    public LogMetricTrigger withMetricTriggerType(MetricTriggerType metricTriggerType) {
        this.metricTriggerType = metricTriggerType;
        return this;
    }

    /**
     * Get the metricColumn property: Evaluation of metric on a particular column.
     *
     * @return the metricColumn value.
     */
    public String metricColumn() {
        return this.metricColumn;
    }

    /**
     * Set the metricColumn property: Evaluation of metric on a particular column.
     *
     * @param metricColumn the metricColumn value to set.
     * @return the LogMetricTrigger object itself.
     */
    public LogMetricTrigger withMetricColumn(String metricColumn) {
        this.metricColumn = metricColumn;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
