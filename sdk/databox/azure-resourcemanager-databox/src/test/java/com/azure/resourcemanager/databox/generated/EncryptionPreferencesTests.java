// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.DoubleEncryption;
import com.azure.resourcemanager.databox.models.EncryptionPreferences;
import org.junit.jupiter.api.Assertions;

public final class EncryptionPreferencesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EncryptionPreferences model =
            BinaryData.fromString("{\"doubleEncryption\":\"Enabled\"}").toObject(EncryptionPreferences.class);
        Assertions.assertEquals(DoubleEncryption.ENABLED, model.doubleEncryption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EncryptionPreferences model = new EncryptionPreferences().withDoubleEncryption(DoubleEncryption.ENABLED);
        model = BinaryData.fromObject(model).toObject(EncryptionPreferences.class);
        Assertions.assertEquals(DoubleEncryption.ENABLED, model.doubleEncryption());
    }
}
