// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** A listed Azure Storage handle item. */
@JacksonXmlRootElement(localName = "Handle")
@Fluent
public final class HandleItem {
    /*
     * XSMB service handle ID
     */
    @JsonProperty(value = "HandleId", required = true)
    private String handleId;

    /*
     * The Path property.
     */
    @JsonProperty(value = "Path", required = true)
    private StringEncoded path;

    /*
     * FileId uniquely identifies the file or directory.
     */
    @JsonProperty(value = "FileId", required = true)
    private String fileId;

    /*
     * ParentId uniquely identifies the parent directory of the object.
     */
    @JsonProperty(value = "ParentId")
    private String parentId;

    /*
     * SMB session ID in context of which the file handle was opened
     */
    @JsonProperty(value = "SessionId", required = true)
    private String sessionId;

    /*
     * Client IP that opened the handle
     */
    @JsonProperty(value = "ClientIp", required = true)
    private String clientIp;

    /*
     * Time when the session that previously opened the handle has last been reconnected. (UTC)
     */
    @JsonProperty(value = "OpenTime", required = true)
    private DateTimeRfc1123 openTime;

    /*
     * Time handle was last connected to (UTC)
     */
    @JsonProperty(value = "LastReconnectTime")
    private DateTimeRfc1123 lastReconnectTime;

    /** Creates an instance of HandleItem class. */
    public HandleItem() {}

    /**
     * Get the handleId property: XSMB service handle ID.
     *
     * @return the handleId value.
     */
    public String getHandleId() {
        return this.handleId;
    }

    /**
     * Set the handleId property: XSMB service handle ID.
     *
     * @param handleId the handleId value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setHandleId(String handleId) {
        this.handleId = handleId;
        return this;
    }

    /**
     * Get the path property: The Path property.
     *
     * @return the path value.
     */
    public StringEncoded getPath() {
        return this.path;
    }

    /**
     * Set the path property: The Path property.
     *
     * @param path the path value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setPath(StringEncoded path) {
        this.path = path;
        return this;
    }

    /**
     * Get the fileId property: FileId uniquely identifies the file or directory.
     *
     * @return the fileId value.
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: FileId uniquely identifies the file or directory.
     *
     * @param fileId the fileId value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the parentId property: ParentId uniquely identifies the parent directory of the object.
     *
     * @return the parentId value.
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Set the parentId property: ParentId uniquely identifies the parent directory of the object.
     *
     * @param parentId the parentId value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get the sessionId property: SMB session ID in context of which the file handle was opened.
     *
     * @return the sessionId value.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: SMB session ID in context of which the file handle was opened.
     *
     * @param sessionId the sessionId value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the clientIp property: Client IP that opened the handle.
     *
     * @return the clientIp value.
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * Set the clientIp property: Client IP that opened the handle.
     *
     * @param clientIp the clientIp value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * Get the openTime property: Time when the session that previously opened the handle has last been reconnected.
     * (UTC).
     *
     * @return the openTime value.
     */
    public OffsetDateTime getOpenTime() {
        if (this.openTime == null) {
            return null;
        }
        return this.openTime.getDateTime();
    }

    /**
     * Set the openTime property: Time when the session that previously opened the handle has last been reconnected.
     * (UTC).
     *
     * @param openTime the openTime value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setOpenTime(OffsetDateTime openTime) {
        if (openTime == null) {
            this.openTime = null;
        } else {
            this.openTime = new DateTimeRfc1123(openTime);
        }
        return this;
    }

    /**
     * Get the lastReconnectTime property: Time handle was last connected to (UTC).
     *
     * @return the lastReconnectTime value.
     */
    public OffsetDateTime getLastReconnectTime() {
        if (this.lastReconnectTime == null) {
            return null;
        }
        return this.lastReconnectTime.getDateTime();
    }

    /**
     * Set the lastReconnectTime property: Time handle was last connected to (UTC).
     *
     * @param lastReconnectTime the lastReconnectTime value to set.
     * @return the HandleItem object itself.
     */
    public HandleItem setLastReconnectTime(OffsetDateTime lastReconnectTime) {
        if (lastReconnectTime == null) {
            this.lastReconnectTime = null;
        } else {
            this.lastReconnectTime = new DateTimeRfc1123(lastReconnectTime);
        }
        return this;
    }
}
