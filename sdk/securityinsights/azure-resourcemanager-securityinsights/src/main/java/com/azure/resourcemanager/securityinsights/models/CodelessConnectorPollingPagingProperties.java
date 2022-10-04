// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describe the properties needed to make a pagination call. */
@Fluent
public final class CodelessConnectorPollingPagingProperties {
    /*
     * Describes the type. could be 'None', 'PageToken', 'PageCount', 'TimeStamp'
     */
    @JsonProperty(value = "pagingType", required = true)
    private String pagingType;

    /*
     * Defines the name of a next page attribute
     */
    @JsonProperty(value = "nextPageParaName")
    private String nextPageParaName;

    /*
     * Defines the path to a next page token JSON
     */
    @JsonProperty(value = "nextPageTokenJsonPath")
    private String nextPageTokenJsonPath;

    /*
     * Defines the path to a page count attribute
     */
    @JsonProperty(value = "pageCountAttributePath")
    private String pageCountAttributePath;

    /*
     * Defines the path to a page total count attribute
     */
    @JsonProperty(value = "pageTotalCountAttributePath")
    private String pageTotalCountAttributePath;

    /*
     * Defines the path to a paging time stamp attribute
     */
    @JsonProperty(value = "pageTimeStampAttributePath")
    private String pageTimestampAttributePath;

    /*
     * Determines whether to search for the latest time stamp in the events list
     */
    @JsonProperty(value = "searchTheLatestTimeStampFromEventsList")
    private String searchTheLatestTimestampFromEventsList;

    /*
     * Defines the name of the page size parameter
     */
    @JsonProperty(value = "pageSizeParaName")
    private String pageSizeParaName;

    /*
     * Defines the paging size
     */
    @JsonProperty(value = "pageSize")
    private Integer pageSize;

    /**
     * Get the pagingType property: Describes the type. could be 'None', 'PageToken', 'PageCount', 'TimeStamp'.
     *
     * @return the pagingType value.
     */
    public String pagingType() {
        return this.pagingType;
    }

    /**
     * Set the pagingType property: Describes the type. could be 'None', 'PageToken', 'PageCount', 'TimeStamp'.
     *
     * @param pagingType the pagingType value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withPagingType(String pagingType) {
        this.pagingType = pagingType;
        return this;
    }

    /**
     * Get the nextPageParaName property: Defines the name of a next page attribute.
     *
     * @return the nextPageParaName value.
     */
    public String nextPageParaName() {
        return this.nextPageParaName;
    }

    /**
     * Set the nextPageParaName property: Defines the name of a next page attribute.
     *
     * @param nextPageParaName the nextPageParaName value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withNextPageParaName(String nextPageParaName) {
        this.nextPageParaName = nextPageParaName;
        return this;
    }

    /**
     * Get the nextPageTokenJsonPath property: Defines the path to a next page token JSON.
     *
     * @return the nextPageTokenJsonPath value.
     */
    public String nextPageTokenJsonPath() {
        return this.nextPageTokenJsonPath;
    }

    /**
     * Set the nextPageTokenJsonPath property: Defines the path to a next page token JSON.
     *
     * @param nextPageTokenJsonPath the nextPageTokenJsonPath value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withNextPageTokenJsonPath(String nextPageTokenJsonPath) {
        this.nextPageTokenJsonPath = nextPageTokenJsonPath;
        return this;
    }

    /**
     * Get the pageCountAttributePath property: Defines the path to a page count attribute.
     *
     * @return the pageCountAttributePath value.
     */
    public String pageCountAttributePath() {
        return this.pageCountAttributePath;
    }

    /**
     * Set the pageCountAttributePath property: Defines the path to a page count attribute.
     *
     * @param pageCountAttributePath the pageCountAttributePath value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withPageCountAttributePath(String pageCountAttributePath) {
        this.pageCountAttributePath = pageCountAttributePath;
        return this;
    }

    /**
     * Get the pageTotalCountAttributePath property: Defines the path to a page total count attribute.
     *
     * @return the pageTotalCountAttributePath value.
     */
    public String pageTotalCountAttributePath() {
        return this.pageTotalCountAttributePath;
    }

    /**
     * Set the pageTotalCountAttributePath property: Defines the path to a page total count attribute.
     *
     * @param pageTotalCountAttributePath the pageTotalCountAttributePath value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withPageTotalCountAttributePath(
        String pageTotalCountAttributePath) {
        this.pageTotalCountAttributePath = pageTotalCountAttributePath;
        return this;
    }

    /**
     * Get the pageTimestampAttributePath property: Defines the path to a paging time stamp attribute.
     *
     * @return the pageTimestampAttributePath value.
     */
    public String pageTimestampAttributePath() {
        return this.pageTimestampAttributePath;
    }

    /**
     * Set the pageTimestampAttributePath property: Defines the path to a paging time stamp attribute.
     *
     * @param pageTimestampAttributePath the pageTimestampAttributePath value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withPageTimestampAttributePath(String pageTimestampAttributePath) {
        this.pageTimestampAttributePath = pageTimestampAttributePath;
        return this;
    }

    /**
     * Get the searchTheLatestTimestampFromEventsList property: Determines whether to search for the latest time stamp
     * in the events list.
     *
     * @return the searchTheLatestTimestampFromEventsList value.
     */
    public String searchTheLatestTimestampFromEventsList() {
        return this.searchTheLatestTimestampFromEventsList;
    }

    /**
     * Set the searchTheLatestTimestampFromEventsList property: Determines whether to search for the latest time stamp
     * in the events list.
     *
     * @param searchTheLatestTimestampFromEventsList the searchTheLatestTimestampFromEventsList value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withSearchTheLatestTimestampFromEventsList(
        String searchTheLatestTimestampFromEventsList) {
        this.searchTheLatestTimestampFromEventsList = searchTheLatestTimestampFromEventsList;
        return this;
    }

    /**
     * Get the pageSizeParaName property: Defines the name of the page size parameter.
     *
     * @return the pageSizeParaName value.
     */
    public String pageSizeParaName() {
        return this.pageSizeParaName;
    }

    /**
     * Set the pageSizeParaName property: Defines the name of the page size parameter.
     *
     * @param pageSizeParaName the pageSizeParaName value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withPageSizeParaName(String pageSizeParaName) {
        this.pageSizeParaName = pageSizeParaName;
        return this;
    }

    /**
     * Get the pageSize property: Defines the paging size.
     *
     * @return the pageSize value.
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set the pageSize property: Defines the paging size.
     *
     * @param pageSize the pageSize value to set.
     * @return the CodelessConnectorPollingPagingProperties object itself.
     */
    public CodelessConnectorPollingPagingProperties withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pagingType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property pagingType in model CodelessConnectorPollingPagingProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CodelessConnectorPollingPagingProperties.class);
}
