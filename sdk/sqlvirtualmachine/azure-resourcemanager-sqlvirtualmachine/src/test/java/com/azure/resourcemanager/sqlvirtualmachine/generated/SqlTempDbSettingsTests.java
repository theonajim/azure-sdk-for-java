// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlTempDbSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlTempDbSettingsTests {
    @Test
    public void testDeserialize() {
        SqlTempDbSettings model =
            BinaryData
                .fromString(
                    "{\"dataFileSize\":1610498845,\"dataGrowth\":650318692,\"logFileSize\":315992042,\"logGrowth\":2071345899,\"dataFileCount\":1202809910,\"persistFolder\":true,\"persistFolderPath\":\"rp\",\"luns\":[1035885378,380689806],\"defaultFilePath\":\"nuqqkpikadrgvt\"}")
                .toObject(SqlTempDbSettings.class);
        Assertions.assertEquals(1610498845, model.dataFileSize());
        Assertions.assertEquals(650318692, model.dataGrowth());
        Assertions.assertEquals(315992042, model.logFileSize());
        Assertions.assertEquals(2071345899, model.logGrowth());
        Assertions.assertEquals(1202809910, model.dataFileCount());
        Assertions.assertEquals(true, model.persistFolder());
        Assertions.assertEquals("rp", model.persistFolderPath());
        Assertions.assertEquals(1035885378, model.luns().get(0));
        Assertions.assertEquals("nuqqkpikadrgvt", model.defaultFilePath());
    }

    @Test
    public void testSerialize() {
        SqlTempDbSettings model =
            new SqlTempDbSettings()
                .withDataFileSize(1610498845)
                .withDataGrowth(650318692)
                .withLogFileSize(315992042)
                .withLogGrowth(2071345899)
                .withDataFileCount(1202809910)
                .withPersistFolder(true)
                .withPersistFolderPath("rp")
                .withLuns(Arrays.asList(1035885378, 380689806))
                .withDefaultFilePath("nuqqkpikadrgvt");
        model = BinaryData.fromObject(model).toObject(SqlTempDbSettings.class);
        Assertions.assertEquals(1610498845, model.dataFileSize());
        Assertions.assertEquals(650318692, model.dataGrowth());
        Assertions.assertEquals(315992042, model.logFileSize());
        Assertions.assertEquals(2071345899, model.logGrowth());
        Assertions.assertEquals(1202809910, model.dataFileCount());
        Assertions.assertEquals(true, model.persistFolder());
        Assertions.assertEquals("rp", model.persistFolderPath());
        Assertions.assertEquals(1035885378, model.luns().get(0));
        Assertions.assertEquals("nuqqkpikadrgvt", model.defaultFilePath());
    }
}
