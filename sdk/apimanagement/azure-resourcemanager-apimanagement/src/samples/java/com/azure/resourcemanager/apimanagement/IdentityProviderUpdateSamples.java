// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderContract;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderType;

/** Samples for IdentityProvider Update. */
public final class IdentityProviderUpdateSamples {
    /*
     * operationId: IdentityProvider_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateIdentityProvider
     */
    /**
     * Sample code: ApiManagementUpdateIdentityProvider.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateIdentityProvider(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        IdentityProviderContract resource =
            manager
                .identityProviders()
                .getWithResponse("rg1", "apimService1", IdentityProviderType.FACEBOOK, Context.NONE)
                .getValue();
        resource
            .update()
            .withClientId("updatedfacebookid")
            .withClientSecret("updatedfacebooksecret")
            .withIfMatch("*")
            .apply();
    }
}
