// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.models.BillingResponseListResult;
import com.azure.resourcemanager.hdinsight.models.FilterMode;
import com.azure.resourcemanager.hdinsight.models.OSType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LocationsListBillingSpecsWithResponseMockTests {
    @Test
    public void testListBillingSpecsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"vmSizes\":[\"dmdqb\"],\"vmSizesWithEncryptionAtHost\":[\"pqtgsfjac\"],\"vmSizeFilters\":[{\"filterMode\":\"Recommend\",\"regions\":[\"db\",\"vodhtn\"],\"clusterFlavors\":[\"ud\",\"z\",\"mes\",\"kdlpa\"],\"nodeTypes\":[\"cxfailcfxwmdboxd\",\"gsftufqobrjlnacg\",\"ckknhxkizvy\",\"nrzvuljraaer\"],\"clusterVersions\":[\"kqg\",\"kkjqnvbroylaxxu\",\"cdisd\"],\"osType\":[\"Linux\"],\"vmSizes\":[\"svgjrwhryvy\"],\"espApplied\":\"t\",\"computeIsolationSupported\":\"lxgccknfnwmbtm\"},{\"filterMode\":\"Recommend\",\"regions\":[\"dhttzaefedxihchr\",\"hk\",\"crjdqnsdfzpbgtg\",\"ylkdghrje\"],\"clusterFlavors\":[\"lwxezwzhokvbwnh\"],\"nodeTypes\":[\"lgehg\",\"pipifh\"],\"clusterVersions\":[\"oajvgcxtxjcs\"],\"osType\":[\"Windows\",\"Linux\",\"Windows\"],\"vmSizes\":[\"ugsresmkssjhoi\",\"txfkfweg\",\"rhptilluc\",\"iqtgdqoh\"],\"espApplied\":\"wsldrizetpwbr\",\"computeIsolationSupported\":\"llibphbqzmizak\"},{\"filterMode\":\"Recommend\",\"regions\":[\"jpdn\",\"zhajoylhjlmuo\",\"xprimrsop\"],\"clusterFlavors\":[\"cjmeislstvasy\"],\"nodeTypes\":[\"dzaumweooh\"],\"clusterVersions\":[\"fuzboyjathwtzolb\",\"emwmdxmebwjs\"],\"osType\":[\"Linux\"],\"vmSizes\":[\"xveabf\",\"xnmwmqtibxyijddt\",\"qcttadijaeukmrsi\"],\"espApplied\":\"kpn\",\"computeIsolationSupported\":\"aapm\"},{\"filterMode\":\"Default\",\"regions\":[\"qwigpibudqwyxe\"],\"clusterFlavors\":[\"bpmzzn\",\"tffyaqit\",\"hheioqaqhvseuf\",\"qyrxp\"],\"nodeTypes\":[\"gql\"],\"clusterVersions\":[\"mjqfrddgamquhio\",\"rsjuivfcdisyir\",\"xzhczexrxz\"],\"osType\":[\"Linux\",\"Windows\",\"Linux\"],\"vmSizes\":[\"vwrevkhgnlnzon\",\"lrpiqywnc\"],\"espApplied\":\"tszcofizehtdhgb\",\"computeIsolationSupported\":\"vreljea\"}],\"vmSizeProperties\":[{\"name\":\"zmlovuanash\",\"cores\":1712193542,\"dataDiskStorageTier\":\"mjerbdk\",\"label\":\"vidizozsdb\",\"maxDataDiskCount\":6191416292355922762,\"memoryInMb\":1398684791655344997,\"supportedByVirtualMachines\":true,\"supportedByWebWorkerRoles\":true,\"virtualMachineResourceDiskSizeInMb\":1108415883260069498,\"webWorkerResourceDiskSizeInMb\":4527807456286813914},{\"name\":\"w\",\"cores\":1941131866,\"dataDiskStorageTier\":\"uqj\",\"label\":\"zenkeifzzhmkd\",\"maxDataDiskCount\":640466404560653051,\"memoryInMb\":3956942710936432469,\"supportedByVirtualMachines\":true,\"supportedByWebWorkerRoles\":true,\"virtualMachineResourceDiskSizeInMb\":5039655555288828221,\"webWorkerResourceDiskSizeInMb\":5098089409961855245},{\"name\":\"boldforobwj\",\"cores\":998979559,\"dataDiskStorageTier\":\"bfhfovvacqp\",\"label\":\"uodxesza\",\"maxDataDiskCount\":7104035762189802588,\"memoryInMb\":741706840028604356,\"supportedByVirtualMachines\":false,\"supportedByWebWorkerRoles\":true,\"virtualMachineResourceDiskSizeInMb\":199833503819632386,\"webWorkerResourceDiskSizeInMb\":7026636829095827227}],\"billingResources\":[{\"region\":\"cqucwyhahnom\",\"billingMeters\":[],\"diskBillingMeters\":[]},{\"region\":\"hpsvfu\",\"billingMeters\":[],\"diskBillingMeters\":[]}]}";

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

        HDInsightManager manager =
            HDInsightManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        BillingResponseListResult response =
            manager.locations().listBillingSpecsWithResponse("tvtzeexavoxtfg", Context.NONE).getValue();

        Assertions.assertEquals("dmdqb", response.vmSizes().get(0));
        Assertions.assertEquals("pqtgsfjac", response.vmSizesWithEncryptionAtHost().get(0));
        Assertions.assertEquals(FilterMode.RECOMMEND, response.vmSizeFilters().get(0).filterMode());
        Assertions.assertEquals("db", response.vmSizeFilters().get(0).regions().get(0));
        Assertions.assertEquals("ud", response.vmSizeFilters().get(0).clusterFlavors().get(0));
        Assertions.assertEquals("cxfailcfxwmdboxd", response.vmSizeFilters().get(0).nodeTypes().get(0));
        Assertions.assertEquals("kqg", response.vmSizeFilters().get(0).clusterVersions().get(0));
        Assertions.assertEquals(OSType.LINUX, response.vmSizeFilters().get(0).osType().get(0));
        Assertions.assertEquals("svgjrwhryvy", response.vmSizeFilters().get(0).vmSizes().get(0));
        Assertions.assertEquals("t", response.vmSizeFilters().get(0).espApplied());
        Assertions.assertEquals("lxgccknfnwmbtm", response.vmSizeFilters().get(0).computeIsolationSupported());
        Assertions.assertEquals("cqucwyhahnom", response.billingResources().get(0).region());
    }
}
