// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Sets the routing preference of the SAP monitor. By default only RFC1918 traffic is routed to the customer VNET.
 */
public final class RoutingPreference extends ExpandableStringEnum<RoutingPreference> {
    /**
     * Static value Default for RoutingPreference.
     */
    public static final RoutingPreference DEFAULT = fromString("Default");

    /**
     * Static value RouteAll for RoutingPreference.
     */
    public static final RoutingPreference ROUTE_ALL = fromString("RouteAll");

    /**
     * Creates a new instance of RoutingPreference value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RoutingPreference() {
    }

    /**
     * Creates or finds a RoutingPreference from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RoutingPreference.
     */
    @JsonCreator
    public static RoutingPreference fromString(String name) {
        return fromString(name, RoutingPreference.class);
    }

    /**
     * Gets known RoutingPreference values.
     * 
     * @return known RoutingPreference values.
     */
    public static Collection<RoutingPreference> values() {
        return values(RoutingPreference.class);
    }
}
