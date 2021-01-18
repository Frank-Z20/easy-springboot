package com.chou.easyspringboot.multipledatasource.mapper.ds2;

import com.chou.easyspringboot.multipledatasource.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 19:47
 */
@Repository
public interface TeacherMapper {
    List<Teacher> selectAllTeachers();
}
