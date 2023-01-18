// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.purview.models.PrivateEndpointConnectionList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionList model =
            BinaryData
                .fromString(
                    "{\"count\":8974956184812765596,\"nextLink\":\"uzyoxaep\",\"value\":[{\"properties\":{\"provisioningState\":\"cuxrhdwbavx\"},\"id\":\"niwdjsw\",\"name\":\"tsdbpgn\",\"type\":\"ytxhp\"},{\"properties\":{\"provisioningState\":\"fzab\"},\"id\":\"lcuhxwtctyqiklb\",\"name\":\"ovplw\",\"type\":\"bhvgy\"},{\"properties\":{\"provisioningState\":\"vmkfssxqu\"},\"id\":\"kfplgmgsxnk\",\"name\":\"zkd\",\"type\":\"slpvlop\"},{\"properties\":{\"provisioningState\":\"hxpkd\"},\"id\":\"zb\",\"name\":\"iuebbaumny\",\"type\":\"upedeojnabckhs\"}]}")
                .toObject(PrivateEndpointConnectionList.class);
        Assertions.assertEquals(8974956184812765596L, model.count());
        Assertions.assertEquals("uzyoxaep", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionList model =
            new PrivateEndpointConnectionList()
                .withCount(8974956184812765596L)
                .withNextLink("uzyoxaep")
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner()));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionList.class);
        Assertions.assertEquals(8974956184812765596L, model.count());
        Assertions.assertEquals("uzyoxaep", model.nextLink());
    }
}
