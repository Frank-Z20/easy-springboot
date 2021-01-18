package com.chou.easyspringboot.easyspringbootlistener.service;

import com.chou.easyspringboot.easyspringbootlistener.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxf
 * @Create: 2021/1/8 18:37
 */
@Service
public class UserService {
    @Autowired
    private ApplicationContext context;

    public String getUserName() {
        DemoEvent demoEvent = new DemoEvent(this, "zhangsan");
        context.publishEvent(demoEvent);
        return demoEvent.getUserName();
    }
}
