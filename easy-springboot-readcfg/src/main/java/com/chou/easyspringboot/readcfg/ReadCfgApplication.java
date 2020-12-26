package com.chou.easyspringboot.readcfg;

import com.chou.easyspringboot.readcfg.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhouxf
 * @Create: 2020/12/23 21:35
 */
@SpringBootApplication
public class ReadCfgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadCfgApplication.class, args);
    }

}
