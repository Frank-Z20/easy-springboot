package com.chou.easyspringboot.dubbo.provider.service.impl;

import com.chou.easyspringboot.dubbo.common.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: zhouxf
 * @Create: 2021/1/30 17:47
 */
@DubboService
public class DemoServiceImpl implements DemoService {
    Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public void sayHello(String name) {
        logger.info("Hello {}, this is dubbo provider", name);
    }
}
