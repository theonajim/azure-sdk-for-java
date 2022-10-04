// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Protocol to use for the redirect. The default value is MatchRequest. */
public final class DestinationProtocol extends ExpandableStringEnum<DestinationProtocol> {
    /** Static value MatchRequest for DestinationProtocol. */
    public static final DestinationProtocol MATCH_REQUEST = fromString("MatchRequest");

    /** Static value Http for DestinationProtocol. */
    public static final DestinationProtocol HTTP = fromString("Http");

    /** Static value Https for DestinationProtocol. */
    public static final DestinationProtocol HTTPS = fromString("Https");

    /**
     * Creates or finds a DestinationProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DestinationProtocol.
     */
    @JsonCreator
    public static DestinationProtocol fromString(String name) {
        return fromString(name, DestinationProtocol.class);
    }

    /**
     * Gets known DestinationProtocol values.
     *
     * @return known DestinationProtocol values.
     */
    public static Collection<DestinationProtocol> values() {
        return values(DestinationProtocol.class);
    }
}
