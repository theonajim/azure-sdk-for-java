// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The platform of this runtime version (possible values: "Java" or ".NET"). */
public final class SupportedRuntimePlatform extends ExpandableStringEnum<SupportedRuntimePlatform> {
    /** Static value Java for SupportedRuntimePlatform. */
    public static final SupportedRuntimePlatform JAVA = fromString("Java");

    /** Static value .NET Core for SupportedRuntimePlatform. */
    public static final SupportedRuntimePlatform NET_CORE = fromString(".NET Core");

    /**
     * Creates or finds a SupportedRuntimePlatform from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SupportedRuntimePlatform.
     */
    @JsonCreator
    public static SupportedRuntimePlatform fromString(String name) {
        return fromString(name, SupportedRuntimePlatform.class);
    }

    /**
     * Gets known SupportedRuntimePlatform values.
     *
     * @return known SupportedRuntimePlatform values.
     */
    public static Collection<SupportedRuntimePlatform> values() {
        return values(SupportedRuntimePlatform.class);
    }
}
