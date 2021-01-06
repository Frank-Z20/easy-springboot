package com.chou.easyspringboot.multipledatasource.mapper;

import com.chou.easyspringboot.multipledatasource.annotation.DataSource;
import com.chou.easyspringboot.multipledatasource.datasource.DataSourceEnum;
import com.chou.easyspringboot.multipledatasource.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 19:47
 */
@Repository
public interface TeacherMapper {
    @DataSource(DataSourceEnum.DATASOURCE1)
    List<Teacher> selectAllTeachers();
}
