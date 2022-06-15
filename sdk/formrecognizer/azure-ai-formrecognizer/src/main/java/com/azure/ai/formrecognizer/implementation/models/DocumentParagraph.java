// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paragraph object consisting with contiguous lines generally with common alignment and spacing. */
@Fluent
public final class DocumentParagraph {
    /*
     * Semantic role of the paragraph.
     */
    @JsonProperty(value = "role")
    private ParagraphRole role;

    /*
     * Concatenated content of the paragraph in reading order.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Bounding regions covering the paragraph.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the paragraph in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /**
     * Get the role property: Semantic role of the paragraph.
     *
     * @return the role value.
     */
    public ParagraphRole getRole() {
        return this.role;
    }

    /**
     * Set the role property: Semantic role of the paragraph.
     *
     * @param role the role value to set.
     * @return the DocumentParagraph object itself.
     */
    public DocumentParagraph setRole(ParagraphRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the content property: Concatenated content of the paragraph in reading order.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Concatenated content of the paragraph in reading order.
     *
     * @param content the content value to set.
     * @return the DocumentParagraph object itself.
     */
    public DocumentParagraph setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the paragraph.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the paragraph.
     *
     * @param boundingRegions the boundingRegions value to set.
     * @return the DocumentParagraph object itself.
     */
    public DocumentParagraph setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the spans property: Location of the paragraph in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the paragraph in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the DocumentParagraph object itself.
     */
    public DocumentParagraph setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }
}
