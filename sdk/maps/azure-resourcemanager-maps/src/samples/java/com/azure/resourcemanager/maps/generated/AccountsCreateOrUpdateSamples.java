// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.resourcemanager.maps.fluent.models.MapsAccountProperties;
import com.azure.resourcemanager.maps.models.Kind;
import com.azure.resourcemanager.maps.models.Name;
import com.azure.resourcemanager.maps.models.Sku;
import java.util.HashMap;
import java.util.Map;

/** Samples for Accounts CreateOrUpdate. */
public final class AccountsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/maps/resource-manager/Microsoft.Maps/stable/2021-02-01/examples/CreateAccountGen2.json
     */
    /**
     * Sample code: Create Gen2 Account.
     *
     * @param manager Entry point to AzureMapsManager.
     */
    public static void createGen2Account(com.azure.resourcemanager.maps.AzureMapsManager manager) {
        manager
            .accounts()
            .define("myMapsAccount")
            .withRegion("global")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new Sku().withName(Name.G2))
            .withTags(mapOf("test", "true"))
            .withKind(Kind.GEN2)
            .withProperties(new MapsAccountProperties().withDisableLocalAuth(true))
            .create();
    }

    /*
     * x-ms-original-file: specification/maps/resource-manager/Microsoft.Maps/stable/2021-02-01/examples/CreateAccount.json
     */
    /**
     * Sample code: Create Gen1 Account.
     *
     * @param manager Entry point to AzureMapsManager.
     */
    public static void createGen1Account(com.azure.resourcemanager.maps.AzureMapsManager manager) {
        manager
            .accounts()
            .define("myMapsAccount")
            .withRegion("global")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new Sku().withName(Name.S0))
            .withTags(mapOf("test", "true"))
            .withKind(Kind.GEN1)
            .withProperties(new MapsAccountProperties().withDisableLocalAuth(false))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
