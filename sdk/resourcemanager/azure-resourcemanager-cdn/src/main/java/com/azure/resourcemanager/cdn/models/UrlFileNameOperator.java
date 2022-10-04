// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes operator to be matched. */
public final class UrlFileNameOperator extends ExpandableStringEnum<UrlFileNameOperator> {
    /** Static value Any for UrlFileNameOperator. */
    public static final UrlFileNameOperator ANY = fromString("Any");

    /** Static value Equal for UrlFileNameOperator. */
    public static final UrlFileNameOperator EQUAL = fromString("Equal");

    /** Static value Contains for UrlFileNameOperator. */
    public static final UrlFileNameOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for UrlFileNameOperator. */
    public static final UrlFileNameOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for UrlFileNameOperator. */
    public static final UrlFileNameOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for UrlFileNameOperator. */
    public static final UrlFileNameOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for UrlFileNameOperator. */
    public static final UrlFileNameOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for UrlFileNameOperator. */
    public static final UrlFileNameOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for UrlFileNameOperator. */
    public static final UrlFileNameOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for UrlFileNameOperator. */
    public static final UrlFileNameOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a UrlFileNameOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UrlFileNameOperator.
     */
    @JsonCreator
    public static UrlFileNameOperator fromString(String name) {
        return fromString(name, UrlFileNameOperator.class);
    }

    /**
     * Gets known UrlFileNameOperator values.
     *
     * @return known UrlFileNameOperator values.
     */
    public static Collection<UrlFileNameOperator> values() {
        return values(UrlFileNameOperator.class);
    }
}
