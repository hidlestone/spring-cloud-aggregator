package com.payn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: payn
 * @date: 2020/10/26 20:20
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer   // 表示它是服务注册中心
public class EurekaServer_7001 {
	public static void main(String[] args){
		SpringApplication.run(EurekaServer_7001.class, args);
	}
}
