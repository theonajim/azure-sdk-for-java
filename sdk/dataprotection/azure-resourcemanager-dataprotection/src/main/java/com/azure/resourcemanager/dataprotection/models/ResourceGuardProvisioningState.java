// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the BackupVault resource. */
public final class ResourceGuardProvisioningState extends ExpandableStringEnum<ResourceGuardProvisioningState> {
    /** Static value Failed for ResourceGuardProvisioningState. */
    public static final ResourceGuardProvisioningState FAILED = fromString("Failed");

    /** Static value Provisioning for ResourceGuardProvisioningState. */
    public static final ResourceGuardProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Succeeded for ResourceGuardProvisioningState. */
    public static final ResourceGuardProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Unknown for ResourceGuardProvisioningState. */
    public static final ResourceGuardProvisioningState UNKNOWN = fromString("Unknown");

    /** Static value Updating for ResourceGuardProvisioningState. */
    public static final ResourceGuardProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of ResourceGuardProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceGuardProvisioningState() {
    }

    /**
     * Creates or finds a ResourceGuardProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceGuardProvisioningState.
     */
    @JsonCreator
    public static ResourceGuardProvisioningState fromString(String name) {
        return fromString(name, ResourceGuardProvisioningState.class);
    }

    /**
     * Gets known ResourceGuardProvisioningState values.
     *
     * @return known ResourceGuardProvisioningState values.
     */
    public static Collection<ResourceGuardProvisioningState> values() {
        return values(ResourceGuardProvisioningState.class);
    }
}
