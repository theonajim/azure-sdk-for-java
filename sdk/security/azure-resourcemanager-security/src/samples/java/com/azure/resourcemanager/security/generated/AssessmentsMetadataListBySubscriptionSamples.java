// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for AssessmentsMetadata ListBySubscription. */
public final class AssessmentsMetadataListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2021-06-01/examples/AssessmentsMetadata/ListAssessmentsMetadata_subscription_example.json
     */
    /**
     * Sample code: List security assessment metadata for subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listSecurityAssessmentMetadataForSubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.assessmentsMetadatas().listBySubscription(Context.NONE);
    }
}
