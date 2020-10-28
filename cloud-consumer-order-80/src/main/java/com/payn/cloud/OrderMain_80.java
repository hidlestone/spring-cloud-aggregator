package com.payn.cloud;

import com.payn.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name="CLOUD-PROVIDER-SERVICE", configuration = MySelfRule.class)
public class OrderMain_80 {

    public static void main(String[] args){
        SpringApplication.run(OrderMain_80.class, args);
    }
}
