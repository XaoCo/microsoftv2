package com.abc.pub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.abc.pub.user.mapper"})
public class UserApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(UserApplication.class, args);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

}
