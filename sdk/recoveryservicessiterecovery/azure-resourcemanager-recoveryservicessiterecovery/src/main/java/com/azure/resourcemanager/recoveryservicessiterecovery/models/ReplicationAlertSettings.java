// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ReplicationAlertSettings. */
public interface ReplicationAlertSettings {
    /**
     * Gets the list of configured email notification(alert) configurations.
     *
     * <p>Gets the list of email notification(alert) configurations for the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of email notification(alert) configurations for the vault as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<Alert> list(String resourceName, String resourceGroupName);

    /**
     * Gets the list of configured email notification(alert) configurations.
     *
     * <p>Gets the list of email notification(alert) configurations for the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of email notification(alert) configurations for the vault as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<Alert> list(String resourceName, String resourceGroupName, Context context);

    /**
     * Gets an email notification(alert) configuration.
     *
     * <p>Gets the details of the specified email notification(alert) configuration.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param alertSettingName The name of the email notification configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified email notification(alert) configuration along with {@link Response}.
     */
    Response<Alert> getWithResponse(
        String resourceName, String resourceGroupName, String alertSettingName, Context context);

    /**
     * Gets an email notification(alert) configuration.
     *
     * <p>Gets the details of the specified email notification(alert) configuration.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param alertSettingName The name of the email notification configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified email notification(alert) configuration.
     */
    Alert get(String resourceName, String resourceGroupName, String alertSettingName);

    /**
     * Gets an email notification(alert) configuration.
     *
     * <p>Gets the details of the specified email notification(alert) configuration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified email notification(alert) configuration along with {@link Response}.
     */
    Alert getById(String id);

    /**
     * Gets an email notification(alert) configuration.
     *
     * <p>Gets the details of the specified email notification(alert) configuration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified email notification(alert) configuration along with {@link Response}.
     */
    Response<Alert> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Alert resource.
     *
     * @param name resource name.
     * @return the first stage of the new Alert definition.
     */
    Alert.DefinitionStages.Blank define(String name);
}
