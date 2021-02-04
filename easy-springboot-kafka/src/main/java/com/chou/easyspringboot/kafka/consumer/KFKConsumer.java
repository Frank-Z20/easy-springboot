package com.chou.easyspringboot.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouxf
 * @Create: 2021/2/4 10:47
 */
@Component
public class KFKConsumer {
    Logger logger = LoggerFactory.getLogger(KFKConsumer.class);

    // 消费监听，groupId 指定消费者组，
    // @TopicPartition(topic = "topic2", partitions = "0", partitionOffsets = @PartitionOffset(partition = "1", initialOffset = "8"))
    // 指定分区 offset
    @KafkaListener(topics = {"simpleTopic"}, groupId = "defaultconsumergroup")
    public void onMessage1(ConsumerRecord<?, ?> record) {
        logger.info("收到主题 {} 分区 {} 的消息 {} ", record.topic(), record.partition(), record.value());
    }

    // 自定义异常处理器
    @Bean
    public ConsumerAwareListenerErrorHandler consumerAwareErrorHandler() {
        return (message, exception, consumer) -> {
            logger.info("消费异常：{}", message.getPayload());
            return 0;
        };
    }
    // 将这个异常处理器的 BeanName 放到 @KafkaListener 注解的 errorHandler 属性里面
    @KafkaListener(topics = {"simpleTopic"}, errorHandler = "consumerAwareErrorHandler")
    public void onMessageWithExceptionHandler(ConsumerRecord<?, ?> record) throws Exception {
        throw new Exception("模拟异常");
    }

    // 定义消息过滤器
    @Autowired
    ConsumerFactory consumerFactory;
    @Bean
    public ConcurrentKafkaListenerContainerFactory filterContainerFactory() {
        ConcurrentKafkaListenerContainerFactory factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactory);
        // 被过滤的消息将被丢弃
        factory.setAckDiscarded(true);
        // 消息过滤策略
        factory.setRecordFilterStrategy(consumerRecord -> {
            if (Integer.parseInt(consumerRecord.value().toString()) % 2 == 0) {
                return false;
            }
            //返回true消息则被过滤
            return true;
        });
        return factory;
    }
    // 过滤器放到 @KafkaListener 注解的 containerFactory 属性里面
    @KafkaListener(topics = {"topic1"},containerFactory = "filterContainerFactory")
    public void onMessageWithFilter(ConsumerRecord<?, ?> record) {
        logger.info("{}", record.value());
    }
}
