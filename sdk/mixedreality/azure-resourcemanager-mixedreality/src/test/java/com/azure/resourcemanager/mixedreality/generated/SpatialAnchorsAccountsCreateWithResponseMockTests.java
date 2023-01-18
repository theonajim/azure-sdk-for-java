// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mixedreality.MixedRealityManager;
import com.azure.resourcemanager.mixedreality.models.Identity;
import com.azure.resourcemanager.mixedreality.models.ResourceIdentityType;
import com.azure.resourcemanager.mixedreality.models.Sku;
import com.azure.resourcemanager.mixedreality.models.SkuTier;
import com.azure.resourcemanager.mixedreality.models.SpatialAnchorsAccount;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SpatialAnchorsAccountsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"storageAccountName\":\"dckcbc\",\"accountId\":\"jrjxgciqibrhosx\",\"accountDomain\":\"qrhzoymibmrqyib\"},\"identity\":{\"principalId\":\"fluszdtm\",\"tenantId\":\"kwofyyvoq\",\"type\":\"SystemAssigned\"},\"plan\":{\"principalId\":\"xpbtgiwbwo\",\"tenantId\":\"washr\",\"type\":\"SystemAssigned\"},\"sku\":{\"name\":\"cnqxwbpokulpi\",\"tier\":\"Basic\",\"size\":\"asipqiio\",\"family\":\"uqerpqlpqwc\",\"capacity\":1475911208},\"kind\":{\"name\":\"gbdbutauv\",\"tier\":\"Premium\",\"size\":\"uwhhmhykojoxafn\",\"family\":\"lpichk\",\"capacity\":1847154217},\"location\":\"cdyhbpkkpwdreqn\",\"tags\":{\"rsndsytgadgvra\":\"qfovljxywsuws\"},\"id\":\"aeneqnzarrwl\",\"name\":\"uu\",\"type\":\"jfqka\"}";

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

        MixedRealityManager manager =
            MixedRealityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SpatialAnchorsAccount response =
            manager
                .spatialAnchorsAccounts()
                .define("pnppfuf")
                .withRegion("cpwi")
                .withExistingResourceGroup("vhqcrail")
                .withTags(mapOf("mond", "qtmnubexkpzk", "gkopkwhojvpajqgx", "mquxvypo"))
                .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                .withPlan(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                .withSku(
                    new Sku()
                        .withName("lpmutwuoegrpkhj")
                        .withTier(SkuTier.FREE)
                        .withSize("qsluicp")
                        .withFamily("gk")
                        .withCapacity(2143167130))
                .withKind(
                    new Sku()
                        .withName("mbmpaxmodfvuefy")
                        .withTier(SkuTier.BASIC)
                        .withSize("fvmwy")
                        .withFamily("fouyf")
                        .withCapacity(938616277))
                .withStorageAccountName("dmhdlxyjr")
                .create();

        Assertions.assertEquals("cdyhbpkkpwdreqn", response.location());
        Assertions.assertEquals("qfovljxywsuws", response.tags().get("rsndsytgadgvra"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.plan().type());
        Assertions.assertEquals("cnqxwbpokulpi", response.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, response.sku().tier());
        Assertions.assertEquals("asipqiio", response.sku().size());
        Assertions.assertEquals("uqerpqlpqwc", response.sku().family());
        Assertions.assertEquals(1475911208, response.sku().capacity());
        Assertions.assertEquals("gbdbutauv", response.kind().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.kind().tier());
        Assertions.assertEquals("uwhhmhykojoxafn", response.kind().size());
        Assertions.assertEquals("lpichk", response.kind().family());
        Assertions.assertEquals(1847154217, response.kind().capacity());
        Assertions.assertEquals("dckcbc", response.storageAccountName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
