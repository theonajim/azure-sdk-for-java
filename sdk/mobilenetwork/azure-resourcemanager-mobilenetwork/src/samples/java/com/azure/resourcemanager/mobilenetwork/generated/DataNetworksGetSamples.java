// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;

/** Samples for DataNetworks Get. */
public final class DataNetworksGetSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/preview/2022-04-01-preview/examples/DataNetworkGet.json
     */
    /**
     * Sample code: Get data network.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void getDataNetwork(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.dataNetworks().getWithResponse("rg1", "testMobileNetwork", "testDataNetwork", Context.NONE);
    }
}
