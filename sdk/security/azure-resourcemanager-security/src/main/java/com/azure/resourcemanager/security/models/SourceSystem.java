// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The source type of the machine group. */
public final class SourceSystem extends ExpandableStringEnum<SourceSystem> {
    /** Static value Azure_AppLocker for SourceSystem. */
    public static final SourceSystem AZURE_APP_LOCKER = fromString("Azure_AppLocker");

    /** Static value Azure_AuditD for SourceSystem. */
    public static final SourceSystem AZURE_AUDITD = fromString("Azure_AuditD");

    /** Static value NonAzure_AppLocker for SourceSystem. */
    public static final SourceSystem NON_AZURE_APP_LOCKER = fromString("NonAzure_AppLocker");

    /** Static value NonAzure_AuditD for SourceSystem. */
    public static final SourceSystem NON_AZURE_AUDITD = fromString("NonAzure_AuditD");

    /** Static value None for SourceSystem. */
    public static final SourceSystem NONE = fromString("None");

    /**
     * Creates or finds a SourceSystem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SourceSystem.
     */
    @JsonCreator
    public static SourceSystem fromString(String name) {
        return fromString(name, SourceSystem.class);
    }

    /**
     * Gets known SourceSystem values.
     *
     * @return known SourceSystem values.
     */
    public static Collection<SourceSystem> values() {
        return values(SourceSystem.class);
    }
}
