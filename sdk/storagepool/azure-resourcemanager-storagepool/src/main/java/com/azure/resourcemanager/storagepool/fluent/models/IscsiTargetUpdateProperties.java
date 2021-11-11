// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagepool.models.Acl;
import com.azure.resourcemanager.storagepool.models.IscsiLun;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties for iSCSI Target update request. */
@Fluent
public final class IscsiTargetUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IscsiTargetUpdateProperties.class);

    /*
     * Access Control List (ACL) for an iSCSI Target; defines LUN masking
     * policy
     */
    @JsonProperty(value = "staticAcls")
    private List<Acl> staticAcls;

    /*
     * List of LUNs to be exposed through iSCSI Target.
     */
    @JsonProperty(value = "luns")
    private List<IscsiLun> luns;

    /**
     * Get the staticAcls property: Access Control List (ACL) for an iSCSI Target; defines LUN masking policy.
     *
     * @return the staticAcls value.
     */
    public List<Acl> staticAcls() {
        return this.staticAcls;
    }

    /**
     * Set the staticAcls property: Access Control List (ACL) for an iSCSI Target; defines LUN masking policy.
     *
     * @param staticAcls the staticAcls value to set.
     * @return the IscsiTargetUpdateProperties object itself.
     */
    public IscsiTargetUpdateProperties withStaticAcls(List<Acl> staticAcls) {
        this.staticAcls = staticAcls;
        return this;
    }

    /**
     * Get the luns property: List of LUNs to be exposed through iSCSI Target.
     *
     * @return the luns value.
     */
    public List<IscsiLun> luns() {
        return this.luns;
    }

    /**
     * Set the luns property: List of LUNs to be exposed through iSCSI Target.
     *
     * @param luns the luns value to set.
     * @return the IscsiTargetUpdateProperties object itself.
     */
    public IscsiTargetUpdateProperties withLuns(List<IscsiLun> luns) {
        this.luns = luns;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (staticAcls() != null) {
            staticAcls().forEach(e -> e.validate());
        }
        if (luns() != null) {
            luns().forEach(e -> e.validate());
        }
    }
}
