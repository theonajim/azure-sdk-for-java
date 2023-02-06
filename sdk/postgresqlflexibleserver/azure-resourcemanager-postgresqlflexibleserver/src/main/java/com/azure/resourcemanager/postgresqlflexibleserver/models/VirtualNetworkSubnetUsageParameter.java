// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual network subnet usage parameter. */
@Fluent
public final class VirtualNetworkSubnetUsageParameter {
    /*
     * Virtual network resource id.
     */
    @JsonProperty(value = "virtualNetworkArmResourceId")
    private String virtualNetworkArmResourceId;

    /** Creates an instance of VirtualNetworkSubnetUsageParameter class. */
    public VirtualNetworkSubnetUsageParameter() {
    }

    /**
     * Get the virtualNetworkArmResourceId property: Virtual network resource id.
     *
     * @return the virtualNetworkArmResourceId value.
     */
    public String virtualNetworkArmResourceId() {
        return this.virtualNetworkArmResourceId;
    }

    /**
     * Set the virtualNetworkArmResourceId property: Virtual network resource id.
     *
     * @param virtualNetworkArmResourceId the virtualNetworkArmResourceId value to set.
     * @return the VirtualNetworkSubnetUsageParameter object itself.
     */
    public VirtualNetworkSubnetUsageParameter withVirtualNetworkArmResourceId(String virtualNetworkArmResourceId) {
        this.virtualNetworkArmResourceId = virtualNetworkArmResourceId;
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
