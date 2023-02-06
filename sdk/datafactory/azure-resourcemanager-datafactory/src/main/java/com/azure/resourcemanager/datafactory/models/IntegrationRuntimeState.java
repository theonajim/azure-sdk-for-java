// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of integration runtime. */
public final class IntegrationRuntimeState extends ExpandableStringEnum<IntegrationRuntimeState> {
    /** Static value Initial for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState INITIAL = fromString("Initial");

    /** Static value Stopped for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STOPPED = fromString("Stopped");

    /** Static value Started for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STARTED = fromString("Started");

    /** Static value Starting for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STARTING = fromString("Starting");

    /** Static value Stopping for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STOPPING = fromString("Stopping");

    /** Static value NeedRegistration for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState NEED_REGISTRATION = fromString("NeedRegistration");

    /** Static value Online for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState ONLINE = fromString("Online");

    /** Static value Limited for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState LIMITED = fromString("Limited");

    /** Static value Offline for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState OFFLINE = fromString("Offline");

    /** Static value AccessDenied for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState ACCESS_DENIED = fromString("AccessDenied");

    /**
     * Creates a new instance of IntegrationRuntimeState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IntegrationRuntimeState() {
    }

    /**
     * Creates or finds a IntegrationRuntimeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeState.
     */
    @JsonCreator
    public static IntegrationRuntimeState fromString(String name) {
        return fromString(name, IntegrationRuntimeState.class);
    }

    /**
     * Gets known IntegrationRuntimeState values.
     *
     * @return known IntegrationRuntimeState values.
     */
    public static Collection<IntegrationRuntimeState> values() {
        return values(IntegrationRuntimeState.class);
    }
}
