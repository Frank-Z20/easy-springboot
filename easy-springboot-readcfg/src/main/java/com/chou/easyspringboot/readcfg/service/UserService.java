package com.chou.easyspringboot.readcfg.service;

import com.chou.easyspringboot.readcfg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxf
 * @Create: 2020/12/23 22:36
 */
@Service
public class UserService {
    @Autowired
    User user;

    public void getUserInfo() {
        System.out.println(user.toString());
    }
}
