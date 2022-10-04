// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The track property condition operation. */
public final class FilterTrackPropertyCompareOperation
    extends ExpandableStringEnum<FilterTrackPropertyCompareOperation> {
    /** Static value Equal for FilterTrackPropertyCompareOperation. */
    public static final FilterTrackPropertyCompareOperation EQUAL = fromString("Equal");

    /** Static value NotEqual for FilterTrackPropertyCompareOperation. */
    public static final FilterTrackPropertyCompareOperation NOT_EQUAL = fromString("NotEqual");

    /**
     * Creates or finds a FilterTrackPropertyCompareOperation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FilterTrackPropertyCompareOperation.
     */
    @JsonCreator
    public static FilterTrackPropertyCompareOperation fromString(String name) {
        return fromString(name, FilterTrackPropertyCompareOperation.class);
    }

    /**
     * Gets known FilterTrackPropertyCompareOperation values.
     *
     * @return known FilterTrackPropertyCompareOperation values.
     */
    public static Collection<FilterTrackPropertyCompareOperation> values() {
        return values(FilterTrackPropertyCompareOperation.class);
    }
}
