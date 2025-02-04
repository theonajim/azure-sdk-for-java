// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DataSourceType. */
public enum DataSourceType {
    /** Enum value CustomLogs. */
    CUSTOM_LOGS("CustomLogs"),

    /** Enum value AzureWatson. */
    AZURE_WATSON("AzureWatson"),

    /** Enum value Query. */
    QUERY("Query"),

    /** Enum value Ingestion. */
    INGESTION("Ingestion"),

    /** Enum value Alerts. */
    ALERTS("Alerts");

    /** The actual serialized value for a DataSourceType instance. */
    private final String value;

    DataSourceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataSourceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataSourceType object, or null if unable to parse.
     */
    @JsonCreator
    public static DataSourceType fromString(String value) {
        DataSourceType[] items = DataSourceType.values();
        for (DataSourceType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
