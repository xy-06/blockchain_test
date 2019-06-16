package com.example.blockchain_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.example.blockchain_test.dao")
@EnableFeignClients
public class BlockchainTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockchainTestApplication.class, args);
	}

}
