// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.DedicatedHostGroupUpdate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for DedicatedHostGroups Update. */
public final class DedicatedHostGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-08-01/examples/dedicatedHostExamples/DedicatedHostGroups_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroups_Update_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostGroupsUpdateMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .updateWithResponse("rgcompute", "aaaaaaaaaaa", new DedicatedHostGroupUpdate(), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-08-01/examples/dedicatedHostExamples/DedicatedHostGroups_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroups_Update_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostGroupsUpdateMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .updateWithResponse(
                "rgcompute",
                "aaaa",
                new DedicatedHostGroupUpdate()
                    .withTags(mapOf("key9921", "aaaaaaaaaa"))
                    .withZones(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
                    .withPlatformFaultDomainCount(3)
                    .withSupportAutomaticPlacement(true),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
