// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.messaging.checkpoint;

/**
 * Support checkpoint by setting {@link CheckpointConfig}
 */
public interface Checkpointable {

    CheckpointConfig getCheckpointConfig();

    void setCheckpointConfig(CheckpointConfig checkpointConfig);
}
