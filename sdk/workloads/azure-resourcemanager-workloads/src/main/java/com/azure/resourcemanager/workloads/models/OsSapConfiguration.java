// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Defines the OS and SAP Configurations for Deployment.
 */
@Fluent
public final class OsSapConfiguration {
    /*
     * The url and storage account ID where deployer VM packages are uploaded
     */
    @JsonProperty(value = "deployerVmPackages")
    private DeployerVmPackages deployerVmPackages;

    /*
     * The FQDN to set for the SAP system
     */
    @JsonProperty(value = "sapFqdn")
    private String sapFqdn;

    /**
     * Creates an instance of OsSapConfiguration class.
     */
    public OsSapConfiguration() {
    }

    /**
     * Get the deployerVmPackages property: The url and storage account ID where deployer VM packages are uploaded.
     * 
     * @return the deployerVmPackages value.
     */
    public DeployerVmPackages deployerVmPackages() {
        return this.deployerVmPackages;
    }

    /**
     * Set the deployerVmPackages property: The url and storage account ID where deployer VM packages are uploaded.
     * 
     * @param deployerVmPackages the deployerVmPackages value to set.
     * @return the OsSapConfiguration object itself.
     */
    public OsSapConfiguration withDeployerVmPackages(DeployerVmPackages deployerVmPackages) {
        this.deployerVmPackages = deployerVmPackages;
        return this;
    }

    /**
     * Get the sapFqdn property: The FQDN to set for the SAP system.
     * 
     * @return the sapFqdn value.
     */
    public String sapFqdn() {
        return this.sapFqdn;
    }

    /**
     * Set the sapFqdn property: The FQDN to set for the SAP system.
     * 
     * @param sapFqdn the sapFqdn value to set.
     * @return the OsSapConfiguration object itself.
     */
    public OsSapConfiguration withSapFqdn(String sapFqdn) {
        this.sapFqdn = sapFqdn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deployerVmPackages() != null) {
            deployerVmPackages().validate();
        }
    }
}
