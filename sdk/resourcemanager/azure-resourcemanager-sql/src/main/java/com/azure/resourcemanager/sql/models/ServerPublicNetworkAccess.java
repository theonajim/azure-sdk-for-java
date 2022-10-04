// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerPublicNetworkAccess. */
public final class ServerPublicNetworkAccess extends ExpandableStringEnum<ServerPublicNetworkAccess> {
    /** Static value Enabled for ServerPublicNetworkAccess. */
    public static final ServerPublicNetworkAccess ENABLED = fromString("Enabled");

    /** Static value Disabled for ServerPublicNetworkAccess. */
    public static final ServerPublicNetworkAccess DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ServerPublicNetworkAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerPublicNetworkAccess.
     */
    @JsonCreator
    public static ServerPublicNetworkAccess fromString(String name) {
        return fromString(name, ServerPublicNetworkAccess.class);
    }

    /**
     * Gets known ServerPublicNetworkAccess values.
     *
     * @return known ServerPublicNetworkAccess values.
     */
    public static Collection<ServerPublicNetworkAccess> values() {
        return values(ServerPublicNetworkAccess.class);
    }
}
