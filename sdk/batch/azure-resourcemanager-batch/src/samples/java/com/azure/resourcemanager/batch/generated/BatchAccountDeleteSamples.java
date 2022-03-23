// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.Context;

/** Samples for BatchAccount Delete. */
public final class BatchAccountDeleteSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2022-01-01/examples/BatchAccountDelete.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.batchAccounts().delete("default-azurebatch-japaneast", "sampleacct", Context.NONE);
    }
}
