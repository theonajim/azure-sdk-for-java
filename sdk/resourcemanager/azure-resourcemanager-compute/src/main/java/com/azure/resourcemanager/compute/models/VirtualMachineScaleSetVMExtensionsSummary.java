// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Extensions summary for virtual machines of a virtual machine scale set. */
@Immutable
public final class VirtualMachineScaleSetVMExtensionsSummary {
    /*
     * The extension name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The extensions information.
     */
    @JsonProperty(value = "statusesSummary", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineStatusCodeCount> statusesSummary;

    /**
     * Get the name property: The extension name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the statusesSummary property: The extensions information.
     *
     * @return the statusesSummary value.
     */
    public List<VirtualMachineStatusCodeCount> statusesSummary() {
        return this.statusesSummary;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statusesSummary() != null) {
            statusesSummary().forEach(e -> e.validate());
        }
    }
}
