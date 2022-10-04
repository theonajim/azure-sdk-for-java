// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.InputFieldMappingEntry;
import com.azure.search.documents.indexes.models.OutputFieldMappingEntry;
import com.azure.search.documents.indexes.models.SearchIndexerSkill;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Using the Text Analytics API, extracts entities of different types from text. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Skills.Text.V3.EntityRecognitionSkill")
@Fluent
public final class EntityRecognitionSkillV3 extends SearchIndexerSkill {

    /*
     * Identifies the concrete type of the skill.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Skills.Text.V3.EntityRecognitionSkill";

    /*
     * A list of entity categories that should be extracted.
     */
    @JsonProperty(value = "categories")
    private List<String> categories;

    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private String defaultLanguageCode;

    /*
     * A value between 0 and 1 that be used to only include entities whose confidence score is greater than the value
     * specified. If not set (default), or if explicitly set to null, all entities will be included.
     */
    @JsonProperty(value = "minimumPrecision")
    private Double minimumPrecision;

    /*
     * The version of the model to use when calling the Text Analytics service. It will default to the latest available
     * when not specified. We recommend you do not specify this value unless absolutely necessary.
     */
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    /**
     * Creates an instance of EntityRecognitionSkillV3 class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public EntityRecognitionSkillV3(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the odataType property: Identifies the concrete type of the skill.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the categories property: A list of entity categories that should be extracted.
     *
     * @return the categories value.
     */
    public List<String> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: A list of entity categories that should be extracted.
     *
     * @param categories the categories value to set.
     * @return the EntityRecognitionSkillV3 object itself.
     */
    public EntityRecognitionSkillV3 setCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public String getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the EntityRecognitionSkillV3 object itself.
     */
    public EntityRecognitionSkillV3 setDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @return the minimumPrecision value.
     */
    public Double getMinimumPrecision() {
        return this.minimumPrecision;
    }

    /**
     * Set the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @param minimumPrecision the minimumPrecision value to set.
     * @return the EntityRecognitionSkillV3 object itself.
     */
    public EntityRecognitionSkillV3 setMinimumPrecision(Double minimumPrecision) {
        this.minimumPrecision = minimumPrecision;
        return this;
    }

    /**
     * Get the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the EntityRecognitionSkillV3 object itself.
     */
    public EntityRecognitionSkillV3 setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityRecognitionSkillV3 setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityRecognitionSkillV3 setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityRecognitionSkillV3 setContext(String context) {
        super.setContext(context);
        return this;
    }
}
