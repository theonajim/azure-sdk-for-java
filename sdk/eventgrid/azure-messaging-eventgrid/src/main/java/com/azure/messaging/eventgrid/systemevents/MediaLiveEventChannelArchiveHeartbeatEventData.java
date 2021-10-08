// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel Archive heartbeat event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.LiveEventChannelArchiveHeartbeat event.
 */
@Immutable
public final class MediaLiveEventChannelArchiveHeartbeatEventData {
    /*
     * Gets the channel latency in ms.
     */
    @JsonProperty(value = "channelLatencyMs", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String channelLatencyMs;

    /*
     * Gets the latency result code.
     */
    @JsonProperty(value = "latencyResultCode", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String latencyResultCode;

    /**
     * Get the channelLatencyMs property: Gets the channel latency in ms.
     *
     * @return the channelLatencyMs value.
     */
    public String getChannelLatencyMs() {
        return this.channelLatencyMs;
    }

    /**
     * Get the latencyResultCode property: Gets the latency result code.
     *
     * @return the latencyResultCode value.
     */
    public String getLatencyResultCode() {
        return this.latencyResultCode;
    }
}
