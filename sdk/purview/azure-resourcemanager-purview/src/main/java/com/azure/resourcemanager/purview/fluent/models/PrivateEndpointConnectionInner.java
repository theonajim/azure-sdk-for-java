// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.purview.models.PrivateEndpoint;
import com.azure.resourcemanager.purview.models.PrivateLinkServiceConnectionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private endpoint connection class. */
@Fluent
public final class PrivateEndpointConnectionInner extends ProxyResource {
    /*
     * The connection identifier.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProperties innerProperties;

    /** Creates an instance of PrivateEndpointConnectionInner class. */
    public PrivateEndpointConnectionInner() {
    }

    /**
     * Get the innerProperties property: The connection identifier.
     *
     * @return the innerProperties value.
     */
    private PrivateEndpointConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the privateEndpoint property: The private endpoint information.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Set the privateEndpoint property: The private endpoint information.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The private link service connection state.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: The private link service connection state.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
