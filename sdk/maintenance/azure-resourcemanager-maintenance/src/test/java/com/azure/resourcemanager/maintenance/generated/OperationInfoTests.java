// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.models.OperationInfo;
import org.junit.jupiter.api.Assertions;

public final class OperationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInfo model =
            BinaryData
                .fromString(
                    "{\"provider\":\"izuckyfihrfidfvz\",\"resource\":\"zuhtymwisdkfthwx\",\"operation\":\"t\",\"description\":\"waopvkmijcmmxd\"}")
                .toObject(OperationInfo.class);
        Assertions.assertEquals("izuckyfihrfidfvz", model.provider());
        Assertions.assertEquals("zuhtymwisdkfthwx", model.resource());
        Assertions.assertEquals("t", model.operation());
        Assertions.assertEquals("waopvkmijcmmxd", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInfo model =
            new OperationInfo()
                .withProvider("izuckyfihrfidfvz")
                .withResource("zuhtymwisdkfthwx")
                .withOperation("t")
                .withDescription("waopvkmijcmmxd");
        model = BinaryData.fromObject(model).toObject(OperationInfo.class);
        Assertions.assertEquals("izuckyfihrfidfvz", model.provider());
        Assertions.assertEquals("zuhtymwisdkfthwx", model.resource());
        Assertions.assertEquals("t", model.operation());
        Assertions.assertEquals("waopvkmijcmmxd", model.description());
    }
}
