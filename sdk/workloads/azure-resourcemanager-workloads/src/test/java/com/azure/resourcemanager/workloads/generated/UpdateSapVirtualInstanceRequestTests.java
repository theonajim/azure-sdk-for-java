// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.workloads.models.UpdateSapVirtualInstanceRequest;
import com.azure.resourcemanager.workloads.models.UserAssignedIdentity;
import com.azure.resourcemanager.workloads.models.UserAssignedServiceIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateSapVirtualInstanceRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateSapVirtualInstanceRequest model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"vwryoqpso\":\"odjpslwejd\",\"yffdfdos\":\"cctazakljlahbc\"},\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"jakhmsbzjh\":{\"principalId\":\"d740bb3d-6a79-4535-a4fc-ff622e59a61c\",\"clientId\":\"bf9f70b6-53fc-491a-a6e0-59029b648724\"},\"evdphlxaol\":{\"principalId\":\"a74dead6-6432-4579-bc3a-9293431a9186\",\"clientId\":\"3ec22de8-a90c-41ec-b3f1-34a958870e38\"},\"trg\":{\"principalId\":\"44bf1942-0f49-4345-80f3-8f368ded2342\",\"clientId\":\"54d75a6f-eb77-4bb5-8864-6dd02e40792a\"},\"pfzfsinzgvfc\":{\"principalId\":\"6c6195b4-1e79-40a8-9ca3-4d79d33cf8f0\",\"clientId\":\"d799720f-df8f-4d82-b3db-bc11c753596a\"}}}}")
                .toObject(UpdateSapVirtualInstanceRequest.class);
        Assertions.assertEquals("odjpslwejd", model.tags().get("vwryoqpso"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateSapVirtualInstanceRequest model =
            new UpdateSapVirtualInstanceRequest()
                .withTags(mapOf("vwryoqpso", "odjpslwejd", "yffdfdos", "cctazakljlahbc"))
                .withIdentity(
                    new UserAssignedServiceIdentity()
                        .withType(ManagedServiceIdentityType.NONE)
                        .withUserAssignedIdentities(
                            mapOf(
                                "jakhmsbzjh",
                                new UserAssignedIdentity(),
                                "evdphlxaol",
                                new UserAssignedIdentity(),
                                "trg",
                                new UserAssignedIdentity(),
                                "pfzfsinzgvfc",
                                new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(UpdateSapVirtualInstanceRequest.class);
        Assertions.assertEquals("odjpslwejd", model.tags().get("vwryoqpso"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
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
