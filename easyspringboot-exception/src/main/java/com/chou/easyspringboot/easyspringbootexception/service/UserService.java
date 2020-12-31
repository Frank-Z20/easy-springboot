package com.chou.easyspringboot.easyspringbootexception.service;

import com.chou.easyspringboot.easyspringbootexception.buzexception.MsgConvertException;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxf
 * @Create: 2020/12/30 18:54
 */
@Service
public class UserService {

    public void printUserInfo() {
        throw new NullPointerException("com.chou.easyspringboot.easyspringbootexception.service.UserService.printUserInfo空指针了");
    }

    public void userToSecurityUser() {
        throw new MsgConvertException("com.chou.easyspringboot.easyspringbootexception.service.UserService.userToSecurityUser转换异常了");
    }
}
