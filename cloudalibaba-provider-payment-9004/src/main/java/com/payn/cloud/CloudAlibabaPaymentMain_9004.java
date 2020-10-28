package com.payn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class CloudAlibabaPaymentMain_9004 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaPaymentMain_9004.class,args);
    }
}
