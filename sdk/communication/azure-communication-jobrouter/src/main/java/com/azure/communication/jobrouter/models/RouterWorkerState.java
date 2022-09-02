// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RouterWorkerState. */
public final class RouterWorkerState extends ExpandableStringEnum<RouterWorkerState> {
    /** Static value active for RouterWorkerState. */
    public static final RouterWorkerState ACTIVE = fromString("active");

    /** Static value draining for RouterWorkerState. */
    public static final RouterWorkerState DRAINING = fromString("draining");

    /** Static value inactive for RouterWorkerState. */
    public static final RouterWorkerState INACTIVE = fromString("inactive");

    /**
     * Creates or finds a RouterWorkerState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouterWorkerState.
     */
    @JsonCreator
    public static RouterWorkerState fromString(String name) {
        return fromString(name, RouterWorkerState.class);
    }

    /**
     * Gets known RouterWorkerState values.
     *
     * @return known RouterWorkerState values.
     */
    public static Collection<RouterWorkerState> values() {
        return values(RouterWorkerState.class);
    }
}
