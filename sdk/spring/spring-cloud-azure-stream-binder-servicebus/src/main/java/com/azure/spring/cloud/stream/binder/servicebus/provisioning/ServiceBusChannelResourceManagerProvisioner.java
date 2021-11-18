// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.stream.binder.servicebus.provisioning;

import com.azure.spring.cloud.resourcemanager.provisioner.servicebus.ServiceBusProvisioner;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

import static com.azure.spring.service.servicebus.properties.ServiceBusEntityType.QUEUE;

/**
 *
 */
public class ServiceBusChannelResourceManagerProvisioner extends ServiceBusChannelProvisioner {

    private final String namespace;
    private final ServiceBusProvisioner serviceBusProvisioner;

    public ServiceBusChannelResourceManagerProvisioner(@NonNull String namespace,
                                                       @NonNull ServiceBusProvisioner serviceBusProvisioner) {
        Assert.hasText(namespace, "The namespace can't be null or empty");
        this.namespace = namespace;
        this.serviceBusProvisioner = serviceBusProvisioner;
    }

    @Override
    protected void validateOrCreateForConsumer(String name, String group, ServiceBusEntityType type) {
        if (QUEUE == type) {
            this.serviceBusProvisioner.provisionQueue(namespace, name);
        } else {
            this.serviceBusProvisioner.provisionSubscription(namespace, name, group);
        }
    }

    @Override
    protected void validateOrCreateForProducer(String name, ServiceBusEntityType type) {
        if (QUEUE == type) {
            this.serviceBusProvisioner.provisionQueue(namespace, name);
        } else {
            this.serviceBusProvisioner.provisionTopic(namespace, name);
        }
    }
}
