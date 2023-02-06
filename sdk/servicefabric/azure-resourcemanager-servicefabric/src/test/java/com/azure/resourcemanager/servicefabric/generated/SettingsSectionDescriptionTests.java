// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.SettingsParameterDescription;
import com.azure.resourcemanager.servicefabric.models.SettingsSectionDescription;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SettingsSectionDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SettingsSectionDescription model =
            BinaryData
                .fromString(
                    "{\"name\":\"jzyflu\",\"parameters\":[{\"name\":\"rh\",\"value\":\"ofcqhsm\"},{\"name\":\"urkdtmlx\",\"value\":\"ekuksjtx\"},{\"name\":\"kc\",\"value\":\"mparcryuanzw\"}]}")
                .toObject(SettingsSectionDescription.class);
        Assertions.assertEquals("jzyflu", model.name());
        Assertions.assertEquals("rh", model.parameters().get(0).name());
        Assertions.assertEquals("ofcqhsm", model.parameters().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SettingsSectionDescription model =
            new SettingsSectionDescription()
                .withName("jzyflu")
                .withParameters(
                    Arrays
                        .asList(
                            new SettingsParameterDescription().withName("rh").withValue("ofcqhsm"),
                            new SettingsParameterDescription().withName("urkdtmlx").withValue("ekuksjtx"),
                            new SettingsParameterDescription().withName("kc").withValue("mparcryuanzw")));
        model = BinaryData.fromObject(model).toObject(SettingsSectionDescription.class);
        Assertions.assertEquals("jzyflu", model.name());
        Assertions.assertEquals("rh", model.parameters().get(0).name());
        Assertions.assertEquals("ofcqhsm", model.parameters().get(0).value());
    }
}
