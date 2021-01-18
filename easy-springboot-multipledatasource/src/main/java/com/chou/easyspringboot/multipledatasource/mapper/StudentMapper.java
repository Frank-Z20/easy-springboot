package com.chou.easyspringboot.multipledatasource.mapper;

import com.chou.easyspringboot.multipledatasource.annotation.DataSource;
import com.chou.easyspringboot.multipledatasource.datasource.DataSourceEnum;
import com.chou.easyspringboot.multipledatasource.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 19:46
 */
@Repository
public interface StudentMapper {
    @DataSource(DataSourceEnum.PRIMARY)
    List<Student> selectAllStudents();
}
