package com.chou.easyspringboot.multipledatasource.service;

import com.chou.easyspringboot.multipledatasource.entity.Teacher;
import com.chou.easyspringboot.multipledatasource.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 20:01
 */
@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> getAllTeachers() {
        return teacherMapper.selectAllTeachers();
    }
}
