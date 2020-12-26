package com.chou.easyspringboot.readcfg.controller;

import com.chou.easyspringboot.readcfg.service.JdbcService;
import com.chou.easyspringboot.readcfg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouxf
 * @Create: 2020/12/23 22:25
 */
@RestController
public class MyController {
    @Autowired
    JdbcService jdbcService;
    @Autowired
    UserService userService;

    @GetMapping("/connectdb")
    public void connectDb() {
        jdbcService.connectDb();
    }

    @GetMapping("/getuserinfo")
    public void getUserInfo() {
        userService.getUserInfo();
    }
}
