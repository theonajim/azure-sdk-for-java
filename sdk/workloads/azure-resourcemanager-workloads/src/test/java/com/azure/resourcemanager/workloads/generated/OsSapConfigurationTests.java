// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.DeployerVmPackages;
import com.azure.resourcemanager.workloads.models.OsSapConfiguration;
import org.junit.jupiter.api.Assertions;

public final class OsSapConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OsSapConfiguration model =
            BinaryData
                .fromString(
                    "{\"deployerVmPackages\":{\"url\":\"wnawjslbiw\",\"storageAccountId\":\"jgcyztsfmznba\"},\"sapFqdn\":\"ph\"}")
                .toObject(OsSapConfiguration.class);
        Assertions.assertEquals("wnawjslbiw", model.deployerVmPackages().url());
        Assertions.assertEquals("jgcyztsfmznba", model.deployerVmPackages().storageAccountId());
        Assertions.assertEquals("ph", model.sapFqdn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OsSapConfiguration model =
            new OsSapConfiguration()
                .withDeployerVmPackages(
                    new DeployerVmPackages().withUrl("wnawjslbiw").withStorageAccountId("jgcyztsfmznba"))
                .withSapFqdn("ph");
        model = BinaryData.fromObject(model).toObject(OsSapConfiguration.class);
        Assertions.assertEquals("wnawjslbiw", model.deployerVmPackages().url());
        Assertions.assertEquals("jgcyztsfmznba", model.deployerVmPackages().storageAccountId());
        Assertions.assertEquals("ph", model.sapFqdn());
    }
}
