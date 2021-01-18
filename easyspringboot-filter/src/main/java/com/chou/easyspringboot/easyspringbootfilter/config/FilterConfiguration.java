package com.chou.easyspringboot.easyspringbootfilter.config;

import com.chou.easyspringboot.easyspringbootfilter.filter.FirstFilter;
import com.chou.easyspringboot.easyspringbootfilter.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouxf
 * @Create: 2021/1/18 11:52
 */
@Configuration
public class FilterConfiguration {
    /**
     * 注册过滤器，等同于在web.xml中注册
     */
    @Bean
    public FilterRegistrationBean firstFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FirstFilter());
        // 添加过滤得url，默认就是“/*”
        filterRegistrationBean.addUrlPatterns("/*");
        //filterRegistrationBean.setOrder(1);

        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean secondFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
        List<String> urls = new ArrayList();
        urls.add("/*");
        filterRegistrationBean.setUrlPatterns(urls);

        return filterRegistrationBean;
    }
}
