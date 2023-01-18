// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ApplyUpdateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplyUpdateInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"status\":\"RetryNow\",\"resourceId\":\"ngsntnbybk\",\"lastUpdateTime\":\"2021-10-18T14:10:44Z\"},\"id\":\"rwclxxwrljdo\",\"name\":\"skcqvkocrcjd\",\"type\":\"wtnhxbnjbiksqr\"}")
                .toObject(ApplyUpdateInner.class);
        Assertions.assertEquals(UpdateStatus.RETRY_NOW, model.status());
        Assertions.assertEquals("ngsntnbybk", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-18T14:10:44Z"), model.lastUpdateTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplyUpdateInner model =
            new ApplyUpdateInner()
                .withStatus(UpdateStatus.RETRY_NOW)
                .withResourceId("ngsntnbybk")
                .withLastUpdateTime(OffsetDateTime.parse("2021-10-18T14:10:44Z"));
        model = BinaryData.fromObject(model).toObject(ApplyUpdateInner.class);
        Assertions.assertEquals(UpdateStatus.RETRY_NOW, model.status());
        Assertions.assertEquals("ngsntnbybk", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-18T14:10:44Z"), model.lastUpdateTime());
    }
}
