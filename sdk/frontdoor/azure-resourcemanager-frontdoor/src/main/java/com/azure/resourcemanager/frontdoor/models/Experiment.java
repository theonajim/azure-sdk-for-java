// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.fluent.models.ExperimentInner;
import java.util.Map;

/** An immutable client-side representation of Experiment. */
public interface Experiment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the description property: The description of the details or intents of the Experiment.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the endpointA property: The endpoint A of an experiment.
     *
     * @return the endpointA value.
     */
    Endpoint endpointA();

    /**
     * Gets the endpointB property: The endpoint B of an experiment.
     *
     * @return the endpointB value.
     */
    Endpoint endpointB();

    /**
     * Gets the enabledState property: The state of the Experiment.
     *
     * @return the enabledState value.
     */
    State enabledState();

    /**
     * Gets the resourceState property: Resource status.
     *
     * @return the resourceState value.
     */
    NetworkExperimentResourceState resourceState();

    /**
     * Gets the status property: The description of Experiment status from the server side.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the scriptFileUri property: The uri to the Script used in the Experiment.
     *
     * @return the scriptFileUri value.
     */
    String scriptFileUri();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.frontdoor.fluent.models.ExperimentInner object.
     *
     * @return the inner object.
     */
    ExperimentInner innerModel();

    /** The entirety of the Experiment definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The Experiment definition stages. */
    interface DefinitionStages {
        /** The first stage of the Experiment definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Experiment definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the Experiment definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, profileName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param profileName The Profile identifier associated with the Tenant and Partner.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkExperimentProfile(String resourceGroupName, String profileName);
        }
        /**
         * The stage of the Experiment definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDescription,
                DefinitionStages.WithEndpointA,
                DefinitionStages.WithEndpointB,
                DefinitionStages.WithEnabledState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Experiment create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Experiment create(Context context);
        }
        /** The stage of the Experiment definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Experiment definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the details or intents of the Experiment.
             *
             * @param description The description of the details or intents of the Experiment.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the Experiment definition allowing to specify endpointA. */
        interface WithEndpointA {
            /**
             * Specifies the endpointA property: The endpoint A of an experiment.
             *
             * @param endpointA The endpoint A of an experiment.
             * @return the next definition stage.
             */
            WithCreate withEndpointA(Endpoint endpointA);
        }
        /** The stage of the Experiment definition allowing to specify endpointB. */
        interface WithEndpointB {
            /**
             * Specifies the endpointB property: The endpoint B of an experiment.
             *
             * @param endpointB The endpoint B of an experiment.
             * @return the next definition stage.
             */
            WithCreate withEndpointB(Endpoint endpointB);
        }
        /** The stage of the Experiment definition allowing to specify enabledState. */
        interface WithEnabledState {
            /**
             * Specifies the enabledState property: The state of the Experiment.
             *
             * @param enabledState The state of the Experiment.
             * @return the next definition stage.
             */
            WithCreate withEnabledState(State enabledState);
        }
    }
    /**
     * Begins update for the Experiment resource.
     *
     * @return the stage of resource update.
     */
    Experiment.Update update();

    /** The template for Experiment update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithDescription, UpdateStages.WithEnabledState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Experiment apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Experiment apply(Context context);
    }
    /** The Experiment update stages. */
    interface UpdateStages {
        /** The stage of the Experiment update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Experiment update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the intent or details of the Experiment.
             *
             * @param description The description of the intent or details of the Experiment.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the Experiment update allowing to specify enabledState. */
        interface WithEnabledState {
            /**
             * Specifies the enabledState property: The state of the Experiment.
             *
             * @param enabledState The state of the Experiment.
             * @return the next definition stage.
             */
            Update withEnabledState(State enabledState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Experiment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Experiment refresh(Context context);
}
