// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.Context;

/** Samples for Volumes RevertRelocation. */
public final class VolumesRevertRelocationSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-05-01/examples/Volumes_RevertRelocation.json
     */
    /**
     * Sample code: Volumes_RevertRelocation.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesRevertRelocation(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes().revertRelocation("myRG", "account1", "pool1", "volume1", Context.NONE);
    }
}
