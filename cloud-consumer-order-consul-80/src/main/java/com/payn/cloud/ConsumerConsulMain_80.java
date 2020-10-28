package com.payn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConsumerConsulMain_80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMain_80.class,args);
    }
}
