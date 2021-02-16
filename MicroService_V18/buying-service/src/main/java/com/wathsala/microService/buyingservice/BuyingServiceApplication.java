package com.wathsala.microService.buyingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(value = "com.wathsala.microService.buyingcloudmodel.transaction")
@EnableEurekaClient
@EnableCircuitBreaker
public class BuyingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyingServiceApplication.class, args);
	}

}
