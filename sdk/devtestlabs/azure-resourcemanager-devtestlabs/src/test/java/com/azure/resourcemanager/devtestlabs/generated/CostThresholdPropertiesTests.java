// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.CostThresholdProperties;
import com.azure.resourcemanager.devtestlabs.models.CostThresholdStatus;
import com.azure.resourcemanager.devtestlabs.models.PercentageCostThresholdProperties;
import org.junit.jupiter.api.Assertions;

public final class CostThresholdPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CostThresholdProperties model =
            BinaryData
                .fromString(
                    "{\"thresholdId\":\"bpokulpiujwaasip\",\"percentageThreshold\":{\"thresholdValue\":24.11692974595916},\"displayOnChart\":\"Disabled\",\"sendNotificationWhenExceeded\":\"Disabled\",\"notificationSent\":\"pqlpq\"}")
                .toObject(CostThresholdProperties.class);
        Assertions.assertEquals("bpokulpiujwaasip", model.thresholdId());
        Assertions.assertEquals(24.11692974595916D, model.percentageThreshold().thresholdValue());
        Assertions.assertEquals(CostThresholdStatus.DISABLED, model.displayOnChart());
        Assertions.assertEquals(CostThresholdStatus.DISABLED, model.sendNotificationWhenExceeded());
        Assertions.assertEquals("pqlpq", model.notificationSent());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CostThresholdProperties model =
            new CostThresholdProperties()
                .withThresholdId("bpokulpiujwaasip")
                .withPercentageThreshold(new PercentageCostThresholdProperties().withThresholdValue(24.11692974595916D))
                .withDisplayOnChart(CostThresholdStatus.DISABLED)
                .withSendNotificationWhenExceeded(CostThresholdStatus.DISABLED)
                .withNotificationSent("pqlpq");
        model = BinaryData.fromObject(model).toObject(CostThresholdProperties.class);
        Assertions.assertEquals("bpokulpiujwaasip", model.thresholdId());
        Assertions.assertEquals(24.11692974595916D, model.percentageThreshold().thresholdValue());
        Assertions.assertEquals(CostThresholdStatus.DISABLED, model.displayOnChart());
        Assertions.assertEquals(CostThresholdStatus.DISABLED, model.sendNotificationWhenExceeded());
        Assertions.assertEquals("pqlpq", model.notificationSent());
    }
}
