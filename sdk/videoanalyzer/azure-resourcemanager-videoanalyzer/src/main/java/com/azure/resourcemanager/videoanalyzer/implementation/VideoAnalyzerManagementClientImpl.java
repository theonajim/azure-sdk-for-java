// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.videoanalyzer.fluent.AccessPoliciesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.EdgeModulesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.LivePipelineOperationStatusesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.LivePipelinesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.LocationsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.OperationResultsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.OperationStatusesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.OperationsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.PipelineJobOperationStatusesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.PipelineJobsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.PipelineTopologiesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.VideoAnalyzerManagementClient;
import com.azure.resourcemanager.videoanalyzer.fluent.VideoAnalyzerOperationResultsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.VideoAnalyzerOperationStatusesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.VideoAnalyzersClient;
import com.azure.resourcemanager.videoanalyzer.fluent.VideosClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the VideoAnalyzerManagementClientImpl type. */
@ServiceClient(builder = VideoAnalyzerManagementClientBuilder.class)
public final class VideoAnalyzerManagementClientImpl implements VideoAnalyzerManagementClient {
    private final ClientLogger logger = new ClientLogger(VideoAnalyzerManagementClientImpl.class);

    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The EdgeModulesClient object to access its operations. */
    private final EdgeModulesClient edgeModules;

    /**
     * Gets the EdgeModulesClient object to access its operations.
     *
     * @return the EdgeModulesClient object.
     */
    public EdgeModulesClient getEdgeModules() {
        return this.edgeModules;
    }

    /** The PipelineTopologiesClient object to access its operations. */
    private final PipelineTopologiesClient pipelineTopologies;

    /**
     * Gets the PipelineTopologiesClient object to access its operations.
     *
     * @return the PipelineTopologiesClient object.
     */
    public PipelineTopologiesClient getPipelineTopologies() {
        return this.pipelineTopologies;
    }

    /** The LivePipelinesClient object to access its operations. */
    private final LivePipelinesClient livePipelines;

    /**
     * Gets the LivePipelinesClient object to access its operations.
     *
     * @return the LivePipelinesClient object.
     */
    public LivePipelinesClient getLivePipelines() {
        return this.livePipelines;
    }

    /** The PipelineJobsClient object to access its operations. */
    private final PipelineJobsClient pipelineJobs;

    /**
     * Gets the PipelineJobsClient object to access its operations.
     *
     * @return the PipelineJobsClient object.
     */
    public PipelineJobsClient getPipelineJobs() {
        return this.pipelineJobs;
    }

    /** The LivePipelineOperationStatusesClient object to access its operations. */
    private final LivePipelineOperationStatusesClient livePipelineOperationStatuses;

    /**
     * Gets the LivePipelineOperationStatusesClient object to access its operations.
     *
     * @return the LivePipelineOperationStatusesClient object.
     */
    public LivePipelineOperationStatusesClient getLivePipelineOperationStatuses() {
        return this.livePipelineOperationStatuses;
    }

    /** The PipelineJobOperationStatusesClient object to access its operations. */
    private final PipelineJobOperationStatusesClient pipelineJobOperationStatuses;

    /**
     * Gets the PipelineJobOperationStatusesClient object to access its operations.
     *
     * @return the PipelineJobOperationStatusesClient object.
     */
    public PipelineJobOperationStatusesClient getPipelineJobOperationStatuses() {
        return this.pipelineJobOperationStatuses;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The VideoAnalyzersClient object to access its operations. */
    private final VideoAnalyzersClient videoAnalyzers;

    /**
     * Gets the VideoAnalyzersClient object to access its operations.
     *
     * @return the VideoAnalyzersClient object.
     */
    public VideoAnalyzersClient getVideoAnalyzers() {
        return this.videoAnalyzers;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The OperationStatusesClient object to access its operations. */
    private final OperationStatusesClient operationStatuses;

    /**
     * Gets the OperationStatusesClient object to access its operations.
     *
     * @return the OperationStatusesClient object.
     */
    public OperationStatusesClient getOperationStatuses() {
        return this.operationStatuses;
    }

    /** The OperationResultsClient object to access its operations. */
    private final OperationResultsClient operationResults;

    /**
     * Gets the OperationResultsClient object to access its operations.
     *
     * @return the OperationResultsClient object.
     */
    public OperationResultsClient getOperationResults() {
        return this.operationResults;
    }

    /** The VideoAnalyzerOperationStatusesClient object to access its operations. */
    private final VideoAnalyzerOperationStatusesClient videoAnalyzerOperationStatuses;

    /**
     * Gets the VideoAnalyzerOperationStatusesClient object to access its operations.
     *
     * @return the VideoAnalyzerOperationStatusesClient object.
     */
    public VideoAnalyzerOperationStatusesClient getVideoAnalyzerOperationStatuses() {
        return this.videoAnalyzerOperationStatuses;
    }

    /** The VideoAnalyzerOperationResultsClient object to access its operations. */
    private final VideoAnalyzerOperationResultsClient videoAnalyzerOperationResults;

    /**
     * Gets the VideoAnalyzerOperationResultsClient object to access its operations.
     *
     * @return the VideoAnalyzerOperationResultsClient object.
     */
    public VideoAnalyzerOperationResultsClient getVideoAnalyzerOperationResults() {
        return this.videoAnalyzerOperationResults;
    }

    /** The LocationsClient object to access its operations. */
    private final LocationsClient locations;

    /**
     * Gets the LocationsClient object to access its operations.
     *
     * @return the LocationsClient object.
     */
    public LocationsClient getLocations() {
        return this.locations;
    }

    /** The VideosClient object to access its operations. */
    private final VideosClient videos;

    /**
     * Gets the VideosClient object to access its operations.
     *
     * @return the VideosClient object.
     */
    public VideosClient getVideos() {
        return this.videos;
    }

    /** The AccessPoliciesClient object to access its operations. */
    private final AccessPoliciesClient accessPolicies;

    /**
     * Gets the AccessPoliciesClient object to access its operations.
     *
     * @return the AccessPoliciesClient object.
     */
    public AccessPoliciesClient getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Initializes an instance of VideoAnalyzerManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    VideoAnalyzerManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2021-11-01-preview";
        this.edgeModules = new EdgeModulesClientImpl(this);
        this.pipelineTopologies = new PipelineTopologiesClientImpl(this);
        this.livePipelines = new LivePipelinesClientImpl(this);
        this.pipelineJobs = new PipelineJobsClientImpl(this);
        this.livePipelineOperationStatuses = new LivePipelineOperationStatusesClientImpl(this);
        this.pipelineJobOperationStatuses = new PipelineJobOperationStatusesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.videoAnalyzers = new VideoAnalyzersClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.operationStatuses = new OperationStatusesClientImpl(this);
        this.operationResults = new OperationResultsClientImpl(this);
        this.videoAnalyzerOperationStatuses = new VideoAnalyzerOperationStatusesClientImpl(this);
        this.videoAnalyzerOperationResults = new VideoAnalyzerOperationResultsClientImpl(this);
        this.locations = new LocationsClientImpl(this);
        this.videos = new VideosClientImpl(this);
        this.accessPolicies = new AccessPoliciesClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        logger.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }
}
