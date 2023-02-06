// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorMetricThresholds;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorPropertiesGrouping;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorProvisioningState;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Gets or sets the properties for Sap Landscape Monitor Dashboard.
 */
@Fluent
public final class SapLandscapeMonitorProperties {
    /*
     * State of provisioning of the SAP monitor.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private SapLandscapeMonitorProvisioningState provisioningState;

    /*
     * Gets or sets the SID groupings by landscape and Environment.
     */
    @JsonProperty(value = "grouping")
    private SapLandscapeMonitorPropertiesGrouping grouping;

    /*
     * Gets or sets the list Top Metric Thresholds for SAP Landscape Monitor Dashboard
     */
    @JsonProperty(value = "topMetricsThresholds")
    private List<SapLandscapeMonitorMetricThresholds> topMetricsThresholds;

    /**
     * Creates an instance of SapLandscapeMonitorProperties class.
     */
    public SapLandscapeMonitorProperties() {
    }

    /**
     * Get the provisioningState property: State of provisioning of the SAP monitor.
     * 
     * @return the provisioningState value.
     */
    public SapLandscapeMonitorProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the grouping property: Gets or sets the SID groupings by landscape and Environment.
     * 
     * @return the grouping value.
     */
    public SapLandscapeMonitorPropertiesGrouping grouping() {
        return this.grouping;
    }

    /**
     * Set the grouping property: Gets or sets the SID groupings by landscape and Environment.
     * 
     * @param grouping the grouping value to set.
     * @return the SapLandscapeMonitorProperties object itself.
     */
    public SapLandscapeMonitorProperties withGrouping(SapLandscapeMonitorPropertiesGrouping grouping) {
        this.grouping = grouping;
        return this;
    }

    /**
     * Get the topMetricsThresholds property: Gets or sets the list Top Metric Thresholds for SAP Landscape Monitor
     * Dashboard.
     * 
     * @return the topMetricsThresholds value.
     */
    public List<SapLandscapeMonitorMetricThresholds> topMetricsThresholds() {
        return this.topMetricsThresholds;
    }

    /**
     * Set the topMetricsThresholds property: Gets or sets the list Top Metric Thresholds for SAP Landscape Monitor
     * Dashboard.
     * 
     * @param topMetricsThresholds the topMetricsThresholds value to set.
     * @return the SapLandscapeMonitorProperties object itself.
     */
    public SapLandscapeMonitorProperties withTopMetricsThresholds(List<SapLandscapeMonitorMetricThresholds> topMetricsThresholds) {
        this.topMetricsThresholds = topMetricsThresholds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (grouping() != null) {
            grouping().validate();
        }
        if (topMetricsThresholds() != null) {
            topMetricsThresholds().forEach(e -> e.validate());
        }
    }
}
