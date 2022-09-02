// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Action status. */
@Fluent
public final class ActionStatus {
    /*
     * Value indicating whether alert is suppressed.
     */
    @JsonProperty(value = "isSuppressed")
    private Boolean isSuppressed;

    /**
     * Get the isSuppressed property: Value indicating whether alert is suppressed.
     *
     * @return the isSuppressed value.
     */
    public Boolean isSuppressed() {
        return this.isSuppressed;
    }

    /**
     * Set the isSuppressed property: Value indicating whether alert is suppressed.
     *
     * @param isSuppressed the isSuppressed value to set.
     * @return the ActionStatus object itself.
     */
    public ActionStatus withIsSuppressed(Boolean isSuppressed) {
        this.isSuppressed = isSuppressed;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
