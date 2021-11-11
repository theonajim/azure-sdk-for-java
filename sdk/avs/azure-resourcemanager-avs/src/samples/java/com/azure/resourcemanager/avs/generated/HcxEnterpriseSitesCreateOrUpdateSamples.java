// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/** Samples for HcxEnterpriseSites CreateOrUpdate. */
public final class HcxEnterpriseSitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/HcxEnterpriseSites_CreateOrUpdate.json
     */
    /**
     * Sample code: HcxEnterpriseSites_CreateOrUpdate.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void hcxEnterpriseSitesCreateOrUpdate(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.hcxEnterpriseSites().define("site1").withExistingPrivateCloud("group1", "cloud1").create();
    }
}
