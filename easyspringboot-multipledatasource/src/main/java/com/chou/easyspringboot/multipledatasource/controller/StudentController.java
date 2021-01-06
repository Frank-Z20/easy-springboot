package com.chou.easyspringboot.multipledatasource.controller;

import com.chou.easyspringboot.multipledatasource.entity.Student;
import com.chou.easyspringboot.multipledatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/5 9:33
 */
@RestController
public class StudentController {
    @Autowired
    StudentService stuService;

    @GetMapping("/getallstus")
    public List<Student> getAllStudents() {
        return stuService.getAllStudents();
    }
}
