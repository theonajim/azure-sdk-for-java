// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.ThrottlingRetryOptions;
import io.netty.handler.timeout.ReadTimeoutException;
import io.reactivex.subscribers.TestSubscriber;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import javax.net.ssl.SSLHandshakeException;
import java.net.SocketException;
import java.net.URI;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.azure.cosmos.implementation.TestUtils.mockDiagnosticsClientContext;

public class ClientRetryPolicyTest {
    private final static int TIMEOUT = 10000;

    static String dbAccountJson1 = "{\"_self\":\"\",\"id\":\"testaccount\",\"_rid\":\"testaccount.documents.azure.com\",\"media\":\"//media/\",\"addresses\":\"//addresses/\","
            + "\"_dbs\":\"//dbs/\",\"writableLocations\":[{\"name\":\"East US\",\"databaseAccountEndpoint\":\"https://testaccount-eastus.documents.azure.com:443/\"},{\"name\":\"East Asia\","
            + "\"databaseAccountEndpoint\":\"https://testaccount-eastasia.documents.azure.com:443/\"}],\"readableLocations\":[{\"name\":\"East US\","
            + "\"databaseAccountEndpoint\":\"https://testaccount-eastus.documents.azure.com:443/\"},{\"name\":\"East Asia\",\"databaseAccountEndpoint\":\"https://testaccount-eastasia.documents"
            + ".azure.com:443/\"}],\"enableMultipleWriteLocations\":true,\"userReplicationPolicy\":{\"asyncReplication\":false,\"minReplicaSetSize\":3,\"maxReplicasetSize\":4},"
            + "\"userConsistencyPolicy\":{\"defaultConsistencyLevel\":\"Session\"},\"systemReplicationPolicy\":{\"minReplicaSetSize\":3,\"maxReplicasetSize\":4},"
            + "\"readPolicy\":{\"primaryReadCoefficient\":1,\"secondaryReadCoefficient\":1},\"queryEngineConfiguration\":\"{\\\"maxSqlQueryInputLength\\\":262144,\\\"maxJoinsPerSqlQuery\\\":5,"
            + "\\\"maxLogicalAndPerSqlQuery\\\":500,\\\"maxLogicalOrPerSqlQuery\\\":500,\\\"maxUdfRefPerSqlQuery\\\":10,\\\"maxInExpressionItemsCount\\\":16000,"
            + "\\\"queryMaxInMemorySortDocumentCount\\\":500,\\\"maxQueryRequestTimeoutFraction\\\":0.9,\\\"sqlAllowNonFiniteNumbers\\\":false,\\\"sqlAllowAggregateFunctions\\\":true,"
            + "\\\"sqlAllowSubQuery\\\":true,\\\"sqlAllowScalarSubQuery\\\":true,\\\"allowNewKeywords\\\":true,\\\"sqlAllowLike\\\":false,\\\"sqlAllowGroupByClause\\\":true,"
            + "\\\"maxSpatialQueryCells\\\":12,\\\"spatialMaxGeometryPointCount\\\":256,\\\"sqlAllowTop\\\":true,\\\"enableSpatialIndexing\\\":true}\"}\n"
            + "0\n" + "\n";

    @Test(groups = "unit")
    public void networkFailureOnRead() throws Exception {
        ThrottlingRetryOptions throttlingRetryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, throttlingRetryOptions, null);

        Exception exception = new SocketException("Dummy SocketException");
        CosmosException cosmosException = BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, exception);
        BridgeInternal.setSubStatusCode(cosmosException, HttpConstants.SubStatusCodes.GATEWAY_ENDPOINT_UNAVAILABLE);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
                OperationType.Read, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);

            validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                    .nullException()
                    .shouldRetry(true)
                    .backOfTime(Duration.ofMillis(ClientRetryPolicy.RetryIntervalInMS))
                    .build());

            Mockito.verify(endpointManager, Mockito.times(i + 1)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void tcpNetworkFailureOnRead() throws Exception {
        ThrottlingRetryOptions retryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        Mockito.doReturn(2).when(endpointManager).getPreferredLocationCount();
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, retryOptions, null);

        Exception exception = ReadTimeoutException.INSTANCE;
        GoneException goneException = new GoneException(exception);
        CosmosException cosmosException =
            BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE,
                goneException);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Read, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);

            if (i < 2) {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                    .nullException()
                    .shouldRetry(true)
                    .backOfTime(Duration.ofMillis(0))
                    .build());
            } else {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                    .nullException()
                    .shouldRetry(false)
                    .build());
            }

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void networkFailureOnWrite() throws Exception {
        ThrottlingRetryOptions throttlingRetryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, throttlingRetryOptions, null);

        Exception exception = new SocketException("Dummy SocketException");;
        CosmosException cosmosException = BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, exception);
        BridgeInternal.setSubStatusCode(cosmosException, HttpConstants.SubStatusCodes.GATEWAY_ENDPOINT_UNAVAILABLE);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
                OperationType.Create, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);
        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);
            validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                    .nullException()
                    .shouldRetry(false)
                    .build());

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(i + 1)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void tcpNetworkFailureOnWrite() throws Exception {
        ThrottlingRetryOptions retryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        Mockito.doReturn(2).when(endpointManager).getPreferredLocationCount();
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, retryOptions, null);

        //Non retribale exception for write
        Exception exception = new SocketException("Dummy SocketException");;
        GoneException goneException = new GoneException(exception);
        CosmosException cosmosException = BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, goneException);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Create, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);
            //  We don't want to retry writes on network failure with non retriable exception
            validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                .nullException()
                .shouldRetry(false)
                .build());

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }

        // Retriable exception scenario
        exception = new SSLHandshakeException("test");
        goneException = new GoneException(exception);
        cosmosException = BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, goneException);

        Mockito.doReturn(true).when(endpointManager).canUseMultipleWriteLocations(Mockito.any(RxDocumentServiceRequest.class));
        clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, retryOptions, null);
        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);
            //  We want to retry writes on network failure with retriable exception
            if (i < 2) {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                    .nullException()
                    .shouldRetry(true)
                    .backOfTime(Duration.ofMillis(0))
                    .build());
            } else {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                    .nullException()
                    .shouldRetry(false)
                    .build());
            }

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void networkFailureOnUpsert() throws Exception {
        ThrottlingRetryOptions throttlingRetryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, throttlingRetryOptions, null);

        Exception exception = new SocketException("Dummy SocketException");
        CosmosException cosmosException = BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, exception);
        BridgeInternal.setSubStatusCode(cosmosException, HttpConstants.SubStatusCodes.GATEWAY_ENDPOINT_UNAVAILABLE);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Upsert, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);
        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);
            validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                                                             .nullException()
                                                             .shouldRetry(false)
                                                             .build());

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(i + 1)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void tcpNetworkFailureOnUpsert() throws Exception {
        ThrottlingRetryOptions retryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        Mockito.doReturn(2).when(endpointManager).getPreferredLocationCount();
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, retryOptions, null);

        Exception exception = new SocketException("Dummy SocketException");
        GoneException goneException = new GoneException(exception);
        CosmosException cosmosException = BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, goneException);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Upsert, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);
            //  We don't want to retry writes on network failure with non retriable exception
            validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                .nullException()
                .shouldRetry(false)
                .build());

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void networkFailureOnDelete() throws Exception {
        ThrottlingRetryOptions throttlingRetryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, throttlingRetryOptions, null);

        Exception exception = ReadTimeoutException.INSTANCE;
        CosmosException cosmosException = BridgeInternal.createCosmosException(
            null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, exception);
        BridgeInternal.setSubStatusCode(cosmosException, HttpConstants.SubStatusCodes.GATEWAY_ENDPOINT_UNAVAILABLE);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Delete, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);
        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);
            validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                                                             .nullException()
                                                             .shouldRetry(false)
                                                             .build());

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(i + 1)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void tcpNetworkFailureOnDelete() throws Exception {
        ThrottlingRetryOptions retryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        Mockito.doReturn(2).when(endpointManager).getPreferredLocationCount();
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, retryOptions, null);

        Exception exception = ReadTimeoutException.INSTANCE;
        GoneException goneException = new GoneException(exception);
        CosmosException cosmosException = BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.SERVICE_UNAVAILABLE, goneException);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Delete, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);
            //  We don't want to retry writes on network failure with non retriable exception
            validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                .nullException()
                .shouldRetry(false)
                .build());

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void httpNetworkFailureOnQueryPlan() throws Exception {
        ThrottlingRetryOptions retryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        Mockito.doReturn(2).when(endpointManager).getPreferredLocationCount();
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, retryOptions, null);

        Exception exception = ReadTimeoutException.INSTANCE;
        CosmosException cosmosException =
            BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.REQUEST_TIMEOUT, exception);
        BridgeInternal.setSubStatusCode(cosmosException, HttpConstants.SubStatusCodes.GATEWAY_ENDPOINT_READ_TIMEOUT);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.QueryPlan, "/dbs/db/colls/col/docs/", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);

            if (i < 3) {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                                                 .nullException()
                                                 .shouldRetry(true)
                                                 .backOfTime(Duration.ofMillis(0))
                                                 .build());
            } else {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                                                 .nullException()
                                                 .shouldRetry(false)
                                                 .build());
            }

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void httpNetworkFailureOnAddressRefresh() throws Exception {
        ThrottlingRetryOptions retryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        Mockito.doReturn(new URI("http://localhost")).when(endpointManager).resolveServiceEndpoint(Mockito.any(RxDocumentServiceRequest.class));
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        Mockito.doReturn(2).when(endpointManager).getPreferredLocationCount();
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, retryOptions, null);

        Exception exception = ReadTimeoutException.INSTANCE;
        CosmosException cosmosException =
            BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.REQUEST_TIMEOUT, exception);
        BridgeInternal.setSubStatusCode(cosmosException, HttpConstants.SubStatusCodes.GATEWAY_ENDPOINT_READ_TIMEOUT);

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Read, "/dbs/db/colls/col/docs/", ResourceType.Document);
        dsr.setAddressRefresh(true, false);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        clientRetryPolicy.onBeforeSendRequest(dsr);

        for (int i = 0; i < 10; i++) {
            Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(cosmosException);

            if (i < 3) {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                                                 .nullException()
                                                 .shouldRetry(true)
                                                 .backOfTime(Duration.ofMillis(0))
                                                 .build());
            } else {
                validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                                                 .nullException()
                                                 .shouldRetry(false)
                                                 .build());
            }

            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForRead(Mockito.any());
            Mockito.verify(endpointManager, Mockito.times(0)).markEndpointUnavailableForWrite(Mockito.any());
        }
    }

    @Test(groups = "unit")
    public void onBeforeSendRequestNotInvoked() {
        ThrottlingRetryOptions throttlingRetryOptions = new ThrottlingRetryOptions();
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);

        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(Mockito.eq(null), Mockito.eq(false));
        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, true, throttlingRetryOptions, null);

        Exception exception = ReadTimeoutException.INSTANCE;

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
                OperationType.Create, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = Mockito.mock(DocumentServiceRequestContext.class);

        Mono<ShouldRetryResult> shouldRetry = clientRetryPolicy.shouldRetry(exception);
        validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                .withException(exception)
                .shouldRetry(false)
                .build());

        Mockito.verifyNoInteractions(endpointManager);
    }

    @Test(groups = "unit")
    public void multimasterMetadataWriteRetry() throws Exception {

        ConnectionPolicy connectionPolicy = new ConnectionPolicy(DirectConnectionConfig.getDefaultConfig());
        connectionPolicy.setEndpointDiscoveryEnabled(false);

        DatabaseAccount databaseAccount = new DatabaseAccount(dbAccountJson1);

        DatabaseAccountManagerInternal databaseAccountManagerInternal = Mockito.mock(DatabaseAccountManagerInternal.class);
        Mockito.when(databaseAccountManagerInternal.getDatabaseAccountFromEndpoint(ArgumentMatchers.any())).thenReturn(Flux.just(databaseAccount));
        Mockito.when(databaseAccountManagerInternal.getServiceEndpoint()).thenReturn(new URI("https://testaccount-eastasia.documents.azure.com:443"));

        GlobalEndpointManager endpointManager = new GlobalEndpointManager(databaseAccountManagerInternal, connectionPolicy, new Configs());
        endpointManager.init();

        ThrottlingRetryOptions throttlingRetryOptions = new ThrottlingRetryOptions();

        ClientRetryPolicy clientRetryPolicy = new ClientRetryPolicy(mockDiagnosticsClientContext(), endpointManager, false, throttlingRetryOptions, null);

        RxDocumentServiceRequest request = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
            OperationType.Create, "/dbs/dbID", ResourceType.Database);

        assert endpointManager.isMultimasterMetadataWriteRequest(request);
        
        clientRetryPolicy.onBeforeSendRequest(request);

        assert request.requestContext.locationEndpointToRoute.toString() == "https://testaccount-eastasia.documents.azure.com:443";
        
        Exception exception = new Exception();
        CosmosException cosmosException =
            BridgeInternal.createCosmosException(null, HttpConstants.StatusCodes.FORBIDDEN, exception);
        BridgeInternal.setSubStatusCode(cosmosException, HttpConstants.SubStatusCodes.FORBIDDEN_WRITEFORBIDDEN);
        
        Mono<ShouldRetryResult> retryResult = clientRetryPolicy.shouldRetry(cosmosException);

        clientRetryPolicy.onBeforeSendRequest(request);

        assert request.requestContext.locationEndpointToRoute.toString() == "https://testaccount-eastus.documents.azure.com:443/";
    }

    public static void validateSuccess(Mono<ShouldRetryResult> single,
            ShouldRetryValidator validator) {

        validateSuccess(single, validator, TIMEOUT);
    }

    public static void validateSuccess(Mono<ShouldRetryResult> single,
            ShouldRetryValidator validator,
            long timeout) {
        TestSubscriber<ShouldRetryResult> testSubscriber = new TestSubscriber<>();

        single.flux().subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent(timeout, TimeUnit.MILLISECONDS);
        testSubscriber.assertComplete();
        testSubscriber.assertNoErrors();
        testSubscriber.assertValueCount(1);
        validator.validate(testSubscriber.values().get(0));
    }
}
