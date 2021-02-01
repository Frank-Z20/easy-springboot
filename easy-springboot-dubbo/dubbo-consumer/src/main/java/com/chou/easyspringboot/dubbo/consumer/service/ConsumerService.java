package com.chou.easyspringboot.dubbo.consumer.service;

import com.chou.easyspringboot.dubbo.common.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxf
 * @Create: 2021/1/30 18:18
 */
@Service
public class ConsumerService {
    @DubboReference
    private DemoService demoService;

    public void invokeSayHello(String name) {
        demoService.sayHello(name);
    }
}
