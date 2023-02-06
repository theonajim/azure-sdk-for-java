// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.fluent.models.TrustedIdProviderProperties;

public final class TrustedIdProviderPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrustedIdProviderProperties model =
            BinaryData.fromString("{\"idProvider\":\"iy\"}").toObject(TrustedIdProviderProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrustedIdProviderProperties model = new TrustedIdProviderProperties();
        model = BinaryData.fromObject(model).toObject(TrustedIdProviderProperties.class);
    }
}
