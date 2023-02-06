// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.fluent.models.OperationInner;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"rqobmtuk\",\"display\":{\"provider\":\"yrtih\",\"resource\":\"tijbpzvgnwzsymgl\",\"operation\":\"fcyzkohdbihanufh\",\"description\":\"bj\"},\"properties\":\"dataa\",\"origin\":\"th\",\"isDataAction\":false}")
                .toObject(OperationInner.class);
        Assertions.assertEquals(false, model.isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model = new OperationInner().withIsDataAction(false);
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals(false, model.isDataAction());
    }
}
