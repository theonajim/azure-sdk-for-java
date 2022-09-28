// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dnsresolver.fluent.models.ForwardingRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to an enumeration operation on forwarding rules within a DNS forwarding ruleset. */
@Fluent
public final class ForwardingRuleListResult {
    /*
     * Enumeration of the forwarding rules.
     */
    @JsonProperty(value = "value")
    private List<ForwardingRuleInner> value;

    /*
     * The continuation token for the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Enumeration of the forwarding rules.
     *
     * @return the value value.
     */
    public List<ForwardingRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Enumeration of the forwarding rules.
     *
     * @param value the value value to set.
     * @return the ForwardingRuleListResult object itself.
     */
    public ForwardingRuleListResult withValue(List<ForwardingRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token for the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
