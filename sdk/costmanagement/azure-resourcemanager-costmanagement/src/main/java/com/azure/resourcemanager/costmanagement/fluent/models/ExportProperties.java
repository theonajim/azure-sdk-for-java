// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.costmanagement.models.ExportDefinition;
import com.azure.resourcemanager.costmanagement.models.ExportDeliveryInfo;
import com.azure.resourcemanager.costmanagement.models.ExportSchedule;
import com.azure.resourcemanager.costmanagement.models.FormatType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the export. */
@Fluent
public final class ExportProperties extends CommonExportPropertiesInner {
    /*
     * Has schedule information for the export.
     */
    @JsonProperty(value = "schedule")
    private ExportSchedule schedule;

    /** Creates an instance of ExportProperties class. */
    public ExportProperties() {
    }

    /**
     * Get the schedule property: Has schedule information for the export.
     *
     * @return the schedule value.
     */
    public ExportSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Has schedule information for the export.
     *
     * @param schedule the schedule value to set.
     * @return the ExportProperties object itself.
     */
    public ExportProperties withSchedule(ExportSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExportProperties withFormat(FormatType format) {
        super.withFormat(format);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExportProperties withDeliveryInfo(ExportDeliveryInfo deliveryInfo) {
        super.withDeliveryInfo(deliveryInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExportProperties withDefinition(ExportDefinition definition) {
        super.withDefinition(definition);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExportProperties withRunHistory(ExportExecutionListResultInner runHistory) {
        super.withRunHistory(runHistory);
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
        if (schedule() != null) {
            schedule().validate();
        }
    }
}
