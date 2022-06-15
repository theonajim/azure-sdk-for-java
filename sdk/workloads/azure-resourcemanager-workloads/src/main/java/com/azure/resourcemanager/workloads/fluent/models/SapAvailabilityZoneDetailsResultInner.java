// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.workloads.models.SapAvailabilityZonePair;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of supported availability zone pairs which are part of SAP HA deployment. */
@Fluent
public final class SapAvailabilityZoneDetailsResultInner {
    /*
     * Gets the list of availability zone pairs.
     */
    @JsonProperty(value = "availabilityZonePairs")
    private List<SapAvailabilityZonePair> availabilityZonePairs;

    /**
     * Get the availabilityZonePairs property: Gets the list of availability zone pairs.
     *
     * @return the availabilityZonePairs value.
     */
    public List<SapAvailabilityZonePair> availabilityZonePairs() {
        return this.availabilityZonePairs;
    }

    /**
     * Set the availabilityZonePairs property: Gets the list of availability zone pairs.
     *
     * @param availabilityZonePairs the availabilityZonePairs value to set.
     * @return the SapAvailabilityZoneDetailsResultInner object itself.
     */
    public SapAvailabilityZoneDetailsResultInner withAvailabilityZonePairs(
        List<SapAvailabilityZonePair> availabilityZonePairs) {
        this.availabilityZonePairs = availabilityZonePairs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availabilityZonePairs() != null) {
            availabilityZonePairs().forEach(e -> e.validate());
        }
    }
}
