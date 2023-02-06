// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InstanceViewTypes. */
public final class InstanceViewTypes extends ExpandableStringEnum<InstanceViewTypes> {
    /** Static value instanceView for InstanceViewTypes. */
    public static final InstanceViewTypes INSTANCE_VIEW = fromString("instanceView");

    /**
     * Creates a new instance of InstanceViewTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InstanceViewTypes() {
    }

    /**
     * Creates or finds a InstanceViewTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InstanceViewTypes.
     */
    @JsonCreator
    public static InstanceViewTypes fromString(String name) {
        return fromString(name, InstanceViewTypes.class);
    }

    /**
     * Gets known InstanceViewTypes values.
     *
     * @return known InstanceViewTypes values.
     */
    public static Collection<InstanceViewTypes> values() {
        return values(InstanceViewTypes.class);
    }
}
