// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;

/** Samples for DatabasePrincipalAssignments Get. */
public final class DatabasePrincipalAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-07-07/examples/KustoDatabasePrincipalAssignmentsGet.json
     */
    /**
     * Sample code: KustoDatabasePrincipalAssignmentsGet.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDatabasePrincipalAssignmentsGet(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .databasePrincipalAssignments()
            .getWithResponse("kustorptest", "kustoCluster", "Kustodatabase8", "kustoprincipal1", Context.NONE);
    }
}
