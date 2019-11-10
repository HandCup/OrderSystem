package com.cf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName AccountApplication
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 16:34
 */
@SpringBootApplication
@MapperScan("com.cf.repository")
public class AccountApplication {
    public static void main(String[] args){
        SpringApplication.run(AccountApplication.class,args);
    }
}
