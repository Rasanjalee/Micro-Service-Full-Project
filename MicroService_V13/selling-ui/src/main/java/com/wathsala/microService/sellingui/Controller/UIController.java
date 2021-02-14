package com.wathsala.microService.sellingui.Controller;

import com.wathsala.microService.sellingCloud.data.model.Company;
import com.wathsala.microService.sellingui.cofig.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

/**
 * @author acer on 2/11/2021
 */
@Controller
@EnableOAuth2Sso
public class UIController  extends WebSecurityConfigurerAdapter {
    @Autowired
    RestTemplate restTemplate;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    @RequestMapping(value = "/")
    public String loadUI(){
        return "home";
    }

    @RequestMapping(value = "/secure")
    public String loadSecureUI(){
        return "secure";
    }

    @RequestMapping(value = "/companies")
    public String loadCompanies(Model model){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", AccessToken.getAccessToken());


        HttpEntity<Company> companyHttpEntity = new HttpEntity<>(httpHeaders);
        try {

            ResponseEntity<Company[]> responseEntity = restTemplate.exchange("http://localhost:8181/services/companies", HttpMethod.GET, companyHttpEntity, Company[].class);
            model.addAttribute("companies", responseEntity.getBody());

            System.out.println(responseEntity.getBody().length);
        }catch (HttpStatusCodeException e){
            ResponseEntity responseEntity=ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders()).body(e.getResponseBodyAsString());
            model.addAttribute("error",responseEntity);
        }

        return "secure";
    }
}
