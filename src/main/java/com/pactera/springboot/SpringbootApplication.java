package com.pactera.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootApplication {

    //Spring Boot 内置了 Tomcat
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
