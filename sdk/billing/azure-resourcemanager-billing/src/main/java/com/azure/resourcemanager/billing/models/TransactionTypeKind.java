// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of transaction. Options are all or reservation. */
public final class TransactionTypeKind extends ExpandableStringEnum<TransactionTypeKind> {
    /** Static value all for TransactionTypeKind. */
    public static final TransactionTypeKind ALL = fromString("all");

    /** Static value reservation for TransactionTypeKind. */
    public static final TransactionTypeKind RESERVATION = fromString("reservation");

    /**
     * Creates a new instance of TransactionTypeKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TransactionTypeKind() {
    }

    /**
     * Creates or finds a TransactionTypeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TransactionTypeKind.
     */
    @JsonCreator
    public static TransactionTypeKind fromString(String name) {
        return fromString(name, TransactionTypeKind.class);
    }

    /**
     * Gets known TransactionTypeKind values.
     *
     * @return known TransactionTypeKind values.
     */
    public static Collection<TransactionTypeKind> values() {
        return values(TransactionTypeKind.class);
    }
}
