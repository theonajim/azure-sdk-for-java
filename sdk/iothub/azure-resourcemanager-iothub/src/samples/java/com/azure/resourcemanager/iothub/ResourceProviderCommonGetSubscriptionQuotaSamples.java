// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;

/** Samples for ResourceProviderCommon GetSubscriptionQuota. */
public final class ResourceProviderCommonGetSubscriptionQuotaSamples {
    /**
     * Sample code: ResourceProviderCommon_GetSubscriptionQuota.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void resourceProviderCommonGetSubscriptionQuota(
        com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager.resourceProviderCommons().getSubscriptionQuotaWithResponse(Context.NONE);
    }
}
