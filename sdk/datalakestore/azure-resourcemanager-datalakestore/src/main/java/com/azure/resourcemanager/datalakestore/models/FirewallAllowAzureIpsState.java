// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is
 * disabled, this is not enforced.
 */
public enum FirewallAllowAzureIpsState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a FirewallAllowAzureIpsState instance. */
    private final String value;

    FirewallAllowAzureIpsState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FirewallAllowAzureIpsState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FirewallAllowAzureIpsState object, or null if unable to parse.
     */
    @JsonCreator
    public static FirewallAllowAzureIpsState fromString(String value) {
        if (value == null) {
            return null;
        }
        FirewallAllowAzureIpsState[] items = FirewallAllowAzureIpsState.values();
        for (FirewallAllowAzureIpsState item : items) {
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
