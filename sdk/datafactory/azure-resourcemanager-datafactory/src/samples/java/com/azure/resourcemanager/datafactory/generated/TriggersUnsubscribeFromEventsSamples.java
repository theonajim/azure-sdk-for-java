// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/** Samples for Triggers UnsubscribeFromEvents. */
public final class TriggersUnsubscribeFromEventsSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Triggers_UnsubscribeFromEvents.json
     */
    /**
     * Sample code: Triggers_UnsubscribeFromEvents.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void triggersUnsubscribeFromEvents(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .triggers()
            .unsubscribeFromEvents(
                "exampleResourceGroup", "exampleFactoryName", "exampleTrigger", com.azure.core.util.Context.NONE);
    }
}
