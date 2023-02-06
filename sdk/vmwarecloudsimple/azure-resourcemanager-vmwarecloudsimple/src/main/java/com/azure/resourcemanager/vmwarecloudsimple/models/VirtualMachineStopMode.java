// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List of virtual machine stop modes. */
@Fluent
public final class VirtualMachineStopMode {
    /*
     * mode indicates a type of stop operation - reboot, suspend, shutdown or power-off
     */
    @JsonProperty(value = "mode")
    private StopMode mode;

    /** Creates an instance of VirtualMachineStopMode class. */
    public VirtualMachineStopMode() {
    }

    /**
     * Get the mode property: mode indicates a type of stop operation - reboot, suspend, shutdown or power-off.
     *
     * @return the mode value.
     */
    public StopMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: mode indicates a type of stop operation - reboot, suspend, shutdown or power-off.
     *
     * @param mode the mode value to set.
     * @return the VirtualMachineStopMode object itself.
     */
    public VirtualMachineStopMode withMode(StopMode mode) {
        this.mode = mode;
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
