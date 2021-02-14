package com.wathsala.microService.rentCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.wathsala.microService.rentCloud.memo.model")
public class RentCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentCloudApplication.class, args);
	}

}
