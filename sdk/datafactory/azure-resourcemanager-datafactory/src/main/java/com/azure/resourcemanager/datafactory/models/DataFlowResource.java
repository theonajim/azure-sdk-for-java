// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner;

/** An immutable client-side representation of DataFlowResource. */
public interface DataFlowResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the properties property: Data flow properties.
     *
     * @return the properties value.
     */
    DataFlow properties();

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
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner object.
     *
     * @return the inner object.
     */
    DataFlowResourceInner innerModel();

    /** The entirety of the DataFlowResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The DataFlowResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DataFlowResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DataFlowResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, factoryName.
             *
             * @param resourceGroupName The resource group name.
             * @param factoryName The factory name.
             * @return the next definition stage.
             */
            WithProperties withExistingFactory(String resourceGroupName, String factoryName);
        }
        /** The stage of the DataFlowResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Data flow properties..
             *
             * @param properties Data flow properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(DataFlow properties);
        }
        /**
         * The stage of the DataFlowResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DataFlowResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataFlowResource create(Context context);
        }
        /** The stage of the DataFlowResource definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the data flow entity. Should only be specified for update, for
             * which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should
             *     match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the DataFlowResource resource.
     *
     * @return the stage of resource update.
     */
    DataFlowResource.Update update();

    /** The template for DataFlowResource update. */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DataFlowResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataFlowResource apply(Context context);
    }
    /** The DataFlowResource update stages. */
    interface UpdateStages {
        /** The stage of the DataFlowResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Data flow properties..
             *
             * @param properties Data flow properties.
             * @return the next definition stage.
             */
            Update withProperties(DataFlow properties);
        }
        /** The stage of the DataFlowResource update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the data flow entity. Should only be specified for update, for
             * which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should
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
    DataFlowResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataFlowResource refresh(Context context);
}
