// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.RetargetScheduleProperties;
import org.junit.jupiter.api.Assertions;

public final class RetargetSchedulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RetargetScheduleProperties model =
            BinaryData
                .fromString("{\"currentResourceId\":\"ousxauzlwvsgmw\",\"targetResourceId\":\"qf\"}")
                .toObject(RetargetScheduleProperties.class);
        Assertions.assertEquals("ousxauzlwvsgmw", model.currentResourceId());
        Assertions.assertEquals("qf", model.targetResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RetargetScheduleProperties model =
            new RetargetScheduleProperties().withCurrentResourceId("ousxauzlwvsgmw").withTargetResourceId("qf");
        model = BinaryData.fromObject(model).toObject(RetargetScheduleProperties.class);
        Assertions.assertEquals("ousxauzlwvsgmw", model.currentResourceId());
        Assertions.assertEquals("qf", model.targetResourceId());
    }
}
