// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines associated to virtual machine
 * scale set with OrchestrationMode as Flexible.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt;
 * **ImageDefault** - The virtual machine's default patching configuration is used. &lt;br /&gt;&lt;br /&gt;
 * **AutomaticByPlatform** - The virtual machine will be automatically updated by the platform. The property
 * provisionVMAgent must be true.
 */
public final class LinuxVMGuestPatchMode extends ExpandableStringEnum<LinuxVMGuestPatchMode> {
    /** Static value ImageDefault for LinuxVMGuestPatchMode. */
    public static final LinuxVMGuestPatchMode IMAGE_DEFAULT = fromString("ImageDefault");

    /** Static value AutomaticByPlatform for LinuxVMGuestPatchMode. */
    public static final LinuxVMGuestPatchMode AUTOMATIC_BY_PLATFORM = fromString("AutomaticByPlatform");

    /**
     * Creates or finds a LinuxVMGuestPatchMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LinuxVMGuestPatchMode.
     */
    @JsonCreator
    public static LinuxVMGuestPatchMode fromString(String name) {
        return fromString(name, LinuxVMGuestPatchMode.class);
    }

    /**
     * Gets known LinuxVMGuestPatchMode values.
     *
     * @return known LinuxVMGuestPatchMode values.
     */
    public static Collection<LinuxVMGuestPatchMode> values() {
        return values(LinuxVMGuestPatchMode.class);
    }
}
