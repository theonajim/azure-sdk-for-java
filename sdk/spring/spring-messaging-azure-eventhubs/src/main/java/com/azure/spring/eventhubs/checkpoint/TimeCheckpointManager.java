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

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Do checkpoint when the time since last successful checkpoint exceeds {@link CheckpointConfig#getInterval()} ()}
 * for one partition. Effective when {@link CheckpointMode#PARTITION_COUNT}
 *
 * @author Warren Zhu
 */
class TimeCheckpointManager extends CheckpointManager {
    private static final Logger LOG = LoggerFactory.getLogger(TimeCheckpointManager.class);
    private final AtomicReference<LocalDateTime> lastCheckpointTime = new AtomicReference<>(LocalDateTime.now());

    TimeCheckpointManager(CheckpointConfig checkpointConfig) {
        super(checkpointConfig);
        Assert.isTrue(this.checkpointConfig.getMode() == CheckpointMode.TIME,
            () -> "TimeCheckpointManager should have checkpointMode time");
    }

    public void onMessage(EventContext context, EventData eventData) {
        LocalDateTime now = LocalDateTime.now();
        if (Duration.between(this.lastCheckpointTime.get(), now)
            .compareTo(this.checkpointConfig.getInterval()) > 0) {
            context.updateCheckpointAsync()
                .doOnError(t -> logCheckpointFail(context, eventData, t))
                .doOnSuccess(v -> {
                    logCheckpointSuccess(context, eventData);
                    lastCheckpointTime.set(now);
                })
                .subscribe();
        }
    }

    @Override
    protected Logger getLogger() {
        return LOG;
    }
}
