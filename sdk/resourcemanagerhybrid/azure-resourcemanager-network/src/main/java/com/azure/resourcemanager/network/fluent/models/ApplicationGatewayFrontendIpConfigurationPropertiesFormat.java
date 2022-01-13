// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Frontend IP configuration of an application gateway. */
@Fluent
public final class ApplicationGatewayFrontendIpConfigurationPropertiesFormat {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(ApplicationGatewayFrontendIpConfigurationPropertiesFormat.class);

    /*
     * PrivateIPAddress of the network interface IP Configuration.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /*
     * PrivateIP allocation method.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * Reference of the subnet resource.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * Reference of the PublicIP resource.
     */
    @JsonProperty(value = "publicIPAddress")
    private SubResource publicIpAddress;

    /*
     * Provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the privateIpAddress property: PrivateIPAddress of the network interface IP Configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: PrivateIPAddress of the network interface IP Configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the ApplicationGatewayFrontendIpConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayFrontendIpConfigurationPropertiesFormat withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: PrivateIP allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: PrivateIP allocation method.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the ApplicationGatewayFrontendIpConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayFrontendIpConfigurationPropertiesFormat withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: Reference of the subnet resource.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference of the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayFrontendIpConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayFrontendIpConfigurationPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference of the PublicIP resource.
     *
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: Reference of the PublicIP resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the ApplicationGatewayFrontendIpConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayFrontendIpConfigurationPropertiesFormat withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayFrontendIpConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayFrontendIpConfigurationPropertiesFormat withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
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
