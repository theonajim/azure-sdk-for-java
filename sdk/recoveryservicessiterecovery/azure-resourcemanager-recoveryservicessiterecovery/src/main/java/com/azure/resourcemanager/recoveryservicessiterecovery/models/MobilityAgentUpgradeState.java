// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The agent auto upgrade state. */
public final class MobilityAgentUpgradeState extends ExpandableStringEnum<MobilityAgentUpgradeState> {
    /** Static value None for MobilityAgentUpgradeState. */
    public static final MobilityAgentUpgradeState NONE = fromString("None");

    /** Static value Started for MobilityAgentUpgradeState. */
    public static final MobilityAgentUpgradeState STARTED = fromString("Started");

    /** Static value Completed for MobilityAgentUpgradeState. */
    public static final MobilityAgentUpgradeState COMPLETED = fromString("Completed");

    /** Static value Commit for MobilityAgentUpgradeState. */
    public static final MobilityAgentUpgradeState COMMIT = fromString("Commit");

    /**
     * Creates or finds a MobilityAgentUpgradeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MobilityAgentUpgradeState.
     */
    @JsonCreator
    public static MobilityAgentUpgradeState fromString(String name) {
        return fromString(name, MobilityAgentUpgradeState.class);
    }

    /**
     * Gets known MobilityAgentUpgradeState values.
     *
     * @return known MobilityAgentUpgradeState values.
     */
    public static Collection<MobilityAgentUpgradeState> values() {
        return values(MobilityAgentUpgradeState.class);
    }
}
