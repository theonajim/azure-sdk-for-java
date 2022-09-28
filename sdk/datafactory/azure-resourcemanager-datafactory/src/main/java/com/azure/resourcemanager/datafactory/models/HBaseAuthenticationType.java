// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication mechanism to use to connect to the HBase server. */
public final class HBaseAuthenticationType extends ExpandableStringEnum<HBaseAuthenticationType> {
    /** Static value Anonymous for HBaseAuthenticationType. */
    public static final HBaseAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Basic for HBaseAuthenticationType. */
    public static final HBaseAuthenticationType BASIC = fromString("Basic");

    /**
     * Creates or finds a HBaseAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HBaseAuthenticationType.
     */
    @JsonCreator
    public static HBaseAuthenticationType fromString(String name) {
        return fromString(name, HBaseAuthenticationType.class);
    }

    /**
     * Gets known HBaseAuthenticationType values.
     *
     * @return known HBaseAuthenticationType values.
     */
    public static Collection<HBaseAuthenticationType> values() {
        return values(HBaseAuthenticationType.class);
    }
}
