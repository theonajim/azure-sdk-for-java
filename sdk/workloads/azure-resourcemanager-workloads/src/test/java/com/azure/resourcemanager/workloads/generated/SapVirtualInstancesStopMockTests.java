// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.workloads.WorkloadsManager;
import com.azure.resourcemanager.workloads.models.OperationStatusResult;
import com.azure.resourcemanager.workloads.models.StopRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SapVirtualInstancesStopMockTests {
    @Test
    public void testStop() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"xonbzoggculapz\",\"name\":\"rpgogtqxep\",\"status\":\"ylbf\",\"percentComplete\":58.09601,\"startTime\":\"2021-08-25T02:45:25Z\",\"endTime\":\"2021-03-19T23:20:23Z\",\"operations\":[{\"id\":\"fqzhv\",\"name\":\"ibyfmo\",\"status\":\"uxrkjp\",\"percentComplete\":3.1373262,\"startTime\":\"2021-07-02T02:53:51Z\",\"endTime\":\"2021-11-26T03:34:39Z\",\"operations\":[]},{\"id\":\"zjb\",\"name\":\"zsxjrkambtrneg\",\"status\":\"mnvuqe\",\"percentComplete\":14.903975,\"startTime\":\"2021-08-22T06:33:45Z\",\"endTime\":\"2021-11-15T01:45:03Z\",\"operations\":[]},{\"id\":\"kkdmfl\",\"name\":\"stmjlxrri\",\"status\":\"ozapeew\",\"percentComplete\":86.49275,\"startTime\":\"2021-11-07T22:07:07Z\",\"endTime\":\"2021-10-07T14:08:42Z\",\"operations\":[]}]}";

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

        WorkloadsManager manager =
            WorkloadsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response =
            manager
                .sapVirtualInstances()
                .stop(
                    "zb",
                    "msgeivsiykzk",
                    new StopRequest().withSoftStopTimeoutSeconds(3615112848125243921L),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xonbzoggculapz", response.id());
        Assertions.assertEquals("rpgogtqxep", response.name());
        Assertions.assertEquals("ylbf", response.status());
        Assertions.assertEquals(58.09601F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-25T02:45:25Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-19T23:20:23Z"), response.endTime());
        Assertions.assertEquals("fqzhv", response.operations().get(0).id());
        Assertions.assertEquals("ibyfmo", response.operations().get(0).name());
        Assertions.assertEquals("uxrkjp", response.operations().get(0).status());
        Assertions.assertEquals(3.1373262F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T02:53:51Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-26T03:34:39Z"), response.operations().get(0).endTime());
    }
}
