package com.example.springbootpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringbootPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPocApplication.class, args);
    }

}
