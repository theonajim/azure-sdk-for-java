// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

/** Samples for GatewayHostnameConfiguration CreateOrUpdate. */
public final class GatewayHostnameConfigurationCreateOrUpdateSamples {
    /*
     * operationId: GatewayHostnameConfiguration_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateGatewayHostnameConfiguration
     */
    /**
     * Sample code: ApiManagementCreateGatewayHostnameConfiguration.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateGatewayHostnameConfiguration(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .gatewayHostnameConfigurations()
            .define("default")
            .withExistingGateway("rg1", "apimService1", "gw1")
            .withHostname("*")
            .withCertificateId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/certificates/cert1")
            .withNegotiateClientCertificate(false)
            .withTls10Enabled(false)
            .withTls11Enabled(false)
            .withHttp2Enabled(true)
            .create();
    }
}
