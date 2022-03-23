// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConfidenceLevel. */
public final class ConfidenceLevel extends ExpandableStringEnum<ConfidenceLevel> {
    /** Static value Unknown for ConfidenceLevel. */
    public static final ConfidenceLevel UNKNOWN = fromString("Unknown");

    /** Static value Low for ConfidenceLevel. */
    public static final ConfidenceLevel LOW = fromString("Low");

    /** Static value High for ConfidenceLevel. */
    public static final ConfidenceLevel HIGH = fromString("High");

    /**
     * Creates or finds a ConfidenceLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfidenceLevel.
     */
    @JsonCreator
    public static ConfidenceLevel fromString(String name) {
        return fromString(name, ConfidenceLevel.class);
    }

    /** @return known ConfidenceLevel values. */
    public static Collection<ConfidenceLevel> values() {
        return values(ConfidenceLevel.class);
    }
}
