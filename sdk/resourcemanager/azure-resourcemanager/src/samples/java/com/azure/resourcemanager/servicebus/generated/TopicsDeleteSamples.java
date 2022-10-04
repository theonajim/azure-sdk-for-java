// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

import com.azure.core.util.Context;

/** Samples for Topics Delete. */
public final class TopicsDeleteSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/Topics/SBTopicDelete.json
     */
    /**
     * Sample code: TopicDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void topicDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getTopics()
            .deleteWithResponse("ArunMonocle", "sdk-Namespace-1617", "sdk-Topics-5488", Context.NONE);
    }
}
