package com.mydiary.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyDiaryAPIAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDiaryAPIAccountManagementApplication.class, args);
	}

}
