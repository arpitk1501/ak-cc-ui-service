package com.ak.cc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ak.cc.*"})
public class AkCcUiServiceApplication {

    static public void main(String[] args) {
        SpringApplication.run(AkCcUiServiceApplication.class);
    }
}
