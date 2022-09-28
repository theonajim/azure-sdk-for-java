// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The current update status of OneAgent. */
public final class UpdateStatus extends ExpandableStringEnum<UpdateStatus> {
    /** Static value INCOMPATIBLE for UpdateStatus. */
    public static final UpdateStatus INCOMPATIBLE = fromString("INCOMPATIBLE");

    /** Static value OUTDATED for UpdateStatus. */
    public static final UpdateStatus OUTDATED = fromString("OUTDATED");

    /** Static value SCHEDULED for UpdateStatus. */
    public static final UpdateStatus SCHEDULED = fromString("SCHEDULED");

    /** Static value SUPPRESSED for UpdateStatus. */
    public static final UpdateStatus SUPPRESSED = fromString("SUPPRESSED");

    /** Static value UNKNOWN for UpdateStatus. */
    public static final UpdateStatus UNKNOWN = fromString("UNKNOWN");

    /** Static value UP2DATE for UpdateStatus. */
    public static final UpdateStatus UP2DATE = fromString("UP2DATE");

    /** Static value UPDATE_IN_PROGRESS for UpdateStatus. */
    public static final UpdateStatus UPDATE_IN_PROGRESS = fromString("UPDATE_IN_PROGRESS");

    /** Static value UPDATE_PENDING for UpdateStatus. */
    public static final UpdateStatus UPDATE_PENDING = fromString("UPDATE_PENDING");

    /** Static value UPDATE_PROBLEM for UpdateStatus. */
    public static final UpdateStatus UPDATE_PROBLEM = fromString("UPDATE_PROBLEM");

    /**
     * Creates or finds a UpdateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpdateStatus.
     */
    @JsonCreator
    public static UpdateStatus fromString(String name) {
        return fromString(name, UpdateStatus.class);
    }

    /**
     * Gets known UpdateStatus values.
     *
     * @return known UpdateStatus values.
     */
    public static Collection<UpdateStatus> values() {
        return values(UpdateStatus.class);
    }
}
