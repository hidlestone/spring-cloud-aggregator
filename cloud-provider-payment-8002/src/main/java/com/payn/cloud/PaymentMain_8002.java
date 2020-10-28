package com.payn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain_8002 {

    public static void main(String[] args){
        SpringApplication.run(PaymentMain_8002.class, args);
    }
}
