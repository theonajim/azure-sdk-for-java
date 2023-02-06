// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.workloads.models.UpdateMonitorRequest;
import com.azure.resourcemanager.workloads.models.UserAssignedIdentity;
import com.azure.resourcemanager.workloads.models.UserAssignedServiceIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateMonitorRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateMonitorRequest model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"hxsrzdzucersc\":\"lylpstdb\",\"iwjmygtdssls\":\"ntnev\",\"emwabnet\":\"tmweriofzpyq\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"d\":{\"principalId\":\"2c236a33-6693-43d3-8834-daecfc72e48a\",\"clientId\":\"32f393b8-09d3-4edb-b156-51088156ff46\"},\"wiwubm\":{\"principalId\":\"d33c159c-9aec-4ef3-bbb1-27edfbc800bb\",\"clientId\":\"29ac68f3-abe0-4d39-a446-39f66c65fbc9\"},\"esl\":{\"principalId\":\"1924d4a1-cbc1-4653-9cd1-91439bbcf3bb\",\"clientId\":\"27e6322b-880d-4ffa-b4eb-edb5bf5a860d\"}}}}")
                .toObject(UpdateMonitorRequest.class);
        Assertions.assertEquals("lylpstdb", model.tags().get("hxsrzdzucersc"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateMonitorRequest model =
            new UpdateMonitorRequest()
                .withTags(mapOf("hxsrzdzucersc", "lylpstdb", "iwjmygtdssls", "ntnev", "emwabnet", "tmweriofzpyq"))
                .withIdentity(
                    new UserAssignedServiceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "d",
                                new UserAssignedIdentity(),
                                "wiwubm",
                                new UserAssignedIdentity(),
                                "esl",
                                new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(UpdateMonitorRequest.class);
        Assertions.assertEquals("lylpstdb", model.tags().get("hxsrzdzucersc"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
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
