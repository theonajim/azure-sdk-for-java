// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.TypesClient;
import com.azure.analytics.purview.catalog.TypesClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class TypesGetStructDefByGuid {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.typesgetstructdefbyguid.typesgetstructdefbyguid
        TypesClient typesClient =
                new TypesClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                typesClient.getStructDefByGuidWithResponse("f1571b6e-ad08-4040-a9a7-c30ed935d437", requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.typesgetstructdefbyguid.typesgetstructdefbyguid
    }
}
