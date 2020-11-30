/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.ReplicationLink;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ReplicationRole;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ReplicationState;
import org.joda.time.DateTime;

class ReplicationLinkImpl extends IndexableRefreshableWrapperImpl<ReplicationLink, ReplicationLinkInner> implements ReplicationLink {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String sqlPoolName;
    private String linkId;

    ReplicationLinkImpl(ReplicationLinkInner inner,  SynapseManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.sqlPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlPools");
        this.linkId = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationLinks");
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ReplicationLinkInner> getInnerAsync() {
        SqlPoolReplicationLinksInner client = this.manager().inner().sqlPoolReplicationLinks();
        return client.getByNameAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.linkId);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isTerminationAllowed() {
        return this.inner().isTerminationAllowed();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String partnerDatabase() {
        return this.inner().partnerDatabase();
    }

    @Override
    public String partnerLocation() {
        return this.inner().partnerLocation();
    }

    @Override
    public ReplicationRole partnerRole() {
        return this.inner().partnerRole();
    }

    @Override
    public String partnerServer() {
        return this.inner().partnerServer();
    }

    @Override
    public Integer percentComplete() {
        return this.inner().percentComplete();
    }

    @Override
    public String replicationMode() {
        return this.inner().replicationMode();
    }

    @Override
    public ReplicationState replicationState() {
        return this.inner().replicationState();
    }

    @Override
    public ReplicationRole role() {
        return this.inner().role();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
