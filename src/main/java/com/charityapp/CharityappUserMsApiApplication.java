package com.charityapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CharityappUserMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharityappUserMsApiApplication.class, args);
		System.out.println("Hello");
	}

}
