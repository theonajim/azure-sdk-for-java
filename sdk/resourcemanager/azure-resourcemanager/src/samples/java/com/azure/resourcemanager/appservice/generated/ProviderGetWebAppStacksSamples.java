// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for Provider GetWebAppStacks. */
public final class ProviderGetWebAppStacksSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/GetWebAppStacks.json
     */
    /**
     * Sample code: Get Web App Stacks.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getWebAppStacks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getProviders().getWebAppStacks(null, Context.NONE);
    }
}
