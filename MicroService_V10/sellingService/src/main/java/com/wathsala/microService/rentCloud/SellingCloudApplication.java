package com.wathsala.microService.rentCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@SpringBootApplication
@EntityScan(basePackages = "com.wathsala.microService.rentCloud.memo.model")
@EnableResourceServer
public class SellingCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellingCloudApplication.class, args);
	}

}
