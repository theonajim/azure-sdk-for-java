// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for TopicEventSubscriptions GetFullUrl. */
public final class TopicEventSubscriptionsGetFullUrlSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2022-06-15/examples/TopicEventSubscriptions_GetFullUrl.json
     */
    /**
     * Sample code: TopicEventSubscriptions_GetFullUrl.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void topicEventSubscriptionsGetFullUrl(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .topicEventSubscriptions()
            .getFullUrlWithResponse("examplerg", "exampleTopic1", "examplesubscription1", Context.NONE);
    }
}
