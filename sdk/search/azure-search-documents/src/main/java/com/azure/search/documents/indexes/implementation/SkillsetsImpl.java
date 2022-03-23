// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.search.documents.indexes.implementation.models.ListSkillsetsResult;
import com.azure.search.documents.indexes.implementation.models.RequestOptions;
import com.azure.search.documents.indexes.implementation.models.SearchErrorException;
import com.azure.search.documents.indexes.implementation.models.SkillNames;
import com.azure.search.documents.indexes.models.SearchIndexerSkillset;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Skillsets. */
public final class SkillsetsImpl {
    /** The proxy service used to perform REST calls. */
    private final SkillsetsService service;

    /** The service client containing this operation class. */
    private final SearchServiceClientImpl client;

    /**
     * Initializes an instance of SkillsetsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SkillsetsImpl(SearchServiceClientImpl client) {
        this.service =
                RestProxy.create(SkillsetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchServiceClientSkillsets to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceClientS")
    public interface SkillsetsService {
        @Put("/skillsets('{skillsetName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexerSkillset>> createOrUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam("skillsetName") String skillsetName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Prefer") String prefer,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("ignoreResetRequirements") Boolean skipIndexerResetRequirementForCache,
                @QueryParam("disableCacheReprocessingChangeDetection") Boolean disableCacheReprocessingChangeDetection,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SearchIndexerSkillset skillset,
                Context context);

        @Delete("/skillsets('{skillsetName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("skillsetName") String skillsetName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/skillsets('{skillsetName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexerSkillset>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("skillsetName") String skillsetName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/skillsets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<ListSkillsetsResult>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("$select") String select,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/skillsets")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexerSkillset>> create(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SearchIndexerSkillset skillset,
                Context context);

        @Post("/skillsets('{skillsetName}')/search.resetskills")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> resetSkills(
                @HostParam("endpoint") String endpoint,
                @PathParam("skillsetName") String skillsetName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SkillNames skillNames,
                Context context);
    }

    /**
     * Creates a new skillset in a search service or updates the skillset if it already exists.
     *
     * @param skillsetName The name of the skillset to create or update.
     * @param skillset The skillset containing one or more skills to create or update in a search service.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param skipIndexerResetRequirementForCache Ignores cache reset requirements.
     * @param disableCacheReprocessingChangeDetection Disables cache reprocessing change detection.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of skills along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexerSkillset>> createOrUpdateWithResponseAsync(
            String skillsetName,
            SearchIndexerSkillset skillset,
            String ifMatch,
            String ifNoneMatch,
            Boolean skipIndexerResetRequirementForCache,
            Boolean disableCacheReprocessingChangeDetection,
            RequestOptions requestOptions,
            Context context) {
        final String prefer = "return=representation";
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.createOrUpdate(
                this.client.getEndpoint(),
                skillsetName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                prefer,
                this.client.getApiVersion(),
                skipIndexerResetRequirementForCache,
                disableCacheReprocessingChangeDetection,
                accept,
                skillset,
                context);
    }

    /**
     * Deletes a skillset in a search service.
     *
     * @param skillsetName The name of the skillset to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String skillsetName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.delete(
                this.client.getEndpoint(),
                skillsetName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Retrieves a skillset in a search service.
     *
     * @param skillsetName The name of the skillset to retrieve.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of skills along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexerSkillset>> getWithResponseAsync(
            String skillsetName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.get(
                this.client.getEndpoint(),
                skillsetName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * List all skillsets in a search service.
     *
     * @param select Selects which top-level properties of the skillsets to retrieve. Specified as a comma-separated
     *     list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from a list skillset request along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ListSkillsetsResult>> listWithResponseAsync(
            String select, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.list(
                this.client.getEndpoint(), select, xMsClientRequestId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Creates a new skillset in a search service.
     *
     * @param skillset The skillset containing one or more skills to create in a search service.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of skills along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexerSkillset>> createWithResponseAsync(
            SearchIndexerSkillset skillset, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.create(
                this.client.getEndpoint(), xMsClientRequestId, this.client.getApiVersion(), accept, skillset, context);
    }

    /**
     * Reset an existing skillset in a search service.
     *
     * @param skillsetName The name of the skillset to reset.
     * @param skillNames The names of skills to reset.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resetSkillsWithResponseAsync(
            String skillsetName, SkillNames skillNames, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.resetSkills(
                this.client.getEndpoint(),
                skillsetName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                skillNames,
                context);
    }
}
