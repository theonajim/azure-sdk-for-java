// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning;

import com.azure.analytics.purview.scanning.implementation.PurviewScanningClientImpl;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JacksonAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** A builder for creating a new instance of the PurviewScanningClient type. */
@ServiceClientBuilder(
        serviceClients = {
            KeyVaultConnectionsClient.class,
            ClassificationRulesClient.class,
            DataSourcesClient.class,
            FiltersClient.class,
            ScansClient.class,
            ScanResultClient.class,
            ScanRulesetsClient.class,
            SystemScanRulesetsClient.class,
            TriggersClient.class,
            KeyVaultConnectionsAsyncClient.class,
            ClassificationRulesAsyncClient.class,
            DataSourcesAsyncClient.class,
            FiltersAsyncClient.class,
            ScansAsyncClient.class,
            ScanResultAsyncClient.class,
            ScanRulesetsAsyncClient.class,
            SystemScanRulesetsAsyncClient.class,
            TriggersAsyncClient.class
        })
public final class PurviewScanningClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    static final String[] DEFAULT_SCOPES = new String[] {"https://purview.azure.net/.default"};

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the PurviewScanningClientBuilder. */
    public PurviewScanningClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The scanning endpoint of your purview account. Example:
     * https://{accountName}.scan.purview.azure.com
     */
    private String endpoint;

    /**
     * Sets The scanning endpoint of your purview account. Example: https://{accountName}.scan.purview.azure.com.
     *
     * @param endpoint the endpoint value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Service version
     */
    private PurviewScanningServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder serviceVersion(PurviewScanningServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    private TokenCredential tokenCredential;

    /**
     * Sets The TokenCredential used for authentication.
     *
     * @param tokenCredential the tokenCredential value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /*
     * The client options such as application ID and custom headers to set on a
     * request.
     */
    private ClientOptions clientOptions;

    /**
     * Sets The client options such as application ID and custom headers to set on a request.
     *
     * @param clientOptions the clientOptions value.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the PurviewScanningClientBuilder.
     */
    public PurviewScanningClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of PurviewScanningClientImpl with the provided parameters.
     *
     * @return an instance of PurviewScanningClientImpl.
     */
    private PurviewScanningClientImpl buildInnerClient() {
        if (serviceVersion == null) {
            this.serviceVersion = PurviewScanningServiceVersion.getLatest();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        PurviewScanningClientImpl client =
                new PurviewScanningClientImpl(
                        pipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
        return client;
    }

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
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
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

    /**
     * Builds an instance of KeyVaultConnectionsAsyncClient async client.
     *
     * @return an instance of KeyVaultConnectionsAsyncClient.
     */
    public KeyVaultConnectionsAsyncClient buildKeyVaultConnectionsAsyncClient() {
        return new KeyVaultConnectionsAsyncClient(buildInnerClient().getKeyVaultConnections());
    }

    /**
     * Builds an instance of ClassificationRulesAsyncClient async client.
     *
     * @return an instance of ClassificationRulesAsyncClient.
     */
    public ClassificationRulesAsyncClient buildClassificationRulesAsyncClient() {
        return new ClassificationRulesAsyncClient(buildInnerClient().getClassificationRules());
    }

    /**
     * Builds an instance of DataSourcesAsyncClient async client.
     *
     * @return an instance of DataSourcesAsyncClient.
     */
    public DataSourcesAsyncClient buildDataSourcesAsyncClient() {
        return new DataSourcesAsyncClient(buildInnerClient().getDataSources());
    }

    /**
     * Builds an instance of FiltersAsyncClient async client.
     *
     * @return an instance of FiltersAsyncClient.
     */
    public FiltersAsyncClient buildFiltersAsyncClient() {
        return new FiltersAsyncClient(buildInnerClient().getFilters());
    }

    /**
     * Builds an instance of ScansAsyncClient async client.
     *
     * @return an instance of ScansAsyncClient.
     */
    public ScansAsyncClient buildScansAsyncClient() {
        return new ScansAsyncClient(buildInnerClient().getScans());
    }

    /**
     * Builds an instance of ScanResultAsyncClient async client.
     *
     * @return an instance of ScanResultAsyncClient.
     */
    public ScanResultAsyncClient buildScanResultAsyncClient() {
        return new ScanResultAsyncClient(buildInnerClient().getScanResults());
    }

    /**
     * Builds an instance of ScanRulesetsAsyncClient async client.
     *
     * @return an instance of ScanRulesetsAsyncClient.
     */
    public ScanRulesetsAsyncClient buildScanRulesetsAsyncClient() {
        return new ScanRulesetsAsyncClient(buildInnerClient().getScanRulesets());
    }

    /**
     * Builds an instance of SystemScanRulesetsAsyncClient async client.
     *
     * @return an instance of SystemScanRulesetsAsyncClient.
     */
    public SystemScanRulesetsAsyncClient buildSystemScanRulesetsAsyncClient() {
        return new SystemScanRulesetsAsyncClient(buildInnerClient().getSystemScanRulesets());
    }

    /**
     * Builds an instance of TriggersAsyncClient async client.
     *
     * @return an instance of TriggersAsyncClient.
     */
    public TriggersAsyncClient buildTriggersAsyncClient() {
        return new TriggersAsyncClient(buildInnerClient().getTriggers());
    }

    /**
     * Builds an instance of KeyVaultConnectionsClient sync client.
     *
     * @return an instance of KeyVaultConnectionsClient.
     */
    public KeyVaultConnectionsClient buildKeyVaultConnectionsClient() {
        return new KeyVaultConnectionsClient(buildInnerClient().getKeyVaultConnections());
    }

    /**
     * Builds an instance of ClassificationRulesClient sync client.
     *
     * @return an instance of ClassificationRulesClient.
     */
    public ClassificationRulesClient buildClassificationRulesClient() {
        return new ClassificationRulesClient(buildInnerClient().getClassificationRules());
    }

    /**
     * Builds an instance of DataSourcesClient sync client.
     *
     * @return an instance of DataSourcesClient.
     */
    public DataSourcesClient buildDataSourcesClient() {
        return new DataSourcesClient(buildInnerClient().getDataSources());
    }

    /**
     * Builds an instance of FiltersClient sync client.
     *
     * @return an instance of FiltersClient.
     */
    public FiltersClient buildFiltersClient() {
        return new FiltersClient(buildInnerClient().getFilters());
    }

    /**
     * Builds an instance of ScansClient sync client.
     *
     * @return an instance of ScansClient.
     */
    public ScansClient buildScansClient() {
        return new ScansClient(buildInnerClient().getScans());
    }

    /**
     * Builds an instance of ScanResultClient sync client.
     *
     * @return an instance of ScanResultClient.
     */
    public ScanResultClient buildScanResultClient() {
        return new ScanResultClient(buildInnerClient().getScanResults());
    }

    /**
     * Builds an instance of ScanRulesetsClient sync client.
     *
     * @return an instance of ScanRulesetsClient.
     */
    public ScanRulesetsClient buildScanRulesetsClient() {
        return new ScanRulesetsClient(buildInnerClient().getScanRulesets());
    }

    /**
     * Builds an instance of SystemScanRulesetsClient sync client.
     *
     * @return an instance of SystemScanRulesetsClient.
     */
    public SystemScanRulesetsClient buildSystemScanRulesetsClient() {
        return new SystemScanRulesetsClient(buildInnerClient().getSystemScanRulesets());
    }

    /**
     * Builds an instance of TriggersClient sync client.
     *
     * @return an instance of TriggersClient.
     */
    public TriggersClient buildTriggersClient() {
        return new TriggersClient(buildInnerClient().getTriggers());
    }
}
