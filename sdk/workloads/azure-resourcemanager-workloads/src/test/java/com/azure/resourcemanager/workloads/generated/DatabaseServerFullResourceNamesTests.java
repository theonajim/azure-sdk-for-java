// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.DatabaseServerFullResourceNames;
import com.azure.resourcemanager.workloads.models.LoadBalancerResourceNames;
import com.azure.resourcemanager.workloads.models.VirtualMachineResourceNames;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DatabaseServerFullResourceNamesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseServerFullResourceNames model =
            BinaryData
                .fromString(
                    "{\"virtualMachines\":[{\"vmName\":\"xhojuj\",\"hostName\":\"pelmcuvhixbjxyf\",\"networkInterfaces\":[],\"osDiskName\":\"r\",\"dataDiskNames\":{\"iwii\":[\"sttp\",\"iwkkbn\",\"jrywvtylbfpnc\",\"rd\"]}},{\"vmName\":\"tywubxcbihwq\",\"hostName\":\"fdntwjchrdgoih\",\"networkInterfaces\":[],\"osDiskName\":\"ctondz\",\"dataDiskNames\":{\"fiufx\":[\"dfdlwggyts\",\"wtovvtgsein\"]}},{\"vmName\":\"npirgnepttw\",\"hostName\":\"sniffc\",\"networkInterfaces\":[],\"osDiskName\":\"r\",\"dataDiskNames\":{\"c\":[\"ijnkrxfrdd\"],\"ozqyzh\":[\"tizzronasxif\"],\"nnxk\":[\"wesgogczh\"]}}],\"availabilitySetName\":\"gnyhmossxkkg\",\"loadBalancer\":{\"loadBalancerName\":\"rghxjb\",\"frontendIpConfigurationNames\":[\"xvcxgfrpdsofbshr\",\"svbuswdvzyy\",\"ycnunvjsrtk\",\"awnopqgikyzirtxd\"],\"backendPoolNames\":[\"zejntps\"],\"healthProbeNames\":[\"ioilqukrydxtq\",\"ieoxorggufhyaomt\"]}}")
                .toObject(DatabaseServerFullResourceNames.class);
        Assertions.assertEquals("xhojuj", model.virtualMachines().get(0).vmName());
        Assertions.assertEquals("pelmcuvhixbjxyf", model.virtualMachines().get(0).hostname());
        Assertions.assertEquals("r", model.virtualMachines().get(0).osDiskName());
        Assertions.assertEquals("sttp", model.virtualMachines().get(0).dataDiskNames().get("iwii").get(0));
        Assertions.assertEquals("gnyhmossxkkg", model.availabilitySetName());
        Assertions.assertEquals("rghxjb", model.loadBalancer().loadBalancerName());
        Assertions.assertEquals("xvcxgfrpdsofbshr", model.loadBalancer().frontendIpConfigurationNames().get(0));
        Assertions.assertEquals("zejntps", model.loadBalancer().backendPoolNames().get(0));
        Assertions.assertEquals("ioilqukrydxtq", model.loadBalancer().healthProbeNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseServerFullResourceNames model =
            new DatabaseServerFullResourceNames()
                .withVirtualMachines(
                    Arrays
                        .asList(
                            new VirtualMachineResourceNames()
                                .withVmName("xhojuj")
                                .withHostname("pelmcuvhixbjxyf")
                                .withNetworkInterfaces(Arrays.asList())
                                .withOsDiskName("r")
                                .withDataDiskNames(
                                    mapOf("iwii", Arrays.asList("sttp", "iwkkbn", "jrywvtylbfpnc", "rd"))),
                            new VirtualMachineResourceNames()
                                .withVmName("tywubxcbihwq")
                                .withHostname("fdntwjchrdgoih")
                                .withNetworkInterfaces(Arrays.asList())
                                .withOsDiskName("ctondz")
                                .withDataDiskNames(mapOf("fiufx", Arrays.asList("dfdlwggyts", "wtovvtgsein"))),
                            new VirtualMachineResourceNames()
                                .withVmName("npirgnepttw")
                                .withHostname("sniffc")
                                .withNetworkInterfaces(Arrays.asList())
                                .withOsDiskName("r")
                                .withDataDiskNames(
                                    mapOf(
                                        "c",
                                        Arrays.asList("ijnkrxfrdd"),
                                        "ozqyzh",
                                        Arrays.asList("tizzronasxif"),
                                        "nnxk",
                                        Arrays.asList("wesgogczh")))))
                .withAvailabilitySetName("gnyhmossxkkg")
                .withLoadBalancer(
                    new LoadBalancerResourceNames()
                        .withLoadBalancerName("rghxjb")
                        .withFrontendIpConfigurationNames(
                            Arrays.asList("xvcxgfrpdsofbshr", "svbuswdvzyy", "ycnunvjsrtk", "awnopqgikyzirtxd"))
                        .withBackendPoolNames(Arrays.asList("zejntps"))
                        .withHealthProbeNames(Arrays.asList("ioilqukrydxtq", "ieoxorggufhyaomt")));
        model = BinaryData.fromObject(model).toObject(DatabaseServerFullResourceNames.class);
        Assertions.assertEquals("xhojuj", model.virtualMachines().get(0).vmName());
        Assertions.assertEquals("pelmcuvhixbjxyf", model.virtualMachines().get(0).hostname());
        Assertions.assertEquals("r", model.virtualMachines().get(0).osDiskName());
        Assertions.assertEquals("sttp", model.virtualMachines().get(0).dataDiskNames().get("iwii").get(0));
        Assertions.assertEquals("gnyhmossxkkg", model.availabilitySetName());
        Assertions.assertEquals("rghxjb", model.loadBalancer().loadBalancerName());
        Assertions.assertEquals("xvcxgfrpdsofbshr", model.loadBalancer().frontendIpConfigurationNames().get(0));
        Assertions.assertEquals("zejntps", model.loadBalancer().backendPoolNames().get(0));
        Assertions.assertEquals("ioilqukrydxtq", model.loadBalancer().healthProbeNames().get(0));
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
