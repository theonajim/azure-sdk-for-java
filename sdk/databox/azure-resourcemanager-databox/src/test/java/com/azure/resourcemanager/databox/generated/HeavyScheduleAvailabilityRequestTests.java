// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.HeavyScheduleAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class HeavyScheduleAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HeavyScheduleAvailabilityRequest model =
            BinaryData
                .fromString("{\"skuName\":\"DataBoxHeavy\",\"storageLocation\":\"mwmbes\",\"country\":\"nkww\"}")
                .toObject(HeavyScheduleAvailabilityRequest.class);
        Assertions.assertEquals("mwmbes", model.storageLocation());
        Assertions.assertEquals("nkww", model.country());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HeavyScheduleAvailabilityRequest model =
            new HeavyScheduleAvailabilityRequest().withStorageLocation("mwmbes").withCountry("nkww");
        model = BinaryData.fromObject(model).toObject(HeavyScheduleAvailabilityRequest.class);
        Assertions.assertEquals("mwmbes", model.storageLocation());
        Assertions.assertEquals("nkww", model.country());
    }
}
