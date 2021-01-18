package com.chou.easyspringboot.easyspringbootlistener.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: zhouxf
 * @Create: 2021/1/8 18:30
 */
public class DemoEvent extends ApplicationEvent {
    private String userName;

    public DemoEvent(Object source, String userName) {
        super(source);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
