package com.vojinpesalj.microservices.itemdetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemdetailsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemdetailsserviceApplication.class, args);
	}

}
