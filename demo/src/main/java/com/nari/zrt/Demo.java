package com.nari.zrt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.nari.zrt.dao")
@EnableCaching
@EnableDiscoveryClient
@ComponentScan("com.nari.zrt")
public class Demo {
	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}
}
