// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning;

import com.azure.analytics.purview.scanning.implementation.ScanRulesetsImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous PurviewScanningClient type. */
@ServiceClient(builder = PurviewScanningClientBuilder.class, isAsync = true)
public final class ScanRulesetsAsyncClient {
    @Generated private final ScanRulesetsImpl serviceClient;

    /**
     * Initializes an instance of ScanRulesets client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ScanRulesetsAsyncClient(ScanRulesetsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a scan ruleset.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scanRulesetType: String(Custom/System)
     *     status: String(Enabled/Disabled)
     *     version: Integer
     * }
     * }</pre>
     *
     * @param scanRulesetName The scanRulesetName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return a scan ruleset.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String scanRulesetName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(scanRulesetName, requestOptions);
    }

    /**
     * Creates or Updates a scan ruleset.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scanRulesetType: String(Custom/System)
     *     status: String(Enabled/Disabled)
     *     version: Integer
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scanRulesetType: String(Custom/System)
     *     status: String(Enabled/Disabled)
     *     version: Integer
     * }
     * }</pre>
     *
     * @param scanRulesetName The scanRulesetName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String scanRulesetName, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(scanRulesetName, requestOptions);
    }

    /**
     * Deletes a scan ruleset.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     scanRulesetType: String(Custom/System)
     *     status: String(Enabled/Disabled)
     *     version: Integer
     * }
     * }</pre>
     *
     * @param scanRulesetName The scanRulesetName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> deleteWithResponse(String scanRulesetName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(scanRulesetName, requestOptions);
    }

    /**
     * List scan rulesets in Data catalog.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             id: String
     *             name: String
     *             scanRulesetType: String(Custom/System)
     *             status: String(Enabled/Disabled)
     *             version: Integer
     *         }
     *     ]
     *     nextLink: String
     *     count: Long
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAll(RequestOptions requestOptions) {
        return this.serviceClient.listAllAsync(requestOptions);
    }
}
