package com.chou.easyspringboot.easyspringbootthymeleaf.controller;

import com.chou.easyspringboot.easyspringbootthymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: zhouxf
 * @Create: 2021/1/3 13:36
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String toLogin() {
        return "/login/login";
    }

    @PostMapping("/login")
    public String login(User user) {
        if("admin".equals(user.getName())
            && "123456".equals(user.getPwd())) {
            return "redirect:/user/index";
        }
        return "/";
    }
}
