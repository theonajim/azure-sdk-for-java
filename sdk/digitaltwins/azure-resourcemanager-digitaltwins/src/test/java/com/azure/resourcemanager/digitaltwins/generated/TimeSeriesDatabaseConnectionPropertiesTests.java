// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.models.IdentityType;
import com.azure.resourcemanager.digitaltwins.models.ManagedIdentityReference;
import com.azure.resourcemanager.digitaltwins.models.TimeSeriesDatabaseConnectionProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TimeSeriesDatabaseConnectionPropertiesTests {
    @Test
    public void testDeserialize() {
        TimeSeriesDatabaseConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"connectionType\":\"TimeSeriesDatabaseConnectionProperties\",\"provisioningState\":\"Canceled\",\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"yq\"}}")
                .toObject(TimeSeriesDatabaseConnectionProperties.class);
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("yq", model.identity().userAssignedIdentity());
    }

    @Test
    public void testSerialize() {
        TimeSeriesDatabaseConnectionProperties model =
            new TimeSeriesDatabaseConnectionProperties()
                .withIdentity(
                    new ManagedIdentityReference()
                        .withType(IdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentity("yq"));
        model = BinaryData.fromObject(model).toObject(TimeSeriesDatabaseConnectionProperties.class);
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("yq", model.identity().userAssignedIdentity());
    }
}
