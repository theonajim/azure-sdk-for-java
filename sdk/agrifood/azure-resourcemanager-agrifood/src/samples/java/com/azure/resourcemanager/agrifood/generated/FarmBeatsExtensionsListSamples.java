// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.Context;

/** Samples for FarmBeatsExtensions List. */
public final class FarmBeatsExtensionsListSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2021-09-01-preview/examples/FarmBeatsExtensions_List.json
     */
    /**
     * Sample code: FarmBeatsExtensions_List.
     *
     * @param manager Entry point to AgriFoodManager.
     */
    public static void farmBeatsExtensionsList(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.farmBeatsExtensions().list(null, null, null, null, null, Context.NONE);
    }
}
