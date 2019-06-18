package com.example.blockchain_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.blockchain_test.dao")
@EnableFeignClients
@EnableScheduling
@EnableAsync
public class BlockchainTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockchainTestApplication.class, args);
	}

}
