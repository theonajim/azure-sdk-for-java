// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BuildContext;
import org.junit.jupiter.api.Assertions;

public final class BuildContextTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BuildContext model =
            BinaryData
                .fromString("{\"contextUri\":\"mfpjbabw\",\"dockerfilePath\":\"fcxsspuunnoxy\"}")
                .toObject(BuildContext.class);
        Assertions.assertEquals("mfpjbabw", model.contextUri());
        Assertions.assertEquals("fcxsspuunnoxy", model.dockerfilePath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BuildContext model = new BuildContext().withContextUri("mfpjbabw").withDockerfilePath("fcxsspuunnoxy");
        model = BinaryData.fromObject(model).toObject(BuildContext.class);
        Assertions.assertEquals("mfpjbabw", model.contextUri());
        Assertions.assertEquals("fcxsspuunnoxy", model.dockerfilePath());
    }
}
