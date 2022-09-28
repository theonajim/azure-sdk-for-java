// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

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
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.mediaservices.fluent.AccountFiltersClient;
import com.azure.resourcemanager.mediaservices.fluent.AssetFiltersClient;
import com.azure.resourcemanager.mediaservices.fluent.AssetsClient;
import com.azure.resourcemanager.mediaservices.fluent.AzureMediaServices;
import com.azure.resourcemanager.mediaservices.fluent.ContentKeyPoliciesClient;
import com.azure.resourcemanager.mediaservices.fluent.JobsClient;
import com.azure.resourcemanager.mediaservices.fluent.LiveEventsClient;
import com.azure.resourcemanager.mediaservices.fluent.LiveOutputsClient;
import com.azure.resourcemanager.mediaservices.fluent.LocationsClient;
import com.azure.resourcemanager.mediaservices.fluent.MediaServicesOperationResultsClient;
import com.azure.resourcemanager.mediaservices.fluent.MediaServicesOperationStatusesClient;
import com.azure.resourcemanager.mediaservices.fluent.MediaservicesClient;
import com.azure.resourcemanager.mediaservices.fluent.OperationResultsClient;
import com.azure.resourcemanager.mediaservices.fluent.OperationStatusesClient;
import com.azure.resourcemanager.mediaservices.fluent.OperationsClient;
import com.azure.resourcemanager.mediaservices.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.mediaservices.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.mediaservices.fluent.StreamingEndpointsClient;
import com.azure.resourcemanager.mediaservices.fluent.StreamingLocatorsClient;
import com.azure.resourcemanager.mediaservices.fluent.StreamingPoliciesClient;
import com.azure.resourcemanager.mediaservices.fluent.TracksClient;
import com.azure.resourcemanager.mediaservices.fluent.TransformsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AzureMediaServicesImpl type. */
@ServiceClient(builder = AzureMediaServicesBuilder.class)
public final class AzureMediaServicesImpl implements AzureMediaServices {
    /** The unique identifier for a Microsoft Azure subscription. */
    private final String subscriptionId;

    /**
     * Gets The unique identifier for a Microsoft Azure subscription.
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

    /** The AccountFiltersClient object to access its operations. */
    private final AccountFiltersClient accountFilters;

    /**
     * Gets the AccountFiltersClient object to access its operations.
     *
     * @return the AccountFiltersClient object.
     */
    public AccountFiltersClient getAccountFilters() {
        return this.accountFilters;
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

    /** The MediaservicesClient object to access its operations. */
    private final MediaservicesClient mediaservices;

    /**
     * Gets the MediaservicesClient object to access its operations.
     *
     * @return the MediaservicesClient object.
     */
    public MediaservicesClient getMediaservices() {
        return this.mediaservices;
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

    /** The MediaServicesOperationStatusesClient object to access its operations. */
    private final MediaServicesOperationStatusesClient mediaServicesOperationStatuses;

    /**
     * Gets the MediaServicesOperationStatusesClient object to access its operations.
     *
     * @return the MediaServicesOperationStatusesClient object.
     */
    public MediaServicesOperationStatusesClient getMediaServicesOperationStatuses() {
        return this.mediaServicesOperationStatuses;
    }

    /** The MediaServicesOperationResultsClient object to access its operations. */
    private final MediaServicesOperationResultsClient mediaServicesOperationResults;

    /**
     * Gets the MediaServicesOperationResultsClient object to access its operations.
     *
     * @return the MediaServicesOperationResultsClient object.
     */
    public MediaServicesOperationResultsClient getMediaServicesOperationResults() {
        return this.mediaServicesOperationResults;
    }

    /** The AssetsClient object to access its operations. */
    private final AssetsClient assets;

    /**
     * Gets the AssetsClient object to access its operations.
     *
     * @return the AssetsClient object.
     */
    public AssetsClient getAssets() {
        return this.assets;
    }

    /** The AssetFiltersClient object to access its operations. */
    private final AssetFiltersClient assetFilters;

    /**
     * Gets the AssetFiltersClient object to access its operations.
     *
     * @return the AssetFiltersClient object.
     */
    public AssetFiltersClient getAssetFilters() {
        return this.assetFilters;
    }

    /** The TracksClient object to access its operations. */
    private final TracksClient tracks;

    /**
     * Gets the TracksClient object to access its operations.
     *
     * @return the TracksClient object.
     */
    public TracksClient getTracks() {
        return this.tracks;
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

    /** The ContentKeyPoliciesClient object to access its operations. */
    private final ContentKeyPoliciesClient contentKeyPolicies;

    /**
     * Gets the ContentKeyPoliciesClient object to access its operations.
     *
     * @return the ContentKeyPoliciesClient object.
     */
    public ContentKeyPoliciesClient getContentKeyPolicies() {
        return this.contentKeyPolicies;
    }

    /** The TransformsClient object to access its operations. */
    private final TransformsClient transforms;

    /**
     * Gets the TransformsClient object to access its operations.
     *
     * @return the TransformsClient object.
     */
    public TransformsClient getTransforms() {
        return this.transforms;
    }

    /** The JobsClient object to access its operations. */
    private final JobsClient jobs;

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    public JobsClient getJobs() {
        return this.jobs;
    }

    /** The StreamingPoliciesClient object to access its operations. */
    private final StreamingPoliciesClient streamingPolicies;

    /**
     * Gets the StreamingPoliciesClient object to access its operations.
     *
     * @return the StreamingPoliciesClient object.
     */
    public StreamingPoliciesClient getStreamingPolicies() {
        return this.streamingPolicies;
    }

    /** The StreamingLocatorsClient object to access its operations. */
    private final StreamingLocatorsClient streamingLocators;

    /**
     * Gets the StreamingLocatorsClient object to access its operations.
     *
     * @return the StreamingLocatorsClient object.
     */
    public StreamingLocatorsClient getStreamingLocators() {
        return this.streamingLocators;
    }

    /** The LiveEventsClient object to access its operations. */
    private final LiveEventsClient liveEvents;

    /**
     * Gets the LiveEventsClient object to access its operations.
     *
     * @return the LiveEventsClient object.
     */
    public LiveEventsClient getLiveEvents() {
        return this.liveEvents;
    }

    /** The LiveOutputsClient object to access its operations. */
    private final LiveOutputsClient liveOutputs;

    /**
     * Gets the LiveOutputsClient object to access its operations.
     *
     * @return the LiveOutputsClient object.
     */
    public LiveOutputsClient getLiveOutputs() {
        return this.liveOutputs;
    }

    /** The StreamingEndpointsClient object to access its operations. */
    private final StreamingEndpointsClient streamingEndpoints;

    /**
     * Gets the StreamingEndpointsClient object to access its operations.
     *
     * @return the StreamingEndpointsClient object.
     */
    public StreamingEndpointsClient getStreamingEndpoints() {
        return this.streamingEndpoints;
    }

    /**
     * Initializes an instance of AzureMediaServices client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The unique identifier for a Microsoft Azure subscription.
     * @param endpoint server parameter.
     */
    AzureMediaServicesImpl(
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
        this.accountFilters = new AccountFiltersClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.mediaservices = new MediaservicesClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.locations = new LocationsClientImpl(this);
        this.mediaServicesOperationStatuses = new MediaServicesOperationStatusesClientImpl(this);
        this.mediaServicesOperationResults = new MediaServicesOperationResultsClientImpl(this);
        this.assets = new AssetsClientImpl(this);
        this.assetFilters = new AssetFiltersClientImpl(this);
        this.tracks = new TracksClientImpl(this);
        this.operationStatuses = new OperationStatusesClientImpl(this);
        this.operationResults = new OperationResultsClientImpl(this);
        this.contentKeyPolicies = new ContentKeyPoliciesClientImpl(this);
        this.transforms = new TransformsClientImpl(this);
        this.jobs = new JobsClientImpl(this);
        this.streamingPolicies = new StreamingPoliciesClientImpl(this);
        this.streamingLocators = new StreamingLocatorsClientImpl(this);
        this.liveEvents = new LiveEventsClientImpl(this);
        this.liveOutputs = new LiveOutputsClientImpl(this);
        this.streamingEndpoints = new StreamingEndpointsClientImpl(this);
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
        return CoreUtils.mergeContexts(this.getContext(), context);
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
                        LOGGER.logThrowableAsWarning(ioe);
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

    private static final ClientLogger LOGGER = new ClientLogger(AzureMediaServicesImpl.class);
}
