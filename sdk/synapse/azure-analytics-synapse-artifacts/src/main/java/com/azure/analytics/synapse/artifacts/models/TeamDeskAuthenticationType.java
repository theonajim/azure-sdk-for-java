// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication type to use. */
public final class TeamDeskAuthenticationType extends ExpandableStringEnum<TeamDeskAuthenticationType> {
    /** Static value Basic for TeamDeskAuthenticationType. */
    public static final TeamDeskAuthenticationType BASIC = fromString("Basic");

    /** Static value Token for TeamDeskAuthenticationType. */
    public static final TeamDeskAuthenticationType TOKEN = fromString("Token");

    /**
     * Creates or finds a TeamDeskAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TeamDeskAuthenticationType.
     */
    @JsonCreator
    public static TeamDeskAuthenticationType fromString(String name) {
        return fromString(name, TeamDeskAuthenticationType.class);
    }

    /**
     * Gets known TeamDeskAuthenticationType values.
     *
     * @return known TeamDeskAuthenticationType values.
     */
    public static Collection<TeamDeskAuthenticationType> values() {
        return values(TeamDeskAuthenticationType.class);
    }
}
