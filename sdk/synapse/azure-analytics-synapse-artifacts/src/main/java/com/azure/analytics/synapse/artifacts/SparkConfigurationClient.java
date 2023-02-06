// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.SparkConfigurationsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.SparkConfigurationResource;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class SparkConfigurationClient {
    @Generated private final SparkConfigurationsImpl serviceClient;

    /**
     * Initializes an instance of SparkConfigurationClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    SparkConfigurationClient(SparkConfigurationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists sparkconfigurations.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sparkconfiguration resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkConfigurationResource> getSparkConfigurationsByWorkspace() {
        return this.serviceClient.getSparkConfigurationsByWorkspace();
    }

    /**
     * Lists sparkconfigurations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sparkconfiguration resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkConfigurationResource> getSparkConfigurationsByWorkspace(Context context) {
        return this.serviceClient.getSparkConfigurationsByWorkspace(context);
    }

    /**
     * Creates or updates a sparkconfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param sparkConfiguration SparkConfiguration resource definition.
     * @param ifMatch ETag of the sparkConfiguration entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark Configuration resource type along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkConfigurationResource> createOrUpdateSparkConfigurationWithResponse(
            String sparkConfigurationName,
            SparkConfigurationResource sparkConfiguration,
            String ifMatch,
            Context context) {
        return this.serviceClient.createOrUpdateSparkConfigurationWithResponse(
                sparkConfigurationName, sparkConfiguration, ifMatch, context);
    }

    /**
     * Creates or updates a sparkconfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param sparkConfiguration SparkConfiguration resource definition.
     * @param ifMatch ETag of the sparkConfiguration entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark Configuration resource type.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkConfigurationResource createOrUpdateSparkConfiguration(
            String sparkConfigurationName, SparkConfigurationResource sparkConfiguration, String ifMatch) {
        return this.serviceClient.createOrUpdateSparkConfiguration(sparkConfigurationName, sparkConfiguration, ifMatch);
    }

    /**
     * Creates or updates a sparkconfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param sparkConfiguration SparkConfiguration resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark Configuration resource type.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkConfigurationResource createOrUpdateSparkConfiguration(
            String sparkConfigurationName, SparkConfigurationResource sparkConfiguration) {
        return this.serviceClient.createOrUpdateSparkConfiguration(sparkConfigurationName, sparkConfiguration);
    }

    /**
     * Gets a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param ifNoneMatch ETag of the sparkConfiguration entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sparkConfiguration along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkConfigurationResource> getSparkConfigurationWithResponse(
            String sparkConfigurationName, String ifNoneMatch, Context context) {
        return this.serviceClient.getSparkConfigurationWithResponse(sparkConfigurationName, ifNoneMatch, context);
    }

    /**
     * Gets a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param ifNoneMatch ETag of the sparkConfiguration entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sparkConfiguration.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkConfigurationResource getSparkConfiguration(String sparkConfigurationName, String ifNoneMatch) {
        return this.serviceClient.getSparkConfiguration(sparkConfigurationName, ifNoneMatch);
    }

    /**
     * Gets a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sparkConfiguration.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkConfigurationResource getSparkConfiguration(String sparkConfigurationName) {
        return this.serviceClient.getSparkConfiguration(sparkConfigurationName);
    }

    /**
     * Deletes a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteSparkConfigurationWithResponse(String sparkConfigurationName, Context context) {
        return this.serviceClient.deleteSparkConfigurationWithResponse(sparkConfigurationName, context);
    }

    /**
     * Deletes a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteSparkConfiguration(String sparkConfigurationName) {
        this.serviceClient.deleteSparkConfiguration(sparkConfigurationName);
    }

    /**
     * Renames a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renameSparkConfigurationWithResponse(
            String sparkConfigurationName, ArtifactRenameRequest request, Context context) {
        return this.serviceClient.renameSparkConfigurationWithResponse(sparkConfigurationName, request, context);
    }

    /**
     * Renames a sparkConfiguration.
     *
     * @param sparkConfigurationName The spark Configuration name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renameSparkConfiguration(String sparkConfigurationName, ArtifactRenameRequest request) {
        this.serviceClient.renameSparkConfiguration(sparkConfigurationName, request);
    }
}
