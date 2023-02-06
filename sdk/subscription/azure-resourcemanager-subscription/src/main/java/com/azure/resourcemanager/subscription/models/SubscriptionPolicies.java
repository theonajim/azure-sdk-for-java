// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Subscription policies. */
@Immutable
public final class SubscriptionPolicies {
    /*
     * The subscription location placement ID. The ID indicates which regions are visible for a subscription. For
     * example, a subscription with a location placement Id of Public_2014-09-01 has access to Azure public regions.
     */
    @JsonProperty(value = "locationPlacementId", access = JsonProperty.Access.WRITE_ONLY)
    private String locationPlacementId;

    /*
     * The subscription quota ID.
     */
    @JsonProperty(value = "quotaId", access = JsonProperty.Access.WRITE_ONLY)
    private String quotaId;

    /*
     * The subscription spending limit.
     */
    @JsonProperty(value = "spendingLimit", access = JsonProperty.Access.WRITE_ONLY)
    private SpendingLimit spendingLimit;

    /** Creates an instance of SubscriptionPolicies class. */
    public SubscriptionPolicies() {
    }

    /**
     * Get the locationPlacementId property: The subscription location placement ID. The ID indicates which regions are
     * visible for a subscription. For example, a subscription with a location placement Id of Public_2014-09-01 has
     * access to Azure public regions.
     *
     * @return the locationPlacementId value.
     */
    public String locationPlacementId() {
        return this.locationPlacementId;
    }

    /**
     * Get the quotaId property: The subscription quota ID.
     *
     * @return the quotaId value.
     */
    public String quotaId() {
        return this.quotaId;
    }

    /**
     * Get the spendingLimit property: The subscription spending limit.
     *
     * @return the spendingLimit value.
     */
    public SpendingLimit spendingLimit() {
        return this.spendingLimit;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
