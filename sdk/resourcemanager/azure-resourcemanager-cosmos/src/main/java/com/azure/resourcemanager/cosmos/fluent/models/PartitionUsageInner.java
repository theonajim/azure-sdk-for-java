// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The partition level usage data for a usage request. */
@Immutable
public final class PartitionUsageInner extends UsageInner {
    /*
     * The partition id (GUID identifier) of the usages.
     */
    @JsonProperty(value = "partitionId", access = JsonProperty.Access.WRITE_ONLY)
    private String partitionId;

    /*
     * The partition key range id (integer identifier) of the usages.
     */
    @JsonProperty(value = "partitionKeyRangeId", access = JsonProperty.Access.WRITE_ONLY)
    private String partitionKeyRangeId;

    /**
     * Get the partitionId property: The partition id (GUID identifier) of the usages.
     *
     * @return the partitionId value.
     */
    public String partitionId() {
        return this.partitionId;
    }

    /**
     * Get the partitionKeyRangeId property: The partition key range id (integer identifier) of the usages.
     *
     * @return the partitionKeyRangeId value.
     */
    public String partitionKeyRangeId() {
        return this.partitionKeyRangeId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
