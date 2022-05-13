// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DocumentSentiment model. */
@Fluent
public final class DocumentSentiment {
    /*
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Predicted sentiment for document (Negative, Neutral, Positive, or
     * Mixed).
     */
    @JsonProperty(value = "sentiment", required = true)
    private DocumentSentimentValue sentiment;

    /*
     * if showStats=true was specified in the request this field will contain
     * information about the document payload.
     */
    @JsonProperty(value = "statistics")
    private DocumentStatistics statistics;

    /*
     * Document level sentiment confidence scores between 0 and 1 for each
     * sentiment class.
     */
    @JsonProperty(value = "confidenceScores", required = true)
    private SentimentConfidenceScorePerLabel confidenceScores;

    /*
     * Sentence level sentiment analysis.
     */
    @JsonProperty(value = "sentences", required = true)
    private List<SentenceSentiment> sentences;

    /*
     * Warnings encountered while processing document.
     */
    @JsonProperty(value = "warnings", required = true)
    private List<DocumentWarning> warnings;

    /**
     * Get the id property: Unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique, non-empty document identifier.
     *
     * @param id the id value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the sentiment property: Predicted sentiment for document (Negative, Neutral, Positive, or Mixed).
     *
     * @return the sentiment value.
     */
    public DocumentSentimentValue getSentiment() {
        return this.sentiment;
    }

    /**
     * Set the sentiment property: Predicted sentiment for document (Negative, Neutral, Positive, or Mixed).
     *
     * @param sentiment the sentiment value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setSentiment(DocumentSentimentValue sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the request this field will contain information
     * about the document payload.
     *
     * @return the statistics value.
     */
    public DocumentStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the request this field will contain information
     * about the document payload.
     *
     * @param statistics the statistics value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setStatistics(DocumentStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the confidenceScores property: Document level sentiment confidence scores between 0 and 1 for each sentiment
     * class.
     *
     * @return the confidenceScores value.
     */
    public SentimentConfidenceScorePerLabel getConfidenceScores() {
        return this.confidenceScores;
    }

    /**
     * Set the confidenceScores property: Document level sentiment confidence scores between 0 and 1 for each sentiment
     * class.
     *
     * @param confidenceScores the confidenceScores value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setConfidenceScores(SentimentConfidenceScorePerLabel confidenceScores) {
        this.confidenceScores = confidenceScores;
        return this;
    }

    /**
     * Get the sentences property: Sentence level sentiment analysis.
     *
     * @return the sentences value.
     */
    public List<SentenceSentiment> getSentences() {
        return this.sentences;
    }

    /**
     * Set the sentences property: Sentence level sentiment analysis.
     *
     * @param sentences the sentences value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setSentences(List<SentenceSentiment> sentences) {
        this.sentences = sentences;
        return this;
    }

    /**
     * Get the warnings property: Warnings encountered while processing document.
     *
     * @return the warnings value.
     */
    public List<DocumentWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Set the warnings property: Warnings encountered while processing document.
     *
     * @param warnings the warnings value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setWarnings(List<DocumentWarning> warnings) {
        this.warnings = warnings;
        return this;
    }
}
