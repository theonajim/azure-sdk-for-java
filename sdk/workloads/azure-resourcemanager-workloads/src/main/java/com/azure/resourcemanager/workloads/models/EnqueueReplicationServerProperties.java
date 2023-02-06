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
 * Defines the SAP Enqueue Replication Server (ERS) properties.
 */
@Immutable
public final class EnqueueReplicationServerProperties {
    /*
     * Defines the type of Enqueue Replication Server.
     */
    @JsonProperty(value = "ersVersion", access = JsonProperty.Access.WRITE_ONLY)
    private EnqueueReplicationServerType ersVersion;

    /*
     * ERS Instance Number.
     */
    @JsonProperty(value = "instanceNo", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceNo;

    /*
     * ERS SAP Hostname.
     */
    @JsonProperty(value = "hostname", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * ERS SAP Kernel Version.
     */
    @JsonProperty(value = "kernelVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kernelVersion;

    /*
     * ERS SAP Kernel Patch level.
     */
    @JsonProperty(value = "kernelPatch", access = JsonProperty.Access.WRITE_ONLY)
    private String kernelPatch;

    /*
     * ERS SAP IP Address.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /*
     * Defines the health of SAP Instances.
     */
    @JsonProperty(value = "health", access = JsonProperty.Access.WRITE_ONLY)
    private SapHealthState health;

    /**
     * Creates an instance of EnqueueReplicationServerProperties class.
     */
    public EnqueueReplicationServerProperties() {
    }

    /**
     * Get the ersVersion property: Defines the type of Enqueue Replication Server.
     * 
     * @return the ersVersion value.
     */
    public EnqueueReplicationServerType ersVersion() {
        return this.ersVersion;
    }

    /**
     * Get the instanceNo property: ERS Instance Number.
     * 
     * @return the instanceNo value.
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Get the hostname property: ERS SAP Hostname.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the kernelVersion property: ERS SAP Kernel Version.
     * 
     * @return the kernelVersion value.
     */
    public String kernelVersion() {
        return this.kernelVersion;
    }

    /**
     * Get the kernelPatch property: ERS SAP Kernel Patch level.
     * 
     * @return the kernelPatch value.
     */
    public String kernelPatch() {
        return this.kernelPatch;
    }

    /**
     * Get the ipAddress property: ERS SAP IP Address.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
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
