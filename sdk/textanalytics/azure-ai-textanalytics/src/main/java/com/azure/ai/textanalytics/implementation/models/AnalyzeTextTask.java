// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The AnalyzeTextTask model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = AnalyzeTextTask.class)
@JsonTypeName("AnalyzeTextTask")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "EntityLinking", value = AnalyzeTextEntityLinkingInput.class),
    @JsonSubTypes.Type(name = "EntityRecognition", value = AnalyzeTextEntityRecognitionInput.class),
    @JsonSubTypes.Type(name = "KeyPhraseExtraction", value = AnalyzeTextKeyPhraseExtractionInput.class),
    @JsonSubTypes.Type(name = "PiiEntityRecognition", value = AnalyzeTextPiiEntitiesRecognitionInput.class),
    @JsonSubTypes.Type(name = "LanguageDetection", value = AnalyzeTextLanguageDetectionInput.class),
    @JsonSubTypes.Type(name = "SentimentAnalysis", value = AnalyzeTextSentimentAnalysisInput.class),
    @JsonSubTypes.Type(name = "DynamicClassification", value = AnalyzeTextDynamicClassificationInput.class)
})
@Immutable
public class AnalyzeTextTask {
    /** Creates an instance of AnalyzeTextTask class. */
    public AnalyzeTextTask() {}
}
