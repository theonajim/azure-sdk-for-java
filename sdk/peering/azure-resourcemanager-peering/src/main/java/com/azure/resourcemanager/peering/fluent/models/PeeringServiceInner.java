// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.models.PeeringServiceSku;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Peering Service. */
@Fluent
public final class PeeringServiceInner extends ProxyResource {
    /*
     * The SKU that defines the type of the peering service.
     */
    @JsonProperty(value = "sku")
    private PeeringServiceSku sku;

    /*
     * The properties that define a peering service.
     */
    @JsonProperty(value = "properties")
    private PeeringServiceProperties innerProperties;

    /*
     * The location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of PeeringServiceInner class. */
    public PeeringServiceInner() {
    }

    /**
     * Get the sku property: The SKU that defines the type of the peering service.
     *
     * @return the sku value.
     */
    public PeeringServiceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU that defines the type of the peering service.
     *
     * @param sku the sku value to set.
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withSku(PeeringServiceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: The properties that define a peering service.
     *
     * @return the innerProperties value.
     */
    private PeeringServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: The location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the resource.
     *
     * @param location the location value to set.
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags.
     *
     * @param tags the tags value to set.
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the peeringServiceLocation property: The location (state/province) of the customer.
     *
     * @return the peeringServiceLocation value.
     */
    public String peeringServiceLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringServiceLocation();
    }

    /**
     * Set the peeringServiceLocation property: The location (state/province) of the customer.
     *
     * @param peeringServiceLocation the peeringServiceLocation value to set.
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withPeeringServiceLocation(String peeringServiceLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeeringServiceProperties();
        }
        this.innerProperties().withPeeringServiceLocation(peeringServiceLocation);
        return this;
    }

    /**
     * Get the peeringServiceProvider property: The name of the service provider.
     *
     * @return the peeringServiceProvider value.
     */
    public String peeringServiceProvider() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringServiceProvider();
    }

    /**
     * Set the peeringServiceProvider property: The name of the service provider.
     *
     * @param peeringServiceProvider the peeringServiceProvider value to set.
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withPeeringServiceProvider(String peeringServiceProvider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeeringServiceProperties();
        }
        this.innerProperties().withPeeringServiceProvider(peeringServiceProvider);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the providerPrimaryPeeringLocation property: The primary peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @return the providerPrimaryPeeringLocation value.
     */
    public String providerPrimaryPeeringLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().providerPrimaryPeeringLocation();
    }

    /**
     * Set the providerPrimaryPeeringLocation property: The primary peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @param providerPrimaryPeeringLocation the providerPrimaryPeeringLocation value to set.
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withProviderPrimaryPeeringLocation(String providerPrimaryPeeringLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeeringServiceProperties();
        }
        this.innerProperties().withProviderPrimaryPeeringLocation(providerPrimaryPeeringLocation);
        return this;
    }

    /**
     * Get the providerBackupPeeringLocation property: The backup peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @return the providerBackupPeeringLocation value.
     */
    public String providerBackupPeeringLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().providerBackupPeeringLocation();
    }

    /**
     * Set the providerBackupPeeringLocation property: The backup peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @param providerBackupPeeringLocation the providerBackupPeeringLocation value to set.
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withProviderBackupPeeringLocation(String providerBackupPeeringLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeeringServiceProperties();
        }
        this.innerProperties().withProviderBackupPeeringLocation(providerBackupPeeringLocation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model PeeringServiceInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PeeringServiceInner.class);
}
