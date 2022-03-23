// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

import com.azure.core.util.Context;

/** Samples for DenyAssignments ListForResource. */
public final class DenyAssignmentsListForResourceSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2018-07-01-preview/examples/GetDenyAssignmentsForResource.json
     */
    /**
     * Sample code: List deny assignments for resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDenyAssignmentsForResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getDenyAssignments()
            .listForResource(
                "rgname",
                "resourceProviderNamespace",
                "parentResourcePath",
                "resourceType",
                "resourceName",
                null,
                Context.NONE);
    }
}
