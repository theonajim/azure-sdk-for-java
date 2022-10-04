// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.orbital.fluent.models.ContactInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for the ListContacts API service call. */
@Fluent
public final class ContactListResult {
    /*
     * A list of contact resources in a resource group.
     */
    @JsonProperty(value = "value")
    private List<ContactInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of contact resources in a resource group.
     *
     * @return the value value.
     */
    public List<ContactInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of contact resources in a resource group.
     *
     * @param value the value value to set.
     * @return the ContactListResult object itself.
     */
    public ContactListResult withValue(List<ContactInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
