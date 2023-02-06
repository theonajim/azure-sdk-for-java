// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for creating a custom image from a virtual machine. */
@Fluent
public final class CustomImagePropertiesFromVm {
    /*
     * The source vm identifier.
     */
    @JsonProperty(value = "sourceVmId")
    private String sourceVmId;

    /*
     * The Windows OS information of the VM.
     */
    @JsonProperty(value = "windowsOsInfo")
    private WindowsOsInfo windowsOsInfo;

    /*
     * The Linux OS information of the VM.
     */
    @JsonProperty(value = "linuxOsInfo")
    private LinuxOsInfo linuxOsInfo;

    /** Creates an instance of CustomImagePropertiesFromVm class. */
    public CustomImagePropertiesFromVm() {
    }

    /**
     * Get the sourceVmId property: The source vm identifier.
     *
     * @return the sourceVmId value.
     */
    public String sourceVmId() {
        return this.sourceVmId;
    }

    /**
     * Set the sourceVmId property: The source vm identifier.
     *
     * @param sourceVmId the sourceVmId value to set.
     * @return the CustomImagePropertiesFromVm object itself.
     */
    public CustomImagePropertiesFromVm withSourceVmId(String sourceVmId) {
        this.sourceVmId = sourceVmId;
        return this;
    }

    /**
     * Get the windowsOsInfo property: The Windows OS information of the VM.
     *
     * @return the windowsOsInfo value.
     */
    public WindowsOsInfo windowsOsInfo() {
        return this.windowsOsInfo;
    }

    /**
     * Set the windowsOsInfo property: The Windows OS information of the VM.
     *
     * @param windowsOsInfo the windowsOsInfo value to set.
     * @return the CustomImagePropertiesFromVm object itself.
     */
    public CustomImagePropertiesFromVm withWindowsOsInfo(WindowsOsInfo windowsOsInfo) {
        this.windowsOsInfo = windowsOsInfo;
        return this;
    }

    /**
     * Get the linuxOsInfo property: The Linux OS information of the VM.
     *
     * @return the linuxOsInfo value.
     */
    public LinuxOsInfo linuxOsInfo() {
        return this.linuxOsInfo;
    }

    /**
     * Set the linuxOsInfo property: The Linux OS information of the VM.
     *
     * @param linuxOsInfo the linuxOsInfo value to set.
     * @return the CustomImagePropertiesFromVm object itself.
     */
    public CustomImagePropertiesFromVm withLinuxOsInfo(LinuxOsInfo linuxOsInfo) {
        this.linuxOsInfo = linuxOsInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (windowsOsInfo() != null) {
            windowsOsInfo().validate();
        }
        if (linuxOsInfo() != null) {
            linuxOsInfo().validate();
        }
    }
}
