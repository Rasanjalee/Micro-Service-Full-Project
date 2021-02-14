package com.wathsala.microService.buyingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "com.wathsala.microService.buyingcloudmodel.transaction")
public class BuyingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyingServiceApplication.class, args);
	}

}
