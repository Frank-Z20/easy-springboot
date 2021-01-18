package com.chou.easyspringboot.easyspringbootlistener.controller;

import com.chou.easyspringboot.easyspringbootlistener.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouxf
 * @Create: 2021/1/8 18:42
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getusername")
    public String getUserName() {
        return userService.getUserName();
    }
}
