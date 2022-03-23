// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentApiKeyInner;
import com.azure.resourcemanager.applicationinsights.models.ApiKeyRequest;

/** An instance of this class provides access to all the operations defined in ApiKeysClient. */
public interface ApiKeysClient {
    /**
     * Gets a list of API keys of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of API keys of an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInsightsComponentApiKeyInner> list(String resourceGroupName, String resourceName);

    /**
     * Gets a list of API keys of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of API keys of an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInsightsComponentApiKeyInner> list(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Create an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param apiKeyProperties Properties that need to be specified to create an API key of a Application Insights
     *     component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define an API key of an Application Insights Component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInsightsComponentApiKeyInner create(
        String resourceGroupName, String resourceName, ApiKeyRequest apiKeyProperties);

    /**
     * Create an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param apiKeyProperties Properties that need to be specified to create an API key of a Application Insights
     *     component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define an API key of an Application Insights Component along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInsightsComponentApiKeyInner> createWithResponse(
        String resourceGroupName, String resourceName, ApiKeyRequest apiKeyProperties, Context context);

    /**
     * Delete an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define an API key of an Application Insights Component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInsightsComponentApiKeyInner delete(String resourceGroupName, String resourceName, String keyId);

    /**
     * Delete an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define an API key of an Application Insights Component along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInsightsComponentApiKeyInner> deleteWithResponse(
        String resourceGroupName, String resourceName, String keyId, Context context);

    /**
     * Get the API Key for this key id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API Key for this key id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInsightsComponentApiKeyInner get(String resourceGroupName, String resourceName, String keyId);

    /**
     * Get the API Key for this key id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API Key for this key id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInsightsComponentApiKeyInner> getWithResponse(
        String resourceGroupName, String resourceName, String keyId, Context context);
}
