package com.chou.easyspringboot.readcfg.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouxf
 * @Create: 2020/12/23 22:28
 */
@Component
@Data
@ConfigurationProperties("user")
public class User {
    private String name;
    private String sex;
    private String homeUrl;
}
