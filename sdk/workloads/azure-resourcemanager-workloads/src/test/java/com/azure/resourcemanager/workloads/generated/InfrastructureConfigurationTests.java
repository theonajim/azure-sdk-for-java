// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.InfrastructureConfiguration;
import org.junit.jupiter.api.Assertions;

public final class InfrastructureConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InfrastructureConfiguration model =
            BinaryData
                .fromString("{\"deploymentType\":\"InfrastructureConfiguration\",\"appResourceGroup\":\"ebdunyg\"}")
                .toObject(InfrastructureConfiguration.class);
        Assertions.assertEquals("ebdunyg", model.appResourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InfrastructureConfiguration model = new InfrastructureConfiguration().withAppResourceGroup("ebdunyg");
        model = BinaryData.fromObject(model).toObject(InfrastructureConfiguration.class);
        Assertions.assertEquals("ebdunyg", model.appResourceGroup());
    }
}
