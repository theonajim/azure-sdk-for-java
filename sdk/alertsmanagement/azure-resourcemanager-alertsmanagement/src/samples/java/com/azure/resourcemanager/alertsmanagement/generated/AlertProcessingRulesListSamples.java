// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

import com.azure.core.util.Context;

/** Samples for AlertProcessingRules List. */
public final class AlertProcessingRulesListSamples {
    /*
     * x-ms-original-file: specification/alertsmanagement/resource-manager/Microsoft.AlertsManagement/stable/2021-08-08/examples/AlertProcessingRules_List_Subscription.json
     */
    /**
     * Sample code: GetAlertProcessingRulesSubscriptionWide.
     *
     * @param manager Entry point to AlertsManagementManager.
     */
    public static void getAlertProcessingRulesSubscriptionWide(
        com.azure.resourcemanager.alertsmanagement.AlertsManagementManager manager) {
        manager.alertProcessingRules().list(Context.NONE);
    }
}
