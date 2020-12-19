package com.chou.easyspringboot.easystarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouxf
 * @Create: 2020/12/19 21:13
 */
@RestController
public class EasyStarterController {
    @GetMapping("/easystarter/test")
    public void test() {
        System.out.println("this is EasyStarterController");
    }
}
