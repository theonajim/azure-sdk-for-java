// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Reward given to a list of slots. */
@Fluent
public final class PersonalizerRewardMultiSlotOptions {
    /*
     * List of SlotRewards
     */
    @JsonProperty(value = "reward", required = true)
    private List<PersonalizerSlotReward> reward;

    /**
     * Get the reward property: List of SlotRewards.
     *
     * @return the reward value.
     */
    public List<PersonalizerSlotReward> getReward() {
        return this.reward;
    }

    /**
     * Set the reward property: List of SlotRewards.
     *
     * @param reward the reward value to set.
     * @return the PersonalizerRewardMultiSlotOptions object itself.
     */
    public PersonalizerRewardMultiSlotOptions setReward(List<PersonalizerSlotReward> reward) {
        this.reward = reward;
        return this;
    }
}
