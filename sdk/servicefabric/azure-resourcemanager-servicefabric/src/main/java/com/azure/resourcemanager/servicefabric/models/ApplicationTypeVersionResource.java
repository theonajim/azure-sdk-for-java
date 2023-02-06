// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeVersionResourceInner;
import java.util.Map;

/** An immutable client-side representation of ApplicationTypeVersionResource. */
public interface ApplicationTypeVersionResource {
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
     * Gets the location property: It will be deprecated in New API, resource location depends on the parent resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Azure resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: Azure resource etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the appPackageUrl property: The URL to the application package.
     *
     * @return the appPackageUrl value.
     */
    String appPackageUrl();

    /**
     * Gets the defaultParameterList property: List of application type parameters that can be overridden when creating
     * or updating the application.
     *
     * @return the defaultParameterList value.
     */
    Map<String, String> defaultParameterList();

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
     * Gets the inner com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeVersionResourceInner object.
     *
     * @return the inner object.
     */
    ApplicationTypeVersionResourceInner innerModel();

    /** The entirety of the ApplicationTypeVersionResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ApplicationTypeVersionResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationTypeVersionResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ApplicationTypeVersionResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName, applicationTypeName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param clusterName The name of the cluster resource.
             * @param applicationTypeName The name of the application type name resource.
             * @return the next definition stage.
             */
            WithCreate withExistingApplicationType(
                String resourceGroupName, String clusterName, String applicationTypeName);
        }
        /**
         * The stage of the ApplicationTypeVersionResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation, DefinitionStages.WithTags, DefinitionStages.WithAppPackageUrl {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationTypeVersionResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationTypeVersionResource create(Context context);
        }
        /** The stage of the ApplicationTypeVersionResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location It will be deprecated in New API, resource location depends on the parent resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location It will be deprecated in New API, resource location depends on the parent resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the ApplicationTypeVersionResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Azure resource tags..
             *
             * @param tags Azure resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ApplicationTypeVersionResource definition allowing to specify appPackageUrl. */
        interface WithAppPackageUrl {
            /**
             * Specifies the appPackageUrl property: The URL to the application package.
             *
             * @param appPackageUrl The URL to the application package.
             * @return the next definition stage.
             */
            WithCreate withAppPackageUrl(String appPackageUrl);
        }
    }
    /**
     * Begins update for the ApplicationTypeVersionResource resource.
     *
     * @return the stage of resource update.
     */
    ApplicationTypeVersionResource.Update update();

    /** The template for ApplicationTypeVersionResource update. */
    interface Update extends UpdateStages.WithAppPackageUrl {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ApplicationTypeVersionResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ApplicationTypeVersionResource apply(Context context);
    }
    /** The ApplicationTypeVersionResource update stages. */
    interface UpdateStages {
        /** The stage of the ApplicationTypeVersionResource update allowing to specify appPackageUrl. */
        interface WithAppPackageUrl {
            /**
             * Specifies the appPackageUrl property: The URL to the application package.
             *
             * @param appPackageUrl The URL to the application package.
             * @return the next definition stage.
             */
            Update withAppPackageUrl(String appPackageUrl);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ApplicationTypeVersionResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ApplicationTypeVersionResource refresh(Context context);
}
