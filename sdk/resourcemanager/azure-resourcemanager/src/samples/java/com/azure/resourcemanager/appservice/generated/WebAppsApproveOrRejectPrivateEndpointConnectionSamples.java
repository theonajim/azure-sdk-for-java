// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.models.PrivateLinkConnectionApprovalRequestResource;
import com.azure.resourcemanager.appservice.models.PrivateLinkConnectionState;

/** Samples for WebApps ApproveOrRejectPrivateEndpointConnection. */
public final class WebAppsApproveOrRejectPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ApproveRejectSitePrivateEndpointConnection.json
     */
    /**
     * Sample code: Approves or rejects a private endpoint connection for a site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void approvesOrRejectsAPrivateEndpointConnectionForASite(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .approveOrRejectPrivateEndpointConnection(
                "rg",
                "testSite",
                "connection",
                new PrivateLinkConnectionApprovalRequestResource()
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkConnectionState()
                            .withStatus("Approved")
                            .withDescription("Approved by admin.")
                            .withActionsRequired("")),
                Context.NONE);
    }
}
