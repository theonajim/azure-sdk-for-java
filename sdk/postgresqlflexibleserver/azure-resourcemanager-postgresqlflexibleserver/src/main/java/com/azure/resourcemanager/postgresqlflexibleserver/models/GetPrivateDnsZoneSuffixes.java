// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GetPrivateDnsZoneSuffixes. */
public interface GetPrivateDnsZoneSuffixes {
    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud along with {@link Response}.
     */
    Response<String> executeWithResponse(Context context);

    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    String execute();
}
