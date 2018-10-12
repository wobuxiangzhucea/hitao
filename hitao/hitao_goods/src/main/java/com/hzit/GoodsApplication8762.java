package com.hzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hzit.mapper")
public class GoodsApplication8762 {
 public static void main(String[] args) {
	 SpringApplication.run(GoodsApplication8762.class, args);
}
}
