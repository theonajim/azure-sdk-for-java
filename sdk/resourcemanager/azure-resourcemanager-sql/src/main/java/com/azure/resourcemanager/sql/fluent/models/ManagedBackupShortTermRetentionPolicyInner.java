// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A short term retention policy. */
@Fluent
public final class ManagedBackupShortTermRetentionPolicyInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ManagedBackupShortTermRetentionPolicyProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ManagedBackupShortTermRetentionPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionDays();
    }

    /**
     * Set the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the ManagedBackupShortTermRetentionPolicyInner object itself.
     */
    public ManagedBackupShortTermRetentionPolicyInner withRetentionDays(Integer retentionDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedBackupShortTermRetentionPolicyProperties();
        }
        this.innerProperties().withRetentionDays(retentionDays);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
