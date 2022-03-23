// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetFilterInner;

/** An instance of this class provides access to all the operations defined in AssetFiltersClient. */
public interface AssetFiltersClient {
    /**
     * List Asset Filters associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetFilter items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetFilterInner> list(String resourceGroupName, String accountName, String assetName);

    /**
     * List Asset Filters associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetFilter items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetFilterInner> list(
        String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Get the details of an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset Filter associated with the specified Asset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetFilterInner get(String resourceGroupName, String accountName, String assetName, String filterName);

    /**
     * Get the details of an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset Filter associated with the specified Asset along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetFilterInner> getWithResponse(
        String resourceGroupName, String accountName, String assetName, String filterName, Context context);

    /**
     * Creates or updates an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetFilterInner createOrUpdate(
        String resourceGroupName, String accountName, String assetName, String filterName, AssetFilterInner parameters);

    /**
     * Creates or updates an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Filter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetFilterInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        String filterName,
        AssetFilterInner parameters,
        Context context);

    /**
     * Deletes an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String assetName, String filterName);

    /**
     * Deletes an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String assetName, String filterName, Context context);

    /**
     * Updates an existing Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetFilterInner update(
        String resourceGroupName, String accountName, String assetName, String filterName, AssetFilterInner parameters);

    /**
     * Updates an existing Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Asset Filter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetFilterInner> updateWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        String filterName,
        AssetFilterInner parameters,
        Context context);
}
