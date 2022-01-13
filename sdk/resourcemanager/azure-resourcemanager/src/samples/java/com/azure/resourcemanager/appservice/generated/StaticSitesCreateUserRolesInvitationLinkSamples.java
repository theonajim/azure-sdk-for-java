// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.models.StaticSiteUserInvitationRequestResource;

/** Samples for StaticSites CreateUserRolesInvitationLink. */
public final class StaticSitesCreateUserRolesInvitationLinkSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/CreateUserRolesInvitationLink.json
     */
    /**
     * Sample code: Create an invitation link for a user for a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAnInvitationLinkForAUserForAStaticSite(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .createUserRolesInvitationLinkWithResponse(
                "rg",
                "testStaticSite0",
                new StaticSiteUserInvitationRequestResource()
                    .withDomain("happy-sea-15afae3e.azurestaticwebsites.net")
                    .withProvider("aad")
                    .withUserDetails("username")
                    .withRoles("admin,contributor")
                    .withNumHoursToExpiration(1),
                Context.NONE);
    }
}
