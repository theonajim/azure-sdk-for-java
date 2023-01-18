// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.models.Operation;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"ukgjnpiucgygevq\",\"display\":{\"provider\":\"yp\",\"resource\":\"bpizcdrqjsdpydn\",\"operation\":\"hxdeoejz\",\"description\":\"w\"},\"origin\":\"system\",\"properties\":{\"jdeyeamdpha\":\"datatgzfbishcbkh\",\"wkgshwa\":\"dataalpbuxwgipwhon\"}}")
                .toObject(Operation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model = new Operation();
        model = BinaryData.fromObject(model).toObject(Operation.class);
    }
}
