// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.quota.fluent.models.QuotaRequestDetailsInner;

/** An instance of this class provides access to all the operations defined in QuotaRequestStatusClient. */
public interface QuotaRequestStatusClient {
    /**
     * Get the quota request details and status by quota request ID for the resources of the resource provider at a
     * specific location. The quota request ID **id** is returned in the response of the PUT operation.
     *
     * @param id Quota request ID.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota request details and status by quota request ID for the resources of the resource provider at a
     *     specific location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QuotaRequestDetailsInner get(String id, String scope);

    /**
     * Get the quota request details and status by quota request ID for the resources of the resource provider at a
     * specific location. The quota request ID **id** is returned in the response of the PUT operation.
     *
     * @param id Quota request ID.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota request details and status by quota request ID for the resources of the resource provider at a
     *     specific location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QuotaRequestDetailsInner> getWithResponse(String id, String scope, Context context);

    /**
     * For the specified scope, get the current quota requests for a one year period ending at the time is made. Use the
     * **oData** filter to select quota requests.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota request information.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QuotaRequestDetailsInner> list(String scope);

    /**
     * For the specified scope, get the current quota requests for a one year period ending at the time is made. Use the
     * **oData** filter to select quota requests.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param filter | Field | Supported operators |---------------------|------------------------
     *     <p>|requestSubmitTime | ge, le, eq, gt, lt |provisioningState eq {QuotaRequestState} |resourceName eq
     *     {resourceName}.
     * @param top Number of records to return.
     * @param skiptoken The **Skiptoken** parameter is used only if a previous operation returned a partial result. If a
     *     previous response contains a **nextLink** element, its value includes a **skiptoken** parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota request information.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QuotaRequestDetailsInner> list(
        String scope, String filter, Integer top, String skiptoken, Context context);
}
