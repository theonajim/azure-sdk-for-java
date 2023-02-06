// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.deploymentmanager.DeploymentManager;
import com.azure.resourcemanager.deploymentmanager.models.ServiceTopologyResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ServiceTopologiesListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "[{\"properties\":{\"artifactSourceId\":\"hj\"},\"location\":\"unmpxttd\",\"tags\":{\"enbtkcxywny\":\"bnlankxmyskpb\",\"nlqidybyxczf\":\"nrs\",\"lwrq\":\"lhaaxdbabp\",\"hsucoc\":\"fkts\"},\"id\":\"nyyazttbtwwrqpue\",\"name\":\"ckzywbiexzfeyue\",\"type\":\"xibxujwbhqwalm\"},{\"properties\":{\"artifactSourceId\":\"yoxa\"},\"location\":\"pdkzjancuxr\",\"tags\":{\"dbpgnxytxhp\":\"bavxbniwdjswzt\",\"lcuhxwtctyqiklb\":\"xbzpfzab\",\"bhvgy\":\"ovplw\"},\"id\":\"gu\",\"name\":\"svmkfssxquk\",\"type\":\"fpl\"},{\"properties\":{\"artifactSourceId\":\"gsxnkjzkdeslpv\"},\"location\":\"opwi\",\"tags\":{\"zb\":\"hxpkd\",\"upedeojnabckhs\":\"iuebbaumny\"},\"id\":\"txp\",\"name\":\"ie\",\"type\":\"tfhvpesapskrdqmh\"}]";

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

        DeploymentManager manager =
            DeploymentManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        List<ServiceTopologyResource> response =
            manager.serviceTopologies().listWithResponse("iarbutrcvpna", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("unmpxttd", response.get(0).location());
        Assertions.assertEquals("bnlankxmyskpb", response.get(0).tags().get("enbtkcxywny"));
        Assertions.assertEquals("hj", response.get(0).artifactSourceId());
    }
}
