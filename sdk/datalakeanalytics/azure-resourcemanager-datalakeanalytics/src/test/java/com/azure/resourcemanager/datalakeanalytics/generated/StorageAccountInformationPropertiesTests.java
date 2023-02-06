// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.StorageAccountInformationProperties;

public final class StorageAccountInformationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageAccountInformationProperties model =
            BinaryData.fromString("{\"suffix\":\"jrefovgmkqsle\"}").toObject(StorageAccountInformationProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageAccountInformationProperties model = new StorageAccountInformationProperties();
        model = BinaryData.fromObject(model).toObject(StorageAccountInformationProperties.class);
    }
}
