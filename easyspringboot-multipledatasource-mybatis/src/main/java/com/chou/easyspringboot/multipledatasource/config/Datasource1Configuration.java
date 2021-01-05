package com.chou.easyspringboot.multipledatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 18:56
 */
@Configuration
@MapperScan(basePackages = {"com.chou.easyspringboot.multipledatasource.mapper.ds1"}, sqlSessionFactoryRef = "sqlSessionFactory1")
public class Datasource1Configuration {
    @Value("${mybatis.mapper-locations}")
    private String mapperLocation;
    @Value("${spring.datasource.ds1.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.ds1.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.ds1.username}")
    private String username;
    @Value("${spring.datasource.ds1.password}")
    private String password;
    @Value("${spring.datasource.ds1.initialSize}")
    private int initialSize;
    @Value("${spring.datasource.ds1.minIdle}")
    private int minIdle;
    @Value("${spring.datasource.ds1.maxActive}")
    private int maxActive;

    @Bean(name = "dataSource1")
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbcUrl);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);

        return dataSource;
    }

    @Bean("sqlSessionFactory1")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource1") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources(mapperLocation));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean("sqlSessionTemplate1")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory1") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean("transactionManager1")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource1")DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
