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
import java.util.stream.Collectors;

/**
 * Defines the SAP Enqueue Server properties.
 */
@Immutable
public final class EnqueueServerProperties {
    /*
     * Enqueue Server SAP Hostname.
     */
    @JsonProperty(value = "hostname", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * Enqueue Server SAP IP Address.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /*
     * Enqueue Server Port.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Long port;

    /*
     * Defines the health of SAP Instances.
     */
    @JsonProperty(value = "health", access = JsonProperty.Access.WRITE_ONLY)
    private SapHealthState health;

    /**
     * Creates an instance of EnqueueServerProperties class.
     */
    public EnqueueServerProperties() {
    }

    /**
     * Get the hostname property: Enqueue Server SAP Hostname.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the ipAddress property: Enqueue Server SAP IP Address.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the port property: Enqueue Server Port.
     * 
     * @return the port value.
     */
    public Long port() {
        return this.port;
    }

    /**
     * Get the health property: Defines the health of SAP Instances.
     * 
     * @return the health value.
     */
    public SapHealthState health() {
        return this.health;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
