// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The roll up count summary of reservations in each state. */
@Immutable
public final class ReservationSummary {
    /*
     * The number of reservation in Succeeded state
     */
    @JsonProperty(value = "succeededCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float succeededCount;

    /*
     * The number of reservation in Failed state
     */
    @JsonProperty(value = "failedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float failedCount;

    /*
     * The number of reservation in Expiring state
     */
    @JsonProperty(value = "expiringCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float expiringCount;

    /*
     * The number of reservation in Expired state
     */
    @JsonProperty(value = "expiredCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float expiredCount;

    /*
     * The number of reservation in Pending state
     */
    @JsonProperty(value = "pendingCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float pendingCount;

    /*
     * The number of reservation in Cancelled state
     */
    @JsonProperty(value = "cancelledCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float cancelledCount;

    /** Creates an instance of ReservationSummary class. */
    public ReservationSummary() {
    }

    /**
     * Get the succeededCount property: The number of reservation in Succeeded state.
     *
     * @return the succeededCount value.
     */
    public Float succeededCount() {
        return this.succeededCount;
    }

    /**
     * Get the failedCount property: The number of reservation in Failed state.
     *
     * @return the failedCount value.
     */
    public Float failedCount() {
        return this.failedCount;
    }

    /**
     * Get the expiringCount property: The number of reservation in Expiring state.
     *
     * @return the expiringCount value.
     */
    public Float expiringCount() {
        return this.expiringCount;
    }

    /**
     * Get the expiredCount property: The number of reservation in Expired state.
     *
     * @return the expiredCount value.
     */
    public Float expiredCount() {
        return this.expiredCount;
    }

    /**
     * Get the pendingCount property: The number of reservation in Pending state.
     *
     * @return the pendingCount value.
     */
    public Float pendingCount() {
        return this.pendingCount;
    }

    /**
     * Get the cancelledCount property: The number of reservation in Cancelled state.
     *
     * @return the cancelledCount value.
     */
    public Float cancelledCount() {
        return this.cancelledCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
