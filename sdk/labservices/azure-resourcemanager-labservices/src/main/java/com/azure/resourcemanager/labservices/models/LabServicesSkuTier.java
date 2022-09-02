// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The tier of the SKU. */
public final class LabServicesSkuTier extends ExpandableStringEnum<LabServicesSkuTier> {
    /** Static value Standard for LabServicesSkuTier. */
    public static final LabServicesSkuTier STANDARD = fromString("Standard");

    /** Static value Premium for LabServicesSkuTier. */
    public static final LabServicesSkuTier PREMIUM = fromString("Premium");

    /**
     * Creates or finds a LabServicesSkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LabServicesSkuTier.
     */
    @JsonCreator
    public static LabServicesSkuTier fromString(String name) {
        return fromString(name, LabServicesSkuTier.class);
    }

    /**
     * Gets known LabServicesSkuTier values.
     *
     * @return known LabServicesSkuTier values.
     */
    public static Collection<LabServicesSkuTier> values() {
        return values(LabServicesSkuTier.class);
    }
}
