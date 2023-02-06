// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.IntegrationAccountSchema;
import com.azure.resourcemanager.logic.models.SchemaType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IntegrationAccountSchemasGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"schemaType\":\"NotSpecified\",\"targetNamespace\":\"bafo\",\"documentName\":\"ohzha\",\"fileName\":\"v\",\"createdTime\":\"2021-07-17T11:40:42Z\",\"changedTime\":\"2021-09-17T14:17:45Z\",\"metadata\":\"datavkervqchoadhrsxq\",\"content\":\"vspabdsrgfajgl\",\"contentType\":\"subklr\",\"contentLink\":{\"uri\":\"nltce\",\"contentVersion\":\"dvqydie\",\"contentSize\":1754048666808617813,\"metadata\":\"datauwdxvqzxoebwgj\"}},\"location\":\"bibanbau\",\"tags\":{\"lssan\":\"zvpaklozkxbzrpej\"},\"id\":\"tttk\",\"name\":\"s\",\"type\":\"xunrswgkpjhboy\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        LogicManager manager =
            LogicManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationAccountSchema response =
            manager
                .integrationAccountSchemas()
                .getWithResponse("admskx", "npd", "zigjsugswhgsaodk", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("bibanbau", response.location());
        Assertions.assertEquals("zvpaklozkxbzrpej", response.tags().get("lssan"));
        Assertions.assertEquals(SchemaType.NOT_SPECIFIED, response.schemaType());
        Assertions.assertEquals("bafo", response.targetNamespace());
        Assertions.assertEquals("ohzha", response.documentName());
        Assertions.assertEquals("v", response.fileName());
        Assertions.assertEquals("vspabdsrgfajgl", response.content());
        Assertions.assertEquals("subklr", response.contentType());
    }
}
