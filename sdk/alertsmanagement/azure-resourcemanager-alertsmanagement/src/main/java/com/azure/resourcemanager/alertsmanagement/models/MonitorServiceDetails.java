// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of a monitor service. */
@Fluent
public final class MonitorServiceDetails {
    /*
     * Monitor service name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Monitor service display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name property: Monitor service name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Monitor service name.
     *
     * @param name the name value to set.
     * @return the MonitorServiceDetails object itself.
     */
    public MonitorServiceDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Monitor service display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Monitor service display name.
     *
     * @param displayName the displayName value to set.
     * @return the MonitorServiceDetails object itself.
     */
    public MonitorServiceDetails withDisplayName(String displayName) {
        this.displayName = displayName;
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
