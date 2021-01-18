package com.chou.easyspringboot.easyspringbootinterceptor.config;

import com.chou.easyspringboot.easyspringbootinterceptor.interceptor.DemoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author: zhouxf
 * @Create: 2021/1/14 17:14
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}

