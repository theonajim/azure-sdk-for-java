// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2015-04-01/examples/OperationList.json
     */
    /**
     * Sample code: Get a list of operations for a resource provider.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAListOfOperationsForAResourceProvider(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getOperations().listWithResponse(Context.NONE);
    }
}
