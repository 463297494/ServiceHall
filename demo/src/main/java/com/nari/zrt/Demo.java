package com.nari.ztr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.nari.ztr.dao")
@EnableCaching
@EnableDiscoveryClient
public class Demo {
	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}
}
