package com.chou.easyspringboot.multipledatasource.aspect;

import com.chou.easyspringboot.multipledatasource.annotation.DataSource;
import com.chou.easyspringboot.multipledatasource.datasource.DataSourceContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 自定义注解处理类，拦截自定义注解，在执行sql前设置数据源
 * @Author: zhouxf
 * @Create: 2021/1/5 19:03
 */
@Aspect
@Component
// 自定义数据源注解与@Transaction注解同一个方法时会先执行@Transaction
// 即获取数据源在切换数据源之前，所以会导致自定义注解失效。
// @Order(@Order的value越小，就越先执行)，保证该AOP在@Transactional之前执行
@Order(-1)
public class DataSourceAspect {
    @Pointcut("@annotation(com.chou.easyspringboot.multipledatasource.annotation.DataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object dataSourceArround(ProceedingJoinPoint proceed) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceed.getSignature();
        Method method = methodSignature.getMethod();
        DataSource dataSource = method.getAnnotation(DataSource.class);
        if(dataSource != null) {
            DataSourceContextHolder.setDataSource(dataSource.value().name());
        }

        try {
            return proceed.proceed();
        } finally {
            // 方法执行后销毁数据源
            DataSourceContextHolder.clearDataSource();
        }
    }
}
