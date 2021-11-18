// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.stream.binder.servicebus.provisioning;

import org.springframework.cloud.stream.provisioning.ConsumerDestination;

/**
 *
 */
public class ServiceBusConsumerDestination implements ConsumerDestination {

    private final String name;

    public ServiceBusConsumerDestination(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
