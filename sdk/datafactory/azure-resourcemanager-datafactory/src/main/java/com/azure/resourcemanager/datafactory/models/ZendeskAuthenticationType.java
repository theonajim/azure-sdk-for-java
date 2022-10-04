// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication type to use. */
public final class ZendeskAuthenticationType extends ExpandableStringEnum<ZendeskAuthenticationType> {
    /** Static value Basic for ZendeskAuthenticationType. */
    public static final ZendeskAuthenticationType BASIC = fromString("Basic");

    /** Static value Token for ZendeskAuthenticationType. */
    public static final ZendeskAuthenticationType TOKEN = fromString("Token");

    /**
     * Creates or finds a ZendeskAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ZendeskAuthenticationType.
     */
    @JsonCreator
    public static ZendeskAuthenticationType fromString(String name) {
        return fromString(name, ZendeskAuthenticationType.class);
    }

    /**
     * Gets known ZendeskAuthenticationType values.
     *
     * @return known ZendeskAuthenticationType values.
     */
    public static Collection<ZendeskAuthenticationType> values() {
        return values(ZendeskAuthenticationType.class);
    }
}
