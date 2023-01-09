// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the table in the database full schema. */
@Immutable
public final class SyncFullSchemaTable {
    /*
     * List of columns in the table of database full schema.
     */
    @JsonProperty(value = "columns", access = JsonProperty.Access.WRITE_ONLY)
    private List<SyncFullSchemaTableColumn> columns;

    /*
     * Error id of the table.
     */
    @JsonProperty(value = "errorId", access = JsonProperty.Access.WRITE_ONLY)
    private String errorId;

    /*
     * If there is error in the table.
     */
    @JsonProperty(value = "hasError", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasError;

    /*
     * Name of the table.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Quoted name of the table.
     */
    @JsonProperty(value = "quotedName", access = JsonProperty.Access.WRITE_ONLY)
    private String quotedName;

    /** Creates an instance of SyncFullSchemaTable class. */
    public SyncFullSchemaTable() {
    }

    /**
     * Get the columns property: List of columns in the table of database full schema.
     *
     * @return the columns value.
     */
    public List<SyncFullSchemaTableColumn> columns() {
        return this.columns;
    }

    /**
     * Get the errorId property: Error id of the table.
     *
     * @return the errorId value.
     */
    public String errorId() {
        return this.errorId;
    }

    /**
     * Get the hasError property: If there is error in the table.
     *
     * @return the hasError value.
     */
    public Boolean hasError() {
        return this.hasError;
    }

    /**
     * Get the name property: Name of the table.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the quotedName property: Quoted name of the table.
     *
     * @return the quotedName value.
     */
    public String quotedName() {
        return this.quotedName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
    }
}
