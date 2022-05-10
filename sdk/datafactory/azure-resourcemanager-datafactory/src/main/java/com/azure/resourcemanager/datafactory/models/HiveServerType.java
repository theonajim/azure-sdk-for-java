// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HiveServerType. */
public final class HiveServerType extends ExpandableStringEnum<HiveServerType> {
    /** Static value HiveServer1 for HiveServerType. */
    public static final HiveServerType HIVE_SERVER1 = fromString("HiveServer1");

    /** Static value HiveServer2 for HiveServerType. */
    public static final HiveServerType HIVE_SERVER2 = fromString("HiveServer2");

    /** Static value HiveThriftServer for HiveServerType. */
    public static final HiveServerType HIVE_THRIFT_SERVER = fromString("HiveThriftServer");

    /**
     * Creates or finds a HiveServerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HiveServerType.
     */
    @JsonCreator
    public static HiveServerType fromString(String name) {
        return fromString(name, HiveServerType.class);
    }

    /**
     * Gets known HiveServerType values.
     *
     * @return known HiveServerType values.
     */
    public static Collection<HiveServerType> values() {
        return values(HiveServerType.class);
    }
}
