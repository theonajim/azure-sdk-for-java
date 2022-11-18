// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.util.ExpandableStringEnum;

/** Defines values for TemporalModifier. */
public final class TemporalModifier extends ExpandableStringEnum<TemporalModifier> {
    /** Static value AfterApprox for TemporalModifier. */
    public static final TemporalModifier AFTER_APPROX = fromString("AfterApprox");

    /** Static value Before for TemporalModifier. */
    public static final TemporalModifier BEFORE = fromString("Before");

    /** Static value BeforeStart for TemporalModifier. */
    public static final TemporalModifier BEFORE_START = fromString("BeforeStart");

    /** Static value Approx for TemporalModifier. */
    public static final TemporalModifier APPROX = fromString("Approx");

    /** Static value ReferenceUndefined for TemporalModifier. */
    public static final TemporalModifier REFERENCE_UNDEFINED = fromString("ReferenceUndefined");

    /** Static value SinceEnd for TemporalModifier. */
    public static final TemporalModifier SINCE_END = fromString("SinceEnd");

    /** Static value AfterMid for TemporalModifier. */
    public static final TemporalModifier AFTER_MID = fromString("AfterMid");

    /** Static value Start for TemporalModifier. */
    public static final TemporalModifier START = fromString("Start");

    /** Static value After for TemporalModifier. */
    public static final TemporalModifier AFTER = fromString("After");

    /** Static value BeforeEnd for TemporalModifier. */
    public static final TemporalModifier BEFORE_END = fromString("BeforeEnd");

    /** Static value Until for TemporalModifier. */
    public static final TemporalModifier UNTIL = fromString("Until");

    /** Static value End for TemporalModifier. */
    public static final TemporalModifier END = fromString("End");

    /** Static value Less for TemporalModifier. */
    public static final TemporalModifier LESS = fromString("Less");

    /** Static value Since for TemporalModifier. */
    public static final TemporalModifier SINCE = fromString("Since");

    /** Static value AfterStart for TemporalModifier. */
    public static final TemporalModifier AFTER_START = fromString("AfterStart");

    /** Static value BeforeApprox for TemporalModifier. */
    public static final TemporalModifier BEFORE_APPROX = fromString("BeforeApprox");

    /** Static value Mid for TemporalModifier. */
    public static final TemporalModifier MID = fromString("Mid");

    /** Static value More for TemporalModifier. */
    public static final TemporalModifier MORE = fromString("More");

    /**
     * Creates or finds a TemporalModifier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TemporalModifier.
     */
    public static TemporalModifier fromString(String name) {
        return fromString(name, TemporalModifier.class);
    }
}
