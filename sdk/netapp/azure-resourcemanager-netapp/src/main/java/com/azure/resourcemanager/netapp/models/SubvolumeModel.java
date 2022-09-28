// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SubvolumeModel. */
public interface SubvolumeModel {
    /**
     * Gets the id property: Resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the path property: path
     *
     * <p>Path to the subvolume.
     *
     * @return the path value.
     */
    String path();

    /**
     * Gets the parentPath property: parentpath
     *
     * <p>Path to the parent subvolume.
     *
     * @return the parentPath value.
     */
    String parentPath();

    /**
     * Gets the size property: size
     *
     * <p>Size of subvolume.
     *
     * @return the size value.
     */
    Long size();

    /**
     * Gets the bytesUsed property: bytesUsed
     *
     * <p>Bytes used.
     *
     * @return the bytesUsed value.
     */
    Long bytesUsed();

    /**
     * Gets the permissions property: permissions
     *
     * <p>Permissions of the subvolume.
     *
     * @return the permissions value.
     */
    String permissions();

    /**
     * Gets the creationTimestamp property: creationTimeStamp
     *
     * <p>Creation time and date.
     *
     * @return the creationTimestamp value.
     */
    OffsetDateTime creationTimestamp();

    /**
     * Gets the accessedTimestamp property: accessedTimeStamp
     *
     * <p>Most recent access time and date.
     *
     * @return the accessedTimestamp value.
     */
    OffsetDateTime accessedTimestamp();

    /**
     * Gets the modifiedTimestamp property: modifiedTimeStamp
     *
     * <p>Most recent modification time and date.
     *
     * @return the modifiedTimestamp value.
     */
    OffsetDateTime modifiedTimestamp();

    /**
     * Gets the changedTimestamp property: changedTimeStamp
     *
     * <p>Most recent change time and date.
     *
     * @return the changedTimestamp value.
     */
    OffsetDateTime changedTimestamp();

    /**
     * Gets the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelInner object.
     *
     * @return the inner object.
     */
    SubvolumeModelInner innerModel();
}
