// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.implementation;

import com.azure.resourcemanager.advisor.fluent.models.ResourceRecommendationBaseInner;
import com.azure.resourcemanager.advisor.models.Category;
import com.azure.resourcemanager.advisor.models.Impact;
import com.azure.resourcemanager.advisor.models.ResourceMetadata;
import com.azure.resourcemanager.advisor.models.ResourceRecommendationBase;
import com.azure.resourcemanager.advisor.models.ShortDescription;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class ResourceRecommendationBaseImpl implements ResourceRecommendationBase {
    private ResourceRecommendationBaseInner innerObject;

    private final com.azure.resourcemanager.advisor.AdvisorManager serviceManager;

    ResourceRecommendationBaseImpl(
        ResourceRecommendationBaseInner innerObject, com.azure.resourcemanager.advisor.AdvisorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Category category() {
        return this.innerModel().category();
    }

    public Impact impact() {
        return this.innerModel().impact();
    }

    public String impactedField() {
        return this.innerModel().impactedField();
    }

    public String impactedValue() {
        return this.innerModel().impactedValue();
    }

    public OffsetDateTime lastUpdated() {
        return this.innerModel().lastUpdated();
    }

    public Map<String, Object> metadata() {
        Map<String, Object> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String recommendationTypeId() {
        return this.innerModel().recommendationTypeId();
    }

    public ShortDescription shortDescription() {
        return this.innerModel().shortDescription();
    }

    public List<UUID> suppressionIds() {
        List<UUID> inner = this.innerModel().suppressionIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, String> extendedProperties() {
        Map<String, String> inner = this.innerModel().extendedProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceMetadata resourceMetadata() {
        return this.innerModel().resourceMetadata();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String label() {
        return this.innerModel().label();
    }

    public String learnMoreLink() {
        return this.innerModel().learnMoreLink();
    }

    public String potentialBenefits() {
        return this.innerModel().potentialBenefits();
    }

    public List<Map<String, Object>> actions() {
        List<Map<String, Object>> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, Object> remediation() {
        Map<String, Object> inner = this.innerModel().remediation();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, Object> exposedMetadataProperties() {
        Map<String, Object> inner = this.innerModel().exposedMetadataProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceRecommendationBaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.advisor.AdvisorManager manager() {
        return this.serviceManager;
    }
}
