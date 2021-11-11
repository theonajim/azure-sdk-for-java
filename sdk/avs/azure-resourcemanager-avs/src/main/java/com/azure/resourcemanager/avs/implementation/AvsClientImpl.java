// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

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
import com.azure.resourcemanager.avs.fluent.AddonsClient;
import com.azure.resourcemanager.avs.fluent.AuthorizationsClient;
import com.azure.resourcemanager.avs.fluent.AvsClient;
import com.azure.resourcemanager.avs.fluent.CloudLinksClient;
import com.azure.resourcemanager.avs.fluent.ClustersClient;
import com.azure.resourcemanager.avs.fluent.DatastoresClient;
import com.azure.resourcemanager.avs.fluent.GlobalReachConnectionsClient;
import com.azure.resourcemanager.avs.fluent.HcxEnterpriseSitesClient;
import com.azure.resourcemanager.avs.fluent.LocationsClient;
import com.azure.resourcemanager.avs.fluent.OperationsClient;
import com.azure.resourcemanager.avs.fluent.PlacementPoliciesClient;
import com.azure.resourcemanager.avs.fluent.PrivateCloudsClient;
import com.azure.resourcemanager.avs.fluent.ScriptCmdletsClient;
import com.azure.resourcemanager.avs.fluent.ScriptExecutionsClient;
import com.azure.resourcemanager.avs.fluent.ScriptPackagesClient;
import com.azure.resourcemanager.avs.fluent.VirtualMachinesClient;
import com.azure.resourcemanager.avs.fluent.WorkloadNetworksClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AvsClientImpl type. */
@ServiceClient(builder = AvsClientBuilder.class)
public final class AvsClientImpl implements AvsClient {
    private final ClientLogger logger = new ClientLogger(AvsClientImpl.class);

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

    /** The PrivateCloudsClient object to access its operations. */
    private final PrivateCloudsClient privateClouds;

    /**
     * Gets the PrivateCloudsClient object to access its operations.
     *
     * @return the PrivateCloudsClient object.
     */
    public PrivateCloudsClient getPrivateClouds() {
        return this.privateClouds;
    }

    /** The ClustersClient object to access its operations. */
    private final ClustersClient clusters;

    /**
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    public ClustersClient getClusters() {
        return this.clusters;
    }

    /** The DatastoresClient object to access its operations. */
    private final DatastoresClient datastores;

    /**
     * Gets the DatastoresClient object to access its operations.
     *
     * @return the DatastoresClient object.
     */
    public DatastoresClient getDatastores() {
        return this.datastores;
    }

    /** The HcxEnterpriseSitesClient object to access its operations. */
    private final HcxEnterpriseSitesClient hcxEnterpriseSites;

    /**
     * Gets the HcxEnterpriseSitesClient object to access its operations.
     *
     * @return the HcxEnterpriseSitesClient object.
     */
    public HcxEnterpriseSitesClient getHcxEnterpriseSites() {
        return this.hcxEnterpriseSites;
    }

    /** The AuthorizationsClient object to access its operations. */
    private final AuthorizationsClient authorizations;

    /**
     * Gets the AuthorizationsClient object to access its operations.
     *
     * @return the AuthorizationsClient object.
     */
    public AuthorizationsClient getAuthorizations() {
        return this.authorizations;
    }

    /** The GlobalReachConnectionsClient object to access its operations. */
    private final GlobalReachConnectionsClient globalReachConnections;

    /**
     * Gets the GlobalReachConnectionsClient object to access its operations.
     *
     * @return the GlobalReachConnectionsClient object.
     */
    public GlobalReachConnectionsClient getGlobalReachConnections() {
        return this.globalReachConnections;
    }

    /** The WorkloadNetworksClient object to access its operations. */
    private final WorkloadNetworksClient workloadNetworks;

    /**
     * Gets the WorkloadNetworksClient object to access its operations.
     *
     * @return the WorkloadNetworksClient object.
     */
    public WorkloadNetworksClient getWorkloadNetworks() {
        return this.workloadNetworks;
    }

    /** The CloudLinksClient object to access its operations. */
    private final CloudLinksClient cloudLinks;

    /**
     * Gets the CloudLinksClient object to access its operations.
     *
     * @return the CloudLinksClient object.
     */
    public CloudLinksClient getCloudLinks() {
        return this.cloudLinks;
    }

    /** The AddonsClient object to access its operations. */
    private final AddonsClient addons;

    /**
     * Gets the AddonsClient object to access its operations.
     *
     * @return the AddonsClient object.
     */
    public AddonsClient getAddons() {
        return this.addons;
    }

    /** The VirtualMachinesClient object to access its operations. */
    private final VirtualMachinesClient virtualMachines;

    /**
     * Gets the VirtualMachinesClient object to access its operations.
     *
     * @return the VirtualMachinesClient object.
     */
    public VirtualMachinesClient getVirtualMachines() {
        return this.virtualMachines;
    }

    /** The PlacementPoliciesClient object to access its operations. */
    private final PlacementPoliciesClient placementPolicies;

    /**
     * Gets the PlacementPoliciesClient object to access its operations.
     *
     * @return the PlacementPoliciesClient object.
     */
    public PlacementPoliciesClient getPlacementPolicies() {
        return this.placementPolicies;
    }

    /** The ScriptPackagesClient object to access its operations. */
    private final ScriptPackagesClient scriptPackages;

    /**
     * Gets the ScriptPackagesClient object to access its operations.
     *
     * @return the ScriptPackagesClient object.
     */
    public ScriptPackagesClient getScriptPackages() {
        return this.scriptPackages;
    }

    /** The ScriptCmdletsClient object to access its operations. */
    private final ScriptCmdletsClient scriptCmdlets;

    /**
     * Gets the ScriptCmdletsClient object to access its operations.
     *
     * @return the ScriptCmdletsClient object.
     */
    public ScriptCmdletsClient getScriptCmdlets() {
        return this.scriptCmdlets;
    }

    /** The ScriptExecutionsClient object to access its operations. */
    private final ScriptExecutionsClient scriptExecutions;

    /**
     * Gets the ScriptExecutionsClient object to access its operations.
     *
     * @return the ScriptExecutionsClient object.
     */
    public ScriptExecutionsClient getScriptExecutions() {
        return this.scriptExecutions;
    }

    /**
     * Initializes an instance of AvsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    AvsClientImpl(
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
        this.apiVersion = "2021-12-01";
        this.operations = new OperationsClientImpl(this);
        this.locations = new LocationsClientImpl(this);
        this.privateClouds = new PrivateCloudsClientImpl(this);
        this.clusters = new ClustersClientImpl(this);
        this.datastores = new DatastoresClientImpl(this);
        this.hcxEnterpriseSites = new HcxEnterpriseSitesClientImpl(this);
        this.authorizations = new AuthorizationsClientImpl(this);
        this.globalReachConnections = new GlobalReachConnectionsClientImpl(this);
        this.workloadNetworks = new WorkloadNetworksClientImpl(this);
        this.cloudLinks = new CloudLinksClientImpl(this);
        this.addons = new AddonsClientImpl(this);
        this.virtualMachines = new VirtualMachinesClientImpl(this);
        this.placementPolicies = new PlacementPoliciesClientImpl(this);
        this.scriptPackages = new ScriptPackagesClientImpl(this);
        this.scriptCmdlets = new ScriptCmdletsClientImpl(this);
        this.scriptExecutions = new ScriptExecutionsClientImpl(this);
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
