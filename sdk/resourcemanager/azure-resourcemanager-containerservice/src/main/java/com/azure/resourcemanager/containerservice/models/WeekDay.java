// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The weekday enum. */
public final class WeekDay extends ExpandableStringEnum<WeekDay> {
    /** Static value Sunday for WeekDay. */
    public static final WeekDay SUNDAY = fromString("Sunday");

    /** Static value Monday for WeekDay. */
    public static final WeekDay MONDAY = fromString("Monday");

    /** Static value Tuesday for WeekDay. */
    public static final WeekDay TUESDAY = fromString("Tuesday");

    /** Static value Wednesday for WeekDay. */
    public static final WeekDay WEDNESDAY = fromString("Wednesday");

    /** Static value Thursday for WeekDay. */
    public static final WeekDay THURSDAY = fromString("Thursday");

    /** Static value Friday for WeekDay. */
    public static final WeekDay FRIDAY = fromString("Friday");

    /** Static value Saturday for WeekDay. */
    public static final WeekDay SATURDAY = fromString("Saturday");

    /**
     * Creates a new instance of WeekDay value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WeekDay() {
    }

    /**
     * Creates or finds a WeekDay from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WeekDay.
     */
    @JsonCreator
    public static WeekDay fromString(String name) {
        return fromString(name, WeekDay.class);
    }

    /**
     * Gets known WeekDay values.
     *
     * @return known WeekDay values.
     */
    public static Collection<WeekDay> values() {
        return values(WeekDay.class);
    }
}
