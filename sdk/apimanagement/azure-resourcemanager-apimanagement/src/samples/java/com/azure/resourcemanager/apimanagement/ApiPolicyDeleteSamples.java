// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** Samples for ApiPolicy Delete. */
public final class ApiPolicyDeleteSamples {
    /*
     * operationId: ApiPolicy_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteApiPolicy
     */
    /**
     * Sample code: ApiManagementDeleteApiPolicy.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteApiPolicy(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiPolicies()
            .deleteWithResponse("rg1", "apimService1", "loggerId", PolicyIdName.POLICY, "*", Context.NONE);
    }
}
