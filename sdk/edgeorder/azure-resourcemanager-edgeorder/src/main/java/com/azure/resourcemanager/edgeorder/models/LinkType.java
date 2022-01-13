// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LinkType. */
public final class LinkType extends ExpandableStringEnum<LinkType> {
    /** Static value Generic for LinkType. */
    public static final LinkType GENERIC = fromString("Generic");

    /** Static value TermsAndConditions for LinkType. */
    public static final LinkType TERMS_AND_CONDITIONS = fromString("TermsAndConditions");

    /** Static value Specification for LinkType. */
    public static final LinkType SPECIFICATION = fromString("Specification");

    /** Static value Documentation for LinkType. */
    public static final LinkType DOCUMENTATION = fromString("Documentation");

    /** Static value KnowMore for LinkType. */
    public static final LinkType KNOW_MORE = fromString("KnowMore");

    /** Static value SignUp for LinkType. */
    public static final LinkType SIGN_UP = fromString("SignUp");

    /**
     * Creates or finds a LinkType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LinkType.
     */
    @JsonCreator
    public static LinkType fromString(String name) {
        return fromString(name, LinkType.class);
    }

    /** @return known LinkType values. */
    public static Collection<LinkType> values() {
        return values(LinkType.class);
    }
}
