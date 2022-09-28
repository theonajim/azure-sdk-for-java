// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.generated;

import com.azure.core.util.Context;
import java.util.Arrays;

/** Samples for HeatMap Get. */
public final class HeatMapGetSamples {
    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/HeatMap-GET-With-TopLeft-BotRight.json
     */
    /**
     * Sample code: HeatMap-GET-With-TopLeft-BotRight.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void heatMapGETWithTopLeftBotRight(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getHeatMaps()
            .getWithResponse(
                "azuresdkfornetautoresttrafficmanager1323",
                "azuresdkfornetautoresttrafficmanager3880",
                Arrays.asList(10.0, 50.001),
                Arrays.asList(-50.001, 80.0),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/HeatMap-GET.json
     */
    /**
     * Sample code: HeatMap-GET.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void heatMapGET(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getHeatMaps()
            .getWithResponse(
                "azuresdkfornetautoresttrafficmanager1323",
                "azuresdkfornetautoresttrafficmanager3880",
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/HeatMap-GET-With-Null-Values.json
     */
    /**
     * Sample code: HeatMap-GET-With-Null-Values.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void heatMapGETWithNullValues(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getHeatMaps()
            .getWithResponse(
                "azuresdkfornetautoresttrafficmanager1323",
                "azuresdkfornetautoresttrafficmanager3880",
                null,
                null,
                Context.NONE);
    }
}
