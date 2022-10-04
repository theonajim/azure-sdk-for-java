// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.ReportedSeverity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** IoT Security solution recommendation information. */
@Fluent
public final class IoTSecurityAggregatedRecommendationInner extends ProxyResource {
    /*
     * Security Solution data
     */
    @JsonProperty(value = "properties")
    private IoTSecurityAggregatedRecommendationProperties innerProperties;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: Security Solution data.
     *
     * @return the innerProperties value.
     */
    private IoTSecurityAggregatedRecommendationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the IoTSecurityAggregatedRecommendationInner object itself.
     */
    public IoTSecurityAggregatedRecommendationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the recommendationName property: Name of the recommendation.
     *
     * @return the recommendationName value.
     */
    public String recommendationName() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationName();
    }

    /**
     * Set the recommendationName property: Name of the recommendation.
     *
     * @param recommendationName the recommendationName value to set.
     * @return the IoTSecurityAggregatedRecommendationInner object itself.
     */
    public IoTSecurityAggregatedRecommendationInner withRecommendationName(String recommendationName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTSecurityAggregatedRecommendationProperties();
        }
        this.innerProperties().withRecommendationName(recommendationName);
        return this;
    }

    /**
     * Get the recommendationDisplayName property: Display name of the recommendation type.
     *
     * @return the recommendationDisplayName value.
     */
    public String recommendationDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationDisplayName();
    }

    /**
     * Get the description property: Description of the suspected vulnerability and meaning.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the recommendationTypeId property: Recommendation-type GUID.
     *
     * @return the recommendationTypeId value.
     */
    public String recommendationTypeId() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationTypeId();
    }

    /**
     * Get the detectedBy property: Name of the organization that made the recommendation.
     *
     * @return the detectedBy value.
     */
    public String detectedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().detectedBy();
    }

    /**
     * Get the remediationSteps property: Recommended steps for remediation.
     *
     * @return the remediationSteps value.
     */
    public String remediationSteps() {
        return this.innerProperties() == null ? null : this.innerProperties().remediationSteps();
    }

    /**
     * Get the reportedSeverity property: Assessed recommendation severity.
     *
     * @return the reportedSeverity value.
     */
    public ReportedSeverity reportedSeverity() {
        return this.innerProperties() == null ? null : this.innerProperties().reportedSeverity();
    }

    /**
     * Get the healthyDevices property: Number of healthy devices within the IoT Security solution.
     *
     * @return the healthyDevices value.
     */
    public Long healthyDevices() {
        return this.innerProperties() == null ? null : this.innerProperties().healthyDevices();
    }

    /**
     * Get the unhealthyDeviceCount property: Number of unhealthy devices within the IoT Security solution.
     *
     * @return the unhealthyDeviceCount value.
     */
    public Long unhealthyDeviceCount() {
        return this.innerProperties() == null ? null : this.innerProperties().unhealthyDeviceCount();
    }

    /**
     * Get the logAnalyticsQuery property: Log analytics query for getting the list of affected devices/alerts.
     *
     * @return the logAnalyticsQuery value.
     */
    public String logAnalyticsQuery() {
        return this.innerProperties() == null ? null : this.innerProperties().logAnalyticsQuery();
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
