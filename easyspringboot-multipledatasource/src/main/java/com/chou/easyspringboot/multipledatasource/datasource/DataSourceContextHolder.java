package com.chou.easyspringboot.multipledatasource.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据源切换处理类
 * @Author: zhouxf
 * @Create: 2021/1/5 18:31
 */
public class DataSourceContextHolder {
    private static Logger logger = LoggerFactory.getLogger(DataSourceContextHolder.class);

    // 使用ThreadLocal线程安全的使用变量副本
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    /**
     * 设置数据源
     * */
    public static void setDataSource(String dataSource) {
        logger.info("切换到数据源：{}", dataSource);
        CONTEXT_HOLDER.set(dataSource);
    }

    /**
     * 获取数据源
     * */
    public static String getDataSource() {
        return CONTEXT_HOLDER.get();
    }

    /**
     * 清空数据源
     * */
    public static void clearDataSource() {
        CONTEXT_HOLDER.remove();
    }
}
