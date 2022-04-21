// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.OperationStatus;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MySQL migration status. */
@Fluent
public final class MigrateMySqlStatusInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateMySqlStatusInner.class);

    /*
     * MigrateMySqlStatus resource specific properties
     */
    @JsonProperty(value = "properties")
    private MigrateMySqlStatusProperties innerProperties;

    /**
     * Get the innerProperties property: MigrateMySqlStatus resource specific properties.
     *
     * @return the innerProperties value.
     */
    private MigrateMySqlStatusProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MigrateMySqlStatusInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the migrationOperationStatus property: Status of the migration task.
     *
     * @return the migrationOperationStatus value.
     */
    public OperationStatus migrationOperationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationOperationStatus();
    }

    /**
     * Get the operationId property: Operation ID for the migration task.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.innerProperties() == null ? null : this.innerProperties().operationId();
    }

    /**
     * Get the localMySqlEnabled property: True if the web app has in app MySql enabled.
     *
     * @return the localMySqlEnabled value.
     */
    public Boolean localMySqlEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().localMySqlEnabled();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
