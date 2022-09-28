// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Credential reference type. */
public final class CredentialReferenceType extends ExpandableStringEnum<CredentialReferenceType> {
    /** Static value CredentialReference for CredentialReferenceType. */
    public static final CredentialReferenceType CREDENTIAL_REFERENCE = fromString("CredentialReference");

    /**
     * Creates or finds a CredentialReferenceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CredentialReferenceType.
     */
    @JsonCreator
    public static CredentialReferenceType fromString(String name) {
        return fromString(name, CredentialReferenceType.class);
    }

    /**
     * Gets known CredentialReferenceType values.
     *
     * @return known CredentialReferenceType values.
     */
    public static Collection<CredentialReferenceType> values() {
        return values(CredentialReferenceType.class);
    }
}
