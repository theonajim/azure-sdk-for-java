// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainCredentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WsfcDomainCredentialsTests {
    @Test
    public void testDeserialize() {
        WsfcDomainCredentials model =
            BinaryData
                .fromString(
                    "{\"clusterBootstrapAccountPassword\":\"fyhxde\",\"clusterOperatorAccountPassword\":\"jzicwifsjt\",\"sqlServiceAccountPassword\":\"zfbishcbkhaj\"}")
                .toObject(WsfcDomainCredentials.class);
        Assertions.assertEquals("fyhxde", model.clusterBootstrapAccountPassword());
        Assertions.assertEquals("jzicwifsjt", model.clusterOperatorAccountPassword());
        Assertions.assertEquals("zfbishcbkhaj", model.sqlServiceAccountPassword());
    }

    @Test
    public void testSerialize() {
        WsfcDomainCredentials model =
            new WsfcDomainCredentials()
                .withClusterBootstrapAccountPassword("fyhxde")
                .withClusterOperatorAccountPassword("jzicwifsjt")
                .withSqlServiceAccountPassword("zfbishcbkhaj");
        model = BinaryData.fromObject(model).toObject(WsfcDomainCredentials.class);
        Assertions.assertEquals("fyhxde", model.clusterBootstrapAccountPassword());
        Assertions.assertEquals("jzicwifsjt", model.clusterOperatorAccountPassword());
        Assertions.assertEquals("zfbishcbkhaj", model.sqlServiceAccountPassword());
    }
}
