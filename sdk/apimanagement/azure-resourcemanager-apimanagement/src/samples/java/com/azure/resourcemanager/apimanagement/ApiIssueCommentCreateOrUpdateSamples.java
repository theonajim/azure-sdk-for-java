// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import java.time.OffsetDateTime;

/** Samples for ApiIssueComment CreateOrUpdate. */
public final class ApiIssueCommentCreateOrUpdateSamples {
    /*
     * operationId: ApiIssueComment_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateApiIssueComment
     */
    /**
     * Sample code: ApiManagementCreateApiIssueComment.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateApiIssueComment(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiIssueComments()
            .define("599e29ab193c3c0bd0b3e2fb")
            .withExistingIssue("rg1", "apimService1", "57d1f7558aa04f15146d9d8a", "57d2ef278aa04f0ad01d6cdc")
            .withText("Issue comment.")
            .withCreatedDate(OffsetDateTime.parse("2018-02-01T22:21:20.467Z"))
            .withUserId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/users/1")
            .create();
    }
}
