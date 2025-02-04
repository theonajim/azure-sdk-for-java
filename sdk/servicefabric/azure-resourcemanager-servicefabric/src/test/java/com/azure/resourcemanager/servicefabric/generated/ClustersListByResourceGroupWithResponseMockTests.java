// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.servicefabric.ServiceFabricManager;
import com.azure.resourcemanager.servicefabric.models.ClusterListResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClustersListByResourceGroupWithResponseMockTests {
    @Test
    public void testListByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"etag\":\"kkze\",\"location\":\"l\",\"tags\":{\"vogvbbejdcngqqmo\":\"pusdstt\",\"rwr\":\"kufgmj\",\"u\":\"grtwae\",\"inrfdwoyu\":\"zkopb\"},\"id\":\"hziuiefozbhdms\",\"name\":\"l\",\"type\":\"zqhof\"},{\"etag\":\"ae\",\"location\":\"iahxicsl\",\"tags\":{\"alnswhccsphk\":\"qzpiyyl\",\"oluhczbwemh\":\"ivwitqscywugg\",\"sbrgz\":\"i\"},\"id\":\"wmsweypqwd\",\"name\":\"ggicccnxqhue\",\"type\":\"mkttlstvlzywem\"},{\"etag\":\"ncsdtclusiyp\",\"location\":\"fgytguslfeadcyg\",\"tags\":{\"lolp\":\"yhejhzisxgfp\",\"r\":\"vk\",\"swibyr\":\"qvujzraehtwdwrf\"},\"id\":\"dl\",\"name\":\"h\",\"type\":\"hfwpracstwit\"}],\"nextLink\":\"hevxcced\"}";

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

        ServiceFabricManager manager =
            ServiceFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ClusterListResult response =
            manager
                .clusters()
                .listByResourceGroupWithResponse("gmhrskdsnfdsdoak", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("l", response.value().get(0).location());
        Assertions.assertEquals("pusdstt", response.value().get(0).tags().get("vogvbbejdcngqqmo"));
        Assertions.assertEquals("hevxcced", response.nextLink());
    }
}
