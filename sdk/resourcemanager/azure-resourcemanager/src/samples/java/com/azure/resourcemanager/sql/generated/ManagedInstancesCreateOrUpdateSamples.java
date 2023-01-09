// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ManagedInstanceInner;
import com.azure.resourcemanager.sql.models.BackupStorageRedundancy;
import com.azure.resourcemanager.sql.models.ManagedInstanceExternalAdministrator;
import com.azure.resourcemanager.sql.models.ManagedInstanceLicenseType;
import com.azure.resourcemanager.sql.models.ManagedInstanceProxyOverride;
import com.azure.resourcemanager.sql.models.PrincipalType;
import com.azure.resourcemanager.sql.models.ServicePrincipal;
import com.azure.resourcemanager.sql.models.ServicePrincipalType;
import com.azure.resourcemanager.sql.models.Sku;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** Samples for ManagedInstances CreateOrUpdate. */
public final class ManagedInstancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceCreateMin.json
     */
    /**
     * Sample code: Create managed instance with minimal properties.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createManagedInstanceWithMinimalProperties(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstances()
            .createOrUpdate(
                "testrg",
                "testinstance",
                new ManagedInstanceInner()
                    .withLocation("Japan East")
                    .withSku(new Sku().withName("GP_Gen4").withTier("GeneralPurpose"))
                    .withAdministratorLogin("dummylogin")
                    .withAdministratorLoginPassword("PLACEHOLDER")
                    .withSubnetId(
                        "/subscriptions/20D7082A-0FC7-4468-82BD-542694D5042B/resourceGroups/testrg/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1")
                    .withLicenseType(ManagedInstanceLicenseType.LICENSE_INCLUDED)
                    .withVCores(8)
                    .withStorageSizeInGB(1024),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceCreateMax.json
     */
    /**
     * Sample code: Create managed instance with all properties.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createManagedInstanceWithAllProperties(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstances()
            .createOrUpdate(
                "testrg",
                "testinstance",
                new ManagedInstanceInner()
                    .withLocation("Japan East")
                    .withTags(mapOf("tagKey1", "TagValue1"))
                    .withSku(new Sku().withName("GP_Gen5").withTier("GeneralPurpose"))
                    .withAdministratorLogin("dummylogin")
                    .withAdministratorLoginPassword("PLACEHOLDER")
                    .withSubnetId(
                        "/subscriptions/20D7082A-0FC7-4468-82BD-542694D5042B/resourceGroups/testrg/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1")
                    .withLicenseType(ManagedInstanceLicenseType.LICENSE_INCLUDED)
                    .withVCores(8)
                    .withStorageSizeInGB(1024)
                    .withCollation("SQL_Latin1_General_CP1_CI_AS")
                    .withDnsZonePartner(
                        "/subscriptions/20D7082A-0FC7-4468-82BD-542694D5042B/resourceGroups/testrg/providers/Microsoft.Sql/managedInstances/testinstance")
                    .withPublicDataEndpointEnabled(false)
                    .withProxyOverride(ManagedInstanceProxyOverride.REDIRECT)
                    .withTimezoneId("UTC")
                    .withInstancePoolId(
                        "/subscriptions/20D7082A-0FC7-4468-82BD-542694D5042B/resourceGroups/testrg/providers/Microsoft.Sql/instancePools/pool1")
                    .withMaintenanceConfigurationId(
                        "/subscriptions/20D7082A-0FC7-4468-82BD-542694D5042B/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_JapanEast_MI_1")
                    .withMinimalTlsVersion("1.2")
                    .withRequestedBackupStorageRedundancy(BackupStorageRedundancy.GEO)
                    .withAdministrators(
                        new ManagedInstanceExternalAdministrator()
                            .withPrincipalType(PrincipalType.USER)
                            .withLogin("bob@contoso.com")
                            .withSid(UUID.fromString("00000011-1111-2222-2222-123456789111"))
                            .withTenantId(UUID.fromString("00000011-1111-2222-2222-123456789111"))
                            .withAzureADOnlyAuthentication(true))
                    .withServicePrincipal(new ServicePrincipal().withType(ServicePrincipalType.SYSTEM_ASSIGNED)),
                Context.NONE);
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
