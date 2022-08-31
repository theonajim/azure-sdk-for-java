// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** A builder for creating a new instance of the RouteClient type. */
@ServiceClientBuilder(serviceClients = {RouteClientImpl.class})
public final class RouteClientImplBuilder
        implements HttpTrait<RouteClientImplBuilder>, ConfigurationTrait<RouteClientImplBuilder> {
    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated private final Map<String, String> properties = new HashMap<>();

    @Generated private final List<HttpPipelinePolicy> pipelinePolicies;

    /** Create an instance of the RouteClientImplBuilder. */
    @Generated
    public RouteClientImplBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated private HttpPipeline pipeline;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public RouteClientImplBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated private HttpClient httpClient;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public RouteClientImplBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated private HttpLogOptions httpLogOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public RouteClientImplBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a
     * request.
     */
    @Generated private ClientOptions clientOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public RouteClientImplBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated private RetryOptions retryOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public RouteClientImplBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /** {@inheritDoc}. */
    @Generated
    @Override
    public RouteClientImplBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    @Generated private Configuration configuration;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public RouteClientImplBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * Specifies which account is intended for usage in conjunction with the
     * Azure AD security model.  It represents a unique ID for the Azure Maps
     * account and can be retrieved from the Azure Maps management  plane
     * Account API. To use Azure AD security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     */
    @Generated private String clientId;

    /**
     * Sets Specifies which account is intended for usage in conjunction with the Azure AD security model. It represents
     * a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management plane Account API. To
     * use Azure AD security in Azure Maps see the following [articles](https://aka.ms/amauthdetails) for guidance.
     *
     * @param clientId the clientId value.
     * @return the RouteClientImplBuilder.
     */
    @Generated
    public RouteClientImplBuilder clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /*
     * server parameter
     */
    @Generated private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the RouteClientImplBuilder.
     */
    @Generated
    public RouteClientImplBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Api Version
     */
    @Generated private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the RouteClientImplBuilder.
     */
    @Generated
    public RouteClientImplBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    @Generated private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the RouteClientImplBuilder.
     */
    @Generated
    public RouteClientImplBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    @Generated private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the RouteClientImplBuilder.
     */
    @Generated
    public RouteClientImplBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of RouteClientImpl with the provided parameters.
     *
     * @return an instance of RouteClientImpl.
     */
    @Generated
    public RouteClientImpl buildClient() {
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (host == null) {
            this.host = "https://atlas.microsoft.com";
        }
        if (apiVersion == null) {
            this.apiVersion = "1.0";
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        RouteClientImpl client = new RouteClientImpl(pipeline, serializerAdapter, clientId, host, apiVersion);
        return client;
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        if (clientOptions == null) {
            clientOptions = new ClientOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(clientOptions, httpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = new HttpHeaders();
        clientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        policies.add(new CookiePolicy());
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .clientOptions(clientOptions)
                        .build();
        return httpPipeline;
    }
}
