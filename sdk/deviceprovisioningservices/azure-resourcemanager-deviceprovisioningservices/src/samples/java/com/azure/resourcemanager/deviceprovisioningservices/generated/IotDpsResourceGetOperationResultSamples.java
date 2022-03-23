// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;

/** Samples for IotDpsResource GetOperationResult. */
public final class IotDpsResourceGetOperationResultSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2021-10-15/examples/DPSGetOperationResult.json
     */
    /**
     * Sample code: DPSGetOperationResult.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetOperationResult(
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager
            .iotDpsResources()
            .getOperationResultWithResponse(
                "MTY5OTNmZDctODI5Yy00N2E2LTkxNDQtMDU1NGIyYzY1ZjRl",
                "myResourceGroup",
                "myFirstProvisioningService",
                "1508265712453",
                Context.NONE);
    }
}
