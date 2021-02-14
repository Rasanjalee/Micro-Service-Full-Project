package com.wathsala.microServie.sellingprocesstask;

import com.wathsala.microServie.sellingprocesstask.service.SellingProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SellingProcessTaskApplication {

	@Bean
	SellingProcessTaskRunner getSellingProcessTaskRunner(){
		return new SellingProcessTaskRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(SellingProcessTaskApplication.class, args);
	}

}
