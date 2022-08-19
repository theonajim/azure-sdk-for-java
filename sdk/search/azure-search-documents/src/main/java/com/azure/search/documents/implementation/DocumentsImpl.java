// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.search.documents.implementation.models.AutocompleteRequest;
import com.azure.search.documents.implementation.models.IndexBatch;
import com.azure.search.documents.implementation.models.IndexDocumentsResult;
import com.azure.search.documents.implementation.models.RequestOptions;
import com.azure.search.documents.implementation.models.SearchDocumentsResult;
import com.azure.search.documents.implementation.models.SearchErrorException;
import com.azure.search.documents.implementation.models.SearchOptions;
import com.azure.search.documents.implementation.models.SearchRequest;
import com.azure.search.documents.implementation.models.SuggestDocumentsResult;
import com.azure.search.documents.implementation.models.SuggestRequest;
import com.azure.search.documents.models.AutocompleteMode;
import com.azure.search.documents.models.AutocompleteOptions;
import com.azure.search.documents.models.AutocompleteResult;
import com.azure.search.documents.models.QueryType;
import com.azure.search.documents.models.ScoringStatistics;
import com.azure.search.documents.models.SearchMode;
import com.azure.search.documents.models.SuggestOptions;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

/** An instance of this class provides access to all the operations defined in Documents. */
public final class DocumentsImpl {
    /** The proxy service used to perform REST calls. */
    private final DocumentsService service;

    /** The service client containing this operation class. */
    private final SearchIndexClientImpl client;

    /**
     * Initializes an instance of DocumentsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DocumentsImpl(SearchIndexClientImpl client) {
        this.service =
                RestProxy.create(DocumentsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchIndexClientDocuments to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}/indexes('{indexName}')")
    @ServiceInterface(name = "SearchIndexClientDoc")
    public interface DocumentsService {
        @Get("/docs/$count")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Long>> count(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/docs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchDocumentsResult>> searchGet(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @QueryParam("search") String searchText,
                @QueryParam("$count") Boolean includeTotalCount,
                @QueryParam(value = "facet", multipleQueryParams = true) List<String> facets,
                @QueryParam("$filter") String filter,
                @QueryParam("highlight") String highlightFields,
                @QueryParam("highlightPostTag") String highlightPostTag,
                @QueryParam("highlightPreTag") String highlightPreTag,
                @QueryParam("minimumCoverage") Double minimumCoverage,
                @QueryParam("$orderby") String orderBy,
                @QueryParam("queryType") QueryType queryType,
                @QueryParam(value = "scoringParameter", multipleQueryParams = true) List<String> scoringParameters,
                @QueryParam("scoringProfile") String scoringProfile,
                @QueryParam("searchFields") String searchFields,
                @QueryParam("searchMode") SearchMode searchMode,
                @QueryParam("scoringStatistics") ScoringStatistics scoringStatistics,
                @QueryParam("sessionId") String sessionId,
                @QueryParam("$select") String select,
                @QueryParam("$skip") Integer skip,
                @QueryParam("$top") Integer top,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/docs/search.post.search")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchDocumentsResult>> searchPost(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SearchRequest searchRequest,
                Context context);

        @Get("/docs('{key}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Object>> get(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @PathParam("key") String key,
                @QueryParam("$select") String selectedFields,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/docs/search.suggest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SuggestDocumentsResult>> suggestGet(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @QueryParam("search") String searchText,
                @QueryParam("suggesterName") String suggesterName,
                @QueryParam("$filter") String filter,
                @QueryParam("fuzzy") Boolean useFuzzyMatching,
                @QueryParam("highlightPostTag") String highlightPostTag,
                @QueryParam("highlightPreTag") String highlightPreTag,
                @QueryParam("minimumCoverage") Double minimumCoverage,
                @QueryParam("$orderby") String orderBy,
                @QueryParam("searchFields") String searchFields,
                @QueryParam("$select") String select,
                @QueryParam("$top") Integer top,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/docs/search.post.suggest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SuggestDocumentsResult>> suggestPost(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SuggestRequest suggestRequest,
                Context context);

        @Post("/docs/search.index")
        @ExpectedResponses({200, 207})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<IndexDocumentsResult>> index(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") IndexBatch batch,
                Context context);

        @Get("/docs/search.autocomplete")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<AutocompleteResult>> autocompleteGet(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("search") String searchText,
                @QueryParam("suggesterName") String suggesterName,
                @QueryParam("autocompleteMode") AutocompleteMode autocompleteMode,
                @QueryParam("$filter") String filter,
                @QueryParam("fuzzy") Boolean useFuzzyMatching,
                @QueryParam("highlightPostTag") String highlightPostTag,
                @QueryParam("highlightPreTag") String highlightPreTag,
                @QueryParam("minimumCoverage") Double minimumCoverage,
                @QueryParam("searchFields") String searchFields,
                @QueryParam("$top") Integer top,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/docs/search.post.autocomplete")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<AutocompleteResult>> autocompletePost(
                @HostParam("endpoint") String endpoint,
                @HostParam("indexName") String indexName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") AutocompleteRequest autocompleteRequest,
                Context context);
    }

    /**
     * Queries the number of documents in the index.
     *
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Long>> countWithResponseAsync(RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=none";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.count(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Searches for documents in the index.
     *
     * @param searchText A full-text search query expression; Use "*" or omit this parameter to match all documents.
     * @param searchOptions Parameter group.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing search results from an index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchDocumentsResult>> searchGetWithResponseAsync(
            String searchText, SearchOptions searchOptions, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=none";
        Boolean includeTotalCountInternal = null;
        if (searchOptions != null) {
            includeTotalCountInternal = searchOptions.isTotalCountIncluded();
        }
        Boolean includeTotalCount = includeTotalCountInternal;
        List<String> facetsInternal = null;
        if (searchOptions != null) {
            facetsInternal = searchOptions.getFacets();
        }
        List<String> facets = facetsInternal;
        String filterInternal = null;
        if (searchOptions != null) {
            filterInternal = searchOptions.getFilter();
        }
        String filter = filterInternal;
        List<String> highlightFieldsInternal = null;
        if (searchOptions != null) {
            highlightFieldsInternal = searchOptions.getHighlightFields();
        }
        List<String> highlightFields = highlightFieldsInternal;
        String highlightPostTagInternal = null;
        if (searchOptions != null) {
            highlightPostTagInternal = searchOptions.getHighlightPostTag();
        }
        String highlightPostTag = highlightPostTagInternal;
        String highlightPreTagInternal = null;
        if (searchOptions != null) {
            highlightPreTagInternal = searchOptions.getHighlightPreTag();
        }
        String highlightPreTag = highlightPreTagInternal;
        Double minimumCoverageInternal = null;
        if (searchOptions != null) {
            minimumCoverageInternal = searchOptions.getMinimumCoverage();
        }
        Double minimumCoverage = minimumCoverageInternal;
        List<String> orderByInternal = null;
        if (searchOptions != null) {
            orderByInternal = searchOptions.getOrderBy();
        }
        List<String> orderBy = orderByInternal;
        QueryType queryTypeInternal = null;
        if (searchOptions != null) {
            queryTypeInternal = searchOptions.getQueryType();
        }
        QueryType queryType = queryTypeInternal;
        List<String> scoringParametersInternal = null;
        if (searchOptions != null) {
            scoringParametersInternal = searchOptions.getScoringParameters();
        }
        List<String> scoringParameters = scoringParametersInternal;
        String scoringProfileInternal = null;
        if (searchOptions != null) {
            scoringProfileInternal = searchOptions.getScoringProfile();
        }
        String scoringProfile = scoringProfileInternal;
        List<String> searchFieldsInternal = null;
        if (searchOptions != null) {
            searchFieldsInternal = searchOptions.getSearchFields();
        }
        List<String> searchFields = searchFieldsInternal;
        SearchMode searchModeInternal = null;
        if (searchOptions != null) {
            searchModeInternal = searchOptions.getSearchMode();
        }
        SearchMode searchMode = searchModeInternal;
        ScoringStatistics scoringStatisticsInternal = null;
        if (searchOptions != null) {
            scoringStatisticsInternal = searchOptions.getScoringStatistics();
        }
        ScoringStatistics scoringStatistics = scoringStatisticsInternal;
        String sessionIdInternal = null;
        if (searchOptions != null) {
            sessionIdInternal = searchOptions.getSessionId();
        }
        String sessionId = sessionIdInternal;
        List<String> selectInternal = null;
        if (searchOptions != null) {
            selectInternal = searchOptions.getSelect();
        }
        List<String> select = selectInternal;
        Integer skipInternal = null;
        if (searchOptions != null) {
            skipInternal = searchOptions.getSkip();
        }
        Integer skip = skipInternal;
        Integer topInternal = null;
        if (searchOptions != null) {
            topInternal = searchOptions.getTop();
        }
        Integer top = topInternal;
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        List<String> facetsConverted =
                (facets == null)
                        ? new ArrayList<>()
                        : facets.stream().map(item -> Objects.toString(item, "")).collect(Collectors.toList());
        String highlightFieldsConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(highlightFields, CollectionFormat.CSV);
        String orderByConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(orderBy, CollectionFormat.CSV);
        List<String> scoringParametersConverted =
                (scoringParameters == null)
                        ? new ArrayList<>()
                        : scoringParameters.stream()
                                .map(item -> Objects.toString(item, ""))
                                .collect(Collectors.toList());
        String searchFieldsConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(searchFields, CollectionFormat.CSV);
        String selectConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(select, CollectionFormat.CSV);
        return service.searchGet(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                searchText,
                includeTotalCount,
                facetsConverted,
                filter,
                highlightFieldsConverted,
                highlightPostTag,
                highlightPreTag,
                minimumCoverage,
                orderByConverted,
                queryType,
                scoringParametersConverted,
                scoringProfile,
                searchFieldsConverted,
                searchMode,
                scoringStatistics,
                sessionId,
                selectConverted,
                skip,
                top,
                this.client.getApiVersion(),
                xMsClientRequestId,
                accept,
                context);
    }

    /**
     * Searches for documents in the index.
     *
     * @param searchRequest The definition of the Search request.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing search results from an index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchDocumentsResult>> searchPostWithResponseAsync(
            SearchRequest searchRequest, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=none";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.searchPost(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                this.client.getApiVersion(),
                xMsClientRequestId,
                accept,
                searchRequest,
                context);
    }

    /**
     * Retrieves a document from the index.
     *
     * @param key The key of the document to retrieve.
     * @param selectedFields List of field names to retrieve for the document; Any field not retrieved will be missing
     *     from the returned document.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getWithResponseAsync(
            String key, List<String> selectedFields, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=none";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        String selectedFieldsConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(selectedFields, CollectionFormat.CSV);
        return service.get(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                key,
                selectedFieldsConverted,
                this.client.getApiVersion(),
                xMsClientRequestId,
                accept,
                context);
    }

    /**
     * Suggests documents in the index that match the given partial query text.
     *
     * @param searchText The search text to use to suggest documents. Must be at least 1 character, and no more than 100
     *     characters.
     * @param suggesterName The name of the suggester as specified in the suggesters collection that's part of the index
     *     definition.
     * @param suggestOptions Parameter group.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing suggestion query results from an index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SuggestDocumentsResult>> suggestGetWithResponseAsync(
            String searchText,
            String suggesterName,
            SuggestOptions suggestOptions,
            RequestOptions requestOptions,
            Context context) {
        final String accept = "application/json; odata.metadata=none";
        String filterInternal = null;
        if (suggestOptions != null) {
            filterInternal = suggestOptions.getFilter();
        }
        String filter = filterInternal;
        Boolean useFuzzyMatchingInternal = null;
        if (suggestOptions != null) {
            useFuzzyMatchingInternal = suggestOptions.useFuzzyMatching();
        }
        Boolean useFuzzyMatching = useFuzzyMatchingInternal;
        String highlightPostTagInternal = null;
        if (suggestOptions != null) {
            highlightPostTagInternal = suggestOptions.getHighlightPostTag();
        }
        String highlightPostTag = highlightPostTagInternal;
        String highlightPreTagInternal = null;
        if (suggestOptions != null) {
            highlightPreTagInternal = suggestOptions.getHighlightPreTag();
        }
        String highlightPreTag = highlightPreTagInternal;
        Double minimumCoverageInternal = null;
        if (suggestOptions != null) {
            minimumCoverageInternal = suggestOptions.getMinimumCoverage();
        }
        Double minimumCoverage = minimumCoverageInternal;
        List<String> orderByInternal = null;
        if (suggestOptions != null) {
            orderByInternal = suggestOptions.getOrderBy();
        }
        List<String> orderBy = orderByInternal;
        List<String> searchFieldsInternal = null;
        if (suggestOptions != null) {
            searchFieldsInternal = suggestOptions.getSearchFields();
        }
        List<String> searchFields = searchFieldsInternal;
        List<String> selectInternal = null;
        if (suggestOptions != null) {
            selectInternal = suggestOptions.getSelect();
        }
        List<String> select = selectInternal;
        Integer topInternal = null;
        if (suggestOptions != null) {
            topInternal = suggestOptions.getTop();
        }
        Integer top = topInternal;
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        String orderByConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(orderBy, CollectionFormat.CSV);
        String searchFieldsConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(searchFields, CollectionFormat.CSV);
        String selectConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(select, CollectionFormat.CSV);
        return service.suggestGet(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                searchText,
                suggesterName,
                filter,
                useFuzzyMatching,
                highlightPostTag,
                highlightPreTag,
                minimumCoverage,
                orderByConverted,
                searchFieldsConverted,
                selectConverted,
                top,
                this.client.getApiVersion(),
                xMsClientRequestId,
                accept,
                context);
    }

    /**
     * Suggests documents in the index that match the given partial query text.
     *
     * @param suggestRequest The Suggest request.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing suggestion query results from an index.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SuggestDocumentsResult>> suggestPostWithResponseAsync(
            SuggestRequest suggestRequest, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=none";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.suggestPost(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                this.client.getApiVersion(),
                xMsClientRequestId,
                accept,
                suggestRequest,
                context);
    }

    /**
     * Sends a batch of document write actions to the index.
     *
     * @param batch The batch of index actions.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the status of operations for all documents in the indexing request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IndexDocumentsResult>> indexWithResponseAsync(
            IndexBatch batch, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=none";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.index(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                this.client.getApiVersion(),
                xMsClientRequestId,
                accept,
                batch,
                context);
    }

    /**
     * Autocompletes incomplete query terms based on input text and matching terms in the index.
     *
     * @param searchText The incomplete term which should be auto-completed.
     * @param suggesterName The name of the suggester as specified in the suggesters collection that's part of the index
     *     definition.
     * @param requestOptions Parameter group.
     * @param autocompleteOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of Autocomplete query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AutocompleteResult>> autocompleteGetWithResponseAsync(
            String searchText,
            String suggesterName,
            RequestOptions requestOptions,
            AutocompleteOptions autocompleteOptions,
            Context context) {
        final String accept = "application/json; odata.metadata=none";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        AutocompleteMode autocompleteModeInternal = null;
        if (autocompleteOptions != null) {
            autocompleteModeInternal = autocompleteOptions.getAutocompleteMode();
        }
        AutocompleteMode autocompleteMode = autocompleteModeInternal;
        String filterInternal = null;
        if (autocompleteOptions != null) {
            filterInternal = autocompleteOptions.getFilter();
        }
        String filter = filterInternal;
        Boolean useFuzzyMatchingInternal = null;
        if (autocompleteOptions != null) {
            useFuzzyMatchingInternal = autocompleteOptions.useFuzzyMatching();
        }
        Boolean useFuzzyMatching = useFuzzyMatchingInternal;
        String highlightPostTagInternal = null;
        if (autocompleteOptions != null) {
            highlightPostTagInternal = autocompleteOptions.getHighlightPostTag();
        }
        String highlightPostTag = highlightPostTagInternal;
        String highlightPreTagInternal = null;
        if (autocompleteOptions != null) {
            highlightPreTagInternal = autocompleteOptions.getHighlightPreTag();
        }
        String highlightPreTag = highlightPreTagInternal;
        Double minimumCoverageInternal = null;
        if (autocompleteOptions != null) {
            minimumCoverageInternal = autocompleteOptions.getMinimumCoverage();
        }
        Double minimumCoverage = minimumCoverageInternal;
        List<String> searchFieldsInternal = null;
        if (autocompleteOptions != null) {
            searchFieldsInternal = autocompleteOptions.getSearchFields();
        }
        List<String> searchFields = searchFieldsInternal;
        Integer topInternal = null;
        if (autocompleteOptions != null) {
            topInternal = autocompleteOptions.getTop();
        }
        Integer top = topInternal;
        String searchFieldsConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(searchFields, CollectionFormat.CSV);
        return service.autocompleteGet(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                xMsClientRequestId,
                this.client.getApiVersion(),
                searchText,
                suggesterName,
                autocompleteMode,
                filter,
                useFuzzyMatching,
                highlightPostTag,
                highlightPreTag,
                minimumCoverage,
                searchFieldsConverted,
                top,
                accept,
                context);
    }

    /**
     * Autocompletes incomplete query terms based on input text and matching terms in the index.
     *
     * @param autocompleteRequest The definition of the Autocomplete request.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of Autocomplete query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AutocompleteResult>> autocompletePostWithResponseAsync(
            AutocompleteRequest autocompleteRequest, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=none";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.autocompletePost(
                this.client.getEndpoint(),
                this.client.getIndexName(),
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                autocompleteRequest,
                context);
    }
}
