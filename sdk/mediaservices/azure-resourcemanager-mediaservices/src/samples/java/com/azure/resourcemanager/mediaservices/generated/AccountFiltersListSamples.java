// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for AccountFilters List. */
public final class AccountFiltersListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/accountFilters-list-all.json
     */
    /**
     * Sample code: List all Account Filters.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listAllAccountFilters(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.accountFilters().list("contoso", "contosomedia", Context.NONE);
    }
}
