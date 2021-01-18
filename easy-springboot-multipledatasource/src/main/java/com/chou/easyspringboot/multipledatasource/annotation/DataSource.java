package com.chou.easyspringboot.multipledatasource.annotation;

import com.chou.easyspringboot.multipledatasource.datasource.DataSourceEnum;

import java.lang.annotation.*;

/**
 * @Author: zhouxf
 * @Create: 2021/1/5 18:26
 */
// 指定作用在方法上
@Target(ElementType.METHOD)
// 指定运行期生效
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    DataSourceEnum value() default DataSourceEnum.PRIMARY;
}
