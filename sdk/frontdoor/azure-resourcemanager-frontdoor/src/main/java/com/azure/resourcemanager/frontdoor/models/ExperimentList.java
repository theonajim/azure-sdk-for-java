// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.fluent.models.ExperimentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines a list of Experiments. It contains a list of Experiment objects and a URL link to get the next set of
 * results.
 */
@Fluent
public final class ExperimentList {
    /*
     * List of Experiments within a resource group.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExperimentInner> value;

    /*
     * URL to get the next set of Experiment objects if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ExperimentList class. */
    public ExperimentList() {
    }

    /**
     * Get the value property: List of Experiments within a resource group.
     *
     * @return the value value.
     */
    public List<ExperimentInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of Experiment objects if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of Experiment objects if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExperimentList object itself.
     */
    public ExperimentList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
