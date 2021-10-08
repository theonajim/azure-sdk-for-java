// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User activities of a data warehouse. This currently includes the count of running or suspended queries. For more
 * information, please view the sys.dm_pdw_exec_requests dynamic management view (DMV).
 */
@Immutable
public final class DataWarehouseUserActivitiesProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataWarehouseUserActivitiesProperties.class);

    /*
     * Count of running and suspended queries.
     */
    @JsonProperty(value = "activeQueriesCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer activeQueriesCount;

    /**
     * Get the activeQueriesCount property: Count of running and suspended queries.
     *
     * @return the activeQueriesCount value.
     */
    public Integer activeQueriesCount() {
        return this.activeQueriesCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
