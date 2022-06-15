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

public class TypesCreateBusinessMetadata {
    public static void main(String[] args) {
        TypesClient typesClient =
                new TypesClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.typescreatetypedefinitions.typescreatebusinessmetadata
        BinaryData typesDef =
                BinaryData.fromString(
                        "{\"businessMetadataDefs\":[{\"name\":\"myBizMetadata1\",\"description\":\"\",\"attributeDefs\":[{\"name\":\"bizAttr1\",\"cardinality\":\"SINGLE\",\"isIndexable\":true,\"isOptional\":true,\"isUnique\":false,\"options\":{\"applicableEntityTypes\":\"[\\\"Path\\\"]\",\"maxStrLength\":\"50\"},\"typeName\":\"string\"}]}],\"classificationDefs\":[],\"entityDefs\":[],\"enumDefs\":[],\"relationshipDefs\":[],\"structDefs\":[]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = typesClient.createTypeDefinitionsWithResponse(typesDef, requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.typescreatetypedefinitions.typescreatebusinessmetadata
    }
}
