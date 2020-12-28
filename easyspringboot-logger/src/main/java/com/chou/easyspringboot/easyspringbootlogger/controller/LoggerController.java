package com.chou.easyspringboot.easyspringbootlogger.controller;

import com.chou.easyspringboot.easyspringbootlogger.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouxf
 * @Create: 2020/12/28 13:29
 */
@RestController
public class LoggerController {
    @Autowired
    private LoggerService loggerService;

    @GetMapping("logger")
    public void printLog() {
        loggerService.printLog();
    }
}
