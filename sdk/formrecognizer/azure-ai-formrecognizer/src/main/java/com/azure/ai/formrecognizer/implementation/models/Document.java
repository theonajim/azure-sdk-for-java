// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An object describing the location and semantic content of a document. */
@Fluent
public final class Document {
    /*
     * Document type.
     */
    @JsonProperty(value = "docType", required = true)
    private String docType;

    /*
     * Bounding regions covering the document.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the document in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /*
     * Dictionary of named field values.
     */
    @JsonProperty(value = "fields")
    private Map<String, DocumentField> fields;

    /*
     * Confidence of correctly extracting the document.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Get the docType property: Document type.
     *
     * @return the docType value.
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Set the docType property: Document type.
     *
     * @param docType the docType value to set.
     * @return the Document object itself.
     */
    public Document setDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the document.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the document.
     *
     * @param boundingRegions the boundingRegions value to set.
     * @return the Document object itself.
     */
    public Document setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the spans property: Location of the document in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the document in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the Document object itself.
     */
    public Document setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }

    /**
     * Get the fields property: Dictionary of named field values.
     *
     * @return the fields value.
     */
    public Map<String, DocumentField> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: Dictionary of named field values.
     *
     * @param fields the fields value to set.
     * @return the Document object itself.
     */
    public Document setFields(Map<String, DocumentField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the document.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence of correctly extracting the document.
     *
     * @param confidence the confidence value to set.
     * @return the Document object itself.
     */
    public Document setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }
}
