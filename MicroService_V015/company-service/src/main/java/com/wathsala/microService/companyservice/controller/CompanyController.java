package com.wathsala.microService.companyservice.controller;

import com.wathsala.microService.buyingcloudmodel.company.Company;
import com.wathsala.microService.companyservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author acer on 2/13/2021
 */
@RestController
@RequestMapping(value = "/services/companies")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping
    public Company save (@RequestBody Company company){
        return companyService.save(company);
    }

    @GetMapping(value = "/{id}")
    public Company getCompany(@PathVariable int id) {

        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return companyService.findById(id);
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.findAll();
    }
}
