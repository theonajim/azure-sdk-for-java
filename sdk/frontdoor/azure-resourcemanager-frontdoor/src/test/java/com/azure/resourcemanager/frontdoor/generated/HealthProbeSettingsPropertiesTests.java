// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.HealthProbeSettingsProperties;
import com.azure.resourcemanager.frontdoor.models.FrontDoorHealthProbeMethod;
import com.azure.resourcemanager.frontdoor.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.models.HealthProbeEnabled;
import org.junit.jupiter.api.Assertions;

public final class HealthProbeSettingsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HealthProbeSettingsProperties model =
            BinaryData
                .fromString(
                    "{\"resourceState\":\"Disabling\",\"path\":\"l\",\"protocol\":\"Http\",\"intervalInSeconds\":1837530813,\"healthProbeMethod\":\"HEAD\",\"enabledState\":\"Enabled\"}")
                .toObject(HealthProbeSettingsProperties.class);
        Assertions.assertEquals("l", model.path());
        Assertions.assertEquals(FrontDoorProtocol.HTTP, model.protocol());
        Assertions.assertEquals(1837530813, model.intervalInSeconds());
        Assertions.assertEquals(FrontDoorHealthProbeMethod.HEAD, model.healthProbeMethod());
        Assertions.assertEquals(HealthProbeEnabled.ENABLED, model.enabledState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HealthProbeSettingsProperties model =
            new HealthProbeSettingsProperties()
                .withPath("l")
                .withProtocol(FrontDoorProtocol.HTTP)
                .withIntervalInSeconds(1837530813)
                .withHealthProbeMethod(FrontDoorHealthProbeMethod.HEAD)
                .withEnabledState(HealthProbeEnabled.ENABLED);
        model = BinaryData.fromObject(model).toObject(HealthProbeSettingsProperties.class);
        Assertions.assertEquals("l", model.path());
        Assertions.assertEquals(FrontDoorProtocol.HTTP, model.protocol());
        Assertions.assertEquals(1837530813, model.intervalInSeconds());
        Assertions.assertEquals(FrontDoorHealthProbeMethod.HEAD, model.healthProbeMethod());
        Assertions.assertEquals(HealthProbeEnabled.ENABLED, model.enabledState());
    }
}
