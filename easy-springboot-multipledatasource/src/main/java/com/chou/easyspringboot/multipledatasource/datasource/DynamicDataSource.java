package com.chou.easyspringboot.multipledatasource.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 实现AbstractRoutingDataSource的determineCurrentLookupKey用来获取数据源
 * @Author: zhouxf
 * @Create: 2021/1/5 18:42
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
