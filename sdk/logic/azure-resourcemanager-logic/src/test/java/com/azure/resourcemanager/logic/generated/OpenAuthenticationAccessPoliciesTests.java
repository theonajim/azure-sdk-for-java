// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.OpenAuthenticationAccessPolicies;
import com.azure.resourcemanager.logic.models.OpenAuthenticationAccessPolicy;
import com.azure.resourcemanager.logic.models.OpenAuthenticationProviderType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OpenAuthenticationAccessPoliciesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OpenAuthenticationAccessPolicies model =
            BinaryData
                .fromString(
                    "{\"policies\":{\"hfepgzgqex\":{\"type\":\"AAD\",\"claims\":[]},\"scpai\":{\"type\":\"AAD\",\"claims\":[]}}}")
                .toObject(OpenAuthenticationAccessPolicies.class);
        Assertions.assertEquals(OpenAuthenticationProviderType.AAD, model.policies().get("hfepgzgqex").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OpenAuthenticationAccessPolicies model =
            new OpenAuthenticationAccessPolicies()
                .withPolicies(
                    mapOf(
                        "hfepgzgqex",
                        new OpenAuthenticationAccessPolicy()
                            .withType(OpenAuthenticationProviderType.AAD)
                            .withClaims(Arrays.asList()),
                        "scpai",
                        new OpenAuthenticationAccessPolicy()
                            .withType(OpenAuthenticationProviderType.AAD)
                            .withClaims(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(OpenAuthenticationAccessPolicies.class);
        Assertions.assertEquals(OpenAuthenticationProviderType.AAD, model.policies().get("hfepgzgqex").type());
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
