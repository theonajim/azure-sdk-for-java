// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specification of destinations that can be used in data flows. */
@Fluent
public class DestinationsSpec {
    /*
     * List of Log Analytics destinations.
     */
    @JsonProperty(value = "logAnalytics")
    private List<LogAnalyticsDestination> logAnalytics;

    /*
     * Azure Monitor Metrics destination.
     */
    @JsonProperty(value = "azureMonitorMetrics")
    private DestinationsSpecAzureMonitorMetrics azureMonitorMetrics;

    /** Creates an instance of DestinationsSpec class. */
    public DestinationsSpec() {
    }

    /**
     * Get the logAnalytics property: List of Log Analytics destinations.
     *
     * @return the logAnalytics value.
     */
    public List<LogAnalyticsDestination> logAnalytics() {
        return this.logAnalytics;
    }

    /**
     * Set the logAnalytics property: List of Log Analytics destinations.
     *
     * @param logAnalytics the logAnalytics value to set.
     * @return the DestinationsSpec object itself.
     */
    public DestinationsSpec withLogAnalytics(List<LogAnalyticsDestination> logAnalytics) {
        this.logAnalytics = logAnalytics;
        return this;
    }

    /**
     * Get the azureMonitorMetrics property: Azure Monitor Metrics destination.
     *
     * @return the azureMonitorMetrics value.
     */
    public DestinationsSpecAzureMonitorMetrics azureMonitorMetrics() {
        return this.azureMonitorMetrics;
    }

    /**
     * Set the azureMonitorMetrics property: Azure Monitor Metrics destination.
     *
     * @param azureMonitorMetrics the azureMonitorMetrics value to set.
     * @return the DestinationsSpec object itself.
     */
    public DestinationsSpec withAzureMonitorMetrics(DestinationsSpecAzureMonitorMetrics azureMonitorMetrics) {
        this.azureMonitorMetrics = azureMonitorMetrics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logAnalytics() != null) {
            logAnalytics().forEach(e -> e.validate());
        }
        if (azureMonitorMetrics() != null) {
            azureMonitorMetrics().validate();
        }
    }
}
