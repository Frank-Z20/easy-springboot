package com.chou.easyspringboot.easyspringbootlistener.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouxf
 * @Create: 2021/1/8 18:04
 */
@Component
public class MyServletContextListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("MyServletContextListener: Application has started.");
    }
}
