// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Supported parameters for an Extractive Summarization task. */
@Fluent
public final class ExtractiveSummarizationTaskParameters extends PreBuiltTaskParameters {
    /*
     * The sentenceCount property.
     */
    @JsonProperty(value = "sentenceCount")
    private Integer sentenceCount;

    /*
     * The sorting criteria to use for the results of Extractive Summarization.
     */
    @JsonProperty(value = "sortBy")
    private ExtractiveSummarizationSortingCriteria sortBy;

    /*
     * Specifies the method used to interpret string offsets.  Defaults to Text Elements (Graphemes) according to
     * Unicode v8.0.0. For additional information see https://aka.ms/text-analytics-offsets.
     */
    @JsonProperty(value = "stringIndexType")
    private StringIndexType stringIndexType;

    /**
     * Get the sentenceCount property: The sentenceCount property.
     *
     * @return the sentenceCount value.
     */
    public Integer getSentenceCount() {
        return this.sentenceCount;
    }

    /**
     * Set the sentenceCount property: The sentenceCount property.
     *
     * @param sentenceCount the sentenceCount value to set.
     * @return the ExtractiveSummarizationTaskParameters object itself.
     */
    public ExtractiveSummarizationTaskParameters setSentenceCount(Integer sentenceCount) {
        this.sentenceCount = sentenceCount;
        return this;
    }

    /**
     * Get the sortBy property: The sorting criteria to use for the results of Extractive Summarization.
     *
     * @return the sortBy value.
     */
    public ExtractiveSummarizationSortingCriteria getSortBy() {
        return this.sortBy;
    }

    /**
     * Set the sortBy property: The sorting criteria to use for the results of Extractive Summarization.
     *
     * @param sortBy the sortBy value to set.
     * @return the ExtractiveSummarizationTaskParameters object itself.
     */
    public ExtractiveSummarizationTaskParameters setSortBy(ExtractiveSummarizationSortingCriteria sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * Get the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the ExtractiveSummarizationTaskParameters object itself.
     */
    public ExtractiveSummarizationTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationTaskParameters setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }
}
