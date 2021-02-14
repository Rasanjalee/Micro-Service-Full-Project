package com.microservice.consumerConfig.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author acer on 2/9/2021
 */
@Component
public class MemberProfileConfiguration {

    @Autowired
    Environment environment;

    public String getDefaultModel(){
        return environment.getProperty("vehicle.default.model");
    }

    public String getMinRentPeriod(){
        return environment.getProperty("member.rent.min");
    }
}
