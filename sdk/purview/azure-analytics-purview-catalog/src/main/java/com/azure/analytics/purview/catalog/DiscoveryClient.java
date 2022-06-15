// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewCatalogClient type. */
@ServiceClient(builder = DiscoveryClientBuilder.class)
public final class DiscoveryClient {
    @Generated private final DiscoveryAsyncClient client;

    /**
     * Initializes an instance of DiscoveryClient class.
     *
     * @param client the async client.
     */
    @Generated
    DiscoveryClient(DiscoveryAsyncClient client) {
        this.client = client;
    }

    /**
     * Gets data using search.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keywords: String
     *     offset: Integer
     *     limit: Integer
     *     filter: Object
     *     facets: [
     *         {
     *             count: Integer
     *             facet: String
     *             sort: Object
     *         }
     *     ]
     *     taxonomySetting: {
     *         assetTypes: [
     *             String
     *         ]
     *         facet: (recursive schema, see facet above)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     searchFacets: {
     *         assetType: [
     *             {
     *                 count: Integer
     *                 value: String
     *             }
     *         ]
     *         classification: [
     *             (recursive schema, see above)
     *         ]
     *         classificationCategory: [
     *             (recursive schema, see above)
     *         ]
     *         contactId: [
     *             (recursive schema, see above)
     *         ]
     *         fileExtension: [
     *             (recursive schema, see above)
     *         ]
     *         label: [
     *             (recursive schema, see above)
     *         ]
     *         term: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     value: [
     *         {
     *             searchScore: Float
     *             searchHighlights: {
     *                 id: [
     *                     String
     *                 ]
     *                 qualifiedName: [
     *                     String
     *                 ]
     *                 name: [
     *                     String
     *                 ]
     *                 description: [
     *                     String
     *                 ]
     *                 entityType: [
     *                     String
     *                 ]
     *             }
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param searchRequest An object specifying the search criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return data using search along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> queryWithResponse(BinaryData searchRequest, RequestOptions requestOptions) {
        return this.client.queryWithResponse(searchRequest, requestOptions).block();
    }

    /**
     * Get search suggestions by query criteria.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             searchScore: Float
     *             searchText: String
     *             description: String
     *             id: String
     *             name: String
     *             owner: String
     *             qualifiedName: String
     *             entityType: String
     *             classification: [
     *                 String
     *             ]
     *             label: [
     *                 String
     *             ]
     *             term: [
     *                 {
     *                     name: String
     *                     glossaryName: String
     *                     guid: String
     *                 }
     *             ]
     *             contact: [
     *                 {
     *                     id: String
     *                     info: String
     *                     contactType: String
     *                 }
     *             ]
     *             assetType: [
     *                 String
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param suggestRequest An object specifying the suggest criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return search suggestions by query criteria along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> suggestWithResponse(BinaryData suggestRequest, RequestOptions requestOptions) {
        return this.client.suggestWithResponse(suggestRequest, requestOptions).block();
    }

    /**
     * Browse entities by path or entity type.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     entityType: String
     *     path: String
     *     limit: Integer
     *     offset: Integer
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     searchCount: Integer
     *     value: [
     *         {
     *             entityType: String
     *             id: String
     *             isLeaf: Boolean
     *             name: String
     *             owner: [
     *                 {
     *                     id: String
     *                     displayName: String
     *                     mail: String
     *                     contactType: String
     *                 }
     *             ]
     *             path: String
     *             qualifiedName: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param browseRequest An object specifying the browse criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return browseResult along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> browseWithResponse(BinaryData browseRequest, RequestOptions requestOptions) {
        return this.client.browseWithResponse(browseRequest, requestOptions).block();
    }

    /**
     * Get auto complete options.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keywords: String
     *     limit: Integer
     *     filter: Object
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             text: String
     *             queryPlusText: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param autoCompleteRequest An object specifying the autocomplete criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return auto complete options along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> autoCompleteWithResponse(
            BinaryData autoCompleteRequest, RequestOptions requestOptions) {
        return this.client.autoCompleteWithResponse(autoCompleteRequest, requestOptions).block();
    }
}
