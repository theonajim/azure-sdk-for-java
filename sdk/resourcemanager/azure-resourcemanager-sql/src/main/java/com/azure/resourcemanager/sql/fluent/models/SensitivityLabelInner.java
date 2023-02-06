// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.SensitivityLabelRank;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A sensitivity label. */
@Fluent
public final class SensitivityLabelInner extends ProxyResource {
    /*
     * Resource that manages the sensitivity label.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SensitivityLabelProperties innerProperties;

    /** Creates an instance of SensitivityLabelInner class. */
    public SensitivityLabelInner() {
    }

    /**
     * Get the managedBy property: Resource that manages the sensitivity label.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SensitivityLabelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the schemaName property: The schema name.
     *
     * @return the schemaName value.
     */
    public String schemaName() {
        return this.innerProperties() == null ? null : this.innerProperties().schemaName();
    }

    /**
     * Get the tableName property: The table name.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.innerProperties() == null ? null : this.innerProperties().tableName();
    }

    /**
     * Get the columnName property: The column name.
     *
     * @return the columnName value.
     */
    public String columnName() {
        return this.innerProperties() == null ? null : this.innerProperties().columnName();
    }

    /**
     * Get the labelName property: The label name.
     *
     * @return the labelName value.
     */
    public String labelName() {
        return this.innerProperties() == null ? null : this.innerProperties().labelName();
    }

    /**
     * Set the labelName property: The label name.
     *
     * @param labelName the labelName value to set.
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withLabelName(String labelName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelProperties();
        }
        this.innerProperties().withLabelName(labelName);
        return this;
    }

    /**
     * Get the labelId property: The label ID.
     *
     * @return the labelId value.
     */
    public String labelId() {
        return this.innerProperties() == null ? null : this.innerProperties().labelId();
    }

    /**
     * Set the labelId property: The label ID.
     *
     * @param labelId the labelId value to set.
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withLabelId(String labelId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelProperties();
        }
        this.innerProperties().withLabelId(labelId);
        return this;
    }

    /**
     * Get the informationType property: The information type.
     *
     * @return the informationType value.
     */
    public String informationType() {
        return this.innerProperties() == null ? null : this.innerProperties().informationType();
    }

    /**
     * Set the informationType property: The information type.
     *
     * @param informationType the informationType value to set.
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withInformationType(String informationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelProperties();
        }
        this.innerProperties().withInformationType(informationType);
        return this;
    }

    /**
     * Get the informationTypeId property: The information type ID.
     *
     * @return the informationTypeId value.
     */
    public String informationTypeId() {
        return this.innerProperties() == null ? null : this.innerProperties().informationTypeId();
    }

    /**
     * Set the informationTypeId property: The information type ID.
     *
     * @param informationTypeId the informationTypeId value to set.
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withInformationTypeId(String informationTypeId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelProperties();
        }
        this.innerProperties().withInformationTypeId(informationTypeId);
        return this;
    }

    /**
     * Get the isDisabled property: Is sensitivity recommendation disabled. Applicable for recommended sensitivity label
     * only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     *
     * @return the isDisabled value.
     */
    public Boolean isDisabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isDisabled();
    }

    /**
     * Get the rank property: The rank property.
     *
     * @return the rank value.
     */
    public SensitivityLabelRank rank() {
        return this.innerProperties() == null ? null : this.innerProperties().rank();
    }

    /**
     * Set the rank property: The rank property.
     *
     * @param rank the rank value to set.
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withRank(SensitivityLabelRank rank) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelProperties();
        }
        this.innerProperties().withRank(rank);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
