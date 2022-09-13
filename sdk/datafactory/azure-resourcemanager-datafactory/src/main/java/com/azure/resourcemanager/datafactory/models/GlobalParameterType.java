// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Global Parameter type. */
public final class GlobalParameterType extends ExpandableStringEnum<GlobalParameterType> {
    /** Static value Object for GlobalParameterType. */
    public static final GlobalParameterType OBJECT = fromString("Object");

    /** Static value String for GlobalParameterType. */
    public static final GlobalParameterType STRING = fromString("String");

    /** Static value Int for GlobalParameterType. */
    public static final GlobalParameterType INT = fromString("Int");

    /** Static value Float for GlobalParameterType. */
    public static final GlobalParameterType FLOAT = fromString("Float");

    /** Static value Bool for GlobalParameterType. */
    public static final GlobalParameterType BOOL = fromString("Bool");

    /** Static value Array for GlobalParameterType. */
    public static final GlobalParameterType ARRAY = fromString("Array");

    /**
     * Creates or finds a GlobalParameterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GlobalParameterType.
     */
    @JsonCreator
    public static GlobalParameterType fromString(String name) {
        return fromString(name, GlobalParameterType.class);
    }

    /**
     * Gets known GlobalParameterType values.
     *
     * @return known GlobalParameterType values.
     */
    public static Collection<GlobalParameterType> values() {
        return values(GlobalParameterType.class);
    }
}
