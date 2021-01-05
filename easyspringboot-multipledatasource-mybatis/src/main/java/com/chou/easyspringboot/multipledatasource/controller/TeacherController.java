package com.chou.easyspringboot.multipledatasource.controller;

import com.chou.easyspringboot.multipledatasource.entity.Teacher;
import com.chou.easyspringboot.multipledatasource.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/5 9:34
 */
@RestController
public class TeacherController {
    @Autowired
    TeacherService tService;

    @GetMapping("/getallteachers")
    public List<Teacher> getAllTeachers() {
        return tService.getAllTeachers();
    }
}
