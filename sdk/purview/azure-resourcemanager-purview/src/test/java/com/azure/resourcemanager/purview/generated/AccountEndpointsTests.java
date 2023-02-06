// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.models.AccountEndpoints;

public final class AccountEndpointsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountEndpoints model =
            BinaryData
                .fromString("{\"catalog\":\"guhmuouqfpr\",\"guardian\":\"wbnguitnwui\",\"scan\":\"a\"}")
                .toObject(AccountEndpoints.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountEndpoints model = new AccountEndpoints();
        model = BinaryData.fromObject(model).toObject(AccountEndpoints.class);
    }
}
