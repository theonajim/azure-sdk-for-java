// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure
 * Policy definition.
 */
public final class AssessmentType extends ExpandableStringEnum<AssessmentType> {
    /** Static value BuiltIn for AssessmentType. */
    public static final AssessmentType BUILT_IN = fromString("BuiltIn");

    /** Static value CustomPolicy for AssessmentType. */
    public static final AssessmentType CUSTOM_POLICY = fromString("CustomPolicy");

    /** Static value CustomerManaged for AssessmentType. */
    public static final AssessmentType CUSTOMER_MANAGED = fromString("CustomerManaged");

    /** Static value VerifiedPartner for AssessmentType. */
    public static final AssessmentType VERIFIED_PARTNER = fromString("VerifiedPartner");

    /**
     * Creates or finds a AssessmentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AssessmentType.
     */
    @JsonCreator
    public static AssessmentType fromString(String name) {
        return fromString(name, AssessmentType.class);
    }

    /**
     * Gets known AssessmentType values.
     *
     * @return known AssessmentType values.
     */
    public static Collection<AssessmentType> values() {
        return values(AssessmentType.class);
    }
}
