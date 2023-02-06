// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.devtestlabs.models.VirtualNetworkList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"allowedSubnets\":[],\"description\":\"zgakgacyrcmj\",\"externalProviderResourceId\":\"spofapvuhry\",\"externalSubnets\":[],\"subnetOverrides\":[],\"createdDate\":\"2021-02-25T11:36:52Z\",\"provisioningState\":\"zgb\",\"uniqueIdentifier\":\"edm\"},\"location\":\"tkvnlvxbcuiiznkt\",\"tags\":{\"bmikost\":\"nsnvpd\",\"kiwbuqnyoph\":\"z\"},\"id\":\"fy\",\"name\":\"sgcrpfbcunezzce\",\"type\":\"elfwy\"},{\"properties\":{\"allowedSubnets\":[],\"description\":\"xjwet\",\"externalProviderResourceId\":\"sihclafzvaylp\",\"externalSubnets\":[],\"subnetOverrides\":[],\"createdDate\":\"2021-08-23T02:35:52Z\",\"provisioningState\":\"ztcmwq\",\"uniqueIdentifier\":\"hcxwaxfewzjk\"},\"location\":\"exfdeqvhpsylk\",\"tags\":{\"jrgywwpgjxsn\":\"kbffmbmx\",\"jgicgaao\":\"tf\"},\"id\":\"pttaqutd\",\"name\":\"wemxswvruunzz\",\"type\":\"gehkfkimrtixokff\"}],\"nextLink\":\"inljqepqwhixmo\"}")
                .toObject(VirtualNetworkList.class);
        Assertions.assertEquals("tkvnlvxbcuiiznkt", model.value().get(0).location());
        Assertions.assertEquals("nsnvpd", model.value().get(0).tags().get("bmikost"));
        Assertions.assertEquals("zgakgacyrcmj", model.value().get(0).description());
        Assertions.assertEquals("spofapvuhry", model.value().get(0).externalProviderResourceId());
        Assertions.assertEquals("inljqepqwhixmo", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkList model =
            new VirtualNetworkList()
                .withValue(
                    Arrays
                        .asList(
                            new VirtualNetworkInner()
                                .withLocation("tkvnlvxbcuiiznkt")
                                .withTags(mapOf("bmikost", "nsnvpd", "kiwbuqnyoph", "z"))
                                .withAllowedSubnets(Arrays.asList())
                                .withDescription("zgakgacyrcmj")
                                .withExternalProviderResourceId("spofapvuhry")
                                .withSubnetOverrides(Arrays.asList()),
                            new VirtualNetworkInner()
                                .withLocation("exfdeqvhpsylk")
                                .withTags(mapOf("jrgywwpgjxsn", "kbffmbmx", "jgicgaao", "tf"))
                                .withAllowedSubnets(Arrays.asList())
                                .withDescription("xjwet")
                                .withExternalProviderResourceId("sihclafzvaylp")
                                .withSubnetOverrides(Arrays.asList())))
                .withNextLink("inljqepqwhixmo");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkList.class);
        Assertions.assertEquals("tkvnlvxbcuiiznkt", model.value().get(0).location());
        Assertions.assertEquals("nsnvpd", model.value().get(0).tags().get("bmikost"));
        Assertions.assertEquals("zgakgacyrcmj", model.value().get(0).description());
        Assertions.assertEquals("spofapvuhry", model.value().get(0).externalProviderResourceId());
        Assertions.assertEquals("inljqepqwhixmo", model.nextLink());
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
