package com.chou.easyspringboot.easyspringbootfilter.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: zhouxf
 * @Create: 2021/1/18 12:08
 */
public class SecondFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(SecondFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("SecondFilter初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("SecondFilter预处理");
        // 执行下一个过滤器，若没有此行代码则目标 Servlet 的 service 方法都不会被执行
        filterChain.doFilter(servletRequest, servletResponse);
        logger.info("SecondFilter后处理");
    }

    @Override
    public void destroy() {
        logger.info("SecondFilter销毁");
    }
}
