// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for PrivateLinkResources List. */
public final class PrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Accounts/stable/2021-11-01/examples/private-link-resources-list.json
     */
    /**
     * Sample code: Get list of all group IDs.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void getListOfAllGroupIDs(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.privateLinkResources().listWithResponse("contoso", "contososports", com.azure.core.util.Context.NONE);
    }
}
