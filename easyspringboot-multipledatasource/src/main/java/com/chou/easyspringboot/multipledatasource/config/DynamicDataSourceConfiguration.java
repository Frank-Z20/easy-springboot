package com.chou.easyspringboot.multipledatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.chou.easyspringboot.multipledatasource.datasource.DataSourceEnum;
import com.chou.easyspringboot.multipledatasource.datasource.DynamicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @Author: zhouxf
 * @Create: 2021/1/5 18:52
 */
@Configuration
public class DynamicDataSourceConfiguration {
    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ds1")
    public DataSource primaryDataSource(){
        return new DruidDataSource();
    }

    @Bean(name = "dataSource1")
    @ConfigurationProperties(prefix = "spring.datasource.ds2")
    public DataSource dataSource1(){
        return new DruidDataSource();
    }

    @Bean("dynamicDataSource")
    @Primary
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //配置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(primaryDataSource());

        //配置多数据源
        HashMap<Object, Object> dataSourceMap = new HashMap();
        dataSourceMap.put(DataSourceEnum.PRIMARY.name(),primaryDataSource());
        dataSourceMap.put(DataSourceEnum.DATASOURCE1.name(),dataSource1());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;

    }
}
