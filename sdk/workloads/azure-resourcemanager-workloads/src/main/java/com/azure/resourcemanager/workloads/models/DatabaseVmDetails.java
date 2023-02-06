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
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Database VM details.
 */
@Immutable
public final class DatabaseVmDetails {
    /*
     * The virtualMachineId property.
     */
    @JsonProperty(value = "virtualMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualMachineId;

    /*
     * Defines the SAP Instance status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private SapVirtualInstanceStatus status;

    /*
     * Storage details of all the Storage Accounts attached to the Database Virtual Machine. For e.g. NFS on AFS Shared
     * Storage.
     */
    @JsonProperty(value = "storageDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageInformation> storageDetails;

    /**
     * Creates an instance of DatabaseVmDetails class.
     */
    public DatabaseVmDetails() {
    }

    /**
     * Get the virtualMachineId property: The virtualMachineId property.
     * 
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Get the status property: Defines the SAP Instance status.
     * 
     * @return the status value.
     */
    public SapVirtualInstanceStatus status() {
        return this.status;
    }

    /**
     * Get the storageDetails property: Storage details of all the Storage Accounts attached to the Database Virtual
     * Machine. For e.g. NFS on AFS Shared Storage.
     * 
     * @return the storageDetails value.
     */
    public List<StorageInformation> storageDetails() {
        return this.storageDetails;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageDetails() != null) {
            storageDetails().forEach(e -> e.validate());
        }
    }
}
