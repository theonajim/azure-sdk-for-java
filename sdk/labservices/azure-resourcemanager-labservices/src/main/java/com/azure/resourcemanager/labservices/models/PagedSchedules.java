// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.models.ScheduleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged list of schedules. */
@Immutable
public final class PagedSchedules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PagedSchedules.class);

    /*
     * The array page of schedule results.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ScheduleInner> value;

    /*
     * The link to get the next page of schedule results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The array page of schedule results.
     *
     * @return the value value.
     */
    public List<ScheduleInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to get the next page of schedule results.
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
