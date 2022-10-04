// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure MySQL database dataset properties. */
@Fluent
public final class AzureMySqlTableDatasetTypeProperties {
    /*
     * The Azure MySQL database table name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "tableName")
    private Object tableName;

    /*
     * The name of Azure MySQL database table. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "table")
    private Object table;

    /**
     * Get the tableName property: The Azure MySQL database table name. Type: string (or Expression with resultType
     * string).
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The Azure MySQL database table name. Type: string (or Expression with resultType
     * string).
     *
     * @param tableName the tableName value to set.
     * @return the AzureMySqlTableDatasetTypeProperties object itself.
     */
    public AzureMySqlTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table property: The name of Azure MySQL database table. Type: string (or Expression with resultType
     * string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The name of Azure MySQL database table. Type: string (or Expression with resultType
     * string).
     *
     * @param table the table value to set.
     * @return the AzureMySqlTableDatasetTypeProperties object itself.
     */
    public AzureMySqlTableDatasetTypeProperties withTable(Object table) {
        this.table = table;
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
