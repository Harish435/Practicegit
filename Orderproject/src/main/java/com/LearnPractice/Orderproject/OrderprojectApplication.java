package com.LearnPractice.Orderproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderprojectApplication.class, args);
	}

}
