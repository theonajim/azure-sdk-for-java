// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkConnectionTargetDatabase model. */
@Fluent
public final class LinkConnectionTargetDatabase {
    /*
     * Linked service reference
     */
    @JsonProperty(value = "linkedService")
    private LinkedServiceReference linkedService;

    /**
     * Get the linkedService property: Linked service reference.
     *
     * @return the linkedService value.
     */
    public LinkedServiceReference getLinkedService() {
        return this.linkedService;
    }

    /**
     * Set the linkedService property: Linked service reference.
     *
     * @param linkedService the linkedService value to set.
     * @return the LinkConnectionTargetDatabase object itself.
     */
    public LinkConnectionTargetDatabase setLinkedService(LinkedServiceReference linkedService) {
        this.linkedService = linkedService;
        return this;
    }
}
