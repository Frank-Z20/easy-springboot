package com.chou.easyspringboot.readcfg.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxf
 * @Create: 2020/12/23 22:05
 */
@Service
public class JdbcService {
    @Value("${jdbc.account}")
    private String account;
    @Value("${jdbc.pwd}")
    private String pwd;

    public void connectDb() {
        System.out.println("Database has connected, jdbc account is "
            + account + ", password is " + pwd);
    }
}
