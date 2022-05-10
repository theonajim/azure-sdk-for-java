// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** plannerTaskDetails. */
@Fluent
public final class MicrosoftGraphPlannerTaskDetails extends MicrosoftGraphEntity {
    /*
     * plannerChecklistItems
     */
    @JsonProperty(value = "checklist")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> checklist;

    /*
     * Description of the task
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * plannerPreviewType
     */
    @JsonProperty(value = "previewType")
    private MicrosoftGraphPlannerPreviewType previewType;

    /*
     * plannerExternalReferences
     */
    @JsonProperty(value = "references")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> references;

    /*
     * plannerTaskDetails
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the checklist property: plannerChecklistItems.
     *
     * @return the checklist value.
     */
    public Map<String, Object> checklist() {
        return this.checklist;
    }

    /**
     * Set the checklist property: plannerChecklistItems.
     *
     * @param checklist the checklist value to set.
     * @return the MicrosoftGraphPlannerTaskDetails object itself.
     */
    public MicrosoftGraphPlannerTaskDetails withChecklist(Map<String, Object> checklist) {
        this.checklist = checklist;
        return this;
    }

    /**
     * Get the description property: Description of the task.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the task.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphPlannerTaskDetails object itself.
     */
    public MicrosoftGraphPlannerTaskDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the previewType property: plannerPreviewType.
     *
     * @return the previewType value.
     */
    public MicrosoftGraphPlannerPreviewType previewType() {
        return this.previewType;
    }

    /**
     * Set the previewType property: plannerPreviewType.
     *
     * @param previewType the previewType value to set.
     * @return the MicrosoftGraphPlannerTaskDetails object itself.
     */
    public MicrosoftGraphPlannerTaskDetails withPreviewType(MicrosoftGraphPlannerPreviewType previewType) {
        this.previewType = previewType;
        return this;
    }

    /**
     * Get the references property: plannerExternalReferences.
     *
     * @return the references value.
     */
    public Map<String, Object> references() {
        return this.references;
    }

    /**
     * Set the references property: plannerExternalReferences.
     *
     * @param references the references value to set.
     * @return the MicrosoftGraphPlannerTaskDetails object itself.
     */
    public MicrosoftGraphPlannerTaskDetails withReferences(Map<String, Object> references) {
        this.references = references;
        return this;
    }

    /**
     * Get the additionalProperties property: plannerTaskDetails.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: plannerTaskDetails.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPlannerTaskDetails object itself.
     */
    public MicrosoftGraphPlannerTaskDetails withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphPlannerTaskDetails withId(String id) {
        super.withId(id);
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
