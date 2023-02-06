// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Status of the job stage. */
public enum StageStatus {
    /** Enum value None. */
    NONE("None"),

    /** Enum value InProgress. */
    IN_PROGRESS("InProgress"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Cancelled. */
    CANCELLED("Cancelled"),

    /** Enum value Cancelling. */
    CANCELLING("Cancelling"),

    /** Enum value SucceededWithErrors. */
    SUCCEEDED_WITH_ERRORS("SucceededWithErrors"),

    /** Enum value WaitingForCustomerAction. */
    WAITING_FOR_CUSTOMER_ACTION("WaitingForCustomerAction"),

    /** Enum value SucceededWithWarnings. */
    SUCCEEDED_WITH_WARNINGS("SucceededWithWarnings");

    /** The actual serialized value for a StageStatus instance. */
    private final String value;

    StageStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StageStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StageStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static StageStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        StageStatus[] items = StageStatus.values();
        for (StageStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
