// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Properties for the task that collects user tables for the given list of databases. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("GetUserTables.AzureSqlDb.Sync")
@Fluent
public final class GetUserTablesSqlSyncTaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private GetUserTablesSqlSyncTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<GetUserTablesSqlSyncTaskOutput> output;

    /** Creates an instance of GetUserTablesSqlSyncTaskProperties class. */
    public GetUserTablesSqlSyncTaskProperties() {
    }

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public GetUserTablesSqlSyncTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the GetUserTablesSqlSyncTaskProperties object itself.
     */
    public GetUserTablesSqlSyncTaskProperties withInput(GetUserTablesSqlSyncTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<GetUserTablesSqlSyncTaskOutput> output() {
        return this.output;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
    }
}
