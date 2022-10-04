// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager;
import com.azure.resourcemanager.sqlvirtualmachine.models.BackupScheduleType;
import com.azure.resourcemanager.sqlvirtualmachine.models.DayOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.DiskConfigurationType;
import com.azure.resourcemanager.sqlvirtualmachine.models.FullBackupFrequencyType;
import com.azure.resourcemanager.sqlvirtualmachine.models.IdentityType;
import com.azure.resourcemanager.sqlvirtualmachine.models.LeastPrivilegeMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlManagementMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlServerLicenseType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachine;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageWorkloadType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SqlVirtualMachinesListBySqlVmGroupTests {
    @Test
    public void testListBySqlVmGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"identity\":{\"type\":\"SystemAssigned\"},\"properties\":{\"virtualMachineResourceId\":\"vkr\",\"provisioningState\":\"wbxqzvszjfau\",\"sqlImageOffer\":\"fdxxivetvtcqaqtd\",\"sqlServerLicenseType\":\"DR\",\"sqlManagement\":\"LightWeight\",\"leastPrivilegeMode\":\"Enabled\",\"sqlImageSku\":\"Developer\",\"sqlVirtualMachineGroupResourceId\":\"yslqbhsfx\",\"wsfcDomainCredentials\":{\"clusterBootstrapAccountPassword\":\"ytkblmpew\",\"clusterOperatorAccountPassword\":\"fbkrvrnsvs\",\"sqlServiceAccountPassword\":\"johxcrsb\"},\"wsfcStaticIp\":\"vasrruvwb\",\"autoPatchingSettings\":{\"enable\":true,\"dayOfWeek\":\"Thursday\",\"maintenanceWindowStartingHour\":213257698,\"maintenanceWindowDuration\":540005244},\"autoBackupSettings\":{\"enable\":false,\"enableEncryption\":true,\"retentionPeriod\":1282258802,\"storageAccountUrl\":\"srfbjfdtwss\",\"storageContainerName\":\"ftpvjzbexil\",\"storageAccessKey\":\"nfqqnvwp\",\"password\":\"taruoujmkcj\",\"backupSystemDbs\":true,\"backupScheduleType\":\"Automated\",\"fullBackupFrequency\":\"Daily\",\"daysOfWeek\":[],\"fullBackupStartTime\":151199466,\"fullBackupWindowHours\":395045632,\"logBackupFrequency\":1463995661},\"keyVaultCredentialSettings\":{\"enable\":false,\"credentialName\":\"ervnaenqpehi\",\"azureKeyVaultUrl\":\"oygmift\",\"servicePrincipalName\":\"zdnds\",\"servicePrincipalSecret\":\"nayqi\"},\"serverConfigurationsManagementSettings\":{},\"storageConfigurationSettings\":{\"sqlSystemDbOnDataDisk\":false,\"diskConfigurationType\":\"EXTEND\",\"storageWorkloadType\":\"DW\"},\"assessmentSettings\":{\"enable\":false,\"runImmediately\":false},\"enableAutomaticUpgrade\":true},\"location\":\"iertgccymvaolp\",\"tags\":{\"lzpswiydm\":\"qlfmmdnbb\",\"sadbz\":\"wyhzdx\"},\"id\":\"nvdfznuda\",\"name\":\"dvxzbncblylpst\",\"type\":\"bhhxsrzdzuc\"}]}";

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

        SqlVirtualMachineManager manager =
            SqlVirtualMachineManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SqlVirtualMachine> response =
            manager.sqlVirtualMachines().listBySqlVmGroup("nrmfqjhhk", "bpvjymjhx", Context.NONE);

        Assertions.assertEquals("iertgccymvaolp", response.iterator().next().location());
        Assertions.assertEquals("qlfmmdnbb", response.iterator().next().tags().get("lzpswiydm"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("vkr", response.iterator().next().virtualMachineResourceId());
        Assertions.assertEquals("fdxxivetvtcqaqtd", response.iterator().next().sqlImageOffer());
        Assertions.assertEquals(SqlServerLicenseType.DR, response.iterator().next().sqlServerLicenseType());
        Assertions.assertEquals(SqlManagementMode.LIGHT_WEIGHT, response.iterator().next().sqlManagement());
        Assertions.assertEquals(LeastPrivilegeMode.ENABLED, response.iterator().next().leastPrivilegeMode());
        Assertions.assertEquals(SqlImageSku.DEVELOPER, response.iterator().next().sqlImageSku());
        Assertions.assertEquals("yslqbhsfx", response.iterator().next().sqlVirtualMachineGroupResourceId());
        Assertions
            .assertEquals(
                "ytkblmpew", response.iterator().next().wsfcDomainCredentials().clusterBootstrapAccountPassword());
        Assertions
            .assertEquals(
                "fbkrvrnsvs", response.iterator().next().wsfcDomainCredentials().clusterOperatorAccountPassword());
        Assertions
            .assertEquals("johxcrsb", response.iterator().next().wsfcDomainCredentials().sqlServiceAccountPassword());
        Assertions.assertEquals("vasrruvwb", response.iterator().next().wsfcStaticIp());
        Assertions.assertEquals(true, response.iterator().next().autoPatchingSettings().enable());
        Assertions.assertEquals(DayOfWeek.THURSDAY, response.iterator().next().autoPatchingSettings().dayOfWeek());
        Assertions
            .assertEquals(213257698, response.iterator().next().autoPatchingSettings().maintenanceWindowStartingHour());
        Assertions
            .assertEquals(540005244, response.iterator().next().autoPatchingSettings().maintenanceWindowDuration());
        Assertions.assertEquals(false, response.iterator().next().autoBackupSettings().enable());
        Assertions.assertEquals(true, response.iterator().next().autoBackupSettings().enableEncryption());
        Assertions.assertEquals(1282258802, response.iterator().next().autoBackupSettings().retentionPeriod());
        Assertions.assertEquals("srfbjfdtwss", response.iterator().next().autoBackupSettings().storageAccountUrl());
        Assertions.assertEquals("ftpvjzbexil", response.iterator().next().autoBackupSettings().storageContainerName());
        Assertions.assertEquals("nfqqnvwp", response.iterator().next().autoBackupSettings().storageAccessKey());
        Assertions.assertEquals("taruoujmkcj", response.iterator().next().autoBackupSettings().password());
        Assertions.assertEquals(true, response.iterator().next().autoBackupSettings().backupSystemDbs());
        Assertions
            .assertEquals(
                BackupScheduleType.AUTOMATED, response.iterator().next().autoBackupSettings().backupScheduleType());
        Assertions
            .assertEquals(
                FullBackupFrequencyType.DAILY, response.iterator().next().autoBackupSettings().fullBackupFrequency());
        Assertions.assertEquals(151199466, response.iterator().next().autoBackupSettings().fullBackupStartTime());
        Assertions.assertEquals(395045632, response.iterator().next().autoBackupSettings().fullBackupWindowHours());
        Assertions.assertEquals(1463995661, response.iterator().next().autoBackupSettings().logBackupFrequency());
        Assertions.assertEquals(false, response.iterator().next().keyVaultCredentialSettings().enable());
        Assertions
            .assertEquals("ervnaenqpehi", response.iterator().next().keyVaultCredentialSettings().credentialName());
        Assertions.assertEquals("oygmift", response.iterator().next().keyVaultCredentialSettings().azureKeyVaultUrl());
        Assertions
            .assertEquals("zdnds", response.iterator().next().keyVaultCredentialSettings().servicePrincipalName());
        Assertions
            .assertEquals("nayqi", response.iterator().next().keyVaultCredentialSettings().servicePrincipalSecret());
        Assertions
            .assertEquals(false, response.iterator().next().storageConfigurationSettings().sqlSystemDbOnDataDisk());
        Assertions
            .assertEquals(
                DiskConfigurationType.EXTEND,
                response.iterator().next().storageConfigurationSettings().diskConfigurationType());
        Assertions
            .assertEquals(
                StorageWorkloadType.DW,
                response.iterator().next().storageConfigurationSettings().storageWorkloadType());
        Assertions.assertEquals(false, response.iterator().next().assessmentSettings().enable());
        Assertions.assertEquals(false, response.iterator().next().assessmentSettings().runImmediately());
        Assertions.assertEquals(true, response.iterator().next().enableAutomaticUpgrade());
    }
}
