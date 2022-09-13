// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure SQL Managed Instance dataset properties. */
@Fluent
public final class AzureSqlMITableDatasetTypeProperties {
    /*
     * This property will be retired. Please consider using schema + table properties instead.
     */
    @JsonProperty(value = "tableName")
    private Object tableName;

    /*
     * The schema name of the Azure SQL Managed Instance. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "schema")
    private Object schema;

    /*
     * The table name of the Azure SQL Managed Instance dataset. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "table")
    private Object table;

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @param tableName the tableName value to set.
     * @return the AzureSqlMITableDatasetTypeProperties object itself.
     */
    public AzureSqlMITableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the schema property: The schema name of the Azure SQL Managed Instance. Type: string (or Expression with
     * resultType string).
     *
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: The schema name of the Azure SQL Managed Instance. Type: string (or Expression with
     * resultType string).
     *
     * @param schema the schema value to set.
     * @return the AzureSqlMITableDatasetTypeProperties object itself.
     */
    public AzureSqlMITableDatasetTypeProperties withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the table property: The table name of the Azure SQL Managed Instance dataset. Type: string (or Expression
     * with resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The table name of the Azure SQL Managed Instance dataset. Type: string (or Expression
     * with resultType string).
     *
     * @param table the table value to set.
     * @return the AzureSqlMITableDatasetTypeProperties object itself.
     */
    public AzureSqlMITableDatasetTypeProperties withTable(Object table) {
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
