// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.BigDataPoolsImpl;
import com.azure.analytics.synapse.artifacts.models.BigDataPoolResourceInfo;
import com.azure.analytics.synapse.artifacts.models.BigDataPoolResourceInfoListResult;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class BigDataPoolsAsyncClient {
    @Generated private final BigDataPoolsImpl serviceClient;

    /**
     * Initializes an instance of BigDataPools client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    BigDataPoolsAsyncClient(BigDataPoolsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List Big Data Pools.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BigDataPoolResourceInfoListResult>> listWithResponse() {
        return this.serviceClient.listWithResponseAsync();
    }

    /**
     * List Big Data Pools.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BigDataPoolResourceInfoListResult> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Get Big Data Pool.
     *
     * @param bigDataPoolName The Big Data Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BigDataPoolResourceInfo>> getWithResponse(String bigDataPoolName) {
        return this.serviceClient.getWithResponseAsync(bigDataPoolName);
    }

    /**
     * Get Big Data Pool.
     *
     * @param bigDataPoolName The Big Data Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BigDataPoolResourceInfo> get(String bigDataPoolName) {
        return this.serviceClient.getAsync(bigDataPoolName);
    }
}
