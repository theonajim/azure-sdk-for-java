// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.VirtualMachineRestrictMovementState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual Machine Properties. */
@Immutable
public final class VirtualMachineProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineProperties.class);

    /*
     * Display name of the VM.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Virtual machine managed object reference id
     */
    @JsonProperty(value = "moRefId", access = JsonProperty.Access.WRITE_ONLY)
    private String moRefId;

    /*
     * Path to virtual machine's folder starting from datacenter virtual
     * machine folder
     */
    @JsonProperty(value = "folderPath", access = JsonProperty.Access.WRITE_ONLY)
    private String folderPath;

    /*
     * Whether VM DRS-driven movement is restricted (enabled) or not (disabled)
     */
    @JsonProperty(value = "restrictMovement", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineRestrictMovementState restrictMovement;

    /**
     * Get the displayName property: Display name of the VM.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the moRefId property: Virtual machine managed object reference id.
     *
     * @return the moRefId value.
     */
    public String moRefId() {
        return this.moRefId;
    }

    /**
     * Get the folderPath property: Path to virtual machine's folder starting from datacenter virtual machine folder.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Get the restrictMovement property: Whether VM DRS-driven movement is restricted (enabled) or not (disabled).
     *
     * @return the restrictMovement value.
     */
    public VirtualMachineRestrictMovementState restrictMovement() {
        return this.restrictMovement;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
