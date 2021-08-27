// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalDelegationSettingsInner;
import com.azure.resourcemanager.apimanagement.models.RegistrationDelegationSettingsProperties;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsDelegationSettingsProperties;

/** Samples for DelegationSettings CreateOrUpdate. */
public final class DelegationSettingsCreateOrUpdateSamples {
    /*
     * operationId: DelegationSettings_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementPortalSettingsUpdateDelegation
     */
    /**
     * Sample code: ApiManagementPortalSettingsUpdateDelegation.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementPortalSettingsUpdateDelegation(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .delegationSettings()
            .createOrUpdateWithResponse(
                "rg1",
                "apimService1",
                new PortalDelegationSettingsInner()
                    .withUrl("http://contoso.com/delegation")
                    .withValidationKey("<validationKey>")
                    .withSubscriptions(new SubscriptionsDelegationSettingsProperties().withEnabled(true))
                    .withUserRegistration(new RegistrationDelegationSettingsProperties().withEnabled(true)),
                "*",
                Context.NONE);
    }
}
