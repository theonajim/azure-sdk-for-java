// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImdsAttestation. */
public final class ImdsAttestation extends ExpandableStringEnum<ImdsAttestation> {
    /** Static value Disabled for ImdsAttestation. */
    public static final ImdsAttestation DISABLED = fromString("Disabled");

    /** Static value Enabled for ImdsAttestation. */
    public static final ImdsAttestation ENABLED = fromString("Enabled");

    /**
     * Creates or finds a ImdsAttestation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImdsAttestation.
     */
    @JsonCreator
    public static ImdsAttestation fromString(String name) {
        return fromString(name, ImdsAttestation.class);
    }

    /** @return known ImdsAttestation values. */
    public static Collection<ImdsAttestation> values() {
        return values(ImdsAttestation.class);
    }
}
