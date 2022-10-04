// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kusto.models.DatabaseStatistics;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Class representing the Kusto database properties. */
@Fluent
public final class ReadWriteDatabaseProperties {
    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     */
    @JsonProperty(value = "softDeletePeriod")
    private Duration softDeletePeriod;

    /*
     * The time the data should be kept in cache for fast queries in TimeSpan.
     */
    @JsonProperty(value = "hotCachePeriod")
    private Duration hotCachePeriod;

    /*
     * The statistics of the database.
     */
    @JsonProperty(value = "statistics", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseStatistics statistics;

    /*
     * Indicates whether the database is followed.
     */
    @JsonProperty(value = "isFollowed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFollowed;

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the softDeletePeriod property: The time the data should be kept before it stops being accessible to queries
     * in TimeSpan.
     *
     * @return the softDeletePeriod value.
     */
    public Duration softDeletePeriod() {
        return this.softDeletePeriod;
    }

    /**
     * Set the softDeletePeriod property: The time the data should be kept before it stops being accessible to queries
     * in TimeSpan.
     *
     * @param softDeletePeriod the softDeletePeriod value to set.
     * @return the ReadWriteDatabaseProperties object itself.
     */
    public ReadWriteDatabaseProperties withSoftDeletePeriod(Duration softDeletePeriod) {
        this.softDeletePeriod = softDeletePeriod;
        return this;
    }

    /**
     * Get the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @return the hotCachePeriod value.
     */
    public Duration hotCachePeriod() {
        return this.hotCachePeriod;
    }

    /**
     * Set the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @param hotCachePeriod the hotCachePeriod value to set.
     * @return the ReadWriteDatabaseProperties object itself.
     */
    public ReadWriteDatabaseProperties withHotCachePeriod(Duration hotCachePeriod) {
        this.hotCachePeriod = hotCachePeriod;
        return this;
    }

    /**
     * Get the statistics property: The statistics of the database.
     *
     * @return the statistics value.
     */
    public DatabaseStatistics statistics() {
        return this.statistics;
    }

    /**
     * Get the isFollowed property: Indicates whether the database is followed.
     *
     * @return the isFollowed value.
     */
    public Boolean isFollowed() {
        return this.isFollowed;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statistics() != null) {
            statistics().validate();
        }
    }
}
