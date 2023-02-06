// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.workloads.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.workloads.fluent.models.SapDatabaseInstanceInner;
import com.azure.resourcemanager.workloads.models.StopRequest;
import com.azure.resourcemanager.workloads.models.UpdateSapDatabaseInstanceRequest;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SapDatabaseInstancesClient.
 */
public interface SapDatabaseInstancesClient {
    /**
     * Gets the SAP Database Instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SapDatabaseInstanceInner> getWithResponse(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Gets the SAP Database Instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner get(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Creates the Database resource corresponding to the Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginCreate(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Creates the Database resource corresponding to the Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param body Request body of Database resource of a SAP system.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginCreate(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, SapDatabaseInstanceInner body, Context context);

    /**
     * Creates the Database resource corresponding to the Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner create(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Creates the Database resource corresponding to the Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param body Request body of Database resource of a SAP system.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner create(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, SapDatabaseInstanceInner body, Context context);

    /**
     * Updates the Database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginUpdate(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Updates the Database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param body Database resource update request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginUpdate(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, UpdateSapDatabaseInstanceRequest body, Context context);

    /**
     * Updates the Database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner update(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Updates the Database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param body Database resource update request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the Database resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner update(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, UpdateSapDatabaseInstanceRequest body, Context context);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginDelete(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginDelete(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner delete(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner delete(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Lists the Database resources associated with a Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Database Instances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SapDatabaseInstanceInner> list(String resourceGroupName, String sapVirtualInstanceName);

    /**
     * Lists the Database resources associated with a Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Database Instances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SapDatabaseInstanceInner> list(String resourceGroupName, String sapVirtualInstanceName, Context context);

    /**
     * Starts the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginStartInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Starts the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginStartInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Starts the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner startInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Starts the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner startInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Stops the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginStopInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Stops the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param body Stop request for the database instance of the SAP system.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginStopInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, StopRequest body, Context context);

    /**
     * Stops the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner stopInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Stops the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work correctly.
     * @param body Stop request for the database instance of the SAP system.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner stopInstance(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, StopRequest body, Context context);
}
