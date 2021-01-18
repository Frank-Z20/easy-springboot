package com.chou.easyspringboot.easyspringbootlistener.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * @Author: zhouxf
 * @Create: 2021/1/8 18:19
 */
@Component
public class MyHttpSessionListener implements HttpSessionListener {
    Logger logger = LoggerFactory.getLogger(MyHttpSessionListener.class);
    private int countNum = 0;

    @Override
    public synchronized void sessionCreated(HttpSessionEvent se) {
        countNum++;
        logger.info("新用户上线，此时在线人数为：{}", countNum);
        se.getSession().getServletContext().setAttribute("countNum", countNum);
    }

    @Override
    public synchronized void sessionDestroyed(HttpSessionEvent se) {
        countNum--;
        logger.info("用户下线，此时在线人数为：{}", countNum);
        se.getSession().getServletContext().setAttribute("countNum", countNum);
    }
}
