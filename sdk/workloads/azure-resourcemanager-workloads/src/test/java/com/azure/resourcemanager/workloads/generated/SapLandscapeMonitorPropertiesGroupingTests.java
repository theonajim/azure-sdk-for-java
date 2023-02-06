// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorPropertiesGrouping;
import com.azure.resourcemanager.workloads.models.SapLandscapeMonitorSidMapping;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SapLandscapeMonitorPropertiesGroupingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapLandscapeMonitorPropertiesGrouping model =
            BinaryData
                .fromString(
                    "{\"landscape\":[{\"name\":\"sag\",\"topSid\":[\"nihgwqapnedg\",\"bcvkcvqvpkeq\",\"cvdrhvoodsot\",\"obzdopcjwvnhdl\"]},{\"name\":\"mgxcxrslpm\",\"topSid\":[\"uoegrpkhjwniyqs\",\"uicpd\"]},{\"name\":\"kzzlvmbmpaxmodf\",\"topSid\":[\"fy\"]},{\"name\":\"bpfvm\",\"topSid\":[\"rfouyftaakcpw\",\"yzvqt\"]}],\"sapApplication\":[{\"name\":\"exkpzksmondjmq\",\"topSid\":[\"ypomgkopkwho\",\"v\",\"ajqgxy\",\"mocmbqfqvmk\"]}]}")
                .toObject(SapLandscapeMonitorPropertiesGrouping.class);
        Assertions.assertEquals("sag", model.landscape().get(0).name());
        Assertions.assertEquals("nihgwqapnedg", model.landscape().get(0).topSid().get(0));
        Assertions.assertEquals("exkpzksmondjmq", model.sapApplication().get(0).name());
        Assertions.assertEquals("ypomgkopkwho", model.sapApplication().get(0).topSid().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapLandscapeMonitorPropertiesGrouping model =
            new SapLandscapeMonitorPropertiesGrouping()
                .withLandscape(
                    Arrays
                        .asList(
                            new SapLandscapeMonitorSidMapping()
                                .withName("sag")
                                .withTopSid(
                                    Arrays.asList("nihgwqapnedg", "bcvkcvqvpkeq", "cvdrhvoodsot", "obzdopcjwvnhdl")),
                            new SapLandscapeMonitorSidMapping()
                                .withName("mgxcxrslpm")
                                .withTopSid(Arrays.asList("uoegrpkhjwniyqs", "uicpd")),
                            new SapLandscapeMonitorSidMapping()
                                .withName("kzzlvmbmpaxmodf")
                                .withTopSid(Arrays.asList("fy")),
                            new SapLandscapeMonitorSidMapping()
                                .withName("bpfvm")
                                .withTopSid(Arrays.asList("rfouyftaakcpw", "yzvqt"))))
                .withSapApplication(
                    Arrays
                        .asList(
                            new SapLandscapeMonitorSidMapping()
                                .withName("exkpzksmondjmq")
                                .withTopSid(Arrays.asList("ypomgkopkwho", "v", "ajqgxy", "mocmbqfqvmk"))));
        model = BinaryData.fromObject(model).toObject(SapLandscapeMonitorPropertiesGrouping.class);
        Assertions.assertEquals("sag", model.landscape().get(0).name());
        Assertions.assertEquals("nihgwqapnedg", model.landscape().get(0).topSid().get(0));
        Assertions.assertEquals("exkpzksmondjmq", model.sapApplication().get(0).name());
        Assertions.assertEquals("ypomgkopkwho", model.sapApplication().get(0).topSid().get(0));
    }
}
