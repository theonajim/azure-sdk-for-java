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
 * The SAP supported SKU.
 */
@Fluent
public final class SapSupportedSku {
    /*
     * The VM Sku.
     */
    @JsonProperty(value = "vmSku")
    private String vmSku;

    /*
     * True if the Sku is certified for App server in the SAP system.
     */
    @JsonProperty(value = "isAppServerCertified")
    private Boolean isAppServerCertified;

    /*
     * True if the Sku is certified for Database server in the SAP system.
     */
    @JsonProperty(value = "isDatabaseCertified")
    private Boolean isDatabaseCertified;

    /**
     * Creates an instance of SapSupportedSku class.
     */
    public SapSupportedSku() {
    }

    /**
     * Get the vmSku property: The VM Sku.
     * 
     * @return the vmSku value.
     */
    public String vmSku() {
        return this.vmSku;
    }

    /**
     * Set the vmSku property: The VM Sku.
     * 
     * @param vmSku the vmSku value to set.
     * @return the SapSupportedSku object itself.
     */
    public SapSupportedSku withVmSku(String vmSku) {
        this.vmSku = vmSku;
        return this;
    }

    /**
     * Get the isAppServerCertified property: True if the Sku is certified for App server in the SAP system.
     * 
     * @return the isAppServerCertified value.
     */
    public Boolean isAppServerCertified() {
        return this.isAppServerCertified;
    }

    /**
     * Set the isAppServerCertified property: True if the Sku is certified for App server in the SAP system.
     * 
     * @param isAppServerCertified the isAppServerCertified value to set.
     * @return the SapSupportedSku object itself.
     */
    public SapSupportedSku withIsAppServerCertified(Boolean isAppServerCertified) {
        this.isAppServerCertified = isAppServerCertified;
        return this;
    }

    /**
     * Get the isDatabaseCertified property: True if the Sku is certified for Database server in the SAP system.
     * 
     * @return the isDatabaseCertified value.
     */
    public Boolean isDatabaseCertified() {
        return this.isDatabaseCertified;
    }

    /**
     * Set the isDatabaseCertified property: True if the Sku is certified for Database server in the SAP system.
     * 
     * @param isDatabaseCertified the isDatabaseCertified value to set.
     * @return the SapSupportedSku object itself.
     */
    public SapSupportedSku withIsDatabaseCertified(Boolean isDatabaseCertified) {
        this.isDatabaseCertified = isDatabaseCertified;
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
