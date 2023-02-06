// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The SparkServicePlugin model. */
@Fluent
public final class SparkServicePlugin {
    /*
     * The preparationStartedAt property.
     */
    @JsonProperty(value = "preparationStartedAt")
    private OffsetDateTime preparationStartedAt;

    /*
     * The resourceAcquisitionStartedAt property.
     */
    @JsonProperty(value = "resourceAcquisitionStartedAt")
    private OffsetDateTime resourceAcquisitionStartedAt;

    /*
     * The submissionStartedAt property.
     */
    @JsonProperty(value = "submissionStartedAt")
    private OffsetDateTime submissionStartedAt;

    /*
     * The monitoringStartedAt property.
     */
    @JsonProperty(value = "monitoringStartedAt")
    private OffsetDateTime monitoringStartedAt;

    /*
     * The cleanupStartedAt property.
     */
    @JsonProperty(value = "cleanupStartedAt")
    private OffsetDateTime cleanupStartedAt;

    /*
     * The currentState property.
     */
    @JsonProperty(value = "currentState")
    private PluginCurrentState currentState;

    /** Creates an instance of SparkServicePlugin class. */
    public SparkServicePlugin() {}

    /**
     * Get the preparationStartedAt property: The preparationStartedAt property.
     *
     * @return the preparationStartedAt value.
     */
    public OffsetDateTime getPreparationStartedAt() {
        return this.preparationStartedAt;
    }

    /**
     * Set the preparationStartedAt property: The preparationStartedAt property.
     *
     * @param preparationStartedAt the preparationStartedAt value to set.
     * @return the SparkServicePlugin object itself.
     */
    public SparkServicePlugin setPreparationStartedAt(OffsetDateTime preparationStartedAt) {
        this.preparationStartedAt = preparationStartedAt;
        return this;
    }

    /**
     * Get the resourceAcquisitionStartedAt property: The resourceAcquisitionStartedAt property.
     *
     * @return the resourceAcquisitionStartedAt value.
     */
    public OffsetDateTime getResourceAcquisitionStartedAt() {
        return this.resourceAcquisitionStartedAt;
    }

    /**
     * Set the resourceAcquisitionStartedAt property: The resourceAcquisitionStartedAt property.
     *
     * @param resourceAcquisitionStartedAt the resourceAcquisitionStartedAt value to set.
     * @return the SparkServicePlugin object itself.
     */
    public SparkServicePlugin setResourceAcquisitionStartedAt(OffsetDateTime resourceAcquisitionStartedAt) {
        this.resourceAcquisitionStartedAt = resourceAcquisitionStartedAt;
        return this;
    }

    /**
     * Get the submissionStartedAt property: The submissionStartedAt property.
     *
     * @return the submissionStartedAt value.
     */
    public OffsetDateTime getSubmissionStartedAt() {
        return this.submissionStartedAt;
    }

    /**
     * Set the submissionStartedAt property: The submissionStartedAt property.
     *
     * @param submissionStartedAt the submissionStartedAt value to set.
     * @return the SparkServicePlugin object itself.
     */
    public SparkServicePlugin setSubmissionStartedAt(OffsetDateTime submissionStartedAt) {
        this.submissionStartedAt = submissionStartedAt;
        return this;
    }

    /**
     * Get the monitoringStartedAt property: The monitoringStartedAt property.
     *
     * @return the monitoringStartedAt value.
     */
    public OffsetDateTime getMonitoringStartedAt() {
        return this.monitoringStartedAt;
    }

    /**
     * Set the monitoringStartedAt property: The monitoringStartedAt property.
     *
     * @param monitoringStartedAt the monitoringStartedAt value to set.
     * @return the SparkServicePlugin object itself.
     */
    public SparkServicePlugin setMonitoringStartedAt(OffsetDateTime monitoringStartedAt) {
        this.monitoringStartedAt = monitoringStartedAt;
        return this;
    }

    /**
     * Get the cleanupStartedAt property: The cleanupStartedAt property.
     *
     * @return the cleanupStartedAt value.
     */
    public OffsetDateTime getCleanupStartedAt() {
        return this.cleanupStartedAt;
    }

    /**
     * Set the cleanupStartedAt property: The cleanupStartedAt property.
     *
     * @param cleanupStartedAt the cleanupStartedAt value to set.
     * @return the SparkServicePlugin object itself.
     */
    public SparkServicePlugin setCleanupStartedAt(OffsetDateTime cleanupStartedAt) {
        this.cleanupStartedAt = cleanupStartedAt;
        return this;
    }

    /**
     * Get the currentState property: The currentState property.
     *
     * @return the currentState value.
     */
    public PluginCurrentState getCurrentState() {
        return this.currentState;
    }

    /**
     * Set the currentState property: The currentState property.
     *
     * @param currentState the currentState value to set.
     * @return the SparkServicePlugin object itself.
     */
    public SparkServicePlugin setCurrentState(PluginCurrentState currentState) {
        this.currentState = currentState;
        return this;
    }
}
