package com.cf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cf.repository")
public class OrderApplication {
    public static void main(String[] args){
        SpringApplication.run(OrderApplication.class,args);
    }
}
