package com.wathsala.microService.sellingCloud.Controller;

import com.wathsala.microService.sellingCloud.Service.CompanyService;
import com.wathsala.microService.sellingCloud.data.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author acer on 2/9/2021
 */
@RestController
@RequestMapping(value = "/services")
public class CompanyController {


    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "/company",method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Company save(@RequestBody Company company){
        return companyService.save(company);
    }

    @RequestMapping(value = "/company",method = RequestMethod.GET)
    public Company fetchCompanyById(@RequestParam int id){
        return companyService.fetchCompanyById(id);
    }

    @RequestMapping(value = "/companies",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_operator')")
    public List<Company> fetchAllCompanies(){
        return companyService.fetchAllCompanies();
    }
}
