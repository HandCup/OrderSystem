package com.cf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName UserApplication
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 14:58
 */
@SpringBootApplication
@MapperScan("com.cf.repository")
public class UserApplication {
    public static void main(String[] args){
        SpringApplication.run(UserApplication.class,args);
    }
}
