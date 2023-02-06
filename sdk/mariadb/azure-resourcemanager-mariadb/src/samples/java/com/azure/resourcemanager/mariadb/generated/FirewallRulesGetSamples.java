// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

/** Samples for FirewallRules Get. */
public final class FirewallRulesGetSamples {
    /*
     * x-ms-original-file: specification/mariadb/resource-manager/Microsoft.DBforMariaDB/stable/2018-06-01/examples/FirewallRuleGet.json
     */
    /**
     * Sample code: FirewallRuleGet.
     *
     * @param manager Entry point to MariaDBManager.
     */
    public static void firewallRuleGet(com.azure.resourcemanager.mariadb.MariaDBManager manager) {
        manager.firewallRules().getWithResponse("TestGroup", "testserver", "rule1", com.azure.core.util.Context.NONE);
    }
}
