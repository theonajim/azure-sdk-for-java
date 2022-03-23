// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlPoolConnectionPolicies. */
public interface SqlPoolConnectionPolicies {
    /**
     * Get a Sql pool's connection policy, which is used with table auditing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's connection policy, which is used with table auditing.
     */
    SqlPoolConnectionPolicy get(
        String resourceGroupName, String workspaceName, String sqlPoolName, ConnectionPolicyName connectionPolicyName);

    /**
     * Get a Sql pool's connection policy, which is used with table auditing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's connection policy, which is used with table auditing along with {@link Response}.
     */
    Response<SqlPoolConnectionPolicy> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        ConnectionPolicyName connectionPolicyName,
        Context context);
}
