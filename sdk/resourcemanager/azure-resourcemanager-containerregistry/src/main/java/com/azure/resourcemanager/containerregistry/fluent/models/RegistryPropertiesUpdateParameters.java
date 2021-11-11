// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.models.EncryptionProperty;
import com.azure.resourcemanager.containerregistry.models.NetworkRuleBypassOptions;
import com.azure.resourcemanager.containerregistry.models.NetworkRuleSet;
import com.azure.resourcemanager.containerregistry.models.Policies;
import com.azure.resourcemanager.containerregistry.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters for updating the properties of a container registry. */
@Fluent
public final class RegistryPropertiesUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistryPropertiesUpdateParameters.class);

    /*
     * The value that indicates whether the admin user is enabled.
     */
    @JsonProperty(value = "adminUserEnabled")
    private Boolean adminUserEnabled;

    /*
     * The network rule set for a container registry.
     */
    @JsonProperty(value = "networkRuleSet")
    private NetworkRuleSet networkRuleSet;

    /*
     * The policies for a container registry.
     */
    @JsonProperty(value = "policies")
    private Policies policies;

    /*
     * The encryption settings of container registry.
     */
    @JsonProperty(value = "encryption")
    private EncryptionProperty encryption;

    /*
     * Enable a single data endpoint per region for serving data.
     */
    @JsonProperty(value = "dataEndpointEnabled")
    private Boolean dataEndpointEnabled;

    /*
     * Whether or not public network access is allowed for the container
     * registry.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Whether to allow trusted Azure services to access a network restricted
     * registry.
     */
    @JsonProperty(value = "networkRuleBypassOptions")
    private NetworkRuleBypassOptions networkRuleBypassOptions;

    /**
     * Get the adminUserEnabled property: The value that indicates whether the admin user is enabled.
     *
     * @return the adminUserEnabled value.
     */
    public Boolean adminUserEnabled() {
        return this.adminUserEnabled;
    }

    /**
     * Set the adminUserEnabled property: The value that indicates whether the admin user is enabled.
     *
     * @param adminUserEnabled the adminUserEnabled value to set.
     * @return the RegistryPropertiesUpdateParameters object itself.
     */
    public RegistryPropertiesUpdateParameters withAdminUserEnabled(Boolean adminUserEnabled) {
        this.adminUserEnabled = adminUserEnabled;
        return this;
    }

    /**
     * Get the networkRuleSet property: The network rule set for a container registry.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: The network rule set for a container registry.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the RegistryPropertiesUpdateParameters object itself.
     */
    public RegistryPropertiesUpdateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the policies property: The policies for a container registry.
     *
     * @return the policies value.
     */
    public Policies policies() {
        return this.policies;
    }

    /**
     * Set the policies property: The policies for a container registry.
     *
     * @param policies the policies value to set.
     * @return the RegistryPropertiesUpdateParameters object itself.
     */
    public RegistryPropertiesUpdateParameters withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Get the encryption property: The encryption settings of container registry.
     *
     * @return the encryption value.
     */
    public EncryptionProperty encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption settings of container registry.
     *
     * @param encryption the encryption value to set.
     * @return the RegistryPropertiesUpdateParameters object itself.
     */
    public RegistryPropertiesUpdateParameters withEncryption(EncryptionProperty encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the dataEndpointEnabled property: Enable a single data endpoint per region for serving data.
     *
     * @return the dataEndpointEnabled value.
     */
    public Boolean dataEndpointEnabled() {
        return this.dataEndpointEnabled;
    }

    /**
     * Set the dataEndpointEnabled property: Enable a single data endpoint per region for serving data.
     *
     * @param dataEndpointEnabled the dataEndpointEnabled value to set.
     * @return the RegistryPropertiesUpdateParameters object itself.
     */
    public RegistryPropertiesUpdateParameters withDataEndpointEnabled(Boolean dataEndpointEnabled) {
        this.dataEndpointEnabled = dataEndpointEnabled;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for the container registry.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for the container registry.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the RegistryPropertiesUpdateParameters object itself.
     */
    public RegistryPropertiesUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the networkRuleBypassOptions property: Whether to allow trusted Azure services to access a network restricted
     * registry.
     *
     * @return the networkRuleBypassOptions value.
     */
    public NetworkRuleBypassOptions networkRuleBypassOptions() {
        return this.networkRuleBypassOptions;
    }

    /**
     * Set the networkRuleBypassOptions property: Whether to allow trusted Azure services to access a network restricted
     * registry.
     *
     * @param networkRuleBypassOptions the networkRuleBypassOptions value to set.
     * @return the RegistryPropertiesUpdateParameters object itself.
     */
    public RegistryPropertiesUpdateParameters withNetworkRuleBypassOptions(
        NetworkRuleBypassOptions networkRuleBypassOptions) {
        this.networkRuleBypassOptions = networkRuleBypassOptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (policies() != null) {
            policies().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
