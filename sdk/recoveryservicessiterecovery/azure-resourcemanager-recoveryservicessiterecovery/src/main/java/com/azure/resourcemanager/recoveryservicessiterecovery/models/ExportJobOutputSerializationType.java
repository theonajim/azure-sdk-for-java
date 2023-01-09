// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The output type of the jobs. */
public final class ExportJobOutputSerializationType extends ExpandableStringEnum<ExportJobOutputSerializationType> {
    /** Static value Json for ExportJobOutputSerializationType. */
    public static final ExportJobOutputSerializationType JSON = fromString("Json");

    /** Static value Xml for ExportJobOutputSerializationType. */
    public static final ExportJobOutputSerializationType XML = fromString("Xml");

    /** Static value Excel for ExportJobOutputSerializationType. */
    public static final ExportJobOutputSerializationType EXCEL = fromString("Excel");

    /**
     * Creates or finds a ExportJobOutputSerializationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExportJobOutputSerializationType.
     */
    @JsonCreator
    public static ExportJobOutputSerializationType fromString(String name) {
        return fromString(name, ExportJobOutputSerializationType.class);
    }

    /**
     * Gets known ExportJobOutputSerializationType values.
     *
     * @return known ExportJobOutputSerializationType values.
     */
    public static Collection<ExportJobOutputSerializationType> values() {
        return values(ExportJobOutputSerializationType.class);
    }
}
