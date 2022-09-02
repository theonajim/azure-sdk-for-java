// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.alertsmanagement.models.AlertsMetadataProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** alert meta data information. */
@Fluent
public final class AlertsMetadataInner {
    /*
     * alert meta data property bag
     */
    @JsonProperty(value = "properties")
    private AlertsMetadataProperties properties;

    /**
     * Get the properties property: alert meta data property bag.
     *
     * @return the properties value.
     */
    public AlertsMetadataProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: alert meta data property bag.
     *
     * @param properties the properties value to set.
     * @return the AlertsMetadataInner object itself.
     */
    public AlertsMetadataInner withProperties(AlertsMetadataProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
