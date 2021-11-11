// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for PlacementPolicies Delete. */
public final class PlacementPoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/PlacementPolicies_Delete.json
     */
    /**
     * Sample code: PlacementPolicies_Delete.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void placementPoliciesDelete(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.placementPolicies().delete("group1", "cloud1", "cluster1", "policy1", Context.NONE);
    }
}
