// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualApplianceNicProperties;
import com.azure.resourcemanager.network.models.VirtualApplianceSkuProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network Virtual Appliance definition. */
@Fluent
public final class NetworkVirtualAppliancePropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkVirtualAppliancePropertiesFormat.class);

    /*
     * Network Virtual Appliance SKU.
     */
    @JsonProperty(value = "nvaSku")
    private VirtualApplianceSkuProperties nvaSku;

    /*
     * Address Prefix.
     */
    @JsonProperty(value = "addressPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String addressPrefix;

    /*
     * BootStrapConfigurationBlobs storage URLs.
     */
    @JsonProperty(value = "bootStrapConfigurationBlobs")
    private List<String> bootStrapConfigurationBlobs;

    /*
     * The Virtual Hub where Network Virtual Appliance is being deployed.
     */
    @JsonProperty(value = "virtualHub")
    private SubResource virtualHub;

    /*
     * CloudInitConfigurationBlob storage URLs.
     */
    @JsonProperty(value = "cloudInitConfigurationBlobs")
    private List<String> cloudInitConfigurationBlobs;

    /*
     * CloudInitConfiguration string in plain text.
     */
    @JsonProperty(value = "cloudInitConfiguration")
    private String cloudInitConfiguration;

    /*
     * VirtualAppliance ASN.
     */
    @JsonProperty(value = "virtualApplianceAsn")
    private Long virtualApplianceAsn;

    /*
     * List of Virtual Appliance Network Interfaces.
     */
    @JsonProperty(value = "virtualApplianceNics", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualApplianceNicProperties> virtualApplianceNics;

    /*
     * List of references to VirtualApplianceSite.
     */
    @JsonProperty(value = "virtualApplianceSites", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualApplianceSites;

    /*
     * List of references to InboundSecurityRules.
     */
    @JsonProperty(value = "inboundSecurityRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundSecurityRules;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the nvaSku property: Network Virtual Appliance SKU.
     *
     * @return the nvaSku value.
     */
    public VirtualApplianceSkuProperties nvaSku() {
        return this.nvaSku;
    }

    /**
     * Set the nvaSku property: Network Virtual Appliance SKU.
     *
     * @param nvaSku the nvaSku value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withNvaSku(VirtualApplianceSkuProperties nvaSku) {
        this.nvaSku = nvaSku;
        return this;
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Get the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     *
     * @return the bootStrapConfigurationBlobs value.
     */
    public List<String> bootStrapConfigurationBlobs() {
        return this.bootStrapConfigurationBlobs;
    }

    /**
     * Set the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     *
     * @param bootStrapConfigurationBlobs the bootStrapConfigurationBlobs value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withBootStrapConfigurationBlobs(
        List<String> bootStrapConfigurationBlobs) {
        this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
        return this;
    }

    /**
     * Get the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     *
     * @return the cloudInitConfigurationBlobs value.
     */
    public List<String> cloudInitConfigurationBlobs() {
        return this.cloudInitConfigurationBlobs;
    }

    /**
     * Set the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     *
     * @param cloudInitConfigurationBlobs the cloudInitConfigurationBlobs value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withCloudInitConfigurationBlobs(
        List<String> cloudInitConfigurationBlobs) {
        this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
        return this;
    }

    /**
     * Get the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     *
     * @return the cloudInitConfiguration value.
     */
    public String cloudInitConfiguration() {
        return this.cloudInitConfiguration;
    }

    /**
     * Set the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     *
     * @param cloudInitConfiguration the cloudInitConfiguration value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withCloudInitConfiguration(String cloudInitConfiguration) {
        this.cloudInitConfiguration = cloudInitConfiguration;
        return this;
    }

    /**
     * Get the virtualApplianceAsn property: VirtualAppliance ASN.
     *
     * @return the virtualApplianceAsn value.
     */
    public Long virtualApplianceAsn() {
        return this.virtualApplianceAsn;
    }

    /**
     * Set the virtualApplianceAsn property: VirtualAppliance ASN.
     *
     * @param virtualApplianceAsn the virtualApplianceAsn value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withVirtualApplianceAsn(Long virtualApplianceAsn) {
        this.virtualApplianceAsn = virtualApplianceAsn;
        return this;
    }

    /**
     * Get the virtualApplianceNics property: List of Virtual Appliance Network Interfaces.
     *
     * @return the virtualApplianceNics value.
     */
    public List<VirtualApplianceNicProperties> virtualApplianceNics() {
        return this.virtualApplianceNics;
    }

    /**
     * Get the virtualApplianceSites property: List of references to VirtualApplianceSite.
     *
     * @return the virtualApplianceSites value.
     */
    public List<SubResource> virtualApplianceSites() {
        return this.virtualApplianceSites;
    }

    /**
     * Get the inboundSecurityRules property: List of references to InboundSecurityRules.
     *
     * @return the inboundSecurityRules value.
     */
    public List<SubResource> inboundSecurityRules() {
        return this.inboundSecurityRules;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nvaSku() != null) {
            nvaSku().validate();
        }
        if (virtualApplianceNics() != null) {
            virtualApplianceNics().forEach(e -> e.validate());
        }
    }
}
