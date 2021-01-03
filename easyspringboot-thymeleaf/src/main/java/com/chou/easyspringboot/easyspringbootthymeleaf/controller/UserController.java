package com.chou.easyspringboot.easyspringbootthymeleaf.controller;

import com.chou.easyspringboot.easyspringbootthymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/3 17:26
 */
@Controller
public class UserController {
    @GetMapping("/user/index")
    public String index(Model model) {
        List<User> userList = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            User tmpUser = new User();
            tmpUser.setName("user" + i);
            tmpUser.setAddress("北京");
            tmpUser.setAge(i + 20);
            if(i % 2 == 0) {
                tmpUser.setSex("男");
            }else {
                tmpUser.setSex("女");
            }

            userList.add(tmpUser);
        }
        model.addAttribute("userList", userList);
        return "/user/index";
    }
}
