// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.AzureNamedKeyCredentialTrait;
import com.azure.core.client.traits.AzureSasCredentialTrait;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.ConnectionStringTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.credential.AzureNamedKeyCredential;
import com.azure.core.credential.AzureSasCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AzureSasCredentialPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.common.implementation.SasImplUtils;
import com.azure.storage.common.implementation.connectionstring.StorageAuthenticationSettings;
import com.azure.storage.common.implementation.connectionstring.StorageConnectionString;
import com.azure.storage.common.implementation.connectionstring.StorageEndpoint;
import com.azure.storage.common.implementation.credentials.CredentialValidator;
import com.azure.storage.common.policy.RequestRetryOptions;
import com.azure.storage.common.policy.StorageSharedKeyCredentialPolicy;
import com.azure.storage.common.sas.CommonSasQueryParameters;
import com.azure.storage.file.share.implementation.AzureFileStorageImpl;
import com.azure.storage.file.share.implementation.AzureFileStorageImplBuilder;
import com.azure.storage.file.share.implementation.util.BuilderHelper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of the {@link ShareClient
 * ShareClients} and {@link ShareAsyncClient ShareAsyncClients}, calling {@link ShareClientBuilder#buildClient()
 * buildClient} constructs an instance of ShareClient and calling {@link ShareClientBuilder#buildAsyncClient()
 * buildAsyncClient} constructs an instance of ShareAsyncClient.
 *
 * <p>The client needs the endpoint of the Azure Storage File service, name of the share, and authorization credential.
 * {@link ShareClientBuilder#endpoint(String) endpoint} gives the builder the endpoint and may give the builder the
 * {@link ShareClientBuilder#shareName(String) shareName} and a {@link #sasToken(String) SAS token} that authorizes the
 * client.</p>
 *
 * <p><strong>Instantiating a synchronous Share Client with SAS token</strong></p>
 * <!-- src_embed com.azure.storage.file.share.ShareClient.instantiation.sastoken -->
 * <pre>
 * ShareClient shareClient = new ShareClientBuilder&#40;&#41;
 *     .endpoint&#40;&quot;https:&#47;&#47;$&#123;accountName&#125;.file.core.windows.net?$&#123;SASToken&#125;&quot;&#41;
 *     .shareName&#40;&quot;myshare&quot;&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.share.ShareClient.instantiation.sastoken -->
 *
 * <p><strong>Instantiating an Asynchronous Share Client with SAS token</strong></p>
 * <!-- src_embed com.azure.storage.file.share.ShareAsyncClient.instantiation.sastoken -->
 * <pre>
 * ShareAsyncClient shareAsyncClient = new ShareClientBuilder&#40;&#41;
 *     .endpoint&#40;&quot;https:&#47;&#47;&#123;accountName&#125;.file.core.windows.net?&#123;SASToken&#125;&quot;&#41;
 *     .shareName&#40;&quot;myshare&quot;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.share.ShareAsyncClient.instantiation.sastoken -->
 *
 * <p>If the {@code endpoint} doesn't contain the query parameters to construct a SAS token it may be set using
 * {@link #sasToken(String) sasToken}.</p>
 *
 * <!-- src_embed com.azure.storage.file.share.ShareClient.instantiation.credential -->
 * <pre>
 * ShareClient shareClient = new ShareClientBuilder&#40;&#41;
 *     .endpoint&#40;&quot;https:&#47;&#47;$&#123;accountName&#125;.file.core.windows.net&quot;&#41;
 *     .sasToken&#40;&quot;$&#123;SASTokenQueryParams&#125;&quot;&#41;
 *     .shareName&#40;&quot;myshare&quot;&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.share.ShareClient.instantiation.credential -->
 *
 * <!-- src_embed com.azure.storage.file.share.ShareAsyncClient.instantiation.credential -->
 * <pre>
 * ShareAsyncClient shareAsyncClient = new ShareClientBuilder&#40;&#41;
 *     .endpoint&#40;&quot;https:&#47;&#47;&#123;accountName&#125;.file.core.windows.net&quot;&#41;
 *     .sasToken&#40;&quot;$&#123;SASTokenQueryParams&#125;&quot;&#41;
 *     .shareName&#40;&quot;myshare&quot;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.share.ShareAsyncClient.instantiation.credential -->
 *
 * <p>Another way to authenticate the client is using a {@link StorageSharedKeyCredential}. To create a
 * StorageSharedKeyCredential a connection string from the Storage File service must be used. Set the
 * StorageSharedKeyCredential with {@link ShareClientBuilder#connectionString(String) connectionString}.
 * If the builder has both a SAS token and StorageSharedKeyCredential the StorageSharedKeyCredential will be
 * preferred when authorizing requests sent to the service.</p>
 *
 * <p><strong>Instantiating a synchronous Share Client with connection string.</strong></p>
 * <!-- src_embed com.azure.storage.file.share.ShareClient.instantiation.connectionstring -->
 * <pre>
 * String connectionString = &quot;DefaultEndpointsProtocol=https;AccountName=&#123;name&#125;;AccountKey=&#123;key&#125;;&quot;
 *     + &quot;EndpointSuffix=&#123;core.windows.net&#125;&quot;;
 * ShareClient shareClient = new ShareClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;.shareName&#40;&quot;myshare&quot;&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.share.ShareClient.instantiation.connectionstring -->
 *
 * <p><strong>Instantiating an Asynchronous Share Client with connection string.</strong></p>
 * <!-- src_embed com.azure.storage.file.share.ShareAsyncClient.instantiation.connectionstring -->
 * <pre>
 * String connectionString = &quot;DefaultEndpointsProtocol=https;AccountName=&#123;name&#125;;AccountKey=&#123;key&#125;;&quot;
 *     + &quot;EndpointSuffix=&#123;core.windows.net&#125;&quot;;
 * ShareAsyncClient shareAsyncClient = new ShareClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;.shareName&#40;&quot;myshare&quot;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.share.ShareAsyncClient.instantiation.connectionstring -->
 *
 * @see ShareClient
 * @see ShareAsyncClient
 * @see StorageSharedKeyCredential
 */
@ServiceClientBuilder(serviceClients = {ShareClient.class, ShareAsyncClient.class})
public class ShareClientBuilder implements
        HttpTrait<ShareClientBuilder>,
    ConnectionStringTrait<ShareClientBuilder>,
    AzureNamedKeyCredentialTrait<ShareClientBuilder>,
    AzureSasCredentialTrait<ShareClientBuilder>,
    ConfigurationTrait<ShareClientBuilder> {
    private final ClientLogger logger = new ClientLogger(ShareClientBuilder.class);

    private String endpoint;
    private String accountName;
    private String shareName;
    private String snapshot;

    private StorageSharedKeyCredential storageSharedKeyCredential;
    private AzureSasCredential azureSasCredential;
    private String sasToken;

    private HttpClient httpClient;
    private final List<HttpPipelinePolicy> perCallPolicies = new ArrayList<>();
    private final List<HttpPipelinePolicy> perRetryPolicies = new ArrayList<>();
    private HttpLogOptions logOptions;
    private RequestRetryOptions retryOptions = new RequestRetryOptions();
    private HttpPipeline httpPipeline;

    private ClientOptions clientOptions = new ClientOptions();
    private Configuration configuration;
    private ShareServiceVersion version;

    /**
     * Creates a builder instance that is able to configure and construct {@link ShareClient ShareClients} and {@link
     * ShareAsyncClient ShareAsyncClients}.
     */
    public ShareClientBuilder() {
        logOptions = getDefaultHttpLogOptions();
    }

    /**
     * Creates a {@link ShareAsyncClient} based on options set in the builder. Every time {@code buildAsyncClient()} is
     * called a new instance of {@link ShareAsyncClient} is created.
     *
     * <p>
     * If {@link ShareClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and {@link
     * ShareClientBuilder#endpoint(String) endpoint} are used to create the {@link ShareAsyncClient client}. All other
     * builder settings are ignored.
     * </p>
     *
     * @return A ShareAsyncClient with the options set from the builder.
     * @throws NullPointerException If {@code shareName} is {@code null}.
     * @throws IllegalArgumentException If neither a {@link StorageSharedKeyCredential} or
     * {@link #sasToken(String) SAS token} has been set.
     * @throws IllegalStateException If multiple credentials have been specified.
     */
    public ShareAsyncClient buildAsyncClient() {
        Objects.requireNonNull(shareName, "'shareName' cannot be null.");
        CredentialValidator.validateSingleCredentialIsPresent(
            storageSharedKeyCredential, null, azureSasCredential, sasToken, logger);
        ShareServiceVersion serviceVersion = version != null ? version : ShareServiceVersion.getLatest();

        HttpPipeline pipeline = (httpPipeline != null) ? httpPipeline : BuilderHelper.buildPipeline(() -> {
            if (storageSharedKeyCredential != null) {
                return new StorageSharedKeyCredentialPolicy(storageSharedKeyCredential);
            } else if (azureSasCredential != null) {
                return new AzureSasCredentialPolicy(azureSasCredential, false);
            } else if (sasToken != null) {
                return new AzureSasCredentialPolicy(new AzureSasCredential(sasToken), false);
            } else {
                throw logger.logExceptionAsError(
                    new IllegalArgumentException("Credentials are required for authorization"));
            }
        }, retryOptions, logOptions, clientOptions, httpClient, perCallPolicies, perRetryPolicies, configuration);

        AzureFileStorageImpl azureFileStorage = new AzureFileStorageImplBuilder()
            .url(endpoint)
            .pipeline(pipeline)
            .version(serviceVersion.getVersion())
            .buildClient();

        return new ShareAsyncClient(azureFileStorage, shareName, snapshot, accountName, serviceVersion);
    }

    /**
     * Creates a {@link ShareClient} based on options set in the builder. Every time {@code buildClient()} is called a
     * new instance of {@link ShareClient} is created.
     *
     * <p>
     * If {@link ShareClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and {@link
     * ShareClientBuilder#endpoint(String) endpoint} are used to create the {@link ShareClient client}. All other
     * builder settings are ignored.
     * </p>
     *
     * @return A ShareClient with the options set from the builder.
     * @throws NullPointerException If {@code endpoint} or {@code shareName} is {@code null}.
     * @throws IllegalStateException If neither a {@link StorageSharedKeyCredential}
     * or {@link #sasToken(String) SAS token} has been set.
     * @throws IllegalStateException If multiple credentials have been specified.
     */
    public ShareClient buildClient() {
        return new ShareClient(buildAsyncClient());
    }

    /**
     * Sets the endpoint for the Azure Storage File instance that the client will interact with.
     *
     * <p>The first path segment, if the endpoint contains path segments, will be assumed to be the name of the share
     * that the client will interact with.</p>
     *
     * <p>Query parameters of the endpoint will be parsed in an attempt to generate a SAS token to authenticate
     * requests sent to the service.</p>
     *
     * @param endpoint The URL of the Azure Storage File instance to send service requests to and receive responses
     * from.
     * @return the updated ShareClientBuilder object
     * @throws IllegalArgumentException If {@code endpoint} is {@code null} or is an invalid URL
     */
    public ShareClientBuilder endpoint(String endpoint) {
        try {
            URL fullUrl = new URL(endpoint);
            this.endpoint = fullUrl.getProtocol() + "://" + fullUrl.getHost();

            this.accountName = BuilderHelper.getAccountName(fullUrl);

            // Attempt to get the share name from the URL passed
            String[] pathSegments = fullUrl.getPath().split("/");
            int length = pathSegments.length;
            if (length > 3) {
                throw logger.logExceptionAsError(new IllegalArgumentException(
                    "Cannot accept a URL to a file or directory to construct a file share client"));
            }
            this.shareName = length >= 2 ? pathSegments[1] : this.shareName;

            // Attempt to get the snapshot from the URL passed
            Map<String, String[]> queryParamsMap = SasImplUtils.parseQueryString(fullUrl.getQuery());

            String[] snapshotArray = queryParamsMap.remove("sharesnapshot");
            if (snapshotArray != null) {
                this.snapshot = snapshotArray[0];
            }

            // TODO (gapra) : What happens if a user has custom queries?
            // Attempt to get the SAS token from the URL passed
            String sasToken = new CommonSasQueryParameters(
                SasImplUtils.parseQueryString(fullUrl.getQuery()), false).encode();
            if (!CoreUtils.isNullOrEmpty(sasToken)) {
                this.sasToken(sasToken);
            }
        } catch (MalformedURLException ex) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("The Azure Storage File Service endpoint url is malformed."));
        }

        return this;
    }

    /**
     * Sets the share that the constructed clients will interact with
     *
     * @param shareName Name of the share
     * @return the updated ShareClientBuilder object
     * @throws NullPointerException If {@code shareName} is {@code null}.
     */
    public ShareClientBuilder shareName(String shareName) {
        this.shareName = Objects.requireNonNull(shareName, "'shareName' cannot be null.");
        return this;
    }

    /**
     * Sets the snapshot that the constructed clients will interact with. This snapshot must be linked to the share that
     * has been specified in the builder.
     *
     * @param snapshot Identifier of the snapshot
     * @return the updated ShareClientBuilder object
     */
    public ShareClientBuilder snapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Sets the {@link StorageSharedKeyCredential} used to authorize requests sent to the service.
     *
     * @param credential {@link StorageSharedKeyCredential}.
     * @return the updated ShareClientBuilder
     * @throws NullPointerException If {@code credential} is {@code null}.
     */
    public ShareClientBuilder credential(StorageSharedKeyCredential credential) {
        this.storageSharedKeyCredential = Objects.requireNonNull(credential, "'credential' cannot be null.");
        this.sasToken = null;
        return this;
    }

    /**
     * Sets the {@link AzureNamedKeyCredential} used to authorize requests sent to the service.
     *
     * @param credential {@link AzureNamedKeyCredential}.
     * @return the updated ShareClientBuilder
     * @throws NullPointerException If {@code credential} is {@code null}.
     */
    @Override
    public ShareClientBuilder credential(AzureNamedKeyCredential credential) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        return credential(StorageSharedKeyCredential.fromAzureNamedKeyCredential(credential));
    }

    /**
     * Sets the SAS token used to authorize requests sent to the service.
     *
     * @param sasToken The SAS token to use for authenticating requests. This string should only be the query parameters
     * (with or without a leading '?') and not a full url.
     * @return the updated ShareClientBuilder
     * @throws NullPointerException If {@code sasToken} is {@code null}.
     */
    public ShareClientBuilder sasToken(String sasToken) {
        this.sasToken = Objects.requireNonNull(sasToken,
            "'sasToken' cannot be null.");
        this.storageSharedKeyCredential = null;
        return this;
    }

    /**
     * Sets the {@link AzureSasCredential} used to authorize requests sent to the service.
     *
     * @param credential {@link AzureSasCredential} used to authorize requests sent to the service.
     * @return the updated ShareClientBuilder
     * @throws NullPointerException If {@code credential} is {@code null}.
     */
    @Override
    public ShareClientBuilder credential(AzureSasCredential credential) {
        this.azureSasCredential = Objects.requireNonNull(credential,
            "'credential' cannot be null.");
        return this;
    }

    /**
     * Sets the connection string to connect to the service.
     *
     * @param connectionString Connection string of the storage account.
     * @return the updated ShareClientBuilder
     * @throws IllegalArgumentException If {@code connectionString} in invalid.
     * @throws NullPointerException If {@code connectionString} is {@code null}.
     */
    @Override
    public ShareClientBuilder connectionString(String connectionString) {
        StorageConnectionString storageConnectionString
                = StorageConnectionString.create(connectionString, logger);
        StorageEndpoint endpoint = storageConnectionString.getFileEndpoint();
        if (endpoint == null || endpoint.getPrimaryUri() == null) {
            throw logger
                    .logExceptionAsError(new IllegalArgumentException(
                            "connectionString missing required settings to derive file service endpoint."));
        }
        this.endpoint(endpoint.getPrimaryUri());
        if (storageConnectionString.getAccountName() != null) {
            this.accountName = storageConnectionString.getAccountName();
        }
        StorageAuthenticationSettings authSettings = storageConnectionString.getStorageAuthSettings();
        if (authSettings.getType() == StorageAuthenticationSettings.Type.ACCOUNT_NAME_KEY) {
            this.credential(new StorageSharedKeyCredential(authSettings.getAccount().getName(),
                    authSettings.getAccount().getAccessKey()));
        } else if (authSettings.getType() == StorageAuthenticationSettings.Type.SAS_TOKEN) {
            this.sasToken(authSettings.getSasToken());
        }
        return this;
    }

    /**
     * Sets the {@link HttpClient} to use for sending a receiving requests to and from the service.
     *
     * @param httpClient HttpClient to use for requests.
     * @return the updated ShareClientBuilder object
     */
    @Override
    public ShareClientBuilder httpClient(HttpClient httpClient) {
        if (this.httpClient != null && httpClient == null) {
            logger.info("'httpClient' is being set to 'null' when it was previously configured.");
        }

        this.httpClient = httpClient;
        return this;
    }

    /**
     * Adds a pipeline policy to apply on each request sent. The policy will be added after the retry policy. If
     * the method is called multiple times, all policies will be added and their order preserved.
     *
     * @param pipelinePolicy a pipeline policy
     * @return the updated ShareClientBuilder object
     * @throws NullPointerException If {@code pipelinePolicy} is {@code null}.
     */
    @Override
    public ShareClientBuilder addPolicy(HttpPipelinePolicy pipelinePolicy) {
        Objects.requireNonNull(pipelinePolicy, "'pipelinePolicy' cannot be null");
        if (pipelinePolicy.getPipelinePosition() == HttpPipelinePosition.PER_CALL) {
            perCallPolicies.add(pipelinePolicy);
        } else {
            perRetryPolicies.add(pipelinePolicy);
        }
        return this;
    }

    /**
     * Sets the {@link HttpLogOptions} for service requests.
     *
     * @param logOptions The logging configuration to use when sending and receiving HTTP requests/responses.
     * @return the updated ShareClientBuilder object
     * @throws NullPointerException If {@code logOptions} is {@code null}.
     */
    @Override
    public ShareClientBuilder httpLogOptions(HttpLogOptions logOptions) {
        this.logOptions = Objects.requireNonNull(logOptions, "'logOptions' cannot be null.");
        return this;
    }

    /**
     * Gets the default log options with Storage headers and query parameters.
     *
     * @return the default log options.
     */
    public static HttpLogOptions getDefaultHttpLogOptions() {
        return BuilderHelper.getDefaultHttpLogOptions();
    }

    /**
     * Sets the configuration object used to retrieve environment configuration values during building of the client.
     *
     * @param configuration Configuration store used to retrieve environment configurations.
     * @return the updated ShareClientBuilder object
     */
    @Override
    public ShareClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets the request retry options for all the requests made through the client.
     *
     * @param retryOptions {@link RequestRetryOptions}.
     * @return the updated ShareClientBuilder object
     * @throws NullPointerException If {@code retryOptions} is {@code null}.
     */
    public ShareClientBuilder retryOptions(RequestRetryOptions retryOptions) {
        this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
        return this;
    }

    /**
     * Sets the request retry options for all the requests made through the client.
     *
     * Consider using {@link #retryOptions(RequestRetryOptions)} to also set storage specific options.
     *
     * @param retryOptions {@link RetryOptions}.
     * @return the updated ShareClientBuilder object
     * @throws NullPointerException If {@code retryOptions} is {@code null}.
     */
    @Override
    public ShareClientBuilder retryOptions(RetryOptions retryOptions) {
        Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
        return this.retryOptions(RequestRetryOptions.fromRetryOptions(retryOptions, null, null));
    }

    /**
     * Sets the {@link HttpPipeline} to use for the service client.
     *
     * If {@code pipeline} is set, all other settings are ignored, aside from {@link #endpoint(String) endpoint}.
     *
     * @param httpPipeline HttpPipeline to use for sending service requests and receiving responses.
     * @return the updated ShareClientBuilder object
     */
    @Override
    public ShareClientBuilder pipeline(HttpPipeline httpPipeline) {
        if (this.httpPipeline != null && httpPipeline == null) {
            logger.info("HttpPipeline is being set to 'null' when it was previously configured.");
        }

        this.httpPipeline = httpPipeline;
        return this;
    }

    /**
     * Sets the client options for all the requests made through the client.
     *
     * @param clientOptions {@link ClientOptions}.
     * @return the updated ShareClientBuilder object
     * @throws NullPointerException If {@code clientOptions} is {@code null}.
     */
    public ShareClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = Objects.requireNonNull(clientOptions, "'clientOptions' cannot be null.");
        return this;
    }

    /**
     * Sets the {@link ShareServiceVersion} that is used when making API requests.
     * <p>
     * If a service version is not provided, the service version that will be used will be the latest known service
     * version based on the version of the client library being used. If no service version is specified, updating to a
     * newer version of the client library will have the result of potentially moving to a newer service version.
     * <p>
     * Targeting a specific service version may also mean that the service will return an error for newer APIs.
     *
     * @param version {@link ShareServiceVersion} of the service to be used when making requests.
     * @return the updated ShareClientBuilder object
     */
    public ShareClientBuilder serviceVersion(ShareServiceVersion version) {
        this.version = version;
        return this;
    }
}
