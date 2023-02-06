// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.PeeringReceivedRouteInner;

public final class PeeringReceivedRouteInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringReceivedRouteInner model =
            BinaryData
                .fromString(
                    "{\"prefix\":\"hbttkphyw\",\"nextHop\":\"vjtoqnermclfp\",\"asPath\":\"hoxus\",\"originAsValidationState\":\"pabgyeps\",\"rpkiValidationState\":\"tazqugxywpmueefj\",\"trustAnchor\":\"fqkquj\",\"receivedTimestamp\":\"suyonobglaocq\"}")
                .toObject(PeeringReceivedRouteInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringReceivedRouteInner model = new PeeringReceivedRouteInner();
        model = BinaryData.fromObject(model).toObject(PeeringReceivedRouteInner.class);
    }
}
