// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of PipelineResource. */
public interface PipelineResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the additionalProperties property: Pipeline resource type.
     *
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * Gets the description property: The description of the pipeline.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the activities property: List of activities in pipeline.
     *
     * @return the activities value.
     */
    List<Activity> activities();

    /**
     * Gets the parameters property: List of parameters for pipeline.
     *
     * @return the parameters value.
     */
    Map<String, ParameterSpecification> parameters();

    /**
     * Gets the variables property: List of variables for pipeline.
     *
     * @return the variables value.
     */
    Map<String, VariableSpecification> variables();

    /**
     * Gets the concurrency property: The max number of concurrent runs for the pipeline.
     *
     * @return the concurrency value.
     */
    Integer concurrency();

    /**
     * Gets the annotations property: List of tags that can be used for describing the Pipeline.
     *
     * @return the annotations value.
     */
    List<Object> annotations();

    /**
     * Gets the runDimensions property: Dimensions emitted by Pipeline.
     *
     * @return the runDimensions value.
     */
    Map<String, Object> runDimensions();

    /**
     * Gets the folder property: The folder that this Pipeline is in. If not specified, Pipeline will appear at the root
     * level.
     *
     * @return the folder value.
     */
    PipelineFolder folder();

    /**
     * Gets the policy property: Pipeline Policy.
     *
     * @return the policy value.
     */
    PipelinePolicy policy();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.PipelineResourceInner object.
     *
     * @return the inner object.
     */
    PipelineResourceInner innerModel();

    /** The entirety of the PipelineResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The PipelineResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the PipelineResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the PipelineResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, factoryName.
             *
             * @param resourceGroupName The resource group name.
             * @param factoryName The factory name.
             * @return the next definition stage.
             */
            WithCreate withExistingFactory(String resourceGroupName, String factoryName);
        }
        /**
         * The stage of the PipelineResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAdditionalProperties,
                DefinitionStages.WithDescription,
                DefinitionStages.WithActivities,
                DefinitionStages.WithParameters,
                DefinitionStages.WithVariables,
                DefinitionStages.WithConcurrency,
                DefinitionStages.WithAnnotations,
                DefinitionStages.WithRunDimensions,
                DefinitionStages.WithFolder,
                DefinitionStages.WithPolicy,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PipelineResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PipelineResource create(Context context);
        }
        /** The stage of the PipelineResource definition allowing to specify additionalProperties. */
        interface WithAdditionalProperties {
            /**
             * Specifies the additionalProperties property: Pipeline resource type..
             *
             * @param additionalProperties Pipeline resource type.
             * @return the next definition stage.
             */
            WithCreate withAdditionalProperties(Map<String, Object> additionalProperties);
        }
        /** The stage of the PipelineResource definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the pipeline..
             *
             * @param description The description of the pipeline.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the PipelineResource definition allowing to specify activities. */
        interface WithActivities {
            /**
             * Specifies the activities property: List of activities in pipeline..
             *
             * @param activities List of activities in pipeline.
             * @return the next definition stage.
             */
            WithCreate withActivities(List<Activity> activities);
        }
        /** The stage of the PipelineResource definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: List of parameters for pipeline..
             *
             * @param parameters List of parameters for pipeline.
             * @return the next definition stage.
             */
            WithCreate withParameters(Map<String, ParameterSpecification> parameters);
        }
        /** The stage of the PipelineResource definition allowing to specify variables. */
        interface WithVariables {
            /**
             * Specifies the variables property: List of variables for pipeline..
             *
             * @param variables List of variables for pipeline.
             * @return the next definition stage.
             */
            WithCreate withVariables(Map<String, VariableSpecification> variables);
        }
        /** The stage of the PipelineResource definition allowing to specify concurrency. */
        interface WithConcurrency {
            /**
             * Specifies the concurrency property: The max number of concurrent runs for the pipeline..
             *
             * @param concurrency The max number of concurrent runs for the pipeline.
             * @return the next definition stage.
             */
            WithCreate withConcurrency(Integer concurrency);
        }
        /** The stage of the PipelineResource definition allowing to specify annotations. */
        interface WithAnnotations {
            /**
             * Specifies the annotations property: List of tags that can be used for describing the Pipeline..
             *
             * @param annotations List of tags that can be used for describing the Pipeline.
             * @return the next definition stage.
             */
            WithCreate withAnnotations(List<Object> annotations);
        }
        /** The stage of the PipelineResource definition allowing to specify runDimensions. */
        interface WithRunDimensions {
            /**
             * Specifies the runDimensions property: Dimensions emitted by Pipeline..
             *
             * @param runDimensions Dimensions emitted by Pipeline.
             * @return the next definition stage.
             */
            WithCreate withRunDimensions(Map<String, Object> runDimensions);
        }
        /** The stage of the PipelineResource definition allowing to specify folder. */
        interface WithFolder {
            /**
             * Specifies the folder property: The folder that this Pipeline is in. If not specified, Pipeline will
             * appear at the root level..
             *
             * @param folder The folder that this Pipeline is in. If not specified, Pipeline will appear at the root
             *     level.
             * @return the next definition stage.
             */
            WithCreate withFolder(PipelineFolder folder);
        }
        /** The stage of the PipelineResource definition allowing to specify policy. */
        interface WithPolicy {
            /**
             * Specifies the policy property: Pipeline Policy..
             *
             * @param policy Pipeline Policy.
             * @return the next definition stage.
             */
            WithCreate withPolicy(PipelinePolicy policy);
        }
        /** The stage of the PipelineResource definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the pipeline entity. Should only be specified for update, for
             * which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the pipeline entity. Should only be specified for update, for which it should
             *     match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the PipelineResource resource.
     *
     * @return the stage of resource update.
     */
    PipelineResource.Update update();

    /** The template for PipelineResource update. */
    interface Update
        extends UpdateStages.WithAdditionalProperties,
            UpdateStages.WithDescription,
            UpdateStages.WithActivities,
            UpdateStages.WithParameters,
            UpdateStages.WithVariables,
            UpdateStages.WithConcurrency,
            UpdateStages.WithAnnotations,
            UpdateStages.WithRunDimensions,
            UpdateStages.WithFolder,
            UpdateStages.WithPolicy,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PipelineResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PipelineResource apply(Context context);
    }
    /** The PipelineResource update stages. */
    interface UpdateStages {
        /** The stage of the PipelineResource update allowing to specify additionalProperties. */
        interface WithAdditionalProperties {
            /**
             * Specifies the additionalProperties property: Pipeline resource type..
             *
             * @param additionalProperties Pipeline resource type.
             * @return the next definition stage.
             */
            Update withAdditionalProperties(Map<String, Object> additionalProperties);
        }
        /** The stage of the PipelineResource update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the pipeline..
             *
             * @param description The description of the pipeline.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the PipelineResource update allowing to specify activities. */
        interface WithActivities {
            /**
             * Specifies the activities property: List of activities in pipeline..
             *
             * @param activities List of activities in pipeline.
             * @return the next definition stage.
             */
            Update withActivities(List<Activity> activities);
        }
        /** The stage of the PipelineResource update allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: List of parameters for pipeline..
             *
             * @param parameters List of parameters for pipeline.
             * @return the next definition stage.
             */
            Update withParameters(Map<String, ParameterSpecification> parameters);
        }
        /** The stage of the PipelineResource update allowing to specify variables. */
        interface WithVariables {
            /**
             * Specifies the variables property: List of variables for pipeline..
             *
             * @param variables List of variables for pipeline.
             * @return the next definition stage.
             */
            Update withVariables(Map<String, VariableSpecification> variables);
        }
        /** The stage of the PipelineResource update allowing to specify concurrency. */
        interface WithConcurrency {
            /**
             * Specifies the concurrency property: The max number of concurrent runs for the pipeline..
             *
             * @param concurrency The max number of concurrent runs for the pipeline.
             * @return the next definition stage.
             */
            Update withConcurrency(Integer concurrency);
        }
        /** The stage of the PipelineResource update allowing to specify annotations. */
        interface WithAnnotations {
            /**
             * Specifies the annotations property: List of tags that can be used for describing the Pipeline..
             *
             * @param annotations List of tags that can be used for describing the Pipeline.
             * @return the next definition stage.
             */
            Update withAnnotations(List<Object> annotations);
        }
        /** The stage of the PipelineResource update allowing to specify runDimensions. */
        interface WithRunDimensions {
            /**
             * Specifies the runDimensions property: Dimensions emitted by Pipeline..
             *
             * @param runDimensions Dimensions emitted by Pipeline.
             * @return the next definition stage.
             */
            Update withRunDimensions(Map<String, Object> runDimensions);
        }
        /** The stage of the PipelineResource update allowing to specify folder. */
        interface WithFolder {
            /**
             * Specifies the folder property: The folder that this Pipeline is in. If not specified, Pipeline will
             * appear at the root level..
             *
             * @param folder The folder that this Pipeline is in. If not specified, Pipeline will appear at the root
             *     level.
             * @return the next definition stage.
             */
            Update withFolder(PipelineFolder folder);
        }
        /** The stage of the PipelineResource update allowing to specify policy. */
        interface WithPolicy {
            /**
             * Specifies the policy property: Pipeline Policy..
             *
             * @param policy Pipeline Policy.
             * @return the next definition stage.
             */
            Update withPolicy(PipelinePolicy policy);
        }
        /** The stage of the PipelineResource update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the pipeline entity. Should only be specified for update, for
             * which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the pipeline entity. Should only be specified for update, for which it should
             *     match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PipelineResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PipelineResource refresh(Context context);

    /**
     * Creates a run of a pipeline.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    CreateRunResponse createRun();

    /**
     * Creates a run of a pipeline.
     *
     * @param referencePipelineRunId The pipeline run identifier. If run ID is specified the parameters of the specified
     *     run will be used to create a new run.
     * @param isRecovery Recovery mode flag. If recovery mode is set to true, the specified referenced pipeline run and
     *     the new run will be grouped under the same groupId.
     * @param startActivityName In recovery mode, the rerun will start from this activity. If not specified, all
     *     activities will run.
     * @param startFromFailure In recovery mode, if set to true, the rerun will start from failed activities. The
     *     property will be used only if startActivityName is not specified.
     * @param parameters Parameters of the pipeline run. These parameters will be used only if the runId is not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier along with {@link Response}.
     */
    Response<CreateRunResponse> createRunWithResponse(
        String referencePipelineRunId,
        Boolean isRecovery,
        String startActivityName,
        Boolean startFromFailure,
        Map<String, Object> parameters,
        Context context);
}
