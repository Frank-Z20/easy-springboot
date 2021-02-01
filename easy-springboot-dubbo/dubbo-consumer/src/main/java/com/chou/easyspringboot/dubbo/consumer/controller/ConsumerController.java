package com.chou.easyspringboot.dubbo.consumer.controller;

import com.chou.easyspringboot.dubbo.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouxf
 * @Create: 2021/1/30 18:23
 */
@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer/sayhello")
    public void sayHello(@RequestParam("name") String name) {
        consumerService.invokeSayHello(name);
    }
}
