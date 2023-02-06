// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.EnrollmentAccountSummaryProperties;

public final class EnrollmentAccountSummaryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnrollmentAccountSummaryProperties model =
            BinaryData
                .fromString("{\"principalName\":\"sofieypefojyqd\"}")
                .toObject(EnrollmentAccountSummaryProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnrollmentAccountSummaryProperties model = new EnrollmentAccountSummaryProperties();
        model = BinaryData.fromObject(model).toObject(EnrollmentAccountSummaryProperties.class);
    }
}
