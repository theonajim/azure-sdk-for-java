// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.IpAllocationMethod;
import com.azure.resourcemanager.hybridnetwork.models.IpVersion;
import com.azure.resourcemanager.hybridnetwork.models.NetworkInterfaceIpConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NetworkInterfaceIpConfigurationTests {
    @Test
    public void testDeserialize() {
        NetworkInterfaceIpConfiguration model =
            BinaryData
                .fromString(
                    "{\"ipAllocationMethod\":\"Dynamic\",\"ipAddress\":\"usarhmofc\",\"subnet\":\"smy\",\"gateway\":\"kdtmlxhekuk\",\"ipVersion\":\"Unknown\",\"dnsServers\":[\"kc\",\"mparcryuanzw\",\"xzdxtayrlhmwh\",\"pmrqobm\"]}")
                .toObject(NetworkInterfaceIpConfiguration.class);
        Assertions.assertEquals(IpAllocationMethod.DYNAMIC, model.ipAllocationMethod());
        Assertions.assertEquals("usarhmofc", model.ipAddress());
        Assertions.assertEquals("smy", model.subnet());
        Assertions.assertEquals("kdtmlxhekuk", model.gateway());
        Assertions.assertEquals(IpVersion.UNKNOWN, model.ipVersion());
        Assertions.assertEquals("kc", model.dnsServers().get(0));
    }

    @Test
    public void testSerialize() {
        NetworkInterfaceIpConfiguration model =
            new NetworkInterfaceIpConfiguration()
                .withIpAllocationMethod(IpAllocationMethod.DYNAMIC)
                .withIpAddress("usarhmofc")
                .withSubnet("smy")
                .withGateway("kdtmlxhekuk")
                .withIpVersion(IpVersion.UNKNOWN)
                .withDnsServers(Arrays.asList("kc", "mparcryuanzw", "xzdxtayrlhmwh", "pmrqobm"));
        model = BinaryData.fromObject(model).toObject(NetworkInterfaceIpConfiguration.class);
        Assertions.assertEquals(IpAllocationMethod.DYNAMIC, model.ipAllocationMethod());
        Assertions.assertEquals("usarhmofc", model.ipAddress());
        Assertions.assertEquals("smy", model.subnet());
        Assertions.assertEquals("kdtmlxhekuk", model.gateway());
        Assertions.assertEquals(IpVersion.UNKNOWN, model.ipVersion());
        Assertions.assertEquals("kc", model.dnsServers().get(0));
    }
}
