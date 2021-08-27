// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitServiceProviderProperties;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitSku;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.ServiceProviderProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** ExpressRouteCircuit resource. */
@Fluent
public final class ExpressRouteCircuitInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitInner.class);

    /*
     * The SKU.
     */
    @JsonProperty(value = "sku")
    private ExpressRouteCircuitSku sku;

    /*
     * Properties of the express route circuit.
     */
    @JsonProperty(value = "properties")
    private ExpressRouteCircuitPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The SKU.
     *
     * @return the sku value.
     */
    public ExpressRouteCircuitSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU.
     *
     * @param sku the sku value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withSku(ExpressRouteCircuitSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the express route circuit.
     *
     * @return the innerProperties value.
     */
    private ExpressRouteCircuitPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCircuitInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCircuitInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the allowClassicOperations property: Allow classic operations.
     *
     * @return the allowClassicOperations value.
     */
    public Boolean allowClassicOperations() {
        return this.innerProperties() == null ? null : this.innerProperties().allowClassicOperations();
    }

    /**
     * Set the allowClassicOperations property: Allow classic operations.
     *
     * @param allowClassicOperations the allowClassicOperations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAllowClassicOperations(Boolean allowClassicOperations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withAllowClassicOperations(allowClassicOperations);
        return this;
    }

    /**
     * Get the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     *
     * @return the circuitProvisioningState value.
     */
    public String circuitProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().circuitProvisioningState();
    }

    /**
     * Set the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     *
     * @param circuitProvisioningState the circuitProvisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withCircuitProvisioningState(String circuitProvisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withCircuitProvisioningState(circuitProvisioningState);
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     *
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderProvisioningState();
    }

    /**
     * Set the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProvisioningState(
        ServiceProviderProvisioningState serviceProviderProvisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceProviderProvisioningState(serviceProviderProvisioningState);
        return this;
    }

    /**
     * Get the authorizations property: The list of authorizations.
     *
     * @return the authorizations value.
     */
    public List<ExpressRouteCircuitAuthorizationInner> authorizations() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizations();
    }

    /**
     * Set the authorizations property: The list of authorizations.
     *
     * @param authorizations the authorizations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withAuthorizations(authorizations);
        return this;
    }

    /**
     * Get the peerings property: The list of peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.innerProperties() == null ? null : this.innerProperties().peerings();
    }

    /**
     * Set the peerings property: The list of peerings.
     *
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withPeerings(peerings);
        return this;
    }

    /**
     * Get the serviceKey property: The ServiceKey.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceKey();
    }

    /**
     * Set the serviceKey property: The ServiceKey.
     *
     * @param serviceKey the serviceKey value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceKey(String serviceKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceKey(serviceKey);
        return this;
    }

    /**
     * Get the serviceProviderNotes property: The ServiceProviderNotes.
     *
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderNotes();
    }

    /**
     * Set the serviceProviderNotes property: The ServiceProviderNotes.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderNotes(String serviceProviderNotes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceProviderNotes(serviceProviderNotes);
        return this;
    }

    /**
     * Get the serviceProviderProperties property: The ServiceProviderProperties.
     *
     * @return the serviceProviderProperties value.
     */
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceProviderProperties();
    }

    /**
     * Set the serviceProviderProperties property: The ServiceProviderProperties.
     *
     * @param serviceProviderProperties the serviceProviderProperties value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProperties(
        ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withServiceProviderProperties(serviceProviderProperties);
        return this;
    }

    /**
     * Get the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     *
     * @return the expressRoutePort value.
     */
    public SubResource expressRoutePort() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRoutePort();
    }

    /**
     * Set the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     *
     * @param expressRoutePort the expressRoutePort value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withExpressRoutePort(SubResource expressRoutePort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withExpressRoutePort(expressRoutePort);
        return this;
    }

    /**
     * Get the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     *
     * @return the bandwidthInGbps value.
     */
    public Float bandwidthInGbps() {
        return this.innerProperties() == null ? null : this.innerProperties().bandwidthInGbps();
    }

    /**
     * Set the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     *
     * @param bandwidthInGbps the bandwidthInGbps value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withBandwidthInGbps(Float bandwidthInGbps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withBandwidthInGbps(bandwidthInGbps);
        return this;
    }

    /**
     * Get the stag property: The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     *
     * @return the stag value.
     */
    public Integer stag() {
        return this.innerProperties() == null ? null : this.innerProperties().stag();
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route circuit resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayManagerEtag();
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGatewayManagerEtag(String gatewayManagerEtag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withGatewayManagerEtag(gatewayManagerEtag);
        return this;
    }

    /**
     * Get the globalReachEnabled property: Flag denoting global reach status.
     *
     * @return the globalReachEnabled value.
     */
    public Boolean globalReachEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().globalReachEnabled();
    }

    /**
     * Set the globalReachEnabled property: Flag denoting global reach status.
     *
     * @param globalReachEnabled the globalReachEnabled value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGlobalReachEnabled(Boolean globalReachEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteCircuitPropertiesFormat();
        }
        this.innerProperties().withGlobalReachEnabled(globalReachEnabled);
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
    }
}
