// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.fluent.models.PrivateLinkConfigurationProperties;
import com.azure.resourcemanager.hdinsight.models.IpConfiguration;
import com.azure.resourcemanager.hdinsight.models.PrivateIpAllocationMethod;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkConfigurationPropertiesTests {
    @Test
    public void testDeserialize() {
        PrivateLinkConfigurationProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"sqwpgrjb\",\"provisioningState\":\"Failed\",\"ipConfigurations\":[{\"id\":\"jxvsnbyxqabn\",\"name\":\"ocpcy\",\"type\":\"urzafb\",\"properties\":{\"provisioningState\":\"Deleting\",\"primary\":true,\"privateIPAddress\":\"oq\",\"privateIPAllocationMethod\":\"dynamic\"}},{\"id\":\"javbqidtqajz\",\"name\":\"ulpkudjkrl\",\"type\":\"bzhfepgzgqexz\",\"properties\":{\"provisioningState\":\"Succeeded\",\"primary\":false,\"privateIPAddress\":\"aierhhb\",\"privateIPAllocationMethod\":\"dynamic\"}},{\"id\":\"mmajtjaodx\",\"name\":\"bnbdxkqpxokajion\",\"type\":\"mexgstxgcp\",\"properties\":{\"provisioningState\":\"InProgress\",\"primary\":true,\"privateIPAddress\":\"r\",\"privateIPAllocationMethod\":\"dynamic\"}},{\"id\":\"zrlovmclwhijcoej\",\"name\":\"tbzaqsqsycbkbfk\",\"type\":\"kdkexxp\",\"properties\":{\"provisioningState\":\"Succeeded\",\"primary\":true,\"privateIPAddress\":\"c\",\"privateIPAllocationMethod\":\"dynamic\"}}]}")
                .toObject(PrivateLinkConfigurationProperties.class);
        Assertions.assertEquals("sqwpgrjb", model.groupId());
        Assertions.assertEquals("ocpcy", model.ipConfigurations().get(0).name());
        Assertions.assertEquals(true, model.ipConfigurations().get(0).primary());
        Assertions.assertEquals("oq", model.ipConfigurations().get(0).privateIpAddress());
        Assertions
            .assertEquals(
                PrivateIpAllocationMethod.DYNAMIC, model.ipConfigurations().get(0).privateIpAllocationMethod());
    }

    @Test
    public void testSerialize() {
        PrivateLinkConfigurationProperties model =
            new PrivateLinkConfigurationProperties()
                .withGroupId("sqwpgrjb")
                .withIpConfigurations(
                    Arrays
                        .asList(
                            new IpConfiguration()
                                .withName("ocpcy")
                                .withPrimary(true)
                                .withPrivateIpAddress("oq")
                                .withPrivateIpAllocationMethod(PrivateIpAllocationMethod.DYNAMIC),
                            new IpConfiguration()
                                .withName("ulpkudjkrl")
                                .withPrimary(false)
                                .withPrivateIpAddress("aierhhb")
                                .withPrivateIpAllocationMethod(PrivateIpAllocationMethod.DYNAMIC),
                            new IpConfiguration()
                                .withName("bnbdxkqpxokajion")
                                .withPrimary(true)
                                .withPrivateIpAddress("r")
                                .withPrivateIpAllocationMethod(PrivateIpAllocationMethod.DYNAMIC),
                            new IpConfiguration()
                                .withName("tbzaqsqsycbkbfk")
                                .withPrimary(true)
                                .withPrivateIpAddress("c")
                                .withPrivateIpAllocationMethod(PrivateIpAllocationMethod.DYNAMIC)));
        model = BinaryData.fromObject(model).toObject(PrivateLinkConfigurationProperties.class);
        Assertions.assertEquals("sqwpgrjb", model.groupId());
        Assertions.assertEquals("ocpcy", model.ipConfigurations().get(0).name());
        Assertions.assertEquals(true, model.ipConfigurations().get(0).primary());
        Assertions.assertEquals("oq", model.ipConfigurations().get(0).privateIpAddress());
        Assertions
            .assertEquals(
                PrivateIpAllocationMethod.DYNAMIC, model.ipConfigurations().get(0).privateIpAllocationMethod());
    }
}
