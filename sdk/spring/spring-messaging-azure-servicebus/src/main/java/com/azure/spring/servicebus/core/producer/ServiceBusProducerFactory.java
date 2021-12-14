// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.core.producer;


import com.azure.messaging.servicebus.ServiceBusSenderAsyncClient;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;

/**
 * The strategy to produce {@link ServiceBusSenderAsyncClient} instance.
 */
public interface ServiceBusProducerFactory {

    /**
     * Create {@link ServiceBusSenderAsyncClient} to send events to the Service Bus queue/topic entity.
     * @param name the destination entity name
     * @return the producer.
     */
    ServiceBusSenderAsyncClient createProducer(String name);

    /**
     * Create {@link ServiceBusSenderAsyncClient} to send events to the Service Bus queue/topic entity with
     * explicit {@link ServiceBusEntityType}.
     * @param name the destination entity name.
     * @param entityType the Service Bus entity type.
     * @return the producer.
     */
    ServiceBusSenderAsyncClient createProducer(String name, ServiceBusEntityType entityType);

    /**
     * Add a listener for this factory.
     * @param listener the listener
     */
    default void addListener(Listener listener) {

    }

    /**
     * Remove a listener
     * @param listener the listener
     * @return true if removed.
     */
    default boolean removeListener(Listener listener) {
        return false;
    }

    /**
     * Called whenever a producer is added or removed.
     */
    @FunctionalInterface
    interface Listener {

        void producerAdded(String name, ServiceBusSenderAsyncClient client);

        default void producerRemoved(String name, ServiceBusSenderAsyncClient client) {
        }

    }
}
