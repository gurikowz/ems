package com.grk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.grk.dao")
public class EmsApplication {
    public static void main(String[] args) {


        SpringApplication.run(EmsApplication.class, args);
    }
}
