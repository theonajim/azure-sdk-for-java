// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes type of rule. */
public final class RuleType extends ExpandableStringEnum<RuleType> {
    /** Static value MatchRule for RuleType. */
    public static final RuleType MATCH_RULE = fromString("MatchRule");

    /** Static value RateLimitRule for RuleType. */
    public static final RuleType RATE_LIMIT_RULE = fromString("RateLimitRule");

    /**
     * Creates a new instance of RuleType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RuleType() {
    }

    /**
     * Creates or finds a RuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RuleType.
     */
    @JsonCreator
    public static RuleType fromString(String name) {
        return fromString(name, RuleType.class);
    }

    /**
     * Gets known RuleType values.
     *
     * @return known RuleType values.
     */
    public static Collection<RuleType> values() {
        return values(RuleType.class);
    }
}
