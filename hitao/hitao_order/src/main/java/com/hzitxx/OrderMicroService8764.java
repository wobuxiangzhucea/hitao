package com.hzitxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hzitxx.mapper")
public class OrderMicroService8764 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMicroService8764.class, args);
	}
}
