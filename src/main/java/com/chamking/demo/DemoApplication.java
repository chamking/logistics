package com.chamking.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chamking.demo.dao")
public class DemoApplication {
    //mapperscan 扫描注解

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
