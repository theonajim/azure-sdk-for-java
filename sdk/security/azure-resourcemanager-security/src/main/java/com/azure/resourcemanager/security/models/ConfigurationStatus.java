// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The configuration status of the machines group or machine or rule. */
public final class ConfigurationStatus extends ExpandableStringEnum<ConfigurationStatus> {
    /** Static value Configured for ConfigurationStatus. */
    public static final ConfigurationStatus CONFIGURED = fromString("Configured");

    /** Static value NotConfigured for ConfigurationStatus. */
    public static final ConfigurationStatus NOT_CONFIGURED = fromString("NotConfigured");

    /** Static value InProgress for ConfigurationStatus. */
    public static final ConfigurationStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Failed for ConfigurationStatus. */
    public static final ConfigurationStatus FAILED = fromString("Failed");

    /** Static value NoStatus for ConfigurationStatus. */
    public static final ConfigurationStatus NO_STATUS = fromString("NoStatus");

    /**
     * Creates or finds a ConfigurationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfigurationStatus.
     */
    @JsonCreator
    public static ConfigurationStatus fromString(String name) {
        return fromString(name, ConfigurationStatus.class);
    }

    /**
     * Gets known ConfigurationStatus values.
     *
     * @return known ConfigurationStatus values.
     */
    public static Collection<ConfigurationStatus> values() {
        return values(ConfigurationStatus.class);
    }
}
