// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TumblingWindowFrequency. */
public final class TumblingWindowFrequency extends ExpandableStringEnum<TumblingWindowFrequency> {
    /** Static value Minute for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency MINUTE = fromString("Minute");

    /** Static value Hour for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency HOUR = fromString("Hour");

    /** Static value Month for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency MONTH = fromString("Month");

    /**
     * Creates or finds a TumblingWindowFrequency from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TumblingWindowFrequency.
     */
    @JsonCreator
    public static TumblingWindowFrequency fromString(String name) {
        return fromString(name, TumblingWindowFrequency.class);
    }

    /**
     * Gets known TumblingWindowFrequency values.
     *
     * @return known TumblingWindowFrequency values.
     */
    public static Collection<TumblingWindowFrequency> values() {
        return values(TumblingWindowFrequency.class);
    }
}
