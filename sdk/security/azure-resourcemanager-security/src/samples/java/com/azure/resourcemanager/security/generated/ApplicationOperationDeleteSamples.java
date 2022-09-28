// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationOperation Delete. */
public final class ApplicationOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-07-01-preview/examples/Applications/DeleteApplication_example.json
     */
    /**
     * Sample code: Delete security Application.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteSecurityApplication(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.applicationOperations().deleteWithResponse("ad9a8e26-29d9-4829-bb30-e597a58cdbb8", Context.NONE);
    }
}
