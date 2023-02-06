// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Status of protectable item, i.e. InProgress,Succeeded,Failed. */
public final class InquiryStatus extends ExpandableStringEnum<InquiryStatus> {
    /** Static value Invalid for InquiryStatus. */
    public static final InquiryStatus INVALID = fromString("Invalid");

    /** Static value Success for InquiryStatus. */
    public static final InquiryStatus SUCCESS = fromString("Success");

    /** Static value Failed for InquiryStatus. */
    public static final InquiryStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of InquiryStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InquiryStatus() {
    }

    /**
     * Creates or finds a InquiryStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InquiryStatus.
     */
    @JsonCreator
    public static InquiryStatus fromString(String name) {
        return fromString(name, InquiryStatus.class);
    }

    /**
     * Gets known InquiryStatus values.
     *
     * @return known InquiryStatus values.
     */
    public static Collection<InquiryStatus> values() {
        return values(InquiryStatus.class);
    }
}
