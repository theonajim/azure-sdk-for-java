// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.Context;

/** Samples for ResourceProvider GetOperationResult. */
public final class ResourceProviderGetOperationResultSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/GetOperationResult.json
     */
    /**
     * Sample code: Get Operation Result.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void getOperationResult(com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .resourceProviders()
            .getOperationResultWithResponse(
                "HelloWorld",
                "swaggerExample",
                "YWUzNDFkMzQtZmM5OS00MmUyLWEzNDMtZGJkMDIxZjlmZjgzOzdmYzBiMzhmLTc2NmItNDM5NS05OWQ1LTVmOGEzNzg4MWQzNA==",
                Context.NONE);
    }
}
