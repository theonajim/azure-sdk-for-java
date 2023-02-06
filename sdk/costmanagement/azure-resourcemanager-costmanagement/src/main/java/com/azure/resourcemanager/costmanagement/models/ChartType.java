// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Chart type of the main view in Cost Analysis. Required. */
public final class ChartType extends ExpandableStringEnum<ChartType> {
    /** Static value Area for ChartType. */
    public static final ChartType AREA = fromString("Area");

    /** Static value Line for ChartType. */
    public static final ChartType LINE = fromString("Line");

    /** Static value StackedColumn for ChartType. */
    public static final ChartType STACKED_COLUMN = fromString("StackedColumn");

    /** Static value GroupedColumn for ChartType. */
    public static final ChartType GROUPED_COLUMN = fromString("GroupedColumn");

    /** Static value Table for ChartType. */
    public static final ChartType TABLE = fromString("Table");

    /**
     * Creates a new instance of ChartType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ChartType() {
    }

    /**
     * Creates or finds a ChartType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChartType.
     */
    @JsonCreator
    public static ChartType fromString(String name) {
        return fromString(name, ChartType.class);
    }

    /**
     * Gets known ChartType values.
     *
     * @return known ChartType values.
     */
    public static Collection<ChartType> values() {
        return values(ChartType.class);
    }
}
