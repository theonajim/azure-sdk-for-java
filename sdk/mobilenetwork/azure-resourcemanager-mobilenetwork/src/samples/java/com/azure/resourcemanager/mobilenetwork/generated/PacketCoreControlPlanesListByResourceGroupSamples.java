// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for PacketCoreControlPlanes ListByResourceGroup. */
public final class PacketCoreControlPlanesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2022-11-01/examples/PacketCoreControlPlaneListByResourceGroup.json
     */
    /**
     * Sample code: List packet core control planes in resource group.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listPacketCoreControlPlanesInResourceGroup(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCoreControlPlanes().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
