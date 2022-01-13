// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automanage.fluent.AutomanageClient;
import com.azure.resourcemanager.automanage.implementation.AutomanageClientBuilder;
import com.azure.resourcemanager.automanage.implementation.BestPracticesImpl;
import com.azure.resourcemanager.automanage.implementation.BestPracticesVersionsImpl;
import com.azure.resourcemanager.automanage.implementation.ConfigurationProfileAssignmentsImpl;
import com.azure.resourcemanager.automanage.implementation.ConfigurationProfilesImpl;
import com.azure.resourcemanager.automanage.implementation.ConfigurationProfilesVersionsImpl;
import com.azure.resourcemanager.automanage.implementation.OperationsImpl;
import com.azure.resourcemanager.automanage.implementation.ReportsImpl;
import com.azure.resourcemanager.automanage.models.BestPractices;
import com.azure.resourcemanager.automanage.models.BestPracticesVersions;
import com.azure.resourcemanager.automanage.models.ConfigurationProfileAssignments;
import com.azure.resourcemanager.automanage.models.ConfigurationProfiles;
import com.azure.resourcemanager.automanage.models.ConfigurationProfilesVersions;
import com.azure.resourcemanager.automanage.models.Operations;
import com.azure.resourcemanager.automanage.models.Reports;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to AutomanageManager. Automanage Client. */
public final class AutomanageManager {
    private BestPractices bestPractices;

    private BestPracticesVersions bestPracticesVersions;

    private ConfigurationProfiles configurationProfiles;

    private ConfigurationProfilesVersions configurationProfilesVersions;

    private ConfigurationProfileAssignments configurationProfileAssignments;

    private Operations operations;

    private Reports reports;

    private final AutomanageClient clientObject;

    private AutomanageManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AutomanageClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Automanage service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Automanage service API instance.
     */
    public static AutomanageManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create AutomanageManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new AutomanageManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Automanage service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Automanage service API instance.
         */
        public AutomanageManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.automanage")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new AutomanageManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of BestPractices. */
    public BestPractices bestPractices() {
        if (this.bestPractices == null) {
            this.bestPractices = new BestPracticesImpl(clientObject.getBestPractices(), this);
        }
        return bestPractices;
    }

    /** @return Resource collection API of BestPracticesVersions. */
    public BestPracticesVersions bestPracticesVersions() {
        if (this.bestPracticesVersions == null) {
            this.bestPracticesVersions = new BestPracticesVersionsImpl(clientObject.getBestPracticesVersions(), this);
        }
        return bestPracticesVersions;
    }

    /** @return Resource collection API of ConfigurationProfiles. */
    public ConfigurationProfiles configurationProfiles() {
        if (this.configurationProfiles == null) {
            this.configurationProfiles = new ConfigurationProfilesImpl(clientObject.getConfigurationProfiles(), this);
        }
        return configurationProfiles;
    }

    /** @return Resource collection API of ConfigurationProfilesVersions. */
    public ConfigurationProfilesVersions configurationProfilesVersions() {
        if (this.configurationProfilesVersions == null) {
            this.configurationProfilesVersions =
                new ConfigurationProfilesVersionsImpl(clientObject.getConfigurationProfilesVersions(), this);
        }
        return configurationProfilesVersions;
    }

    /** @return Resource collection API of ConfigurationProfileAssignments. */
    public ConfigurationProfileAssignments configurationProfileAssignments() {
        if (this.configurationProfileAssignments == null) {
            this.configurationProfileAssignments =
                new ConfigurationProfileAssignmentsImpl(clientObject.getConfigurationProfileAssignments(), this);
        }
        return configurationProfileAssignments;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Reports. */
    public Reports reports() {
        if (this.reports == null) {
            this.reports = new ReportsImpl(clientObject.getReports(), this);
        }
        return reports;
    }

    /**
     * @return Wrapped service client AutomanageClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public AutomanageClient serviceClient() {
        return this.clientObject;
    }
}
