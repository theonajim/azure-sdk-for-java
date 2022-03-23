// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.KqlScriptsOperationsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.analytics.synapse.artifacts.models.KqlScriptResource;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class KqlScriptClient {
    @Generated private final KqlScriptsOperationsImpl serviceClient;

    /**
     * Initializes an instance of KqlScriptsOperations client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    KqlScriptClient(KqlScriptsOperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates or updates a KQL Script.
     *
     * @param kqlScriptName KQL script name.
     * @param kqlScript KQL script.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public KqlScriptResource createOrUpdate(String kqlScriptName, KqlScriptResource kqlScript) {
        return this.serviceClient.createOrUpdate(kqlScriptName, kqlScript);
    }

    /**
     * Creates or updates a KQL Script.
     *
     * @param kqlScriptName KQL script name.
     * @param kqlScript KQL script.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<KqlScriptResource> createOrUpdateWithResponse(
            String kqlScriptName, KqlScriptResource kqlScript, Context context) {
        return this.serviceClient.createOrUpdateWithResponse(kqlScriptName, kqlScript, context);
    }

    /**
     * Get KQL script by name.
     *
     * @param kqlScriptName KQL script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kQL script by name.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public KqlScriptResource getByName(String kqlScriptName) {
        return this.serviceClient.getByName(kqlScriptName);
    }

    /**
     * Get KQL script by name.
     *
     * @param kqlScriptName KQL script name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kQL script by name along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<KqlScriptResource> getByNameWithResponse(String kqlScriptName, Context context) {
        return this.serviceClient.getByNameWithResponse(kqlScriptName, context);
    }

    /**
     * Delete KQL script by name.
     *
     * @param kqlScriptName KQL script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteByName(String kqlScriptName) {
        this.serviceClient.deleteByName(kqlScriptName);
    }

    /**
     * Delete KQL script by name.
     *
     * @param kqlScriptName KQL script name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteByNameWithResponse(String kqlScriptName, Context context) {
        return this.serviceClient.deleteByNameWithResponse(kqlScriptName, context);
    }

    /**
     * Rename KQL script.
     *
     * @param kqlScriptName KQL script name.
     * @param renameRequest Rename request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void rename(String kqlScriptName, ArtifactRenameRequest renameRequest) {
        this.serviceClient.rename(kqlScriptName, renameRequest);
    }

    /**
     * Rename KQL script.
     *
     * @param kqlScriptName KQL script name.
     * @param renameRequest Rename request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renameWithResponse(
            String kqlScriptName, ArtifactRenameRequest renameRequest, Context context) {
        return this.serviceClient.renameWithResponse(kqlScriptName, renameRequest, context);
    }
}
