// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the SAP Gateway Server properties. */
@Immutable
public final class GatewayServerProperties {
    /*
     * The gateway Port.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Long port;

    /*
     * Defines the SAP Instance health.
     */
    @JsonProperty(value = "health", access = JsonProperty.Access.WRITE_ONLY)
    private SapHealthState health;

    /**
     * Get the port property: The gateway Port.
     *
     * @return the port value.
     */
    public Long port() {
        return this.port;
    }

    /**
     * Get the health property: Defines the SAP Instance health.
     *
     * @return the health value.
     */
    public SapHealthState health() {
        return this.health;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
