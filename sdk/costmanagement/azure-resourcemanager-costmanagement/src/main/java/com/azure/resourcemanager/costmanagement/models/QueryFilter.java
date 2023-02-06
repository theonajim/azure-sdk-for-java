// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The filter expression to be used in the export. */
@Fluent
public final class QueryFilter {
    /*
     * The logical "AND" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "and")
    private List<QueryFilter> and;

    /*
     * The logical "OR" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "or")
    private List<QueryFilter> or;

    /*
     * The logical "NOT" expression.
     */
    @JsonProperty(value = "not")
    private QueryFilter not;

    /*
     * Has comparison expression for a dimension
     */
    @JsonProperty(value = "dimension")
    private QueryComparisonExpression dimension;

    /*
     * Has comparison expression for a tag
     */
    @JsonProperty(value = "tag")
    private QueryComparisonExpression tag;

    /** Creates an instance of QueryFilter class. */
    public QueryFilter() {
    }

    /**
     * Get the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @return the and value.
     */
    public List<QueryFilter> and() {
        return this.and;
    }

    /**
     * Set the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @param and the and value to set.
     * @return the QueryFilter object itself.
     */
    public QueryFilter withAnd(List<QueryFilter> and) {
        this.and = and;
        return this;
    }

    /**
     * Get the or property: The logical "OR" expression. Must have at least 2 items.
     *
     * @return the or value.
     */
    public List<QueryFilter> or() {
        return this.or;
    }

    /**
     * Set the or property: The logical "OR" expression. Must have at least 2 items.
     *
     * @param or the or value to set.
     * @return the QueryFilter object itself.
     */
    public QueryFilter withOr(List<QueryFilter> or) {
        this.or = or;
        return this;
    }

    /**
     * Get the not property: The logical "NOT" expression.
     *
     * @return the not value.
     */
    public QueryFilter not() {
        return this.not;
    }

    /**
     * Set the not property: The logical "NOT" expression.
     *
     * @param not the not value to set.
     * @return the QueryFilter object itself.
     */
    public QueryFilter withNot(QueryFilter not) {
        this.not = not;
        return this;
    }

    /**
     * Get the dimension property: Has comparison expression for a dimension.
     *
     * @return the dimension value.
     */
    public QueryComparisonExpression dimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: Has comparison expression for a dimension.
     *
     * @param dimension the dimension value to set.
     * @return the QueryFilter object itself.
     */
    public QueryFilter withDimension(QueryComparisonExpression dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get the tag property: Has comparison expression for a tag.
     *
     * @return the tag value.
     */
    public QueryComparisonExpression tag() {
        return this.tag;
    }

    /**
     * Set the tag property: Has comparison expression for a tag.
     *
     * @param tag the tag value to set.
     * @return the QueryFilter object itself.
     */
    public QueryFilter withTag(QueryComparisonExpression tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (and() != null) {
            and().forEach(e -> e.validate());
        }
        if (or() != null) {
            or().forEach(e -> e.validate());
        }
        if (not() != null) {
            not().validate();
        }
        if (dimension() != null) {
            dimension().validate();
        }
        if (tag() != null) {
            tag().validate();
        }
    }
}
