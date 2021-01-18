package com.chou.easyspringboot.easyspringbootlistener.listener;

import com.chou.easyspringboot.easyspringbootlistener.event.DemoEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

/**
 * @Author: zhouxf
 * @Create: 2021/1/8 18:33
 */
public class DemoEventListener implements ApplicationListener<DemoEvent> {
    Logger logger = LoggerFactory.getLogger(DemoEventListener.class);

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        logger.info("当前用户为：{}", demoEvent.getUserName());
    }
}
