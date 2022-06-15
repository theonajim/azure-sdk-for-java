// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The PathsCreateHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class PathsCreateHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The Content-Length property.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The x-ms-encryption-key-sha256 property.
     */
    @JsonProperty(value = "x-ms-encryption-key-sha256")
    private String xMsEncryptionKeySha256;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-continuation property.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String xMsContinuation;

    /*
     * The x-ms-request-server-encrypted property.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean xMsRequestServerEncrypted;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of PathsCreateHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public PathsCreateHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.eTag = rawHeaders.getValue("ETag");
        if (rawHeaders.getValue("Last-Modified") != null) {
            this.lastModified = new DateTimeRfc1123(rawHeaders.getValue("Last-Modified"));
        }
        if (rawHeaders.getValue("Content-Length") != null) {
            this.contentLength = Long.parseLong(rawHeaders.getValue("Content-Length"));
        }
        this.xMsEncryptionKeySha256 = rawHeaders.getValue("x-ms-encryption-key-sha256");
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        this.xMsContinuation = rawHeaders.getValue("x-ms-continuation");
        if (rawHeaders.getValue("x-ms-request-server-encrypted") != null) {
            this.xMsRequestServerEncrypted = Boolean.parseBoolean(rawHeaders.getValue("x-ms-request-server-encrypted"));
        }
        if (rawHeaders.getValue("Date") != null) {
            this.dateProperty = new DateTimeRfc1123(rawHeaders.getValue("Date"));
        }
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     *
     * @param contentLength the contentLength value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @return the xMsEncryptionKeySha256 value.
     */
    public String getXMsEncryptionKeySha256() {
        return this.xMsEncryptionKeySha256;
    }

    /**
     * Set the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @param xMsEncryptionKeySha256 the xMsEncryptionKeySha256 value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setXMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsContinuation property: The x-ms-continuation property.
     *
     * @return the xMsContinuation value.
     */
    public String getXMsContinuation() {
        return this.xMsContinuation;
    }

    /**
     * Set the xMsContinuation property: The x-ms-continuation property.
     *
     * @param xMsContinuation the xMsContinuation value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setXMsContinuation(String xMsContinuation) {
        this.xMsContinuation = xMsContinuation;
        return this;
    }

    /**
     * Get the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @return the xMsRequestServerEncrypted value.
     */
    public Boolean isXMsRequestServerEncrypted() {
        return this.xMsRequestServerEncrypted;
    }

    /**
     * Set the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @param xMsRequestServerEncrypted the xMsRequestServerEncrypted value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PathsCreateHeaders object itself.
     */
    public PathsCreateHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
