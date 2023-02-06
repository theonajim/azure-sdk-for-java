// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.resourcemanager.mediaservices.models.IpAccessControl;
import com.azure.resourcemanager.mediaservices.models.IpRange;
import com.azure.resourcemanager.mediaservices.models.LiveEvent;
import com.azure.resourcemanager.mediaservices.models.LiveEventInput;
import com.azure.resourcemanager.mediaservices.models.LiveEventInputAccessControl;
import com.azure.resourcemanager.mediaservices.models.LiveEventInputProtocol;
import com.azure.resourcemanager.mediaservices.models.LiveEventPreview;
import com.azure.resourcemanager.mediaservices.models.LiveEventPreviewAccessControl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for LiveEvents Update. */
public final class LiveEventsUpdateSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Streaming/stable/2022-08-01/examples/liveevent-update.json
     */
    /**
     * Sample code: Update a LiveEvent.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void updateALiveEvent(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        LiveEvent resource =
            manager
                .liveEvents()
                .getWithResponse("mediaresources", "slitestmedia10", "myLiveEvent1", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3"))
            .withDescription("test event updated")
            .withInput(
                new LiveEventInput()
                    .withStreamingProtocol(LiveEventInputProtocol.FRAGMENTED_MP4)
                    .withAccessControl(
                        new LiveEventInputAccessControl()
                            .withIp(
                                new IpAccessControl()
                                    .withAllow(
                                        Arrays.asList(new IpRange().withName("AllowOne").withAddress("192.1.1.0")))))
                    .withKeyFrameIntervalDuration("fakeTokenPlaceholder"))
            .withPreview(
                new LiveEventPreview()
                    .withAccessControl(
                        new LiveEventPreviewAccessControl()
                            .withIp(
                                new IpAccessControl()
                                    .withAllow(
                                        Arrays.asList(new IpRange().withName("AllowOne").withAddress("192.1.1.0"))))))
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
