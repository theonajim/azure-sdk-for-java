// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of virtual network. */
@Immutable
public final class VirtualNetworkProperties {
    /*
     * The Private Cloud id
     */
    @JsonProperty(value = "privateCloudId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateCloudId;

    /** Creates an instance of VirtualNetworkProperties class. */
    public VirtualNetworkProperties() {
    }

    /**
     * Get the privateCloudId property: The Private Cloud id.
     *
     * @return the privateCloudId value.
     */
    public String privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
