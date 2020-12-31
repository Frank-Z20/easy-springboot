package com.chou.easyspringboot.easyspringbootexception.controller;

import com.chou.easyspringboot.easyspringbootexception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouxf
 * @Create: 2020/12/30 18:57
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/printuserinfo")
    public void pringUserInfo() {
        userService.printUserInfo();
    }

    @GetMapping("/usertosecurityuser")
    public void userToSecurityUser() {
        userService.userToSecurityUser();
    }
}
