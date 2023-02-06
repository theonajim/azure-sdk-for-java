// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AuthenticationName. */
public final class AuthenticationName extends ExpandableStringEnum<AuthenticationName> {
    /** Static value Default for AuthenticationName. */
    public static final AuthenticationName DEFAULT = fromString("Default");

    /**
     * Creates or finds a AuthenticationName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuthenticationName.
     */
    @JsonCreator
    public static AuthenticationName fromString(String name) {
        return fromString(name, AuthenticationName.class);
    }

    /**
     * Gets known AuthenticationName values.
     *
     * @return known AuthenticationName values.
     */
    public static Collection<AuthenticationName> values() {
        return values(AuthenticationName.class);
    }
}
