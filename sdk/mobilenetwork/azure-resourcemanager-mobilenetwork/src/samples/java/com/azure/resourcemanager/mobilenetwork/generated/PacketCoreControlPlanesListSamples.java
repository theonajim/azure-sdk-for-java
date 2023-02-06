// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for PacketCoreControlPlanes List. */
public final class PacketCoreControlPlanesListSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2022-11-01/examples/PacketCoreControlPlaneListBySubscription.json
     */
    /**
     * Sample code: List packet core control planes in a subscription.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listPacketCoreControlPlanesInASubscription(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCoreControlPlanes().list(com.azure.core.util.Context.NONE);
    }
}
