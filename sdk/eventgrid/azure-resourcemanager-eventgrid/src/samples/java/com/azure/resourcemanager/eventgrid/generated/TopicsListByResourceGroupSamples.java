// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for Topics ListByResourceGroup. */
public final class TopicsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2021-12-01/examples/Topics_ListByResourceGroup.json
     */
    /**
     * Sample code: Topics_ListByResourceGroup.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void topicsListByResourceGroup(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topics().listByResourceGroup("examplerg", null, null, Context.NONE);
    }
}
