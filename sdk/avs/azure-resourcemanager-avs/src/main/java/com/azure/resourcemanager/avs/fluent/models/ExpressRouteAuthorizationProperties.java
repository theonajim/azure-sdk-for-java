// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.ExpressRouteAuthorizationProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an ExpressRoute Circuit Authorization resource. */
@Fluent
public final class ExpressRouteAuthorizationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteAuthorizationProperties.class);

    /*
     * The state of the  ExpressRoute Circuit Authorization provisioning
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ExpressRouteAuthorizationProvisioningState provisioningState;

    /*
     * The ID of the ExpressRoute Circuit Authorization
     */
    @JsonProperty(value = "expressRouteAuthorizationId", access = JsonProperty.Access.WRITE_ONLY)
    private String expressRouteAuthorizationId;

    /*
     * The key of the ExpressRoute Circuit Authorization
     */
    @JsonProperty(value = "expressRouteAuthorizationKey", access = JsonProperty.Access.WRITE_ONLY)
    private String expressRouteAuthorizationKey;

    /*
     * The ID of the ExpressRoute Circuit
     */
    @JsonProperty(value = "expressRouteId")
    private String expressRouteId;

    /**
     * Get the provisioningState property: The state of the ExpressRoute Circuit Authorization provisioning.
     *
     * @return the provisioningState value.
     */
    public ExpressRouteAuthorizationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the expressRouteAuthorizationId property: The ID of the ExpressRoute Circuit Authorization.
     *
     * @return the expressRouteAuthorizationId value.
     */
    public String expressRouteAuthorizationId() {
        return this.expressRouteAuthorizationId;
    }

    /**
     * Get the expressRouteAuthorizationKey property: The key of the ExpressRoute Circuit Authorization.
     *
     * @return the expressRouteAuthorizationKey value.
     */
    public String expressRouteAuthorizationKey() {
        return this.expressRouteAuthorizationKey;
    }

    /**
     * Get the expressRouteId property: The ID of the ExpressRoute Circuit.
     *
     * @return the expressRouteId value.
     */
    public String expressRouteId() {
        return this.expressRouteId;
    }

    /**
     * Set the expressRouteId property: The ID of the ExpressRoute Circuit.
     *
     * @param expressRouteId the expressRouteId value to set.
     * @return the ExpressRouteAuthorizationProperties object itself.
     */
    public ExpressRouteAuthorizationProperties withExpressRouteId(String expressRouteId) {
        this.expressRouteId = expressRouteId;
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
