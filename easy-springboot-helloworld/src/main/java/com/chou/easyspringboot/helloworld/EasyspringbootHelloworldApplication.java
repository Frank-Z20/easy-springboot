package com.chou.easyspringboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyspringbootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyspringbootHelloworldApplication.class, args);
		System.out.println("Hello World!");
	}

}
