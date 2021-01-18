package com.chou.easyspringboot.multipledatasource.service;

import com.chou.easyspringboot.multipledatasource.entity.Student;
import com.chou.easyspringboot.multipledatasource.mapper.ds1.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 19:59
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> getAllStudents() {
        return studentMapper.selectAllStudents();
    }
}
