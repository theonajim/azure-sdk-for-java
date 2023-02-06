// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

/** Samples for ReservationOrderAlias Get. */
public final class ReservationOrderAliasGetSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/ReservationOrderAliasGet.json
     */
    /**
     * Sample code: ReservationOrderAliasGet.
     *
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void reservationOrderAliasGet(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.reservationOrderAlias().getWithResponse("reservationOrderAlias123", com.azure.core.util.Context.NONE);
    }
}
