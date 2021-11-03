// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.eventhubs.checkpoint;

import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.models.EventContext;
import com.azure.spring.messaging.checkpoint.CheckpointConfig;
import com.azure.spring.messaging.checkpoint.CheckpointMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Do checkpoint when uncheckpointed count exceeds {@link CheckpointConfig#getCount()} ()} for one partition.
 * Effective when {@link CheckpointMode#PARTITION_COUNT}
 *
 * @author Warren Zhu
 */
class PartitionCountCheckpointManager extends CheckpointManager {
    private static final Logger LOG = LoggerFactory.getLogger(PartitionCountCheckpointManager.class);
    private final ConcurrentHashMap<String, AtomicInteger> countByPartition = new ConcurrentHashMap<>();

    PartitionCountCheckpointManager(CheckpointConfig checkpointConfig) {
        super(checkpointConfig);
        Assert.isTrue(this.checkpointConfig.getMode() == CheckpointMode.PARTITION_COUNT,
            () -> "PartitionCountCheckpointManager should have checkpointMode partition_count");
    }

    public void onMessage(EventContext context, EventData eventData) {
        String partitionId = context.getPartitionContext().getPartitionId();
        this.countByPartition.computeIfAbsent(partitionId, (k) -> new AtomicInteger(0));
        AtomicInteger count = this.countByPartition.get(partitionId);
        if (count.incrementAndGet() >= checkpointConfig.getCount()) {
            context.updateCheckpointAsync()
                .doOnError(t -> logCheckpointFail(context, eventData, t))
                .doOnSuccess(v -> {
                    logCheckpointSuccess(context, eventData);
                    count.set(0);
                })
                .subscribe();
        }
    }

    @Override
    protected Logger getLogger() {
        return LOG;
    }
}
