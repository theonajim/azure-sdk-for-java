// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.Layer;
import org.junit.jupiter.api.Assertions;

public final class LayerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Layer model =
            BinaryData
                .fromString("{\"width\":\"fk\",\"height\":\"vsexsowuelu\",\"label\":\"hahhxvrhmzkwpj\"}")
                .toObject(Layer.class);
        Assertions.assertEquals("fk", model.width());
        Assertions.assertEquals("vsexsowuelu", model.height());
        Assertions.assertEquals("hahhxvrhmzkwpj", model.label());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Layer model = new Layer().withWidth("fk").withHeight("vsexsowuelu").withLabel("hahhxvrhmzkwpj");
        model = BinaryData.fromObject(model).toObject(Layer.class);
        Assertions.assertEquals("fk", model.width());
        Assertions.assertEquals("vsexsowuelu", model.height());
        Assertions.assertEquals("hahhxvrhmzkwpj", model.label());
    }
}
