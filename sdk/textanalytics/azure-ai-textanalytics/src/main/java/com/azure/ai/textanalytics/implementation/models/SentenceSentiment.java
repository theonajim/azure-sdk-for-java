// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SentenceSentiment model. */
@Fluent
public final class SentenceSentiment {
    /*
     * The sentence text.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * The predicted Sentiment for the sentence.
     */
    @JsonProperty(value = "sentiment", required = true)
    private SentenceSentimentValue sentiment;

    /*
     * The sentiment confidence score between 0 and 1 for the sentence for all classes.
     */
    @JsonProperty(value = "confidenceScores", required = true)
    private SentimentConfidenceScorePerLabel confidenceScores;

    /*
     * The sentence offset from the start of the document.
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * The length of the sentence.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /*
     * The array of sentence targets for the sentence.
     */
    @JsonProperty(value = "targets")
    private List<SentenceTarget> targets;

    /*
     * The array of assessments for the sentence.
     */
    @JsonProperty(value = "assessments")
    private List<SentenceAssessment> assessments;

    /**
     * Get the text property: The sentence text.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The sentence text.
     *
     * @param text the text value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the sentiment property: The predicted Sentiment for the sentence.
     *
     * @return the sentiment value.
     */
    public SentenceSentimentValue getSentiment() {
        return this.sentiment;
    }

    /**
     * Set the sentiment property: The predicted Sentiment for the sentence.
     *
     * @param sentiment the sentiment value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setSentiment(SentenceSentimentValue sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * Get the confidenceScores property: The sentiment confidence score between 0 and 1 for the sentence for all
     * classes.
     *
     * @return the confidenceScores value.
     */
    public SentimentConfidenceScorePerLabel getConfidenceScores() {
        return this.confidenceScores;
    }

    /**
     * Set the confidenceScores property: The sentiment confidence score between 0 and 1 for the sentence for all
     * classes.
     *
     * @param confidenceScores the confidenceScores value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setConfidenceScores(SentimentConfidenceScorePerLabel confidenceScores) {
        this.confidenceScores = confidenceScores;
        return this;
    }

    /**
     * Get the offset property: The sentence offset from the start of the document.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: The sentence offset from the start of the document.
     *
     * @param offset the offset value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: The length of the sentence.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: The length of the sentence.
     *
     * @param length the length value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Get the targets property: The array of sentence targets for the sentence.
     *
     * @return the targets value.
     */
    public List<SentenceTarget> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The array of sentence targets for the sentence.
     *
     * @param targets the targets value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setTargets(List<SentenceTarget> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Get the assessments property: The array of assessments for the sentence.
     *
     * @return the assessments value.
     */
    public List<SentenceAssessment> getAssessments() {
        return this.assessments;
    }

    /**
     * Set the assessments property: The array of assessments for the sentence.
     *
     * @param assessments the assessments value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setAssessments(List<SentenceAssessment> assessments) {
        this.assessments = assessments;
        return this;
    }
}
