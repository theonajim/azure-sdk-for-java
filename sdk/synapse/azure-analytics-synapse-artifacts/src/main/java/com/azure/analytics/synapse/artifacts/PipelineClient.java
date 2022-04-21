// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.PipelinesImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.CreateRunResponse;
import com.azure.analytics.synapse.artifacts.models.PipelineResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.Map;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class PipelineClient {
    private final PipelinesImpl serviceClient;

    /**
     * Initializes an instance of Pipelines client.
     *
     * @param serviceClient the service client implementation.
     */
    PipelineClient(PipelinesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists pipelines.
     *
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PipelineResource> getPipelinesByWorkspace() {
        return this.serviceClient.getPipelinesByWorkspace();
    }

    /**
     * Lists pipelines.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PipelineResource> getPipelinesByWorkspace(Context context) {
        return this.serviceClient.getPipelinesByWorkspace(context);
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param pipeline Pipeline resource definition.
     * @param ifMatch ETag of the pipeline entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineResource createOrUpdatePipeline(String pipelineName, PipelineResource pipeline, String ifMatch) {
        return this.serviceClient.createOrUpdatePipeline(pipelineName, pipeline, ifMatch);
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param pipeline Pipeline resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineResource createOrUpdatePipeline(String pipelineName, PipelineResource pipeline) {
        return this.serviceClient.createOrUpdatePipeline(pipelineName, pipeline);
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param pipeline Pipeline resource definition.
     * @param ifMatch ETag of the pipeline entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PipelineResource> createOrUpdatePipelineWithResponse(
            String pipelineName, PipelineResource pipeline, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdatePipelineWithResponse(pipelineName, pipeline, ifMatch, context);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param ifNoneMatch ETag of the pipeline entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineResource getPipeline(String pipelineName, String ifNoneMatch) {
        return this.serviceClient.getPipeline(pipelineName, ifNoneMatch);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineResource getPipeline(String pipelineName) {
        return this.serviceClient.getPipeline(pipelineName);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param ifNoneMatch ETag of the pipeline entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PipelineResource> getPipelineWithResponse(
            String pipelineName, String ifNoneMatch, Context context) {
        return this.serviceClient.getPipelineWithResponse(pipelineName, ifNoneMatch, context);
    }

    /**
     * Deletes a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deletePipeline(String pipelineName) {
        this.serviceClient.deletePipeline(pipelineName);
    }

    /**
     * Deletes a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deletePipelineWithResponse(String pipelineName, Context context) {
        return this.serviceClient.deletePipelineWithResponse(pipelineName, context);
    }

    /**
     * Renames a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renamePipeline(String pipelineName, ArtifactRenameRequest request) {
        this.serviceClient.renamePipeline(pipelineName, request);
    }

    /**
     * Renames a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renamePipelineWithResponse(
            String pipelineName, ArtifactRenameRequest request, Context context) {
        return this.serviceClient.renamePipelineWithResponse(pipelineName, request, context);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param referencePipelineRunId The pipeline run identifier. If run ID is specified the parameters of the specified
     *     run will be used to create a new run.
     * @param isRecovery Recovery mode flag. If recovery mode is set to true, the specified referenced pipeline run and
     *     the new run will be grouped under the same groupId.
     * @param startActivityName In recovery mode, the rerun will start from this activity. If not specified, all
     *     activities will run.
     * @param parameters Parameters of the pipeline run. These parameters will be used only if the runId is not
     *     specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreateRunResponse createPipelineRun(
            String pipelineName,
            String referencePipelineRunId,
            Boolean isRecovery,
            String startActivityName,
            Map<String, Object> parameters) {
        return this.serviceClient.createPipelineRun(
                pipelineName, referencePipelineRunId, isRecovery, startActivityName, parameters);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreateRunResponse createPipelineRun(String pipelineName) {
        return this.serviceClient.createPipelineRun(pipelineName);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipeline name.
     * @param referencePipelineRunId The pipeline run identifier. If run ID is specified the parameters of the specified
     *     run will be used to create a new run.
     * @param isRecovery Recovery mode flag. If recovery mode is set to true, the specified referenced pipeline run and
     *     the new run will be grouped under the same groupId.
     * @param startActivityName In recovery mode, the rerun will start from this activity. If not specified, all
     *     activities will run.
     * @param parameters Parameters of the pipeline run. These parameters will be used only if the runId is not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CreateRunResponse> createPipelineRunWithResponse(
            String pipelineName,
            String referencePipelineRunId,
            Boolean isRecovery,
            String startActivityName,
            Map<String, Object> parameters,
            Context context) {
        return this.serviceClient.createPipelineRunWithResponse(
                pipelineName, referencePipelineRunId, isRecovery, startActivityName, parameters, context);
    }
}
