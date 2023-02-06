// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.HlsSettings;
import org.junit.jupiter.api.Assertions;

public final class HlsSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HlsSettings model =
            BinaryData
                .fromString("{\"default\":true,\"forced\":false,\"characteristics\":\"q\"}")
                .toObject(HlsSettings.class);
        Assertions.assertEquals(true, model.defaultProperty());
        Assertions.assertEquals(false, model.forced());
        Assertions.assertEquals("q", model.characteristics());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HlsSettings model = new HlsSettings().withDefaultProperty(true).withForced(false).withCharacteristics("q");
        model = BinaryData.fromObject(model).toObject(HlsSettings.class);
        Assertions.assertEquals(true, model.defaultProperty());
        Assertions.assertEquals(false, model.forced());
        Assertions.assertEquals("q", model.characteristics());
    }
}
