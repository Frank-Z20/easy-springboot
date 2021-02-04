package com.chou.easyspringboot.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouxf
 * @Create: 2021/2/4 10:41
 */
@RestController
public class KFKProducer {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    // 发送消息
    @GetMapping("/kafka/simple")
    public void simpleSend(@RequestParam("message") String message) {
        kafkaTemplate.send("simpleTopic", message);
    }

    // 发送消息，send带回调
    @GetMapping("/kafka/callback")
    public void callbackSend(@RequestParam("message") String message) {
        kafkaTemplate.send("callbackTopic", message).addCallback(
                success -> {
                    System.out.println(success.getRecordMetadata().topic() + "发送成功");
                },
                failure -> {
                    System.out.println(failure.getMessage() + "发送失败");
                }
        );
    }

    // 发送消息，事务的
    @GetMapping("/kafka/transaction")
    public void transactionSend(@RequestParam("message") String message) {
        kafkaTemplate.executeInTransaction(operations -> {
            operations.send("transactionTopic", message);
            // 后面抛出异常，消息不会发送成功
            return 0;
        });
    }
}
