package com.tom.mybatisdruid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.tom.mybatisdruid.mapper")
public class MybatisDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDruidApplication.class, args);
    }

}

