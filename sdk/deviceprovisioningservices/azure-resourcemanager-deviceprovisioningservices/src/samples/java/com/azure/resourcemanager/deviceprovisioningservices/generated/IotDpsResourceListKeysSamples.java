// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;

/** Samples for IotDpsResource ListKeys. */
public final class IotDpsResourceListKeysSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2021-10-15/examples/DPSListKeys.json
     */
    /**
     * Sample code: DPSListKeys.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSListKeys(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources().listKeys("myFirstProvisioningService", "myResourceGroup", Context.NONE);
    }
}
