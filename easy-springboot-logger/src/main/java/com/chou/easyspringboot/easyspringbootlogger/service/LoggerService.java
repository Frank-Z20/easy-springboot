package com.chou.easyspringboot.easyspringbootlogger.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxf
 * @Create: 2020/12/28 12:59
 */
@Service
public class LoggerService {
    private static final Logger logger = LoggerFactory.getLogger(LoggerService.class);

    public void printLog() {
        logger.trace("trace日志……");
        logger.debug("debug日志……");
        logger.info("info日志……");
        logger.warn("warn日志……");
        logger.error("error日志……");
    }
}
