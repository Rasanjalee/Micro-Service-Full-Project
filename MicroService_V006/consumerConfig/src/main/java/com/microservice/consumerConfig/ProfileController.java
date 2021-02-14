package com.microservice.consumerConfig;

import com.microservice.consumerConfig.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author acer on 2/9/2021
 */
@Controller
public class ProfileController {
    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping(value = "/profile")
    public String getConfig(Model model){
        model.addAttribute("model",memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min",memberProfileConfiguration.getMinRentPeriod());
        return "mProfile";

    }
}
