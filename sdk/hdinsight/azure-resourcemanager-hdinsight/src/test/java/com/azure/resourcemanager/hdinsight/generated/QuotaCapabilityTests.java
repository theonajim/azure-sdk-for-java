// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.QuotaCapability;
import com.azure.resourcemanager.hdinsight.models.RegionalQuotaCapability;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class QuotaCapabilityTests {
    @Test
    public void testDeserialize() {
        QuotaCapability model =
            BinaryData
                .fromString(
                    "{\"coresUsed\":5771511896928290533,\"maxCoresAllowed\":7589435135200737860,\"regionalQuotas\":[{\"regionName\":\"fkzikfj\",\"coresUsed\":840452358512329690,\"coresAvailable\":2977949110627506617},{\"regionName\":\"wczelpci\",\"coresUsed\":8795668751139287194,\"coresAvailable\":2411008459227076557},{\"regionName\":\"nwabfatkldd\",\"coresUsed\":3710000815111343591,\"coresAvailable\":3730828856140203341}]}")
                .toObject(QuotaCapability.class);
        Assertions.assertEquals(5771511896928290533L, model.coresUsed());
        Assertions.assertEquals(7589435135200737860L, model.maxCoresAllowed());
        Assertions.assertEquals("fkzikfj", model.regionalQuotas().get(0).regionName());
        Assertions.assertEquals(840452358512329690L, model.regionalQuotas().get(0).coresUsed());
        Assertions.assertEquals(2977949110627506617L, model.regionalQuotas().get(0).coresAvailable());
    }

    @Test
    public void testSerialize() {
        QuotaCapability model =
            new QuotaCapability()
                .withCoresUsed(5771511896928290533L)
                .withMaxCoresAllowed(7589435135200737860L)
                .withRegionalQuotas(
                    Arrays
                        .asList(
                            new RegionalQuotaCapability()
                                .withRegionName("fkzikfj")
                                .withCoresUsed(840452358512329690L)
                                .withCoresAvailable(2977949110627506617L),
                            new RegionalQuotaCapability()
                                .withRegionName("wczelpci")
                                .withCoresUsed(8795668751139287194L)
                                .withCoresAvailable(2411008459227076557L),
                            new RegionalQuotaCapability()
                                .withRegionName("nwabfatkldd")
                                .withCoresUsed(3710000815111343591L)
                                .withCoresAvailable(3730828856140203341L)));
        model = BinaryData.fromObject(model).toObject(QuotaCapability.class);
        Assertions.assertEquals(5771511896928290533L, model.coresUsed());
        Assertions.assertEquals(7589435135200737860L, model.maxCoresAllowed());
        Assertions.assertEquals("fkzikfj", model.regionalQuotas().get(0).regionName());
        Assertions.assertEquals(840452358512329690L, model.regionalQuotas().get(0).coresUsed());
        Assertions.assertEquals(2977949110627506617L, model.regionalQuotas().get(0).coresAvailable());
    }
}
