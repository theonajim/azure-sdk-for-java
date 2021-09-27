// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlManagedInstances. */
public interface SqlManagedInstances {
    /**
     * List sqlManagedInstance resources in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SqlManagedInstance.
     */
    PagedIterable<SqlManagedInstance> list();

    /**
     * List sqlManagedInstance resources in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SqlManagedInstance.
     */
    PagedIterable<SqlManagedInstance> list(Context context);

    /**
     * Gets all sqlManagedInstances in a resource group.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all sqlManagedInstances in a resource group.
     */
    PagedIterable<SqlManagedInstance> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all sqlManagedInstances in a resource group.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all sqlManagedInstances in a resource group.
     */
    PagedIterable<SqlManagedInstance> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    SqlManagedInstance getByResourceGroup(String resourceGroupName, String sqlManagedInstanceName);

    /**
     * Retrieves a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName Name of SQL Managed Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    Response<SqlManagedInstance> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlManagedInstanceName, Context context);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName The name of Sql Managed Instances.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String sqlManagedInstanceName);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param sqlManagedInstanceName The name of Sql Managed Instances.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String sqlManagedInstanceName, Context context);

    /**
     * Retrieves a SQL Managed Instance resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    SqlManagedInstance getById(String id);

    /**
     * Retrieves a SQL Managed Instance resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SqlManagedInstance.
     */
    Response<SqlManagedInstance> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a SQL Managed Instance resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SqlManagedInstance resource.
     *
     * @param name resource name.
     * @return the first stage of the new SqlManagedInstance definition.
     */
    SqlManagedInstance.DefinitionStages.Blank define(String name);
}
