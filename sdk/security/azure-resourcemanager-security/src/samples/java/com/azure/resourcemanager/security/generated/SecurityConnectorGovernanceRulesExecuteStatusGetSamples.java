// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SecurityConnectorGovernanceRulesExecuteStatus Get. */
public final class SecurityConnectorGovernanceRulesExecuteStatusGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/GetSecurityConnectorGovernanceRuleExecuteStatus_example.json
     */
    /**
     * Sample code: Get security governanceRules execution status by specific governanceRuleId.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityGovernanceRulesExecutionStatusBySpecificGovernanceRuleId(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .securityConnectorGovernanceRulesExecuteStatus()
            .get(
                "gcpResourceGroup",
                "gcpconnector",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                "58b33f4f-c8c7-4b01-99cc-d437db4d40dd",
                Context.NONE);
    }
}
