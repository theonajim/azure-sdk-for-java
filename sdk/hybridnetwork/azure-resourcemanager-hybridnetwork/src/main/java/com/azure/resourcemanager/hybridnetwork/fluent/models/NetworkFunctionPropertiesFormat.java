// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionUserConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.azure.resourcemanager.hybridnetwork.models.VendorProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network function properties. */
@Fluent
public final class NetworkFunctionPropertiesFormat {
    /*
     * The provisioning state of the network function resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The reference to the device resource. Once set, it cannot be updated.
     */
    @JsonProperty(value = "device")
    private SubResource device;

    /*
     * The sku name for the network function. Once set, it cannot be updated.
     */
    @JsonProperty(value = "skuName")
    private String skuName;

    /*
     * The sku type for the network function.
     */
    @JsonProperty(value = "skuType", access = JsonProperty.Access.WRITE_ONLY)
    private SkuType skuType;

    /*
     * The vendor name for the network function. Once set, it cannot be updated.
     */
    @JsonProperty(value = "vendorName")
    private String vendorName;

    /*
     * The service key for the network function resource.
     */
    @JsonProperty(value = "serviceKey", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceKey;

    /*
     * The vendor provisioning state for the network function resource.
     */
    @JsonProperty(value = "vendorProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private VendorProvisioningState vendorProvisioningState;

    /*
     * The resource URI of the managed application.
     */
    @JsonProperty(value = "managedApplication", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource managedApplication;

    /*
     * The parameters for the managed application.
     */
    @JsonProperty(value = "managedApplicationParameters")
    private Object managedApplicationParameters;

    /*
     * The network function container configurations from the user.
     */
    @JsonProperty(value = "networkFunctionContainerConfigurations")
    private Object networkFunctionContainerConfigurations;

    /*
     * The network function configurations from the user.
     */
    @JsonProperty(value = "networkFunctionUserConfigurations")
    private List<NetworkFunctionUserConfiguration> networkFunctionUserConfigurations;

    /** Creates an instance of NetworkFunctionPropertiesFormat class. */
    public NetworkFunctionPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the network function resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the device property: The reference to the device resource. Once set, it cannot be updated.
     *
     * @return the device value.
     */
    public SubResource device() {
        return this.device;
    }

    /**
     * Set the device property: The reference to the device resource. Once set, it cannot be updated.
     *
     * @param device the device value to set.
     * @return the NetworkFunctionPropertiesFormat object itself.
     */
    public NetworkFunctionPropertiesFormat withDevice(SubResource device) {
        this.device = device;
        return this;
    }

    /**
     * Get the skuName property: The sku name for the network function. Once set, it cannot be updated.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: The sku name for the network function. Once set, it cannot be updated.
     *
     * @param skuName the skuName value to set.
     * @return the NetworkFunctionPropertiesFormat object itself.
     */
    public NetworkFunctionPropertiesFormat withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the skuType property: The sku type for the network function.
     *
     * @return the skuType value.
     */
    public SkuType skuType() {
        return this.skuType;
    }

    /**
     * Get the vendorName property: The vendor name for the network function. Once set, it cannot be updated.
     *
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.vendorName;
    }

    /**
     * Set the vendorName property: The vendor name for the network function. Once set, it cannot be updated.
     *
     * @param vendorName the vendorName value to set.
     * @return the NetworkFunctionPropertiesFormat object itself.
     */
    public NetworkFunctionPropertiesFormat withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * Get the serviceKey property: The service key for the network function resource.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.serviceKey;
    }

    /**
     * Get the vendorProvisioningState property: The vendor provisioning state for the network function resource.
     *
     * @return the vendorProvisioningState value.
     */
    public VendorProvisioningState vendorProvisioningState() {
        return this.vendorProvisioningState;
    }

    /**
     * Get the managedApplication property: The resource URI of the managed application.
     *
     * @return the managedApplication value.
     */
    public SubResource managedApplication() {
        return this.managedApplication;
    }

    /**
     * Get the managedApplicationParameters property: The parameters for the managed application.
     *
     * @return the managedApplicationParameters value.
     */
    public Object managedApplicationParameters() {
        return this.managedApplicationParameters;
    }

    /**
     * Set the managedApplicationParameters property: The parameters for the managed application.
     *
     * @param managedApplicationParameters the managedApplicationParameters value to set.
     * @return the NetworkFunctionPropertiesFormat object itself.
     */
    public NetworkFunctionPropertiesFormat withManagedApplicationParameters(Object managedApplicationParameters) {
        this.managedApplicationParameters = managedApplicationParameters;
        return this;
    }

    /**
     * Get the networkFunctionContainerConfigurations property: The network function container configurations from the
     * user.
     *
     * @return the networkFunctionContainerConfigurations value.
     */
    public Object networkFunctionContainerConfigurations() {
        return this.networkFunctionContainerConfigurations;
    }

    /**
     * Set the networkFunctionContainerConfigurations property: The network function container configurations from the
     * user.
     *
     * @param networkFunctionContainerConfigurations the networkFunctionContainerConfigurations value to set.
     * @return the NetworkFunctionPropertiesFormat object itself.
     */
    public NetworkFunctionPropertiesFormat withNetworkFunctionContainerConfigurations(
        Object networkFunctionContainerConfigurations) {
        this.networkFunctionContainerConfigurations = networkFunctionContainerConfigurations;
        return this;
    }

    /**
     * Get the networkFunctionUserConfigurations property: The network function configurations from the user.
     *
     * @return the networkFunctionUserConfigurations value.
     */
    public List<NetworkFunctionUserConfiguration> networkFunctionUserConfigurations() {
        return this.networkFunctionUserConfigurations;
    }

    /**
     * Set the networkFunctionUserConfigurations property: The network function configurations from the user.
     *
     * @param networkFunctionUserConfigurations the networkFunctionUserConfigurations value to set.
     * @return the NetworkFunctionPropertiesFormat object itself.
     */
    public NetworkFunctionPropertiesFormat withNetworkFunctionUserConfigurations(
        List<NetworkFunctionUserConfiguration> networkFunctionUserConfigurations) {
        this.networkFunctionUserConfigurations = networkFunctionUserConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkFunctionUserConfigurations() != null) {
            networkFunctionUserConfigurations().forEach(e -> e.validate());
        }
    }
}
