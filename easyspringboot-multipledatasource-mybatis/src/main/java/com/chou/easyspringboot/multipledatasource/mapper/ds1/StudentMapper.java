package com.chou.easyspringboot.multipledatasource.mapper.ds1;

import com.chou.easyspringboot.multipledatasource.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 19:46
 */
@Repository
public interface StudentMapper {
    List<Student> selectAllStudents();
}
