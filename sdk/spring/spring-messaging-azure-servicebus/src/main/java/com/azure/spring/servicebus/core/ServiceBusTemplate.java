// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.core;

import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderAsyncClient;
import com.azure.spring.messaging.PartitionSupplier;
import com.azure.spring.messaging.PropertiesSupplier;
import com.azure.spring.messaging.core.SendOperation;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;
import com.azure.spring.servicebus.core.producer.ServiceBusProducerFactory;
import com.azure.spring.servicebus.core.properties.NamespaceProperties;
import com.azure.spring.servicebus.support.converter.ServiceBusMessageConverter;
import org.springframework.lang.NonNull;
import org.springframework.messaging.Message;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * Azure Service Bus template to support send {@link Message} asynchronously.
 *
 * <p>
 * A {@link #defaultEntityType} is required when no entity type is specified in {@link ServiceBusProducerFactory}
 * via related {@link NamespaceProperties} or producer {@link PropertiesSupplier}.
 * </p>
 */
public class ServiceBusTemplate implements SendOperation {

    private static final ServiceBusMessageConverter DEFAULT_CONVERTER = new ServiceBusMessageConverter();
    private final ServiceBusProducerFactory producerFactory;
    private ServiceBusMessageConverter messageConverter = DEFAULT_CONVERTER;
    private ServiceBusEntityType defaultEntityType;

    /**
     * Create an instance using the supplied producer factory.
     * @param producerFactory the producer factory.
     */
    public ServiceBusTemplate(@NonNull ServiceBusProducerFactory producerFactory) {
        this.producerFactory = producerFactory;
    }

    @Override
    public <U> Mono<Void> sendAsync(String destination,
                                    Message<U> message,
                                    PartitionSupplier partitionSupplier) {
        Assert.hasText(destination, "destination can't be null or empty");
        ServiceBusSenderAsyncClient senderAsyncClient = this.producerFactory.createProducer(destination, defaultEntityType);
        ServiceBusMessage serviceBusMessage = messageConverter.fromMessage(message, ServiceBusMessage.class);

        if (Objects.nonNull(serviceBusMessage) && !StringUtils.hasText(serviceBusMessage.getPartitionKey())) {
            String partitionKey = getPartitionKey(partitionSupplier);
            serviceBusMessage.setPartitionKey(partitionKey);
        }
        return senderAsyncClient.sendMessage(serviceBusMessage);
    }

    /**
     * Set the message converter.
     * @param messageConverter the message converter.
     */
    public void setMessageConverter(ServiceBusMessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }

    /**
     * Get the message converter.
     * @return the message conveter.
     */
    public ServiceBusMessageConverter getMessageConverter() {
        return messageConverter;
    }

    private String getPartitionKey(PartitionSupplier partitionSupplier) {
        if (partitionSupplier == null) {
            return "";
        }

        if (StringUtils.hasText(partitionSupplier.getPartitionKey())) {
            return partitionSupplier.getPartitionKey();
        }

        if (StringUtils.hasText(partitionSupplier.getPartitionId())) {
            return partitionSupplier.getPartitionId();
        }

        return "";
    }

    /**
     * Set the default entity type of the destination to be sent messages to. Required when no entity type is specified
     * in {@link ServiceBusProducerFactory} via related the {@link NamespaceProperties} or producer {@link PropertiesSupplier}.
     * @param entityType the entity type.
     */
    public void setDefaultEntityType(ServiceBusEntityType entityType) {
        defaultEntityType = entityType;
    }
}
