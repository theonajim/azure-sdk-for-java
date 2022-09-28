// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineInner;
import com.azure.resourcemanager.sqlvirtualmachine.models.AssessmentSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoBackupDaysOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoBackupSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoPatchingSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.BackupScheduleType;
import com.azure.resourcemanager.sqlvirtualmachine.models.DayOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.DiskConfigurationType;
import com.azure.resourcemanager.sqlvirtualmachine.models.FullBackupFrequencyType;
import com.azure.resourcemanager.sqlvirtualmachine.models.IdentityType;
import com.azure.resourcemanager.sqlvirtualmachine.models.KeyVaultCredentialSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.LeastPrivilegeMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.ResourceIdentity;
import com.azure.resourcemanager.sqlvirtualmachine.models.ServerConfigurationsManagementSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlManagementMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlServerLicenseType;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageConfigurationSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageWorkloadType;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainCredentials;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlVirtualMachineInnerTests {
    @Test
    public void testDeserialize() {
        SqlVirtualMachineInner model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"type\":\"SystemAssigned\"},\"properties\":{\"virtualMachineResourceId\":\"scxaq\",\"provisioningState\":\"ochcbonqvpkvl\",\"sqlImageOffer\":\"njeaseipheofloke\",\"sqlServerLicenseType\":\"PAYG\",\"sqlManagement\":\"NoAgent\",\"leastPrivilegeMode\":\"Enabled\",\"sqlImageSku\":\"Express\",\"sqlVirtualMachineGroupResourceId\":\"tgrhpdjpjumas\",\"wsfcDomainCredentials\":{\"clusterBootstrapAccountPassword\":\"jpqyegu\",\"clusterOperatorAccountPassword\":\"hb\",\"sqlServiceAccountPassword\":\"hejjz\"},\"wsfcStaticIp\":\"dudgwdslfhot\",\"autoPatchingSettings\":{\"enable\":false,\"dayOfWeek\":\"Wednesday\",\"maintenanceWindowStartingHour\":1733107709,\"maintenanceWindowDuration\":991937495},\"autoBackupSettings\":{\"enable\":true,\"enableEncryption\":false,\"retentionPeriod\":1625524147,\"storageAccountUrl\":\"dehxnltyfsoppu\",\"storageContainerName\":\"esnzwde\",\"storageAccessKey\":\"avo\",\"password\":\"zdmohctbqvu\",\"backupSystemDbs\":false,\"backupScheduleType\":\"Manual\",\"fullBackupFrequency\":\"Weekly\",\"daysOfWeek\":[\"Sunday\",\"Saturday\",\"Friday\",\"Wednesday\"],\"fullBackupStartTime\":766815263,\"fullBackupWindowHours\":247911704,\"logBackupFrequency\":175400299},\"keyVaultCredentialSettings\":{\"enable\":true,\"credentialName\":\"slazjdyg\",\"azureKeyVaultUrl\":\"tjixhbkuofqweyk\",\"servicePrincipalName\":\"enevfyexfwhybci\",\"servicePrincipalSecret\":\"yvdcsitynnaa\"},\"serverConfigurationsManagementSettings\":{},\"storageConfigurationSettings\":{\"sqlSystemDbOnDataDisk\":false,\"diskConfigurationType\":\"NEW\",\"storageWorkloadType\":\"DW\"},\"assessmentSettings\":{\"enable\":true,\"runImmediately\":true},\"enableAutomaticUpgrade\":true},\"location\":\"jrefovgmkqsle\",\"tags\":{\"k\":\"xyqj\",\"jh\":\"attpngjcrcczsq\",\"ysou\":\"mdajv\",\"canoaeupf\":\"q\"},\"id\":\"yhltrpmopjmcm\",\"name\":\"tuo\",\"type\":\"thfuiuaodsfcpkvx\"}")
                .toObject(SqlVirtualMachineInner.class);
        Assertions.assertEquals("jrefovgmkqsle", model.location());
        Assertions.assertEquals("xyqj", model.tags().get("k"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("scxaq", model.virtualMachineResourceId());
        Assertions.assertEquals("njeaseipheofloke", model.sqlImageOffer());
        Assertions.assertEquals(SqlServerLicenseType.PAYG, model.sqlServerLicenseType());
        Assertions.assertEquals(SqlManagementMode.NO_AGENT, model.sqlManagement());
        Assertions.assertEquals(LeastPrivilegeMode.ENABLED, model.leastPrivilegeMode());
        Assertions.assertEquals(SqlImageSku.EXPRESS, model.sqlImageSku());
        Assertions.assertEquals("tgrhpdjpjumas", model.sqlVirtualMachineGroupResourceId());
        Assertions.assertEquals("jpqyegu", model.wsfcDomainCredentials().clusterBootstrapAccountPassword());
        Assertions.assertEquals("hb", model.wsfcDomainCredentials().clusterOperatorAccountPassword());
        Assertions.assertEquals("hejjz", model.wsfcDomainCredentials().sqlServiceAccountPassword());
        Assertions.assertEquals("dudgwdslfhot", model.wsfcStaticIp());
        Assertions.assertEquals(false, model.autoPatchingSettings().enable());
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.autoPatchingSettings().dayOfWeek());
        Assertions.assertEquals(1733107709, model.autoPatchingSettings().maintenanceWindowStartingHour());
        Assertions.assertEquals(991937495, model.autoPatchingSettings().maintenanceWindowDuration());
        Assertions.assertEquals(true, model.autoBackupSettings().enable());
        Assertions.assertEquals(false, model.autoBackupSettings().enableEncryption());
        Assertions.assertEquals(1625524147, model.autoBackupSettings().retentionPeriod());
        Assertions.assertEquals("dehxnltyfsoppu", model.autoBackupSettings().storageAccountUrl());
        Assertions.assertEquals("esnzwde", model.autoBackupSettings().storageContainerName());
        Assertions.assertEquals("avo", model.autoBackupSettings().storageAccessKey());
        Assertions.assertEquals("zdmohctbqvu", model.autoBackupSettings().password());
        Assertions.assertEquals(false, model.autoBackupSettings().backupSystemDbs());
        Assertions.assertEquals(BackupScheduleType.MANUAL, model.autoBackupSettings().backupScheduleType());
        Assertions.assertEquals(FullBackupFrequencyType.WEEKLY, model.autoBackupSettings().fullBackupFrequency());
        Assertions.assertEquals(AutoBackupDaysOfWeek.SUNDAY, model.autoBackupSettings().daysOfWeek().get(0));
        Assertions.assertEquals(766815263, model.autoBackupSettings().fullBackupStartTime());
        Assertions.assertEquals(247911704, model.autoBackupSettings().fullBackupWindowHours());
        Assertions.assertEquals(175400299, model.autoBackupSettings().logBackupFrequency());
        Assertions.assertEquals(true, model.keyVaultCredentialSettings().enable());
        Assertions.assertEquals("slazjdyg", model.keyVaultCredentialSettings().credentialName());
        Assertions.assertEquals("tjixhbkuofqweyk", model.keyVaultCredentialSettings().azureKeyVaultUrl());
        Assertions.assertEquals("enevfyexfwhybci", model.keyVaultCredentialSettings().servicePrincipalName());
        Assertions.assertEquals("yvdcsitynnaa", model.keyVaultCredentialSettings().servicePrincipalSecret());
        Assertions.assertEquals(false, model.storageConfigurationSettings().sqlSystemDbOnDataDisk());
        Assertions
            .assertEquals(DiskConfigurationType.NEW, model.storageConfigurationSettings().diskConfigurationType());
        Assertions.assertEquals(StorageWorkloadType.DW, model.storageConfigurationSettings().storageWorkloadType());
        Assertions.assertEquals(true, model.assessmentSettings().enable());
        Assertions.assertEquals(true, model.assessmentSettings().runImmediately());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
    }

    @Test
    public void testSerialize() {
        SqlVirtualMachineInner model =
            new SqlVirtualMachineInner()
                .withLocation("jrefovgmkqsle")
                .withTags(mapOf("k", "xyqj", "jh", "attpngjcrcczsq", "ysou", "mdajv", "canoaeupf", "q"))
                .withIdentity(new ResourceIdentity().withType(IdentityType.SYSTEM_ASSIGNED))
                .withVirtualMachineResourceId("scxaq")
                .withSqlImageOffer("njeaseipheofloke")
                .withSqlServerLicenseType(SqlServerLicenseType.PAYG)
                .withSqlManagement(SqlManagementMode.NO_AGENT)
                .withLeastPrivilegeMode(LeastPrivilegeMode.ENABLED)
                .withSqlImageSku(SqlImageSku.EXPRESS)
                .withSqlVirtualMachineGroupResourceId("tgrhpdjpjumas")
                .withWsfcDomainCredentials(
                    new WsfcDomainCredentials()
                        .withClusterBootstrapAccountPassword("jpqyegu")
                        .withClusterOperatorAccountPassword("hb")
                        .withSqlServiceAccountPassword("hejjz"))
                .withWsfcStaticIp("dudgwdslfhot")
                .withAutoPatchingSettings(
                    new AutoPatchingSettings()
                        .withEnable(false)
                        .withDayOfWeek(DayOfWeek.WEDNESDAY)
                        .withMaintenanceWindowStartingHour(1733107709)
                        .withMaintenanceWindowDuration(991937495))
                .withAutoBackupSettings(
                    new AutoBackupSettings()
                        .withEnable(true)
                        .withEnableEncryption(false)
                        .withRetentionPeriod(1625524147)
                        .withStorageAccountUrl("dehxnltyfsoppu")
                        .withStorageContainerName("esnzwde")
                        .withStorageAccessKey("avo")
                        .withPassword("zdmohctbqvu")
                        .withBackupSystemDbs(false)
                        .withBackupScheduleType(BackupScheduleType.MANUAL)
                        .withFullBackupFrequency(FullBackupFrequencyType.WEEKLY)
                        .withDaysOfWeek(
                            Arrays
                                .asList(
                                    AutoBackupDaysOfWeek.SUNDAY,
                                    AutoBackupDaysOfWeek.SATURDAY,
                                    AutoBackupDaysOfWeek.FRIDAY,
                                    AutoBackupDaysOfWeek.WEDNESDAY))
                        .withFullBackupStartTime(766815263)
                        .withFullBackupWindowHours(247911704)
                        .withLogBackupFrequency(175400299))
                .withKeyVaultCredentialSettings(
                    new KeyVaultCredentialSettings()
                        .withEnable(true)
                        .withCredentialName("slazjdyg")
                        .withAzureKeyVaultUrl("tjixhbkuofqweyk")
                        .withServicePrincipalName("enevfyexfwhybci")
                        .withServicePrincipalSecret("yvdcsitynnaa"))
                .withServerConfigurationsManagementSettings(new ServerConfigurationsManagementSettings())
                .withStorageConfigurationSettings(
                    new StorageConfigurationSettings()
                        .withSqlSystemDbOnDataDisk(false)
                        .withDiskConfigurationType(DiskConfigurationType.NEW)
                        .withStorageWorkloadType(StorageWorkloadType.DW))
                .withAssessmentSettings(new AssessmentSettings().withEnable(true).withRunImmediately(true))
                .withEnableAutomaticUpgrade(true);
        model = BinaryData.fromObject(model).toObject(SqlVirtualMachineInner.class);
        Assertions.assertEquals("jrefovgmkqsle", model.location());
        Assertions.assertEquals("xyqj", model.tags().get("k"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("scxaq", model.virtualMachineResourceId());
        Assertions.assertEquals("njeaseipheofloke", model.sqlImageOffer());
        Assertions.assertEquals(SqlServerLicenseType.PAYG, model.sqlServerLicenseType());
        Assertions.assertEquals(SqlManagementMode.NO_AGENT, model.sqlManagement());
        Assertions.assertEquals(LeastPrivilegeMode.ENABLED, model.leastPrivilegeMode());
        Assertions.assertEquals(SqlImageSku.EXPRESS, model.sqlImageSku());
        Assertions.assertEquals("tgrhpdjpjumas", model.sqlVirtualMachineGroupResourceId());
        Assertions.assertEquals("jpqyegu", model.wsfcDomainCredentials().clusterBootstrapAccountPassword());
        Assertions.assertEquals("hb", model.wsfcDomainCredentials().clusterOperatorAccountPassword());
        Assertions.assertEquals("hejjz", model.wsfcDomainCredentials().sqlServiceAccountPassword());
        Assertions.assertEquals("dudgwdslfhot", model.wsfcStaticIp());
        Assertions.assertEquals(false, model.autoPatchingSettings().enable());
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.autoPatchingSettings().dayOfWeek());
        Assertions.assertEquals(1733107709, model.autoPatchingSettings().maintenanceWindowStartingHour());
        Assertions.assertEquals(991937495, model.autoPatchingSettings().maintenanceWindowDuration());
        Assertions.assertEquals(true, model.autoBackupSettings().enable());
        Assertions.assertEquals(false, model.autoBackupSettings().enableEncryption());
        Assertions.assertEquals(1625524147, model.autoBackupSettings().retentionPeriod());
        Assertions.assertEquals("dehxnltyfsoppu", model.autoBackupSettings().storageAccountUrl());
        Assertions.assertEquals("esnzwde", model.autoBackupSettings().storageContainerName());
        Assertions.assertEquals("avo", model.autoBackupSettings().storageAccessKey());
        Assertions.assertEquals("zdmohctbqvu", model.autoBackupSettings().password());
        Assertions.assertEquals(false, model.autoBackupSettings().backupSystemDbs());
        Assertions.assertEquals(BackupScheduleType.MANUAL, model.autoBackupSettings().backupScheduleType());
        Assertions.assertEquals(FullBackupFrequencyType.WEEKLY, model.autoBackupSettings().fullBackupFrequency());
        Assertions.assertEquals(AutoBackupDaysOfWeek.SUNDAY, model.autoBackupSettings().daysOfWeek().get(0));
        Assertions.assertEquals(766815263, model.autoBackupSettings().fullBackupStartTime());
        Assertions.assertEquals(247911704, model.autoBackupSettings().fullBackupWindowHours());
        Assertions.assertEquals(175400299, model.autoBackupSettings().logBackupFrequency());
        Assertions.assertEquals(true, model.keyVaultCredentialSettings().enable());
        Assertions.assertEquals("slazjdyg", model.keyVaultCredentialSettings().credentialName());
        Assertions.assertEquals("tjixhbkuofqweyk", model.keyVaultCredentialSettings().azureKeyVaultUrl());
        Assertions.assertEquals("enevfyexfwhybci", model.keyVaultCredentialSettings().servicePrincipalName());
        Assertions.assertEquals("yvdcsitynnaa", model.keyVaultCredentialSettings().servicePrincipalSecret());
        Assertions.assertEquals(false, model.storageConfigurationSettings().sqlSystemDbOnDataDisk());
        Assertions
            .assertEquals(DiskConfigurationType.NEW, model.storageConfigurationSettings().diskConfigurationType());
        Assertions.assertEquals(StorageWorkloadType.DW, model.storageConfigurationSettings().storageWorkloadType());
        Assertions.assertEquals(true, model.assessmentSettings().enable());
        Assertions.assertEquals(true, model.assessmentSettings().runImmediately());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
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
