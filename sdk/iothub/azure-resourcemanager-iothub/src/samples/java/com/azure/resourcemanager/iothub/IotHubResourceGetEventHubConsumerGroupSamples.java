// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;

/** Samples for IotHubResource GetEventHubConsumerGroup. */
public final class IotHubResourceGetEventHubConsumerGroupSamples {
    /**
     * Sample code: IotHubResource_ListEventHubConsumerGroups.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void iotHubResourceListEventHubConsumerGroups(
        com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .iotHubResources()
            .getEventHubConsumerGroupWithResponse("myResourceGroup", "testHub", "events", "test", Context.NONE);
    }
}
