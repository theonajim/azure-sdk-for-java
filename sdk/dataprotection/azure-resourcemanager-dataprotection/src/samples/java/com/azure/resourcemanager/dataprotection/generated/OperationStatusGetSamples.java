// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/** Samples for OperationStatus Get. */
public final class OperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/preview/2022-11-01-preview/examples/GetOperationStatus.json
     */
    /**
     * Sample code: Get OperationStatus.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getOperationStatus(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .operationStatus()
            .getWithResponse(
                "WestUS",
                "MjkxOTMyODMtYTE3My00YzJjLTg5NjctN2E4MDIxNDA3NjA2OzdjNGE2ZWRjLWJjMmItNDRkYi1hYzMzLWY1YzEwNzk5Y2EyOA==",
                com.azure.core.util.Context.NONE);
    }
}
