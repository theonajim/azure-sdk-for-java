// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.PirCommunityGalleryResource;

/** Specifies information about the Community Gallery that you want to create or update. */
@Fluent
public final class CommunityGalleryInner extends PirCommunityGalleryResource {
    /** Creates an instance of CommunityGalleryInner class. */
    public CommunityGalleryInner() {
    }

    /** {@inheritDoc} */
    @Override
    public CommunityGalleryInner withUniqueId(String uniqueId) {
        super.withUniqueId(uniqueId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
