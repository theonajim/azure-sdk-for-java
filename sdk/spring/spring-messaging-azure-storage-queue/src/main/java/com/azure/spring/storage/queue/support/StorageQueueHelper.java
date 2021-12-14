// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.storage.queue.support;

import com.azure.storage.queue.models.QueueMessageItem;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Helper class to process {@link QueueMessageItem}.
 */
public final class StorageQueueHelper {

    /**
     * Convert the {@link QueueMessageItem} to {@link String}.
     * @param messageItem the QueueMessageItem.
     * @return the String.
     */
    public static String toString(QueueMessageItem messageItem) {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("id", messageItem.getMessageId());
        map.put("body", messageItem.getMessageText());
        map.put("dequeueCount", messageItem.getDequeueCount());

        return map.toString();
    }
}
