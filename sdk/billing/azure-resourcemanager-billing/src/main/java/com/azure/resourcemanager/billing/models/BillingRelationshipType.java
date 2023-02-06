// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Identifies which services and purchases are paid by a billing profile. */
public final class BillingRelationshipType extends ExpandableStringEnum<BillingRelationshipType> {
    /** Static value Direct for BillingRelationshipType. */
    public static final BillingRelationshipType DIRECT = fromString("Direct");

    /** Static value IndirectCustomer for BillingRelationshipType. */
    public static final BillingRelationshipType INDIRECT_CUSTOMER = fromString("IndirectCustomer");

    /** Static value IndirectPartner for BillingRelationshipType. */
    public static final BillingRelationshipType INDIRECT_PARTNER = fromString("IndirectPartner");

    /** Static value CSPPartner for BillingRelationshipType. */
    public static final BillingRelationshipType CSPPARTNER = fromString("CSPPartner");

    /**
     * Creates a new instance of BillingRelationshipType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BillingRelationshipType() {
    }

    /**
     * Creates or finds a BillingRelationshipType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BillingRelationshipType.
     */
    @JsonCreator
    public static BillingRelationshipType fromString(String name) {
        return fromString(name, BillingRelationshipType.class);
    }

    /**
     * Gets known BillingRelationshipType values.
     *
     * @return known BillingRelationshipType values.
     */
    public static Collection<BillingRelationshipType> values() {
        return values(BillingRelationshipType.class);
    }
}
