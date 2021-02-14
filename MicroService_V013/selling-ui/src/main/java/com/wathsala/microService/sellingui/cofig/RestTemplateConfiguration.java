package com.wathsala.microService.sellingui.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author acer on 2/12/2021
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
