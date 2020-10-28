package com.payn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignMain_80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain_80.class, args);
    }
}
