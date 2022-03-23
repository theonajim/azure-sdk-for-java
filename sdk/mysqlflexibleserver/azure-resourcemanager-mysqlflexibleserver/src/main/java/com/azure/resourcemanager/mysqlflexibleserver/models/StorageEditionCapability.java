// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** storage edition capability. */
@Immutable
public final class StorageEditionCapability {
    /*
     * storage edition name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The minimal supported storage size.
     */
    @JsonProperty(value = "minStorageSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long minStorageSize;

    /*
     * The maximum supported storage size.
     */
    @JsonProperty(value = "maxStorageSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxStorageSize;

    /*
     * Minimal backup retention days
     */
    @JsonProperty(value = "minBackupRetentionDays", access = JsonProperty.Access.WRITE_ONLY)
    private Long minBackupRetentionDays;

    /*
     * Maximum backup retention days
     */
    @JsonProperty(value = "maxBackupRetentionDays", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxBackupRetentionDays;

    /**
     * Get the name property: storage edition name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the minStorageSize property: The minimal supported storage size.
     *
     * @return the minStorageSize value.
     */
    public Long minStorageSize() {
        return this.minStorageSize;
    }

    /**
     * Get the maxStorageSize property: The maximum supported storage size.
     *
     * @return the maxStorageSize value.
     */
    public Long maxStorageSize() {
        return this.maxStorageSize;
    }

    /**
     * Get the minBackupRetentionDays property: Minimal backup retention days.
     *
     * @return the minBackupRetentionDays value.
     */
    public Long minBackupRetentionDays() {
        return this.minBackupRetentionDays;
    }

    /**
     * Get the maxBackupRetentionDays property: Maximum backup retention days.
     *
     * @return the maxBackupRetentionDays value.
     */
    public Long maxBackupRetentionDays() {
        return this.maxBackupRetentionDays;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
