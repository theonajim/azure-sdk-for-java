// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ManagedInstances List. */
public final class ManagedInstancesListSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceList.json
     */
    /**
     * Sample code: List managed instances.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedInstances(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedInstances().list(null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceListWithExpandEqualsAdministrators.json
     */
    /**
     * Sample code: List managed instances with $expand=administrators/activedirectory.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedInstancesWithExpandAdministratorsActivedirectory(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedInstances().list(null, Context.NONE);
    }
}
