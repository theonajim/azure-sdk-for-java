// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.EnforceCertificateNameCheckEnabledState;
import com.azure.resourcemanager.frontdoor.models.FrontDoor;
import com.azure.resourcemanager.frontdoor.models.FrontDoorEnabledState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FrontDoorsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"resourceState\":\"Enabling\",\"provisioningState\":\"jnjwltlwt\",\"cname\":\"guk\",\"frontdoorId\":\"lhsnvkcdmx\",\"rulesEngines\":[],\"friendlyName\":\"aimlnwiaaom\",\"routingRules\":[],\"loadBalancingSettings\":[],\"healthProbeSettings\":[],\"backendPools\":[],\"frontendEndpoints\":[],\"backendPoolsSettings\":{\"enforceCertificateNameCheck\":\"Enabled\",\"sendRecvTimeoutSeconds\":2137490024},\"enabledState\":\"Disabled\"},\"location\":\"hlf\",\"tags\":{\"fb\":\"pchwa\",\"l\":\"usnfepgfewet\"},\"id\":\"xgncxyk\",\"name\":\"hdjhlimmbcx\",\"type\":\"h\"}]}";

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

        FrontDoorManager manager =
            FrontDoorManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<FrontDoor> response =
            manager.frontDoors().listByResourceGroup("lkb", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hlf", response.iterator().next().location());
        Assertions.assertEquals("pchwa", response.iterator().next().tags().get("fb"));
        Assertions.assertEquals("aimlnwiaaom", response.iterator().next().friendlyName());
        Assertions
            .assertEquals(
                EnforceCertificateNameCheckEnabledState.ENABLED,
                response.iterator().next().backendPoolsSettings().enforceCertificateNameCheck());
        Assertions.assertEquals(2137490024, response.iterator().next().backendPoolsSettings().sendRecvTimeoutSeconds());
        Assertions.assertEquals(FrontDoorEnabledState.DISABLED, response.iterator().next().enabledState());
    }
}
