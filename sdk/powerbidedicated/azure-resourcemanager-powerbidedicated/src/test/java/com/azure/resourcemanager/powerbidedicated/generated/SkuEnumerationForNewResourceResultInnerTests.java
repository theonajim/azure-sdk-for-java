// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.powerbidedicated.fluent.models.SkuEnumerationForNewResourceResultInner;
import com.azure.resourcemanager.powerbidedicated.models.CapacitySku;
import com.azure.resourcemanager.powerbidedicated.models.CapacitySkuTier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SkuEnumerationForNewResourceResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuEnumerationForNewResourceResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"dmgloug\",\"tier\":\"AutoPremiumHost\",\"capacity\":815963973},{\"name\":\"mutduqktaps\",\"tier\":\"AutoPremiumHost\",\"capacity\":1678823592}]}")
                .toObject(SkuEnumerationForNewResourceResultInner.class);
        Assertions.assertEquals("dmgloug", model.value().get(0).name());
        Assertions.assertEquals(CapacitySkuTier.AUTO_PREMIUM_HOST, model.value().get(0).tier());
        Assertions.assertEquals(815963973, model.value().get(0).capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuEnumerationForNewResourceResultInner model =
            new SkuEnumerationForNewResourceResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new CapacitySku()
                                .withName("dmgloug")
                                .withTier(CapacitySkuTier.AUTO_PREMIUM_HOST)
                                .withCapacity(815963973),
                            new CapacitySku()
                                .withName("mutduqktaps")
                                .withTier(CapacitySkuTier.AUTO_PREMIUM_HOST)
                                .withCapacity(1678823592)));
        model = BinaryData.fromObject(model).toObject(SkuEnumerationForNewResourceResultInner.class);
        Assertions.assertEquals("dmgloug", model.value().get(0).name());
        Assertions.assertEquals(CapacitySkuTier.AUTO_PREMIUM_HOST, model.value().get(0).tier());
        Assertions.assertEquals(815963973, model.value().get(0).capacity());
    }
}
