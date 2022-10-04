// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.security.models.TopologySingleResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The TopologyResourceProperties model. */
@Immutable
public final class TopologyResourceProperties {
    /*
     * The UTC time on which the topology was calculated
     */
    @JsonProperty(value = "calculatedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime calculatedDateTime;

    /*
     * Azure resources which are part of this topology resource
     */
    @JsonProperty(value = "topologyResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<TopologySingleResource> topologyResources;

    /**
     * Get the calculatedDateTime property: The UTC time on which the topology was calculated.
     *
     * @return the calculatedDateTime value.
     */
    public OffsetDateTime calculatedDateTime() {
        return this.calculatedDateTime;
    }

    /**
     * Get the topologyResources property: Azure resources which are part of this topology resource.
     *
     * @return the topologyResources value.
     */
    public List<TopologySingleResource> topologyResources() {
        return this.topologyResources;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (topologyResources() != null) {
            topologyResources().forEach(e -> e.validate());
        }
    }
}
