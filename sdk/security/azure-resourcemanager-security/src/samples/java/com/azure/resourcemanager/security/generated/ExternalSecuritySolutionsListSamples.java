// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for ExternalSecuritySolutions List. */
public final class ExternalSecuritySolutionsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/ExternalSecuritySolutions/GetExternalSecuritySolutionsSubscription_example.json
     */
    /**
     * Sample code: Get external security solutions on a subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getExternalSecuritySolutionsOnASubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.externalSecuritySolutions().list(Context.NONE);
    }
}
