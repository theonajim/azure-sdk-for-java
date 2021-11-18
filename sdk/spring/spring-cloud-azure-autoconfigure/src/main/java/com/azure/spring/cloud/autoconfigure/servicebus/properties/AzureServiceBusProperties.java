// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.servicebus.properties;

import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.messaging.servicebus.models.SubQueue;
import com.azure.spring.core.properties.util.AzurePropertiesUtils;
import com.azure.spring.service.servicebus.properties.ServiceBusConsumerDescriptor;
import com.azure.spring.service.servicebus.properties.ServiceBusNamespaceDescriptor;
import com.azure.spring.service.servicebus.properties.ServiceBusProcessorDescriptor;
import com.azure.spring.service.servicebus.properties.ServiceBusProducerDescriptor;
import org.springframework.boot.context.properties.PropertyMapper;

import java.time.Duration;

/**
 *
 */
public class AzureServiceBusProperties extends AzureServiceBusCommonProperties implements ServiceBusNamespaceDescriptor {

    public static final String PREFIX = "spring.cloud.azure.servicebus";

    private Boolean crossEntityTransactions;
    private final Producer producer = new Producer();
    private final Consumer consumer = new Consumer();
    private final Processor processor = new Processor();

    public Boolean getCrossEntityTransactions() {
        return crossEntityTransactions;
    }

    public void setCrossEntityTransactions(Boolean crossEntityTransactions) {
        this.crossEntityTransactions = crossEntityTransactions;
    }

    public Producer getProducer() {
        return producer;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Producer buildProducerProperties() {
        PropertyMapper propertyMapper = PropertyMapper.get().alwaysApplyingWhenNonNull();

        Producer properties = new Producer();

        AzurePropertiesUtils.mergeAzureCommonProperties(this, this.producer, properties);

        propertyMapper.from(this.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(this.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(this.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(this.getEntityName()).to(properties::setEntityName);
        propertyMapper.from(this.getEntityType()).to(properties::setEntityType);

        propertyMapper.from(this.producer.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(this.producer.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(this.producer.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(this.producer.getEntityType()).to(properties::setEntityType);
        propertyMapper.from(this.producer.getEntityName()).to(properties::setEntityName);

        return properties;
    }

    public Consumer buildConsumerProperties() {
        PropertyMapper propertyMapper = PropertyMapper.get().alwaysApplyingWhenNonNull();

        Consumer properties = new Consumer();

        AzurePropertiesUtils.mergeAzureCommonProperties(this, this.consumer, properties);

        propertyMapper.from(this.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(this.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(this.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(this.getEntityName()).to(properties::setEntityName);
        propertyMapper.from(this.getEntityType()).to(properties::setEntityType);

        propertyMapper.from(this.consumer.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(this.consumer.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(this.consumer.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(this.consumer.getEntityType()).to(properties::setEntityType);
        propertyMapper.from(this.consumer.getEntityName()).to(properties::setEntityName);

        propertyMapper.from(this.consumer.getSessionEnabled()).to(properties::setSessionEnabled);
        propertyMapper.from(this.consumer.getAutoComplete()).to(properties::setAutoComplete);
        propertyMapper.from(this.consumer.getPrefetchCount()).to(properties::setPrefetchCount);
        propertyMapper.from(this.consumer.getSubQueue()).to(properties::setSubQueue);
        propertyMapper.from(this.consumer.getReceiveMode()).to(properties::setReceiveMode);
        propertyMapper.from(this.consumer.getSubscriptionName()).to(properties::setSubscriptionName);
        propertyMapper.from(this.consumer.getMaxAutoLockRenewDuration()).to(properties::setMaxAutoLockRenewDuration);

        return properties;
    }

    public Processor buildProcessorProperties() {
        PropertyMapper propertyMapper = PropertyMapper.get().alwaysApplyingWhenNonNull();

        Processor properties = new Processor();

        AzurePropertiesUtils.mergeAzureCommonProperties(this, this.processor, properties);

        propertyMapper.from(this.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(this.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(this.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(this.getEntityName()).to(properties::setEntityName);
        propertyMapper.from(this.getEntityType()).to(properties::setEntityType);

        propertyMapper.from(this.processor.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(this.processor.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(this.processor.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(this.processor.getEntityType()).to(properties::setEntityType);
        propertyMapper.from(this.processor.getEntityName()).to(properties::setEntityName);

        propertyMapper.from(this.processor.getSessionEnabled()).to(properties::setSessionEnabled);
        propertyMapper.from(this.processor.getAutoComplete()).to(properties::setAutoComplete);
        propertyMapper.from(this.processor.getPrefetchCount()).to(properties::setPrefetchCount);
        propertyMapper.from(this.processor.getSubQueue()).to(properties::setSubQueue);
        propertyMapper.from(this.processor.getReceiveMode()).to(properties::setReceiveMode);
        propertyMapper.from(this.processor.getSubscriptionName()).to(properties::setSubscriptionName);
        propertyMapper.from(this.processor.getMaxAutoLockRenewDuration()).to(properties::setMaxAutoLockRenewDuration);
        propertyMapper.from(this.processor.getMaxConcurrentCalls()).to(properties::setMaxConcurrentCalls);
        propertyMapper.from(this.processor.getMaxConcurrentSessions()).to(properties::setMaxConcurrentSessions);

        return properties;
    }

    /**
     * Properties of a Service Bus producer.
     */
    public static class Producer extends AzureServiceBusCommonProperties implements ServiceBusProducerDescriptor {

    }

    /**
     * Properties of a Service Bus consumer.
     */
    public static class Consumer extends AzureServiceBusCommonProperties implements ServiceBusConsumerDescriptor {

        private Boolean sessionEnabled;
        private Boolean autoComplete;
        private Integer prefetchCount;
        private SubQueue subQueue;
        private ServiceBusReceiveMode receiveMode = ServiceBusReceiveMode.PEEK_LOCK;
        private String subscriptionName;
        private Duration maxAutoLockRenewDuration;

        @Override
        public Boolean getSessionEnabled() {
            return sessionEnabled;
        }

        public void setSessionEnabled(Boolean sessionEnabled) {
            this.sessionEnabled = sessionEnabled;
        }

        @Override
        public Boolean getAutoComplete() {
            return autoComplete;
        }

        public void setAutoComplete(Boolean autoComplete) {
            this.autoComplete = autoComplete;
        }

        @Override
        public Integer getPrefetchCount() {
            return prefetchCount;
        }

        public void setPrefetchCount(Integer prefetchCount) {
            this.prefetchCount = prefetchCount;
        }

        @Override
        public SubQueue getSubQueue() {
            return subQueue;
        }

        public void setSubQueue(SubQueue subQueue) {
            this.subQueue = subQueue;
        }

        @Override
        public ServiceBusReceiveMode getReceiveMode() {
            return receiveMode;
        }

        public void setReceiveMode(ServiceBusReceiveMode receiveMode) {
            this.receiveMode = receiveMode;
        }

        @Override
        public String getSubscriptionName() {
            return subscriptionName;
        }

        public void setSubscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
        }

        @Override
        public Duration getMaxAutoLockRenewDuration() {
            return maxAutoLockRenewDuration;
        }

        public void setMaxAutoLockRenewDuration(Duration maxAutoLockRenewDuration) {
            this.maxAutoLockRenewDuration = maxAutoLockRenewDuration;
        }
    }

    /**
     * Properties of a Service Bus processor.
     */
    public static class Processor extends Consumer implements ServiceBusProcessorDescriptor {
        private Integer maxConcurrentCalls;
        private Integer maxConcurrentSessions;

        public Integer getMaxConcurrentCalls() {
            return maxConcurrentCalls;
        }

        public void setMaxConcurrentCalls(Integer maxConcurrentCalls) {
            this.maxConcurrentCalls = maxConcurrentCalls;
        }

        public Integer getMaxConcurrentSessions() {
            return maxConcurrentSessions;
        }

        public void setMaxConcurrentSessions(Integer maxConcurrentSessions) {
            this.maxConcurrentSessions = maxConcurrentSessions;
        }
    }

}
