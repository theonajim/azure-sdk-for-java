// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.fluent.models.GalleryInner;
import com.azure.resourcemanager.compute.models.CommunityGalleryInfo;
import com.azure.resourcemanager.compute.models.GallerySharingPermissionTypes;
import com.azure.resourcemanager.compute.models.SharingProfile;
import com.azure.resourcemanager.compute.models.SoftDeletePolicy;

/** Samples for Galleries CreateOrUpdate. */
public final class GalleriesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/galleryExamples/CommunityGallery_Create.json
     */
    /**
     * Sample code: Create a community gallery.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createACommunityGallery(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .createOrUpdate(
                "myResourceGroup",
                "myGalleryName",
                new GalleryInner()
                    .withLocation("West US")
                    .withDescription("This is the gallery description.")
                    .withSharingProfile(
                        new SharingProfile()
                            .withPermissions(GallerySharingPermissionTypes.COMMUNITY)
                            .withCommunityGalleryInfo(
                                new CommunityGalleryInfo()
                                    .withPublisherUri("uri")
                                    .withPublisherContact("pir@microsoft.com")
                                    .withEula("eula")
                                    .withPublicNamePrefix("PirPublic"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/galleryExamples/Gallery_Create_WithSharingProfile.json
     */
    /**
     * Sample code: Create or update a simple gallery with sharing profile.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateASimpleGalleryWithSharingProfile(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .createOrUpdate(
                "myResourceGroup",
                "myGalleryName",
                new GalleryInner()
                    .withLocation("West US")
                    .withDescription("This is the gallery description.")
                    .withSharingProfile(new SharingProfile().withPermissions(GallerySharingPermissionTypes.GROUPS)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/galleryExamples/Gallery_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateASimpleGallery(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .createOrUpdate(
                "myResourceGroup",
                "myGalleryName",
                new GalleryInner().withLocation("West US").withDescription("This is the gallery description."),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/galleryExamples/Gallery_Create_SoftDeletionEnabled.json
     */
    /**
     * Sample code: Create or update a simple gallery with soft deletion enabled.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateASimpleGalleryWithSoftDeletionEnabled(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .createOrUpdate(
                "myResourceGroup",
                "myGalleryName",
                new GalleryInner()
                    .withLocation("West US")
                    .withDescription("This is the gallery description.")
                    .withSoftDeletePolicy(new SoftDeletePolicy().withIsSoftDeleteEnabled(true)),
                com.azure.core.util.Context.NONE);
    }
}
