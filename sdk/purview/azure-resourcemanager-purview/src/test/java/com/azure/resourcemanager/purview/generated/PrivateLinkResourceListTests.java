// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.purview.models.PrivateLinkResourceList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceList model =
            BinaryData
                .fromString(
                    "{\"count\":4741909009128684267,\"nextLink\":\"ie\",\"value\":[{\"id\":\"hvpesapskrdqm\",\"name\":\"jdhtldwkyzxu\",\"properties\":{\"groupId\":\"ncwscwsvlxoto\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"type\":\"upqsx\"},{\"id\":\"micykvceoveilo\",\"name\":\"oty\",\"properties\":{\"groupId\":\"cnjbkcnxdhbt\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"type\":\"ywpnvjt\"},{\"id\":\"nermcl\",\"name\":\"lphox\",\"properties\":{\"groupId\":\"rpabg\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"type\":\"bjtazqugxywpmu\"},{\"id\":\"fjz\",\"name\":\"qkqujidsu\",\"properties\":{\"groupId\":\"obglaocqxtcc\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"type\":\"dxyt\"}]}")
                .toObject(PrivateLinkResourceList.class);
        Assertions.assertEquals(4741909009128684267L, model.count());
        Assertions.assertEquals("ie", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceList model =
            new PrivateLinkResourceList()
                .withCount(4741909009128684267L)
                .withNextLink("ie")
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner()));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceList.class);
        Assertions.assertEquals(4741909009128684267L, model.count());
        Assertions.assertEquals("ie", model.nextLink());
    }
}
