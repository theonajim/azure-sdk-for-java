// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The configuration Type.
 */
public final class SapConfigurationType extends ExpandableStringEnum<SapConfigurationType> {
    /**
     * Static value Deployment for SapConfigurationType.
     */
    public static final SapConfigurationType DEPLOYMENT = fromString("Deployment");

    /**
     * Static value Discovery for SapConfigurationType.
     */
    public static final SapConfigurationType DISCOVERY = fromString("Discovery");

    /**
     * Static value DeploymentWithOSConfig for SapConfigurationType.
     */
    public static final SapConfigurationType DEPLOYMENT_WITH_OSCONFIG = fromString("DeploymentWithOSConfig");

    /**
     * Creates a new instance of SapConfigurationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SapConfigurationType() {
    }

    /**
     * Creates or finds a SapConfigurationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SapConfigurationType.
     */
    @JsonCreator
    public static SapConfigurationType fromString(String name) {
        return fromString(name, SapConfigurationType.class);
    }

    /**
     * Gets known SapConfigurationType values.
     * 
     * @return known SapConfigurationType values.
     */
    public static Collection<SapConfigurationType> values() {
        return values(SapConfigurationType.class);
    }
}
