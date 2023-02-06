// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This property is required for providing the region and new quota limits. */
@Fluent
public final class QuotaChangeRequest {
    /*
     * Region for which the quota increase request is being made.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * Payload of the quota increase request.
     */
    @JsonProperty(value = "payload")
    private String payload;

    /** Creates an instance of QuotaChangeRequest class. */
    public QuotaChangeRequest() {
    }

    /**
     * Get the region property: Region for which the quota increase request is being made.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Region for which the quota increase request is being made.
     *
     * @param region the region value to set.
     * @return the QuotaChangeRequest object itself.
     */
    public QuotaChangeRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the payload property: Payload of the quota increase request.
     *
     * @return the payload value.
     */
    public String payload() {
        return this.payload;
    }

    /**
     * Set the payload property: Payload of the quota increase request.
     *
     * @param payload the payload value to set.
     * @return the QuotaChangeRequest object itself.
     */
    public QuotaChangeRequest withPayload(String payload) {
        this.payload = payload;
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
