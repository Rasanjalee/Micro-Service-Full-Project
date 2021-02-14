package com.wathsala.microService.rentCloud.Controller;

import com.wathsala.microService.rentCloud.Service.CompanyService;
import com.wathsala.microService.rentCloud.memo.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Company save(@RequestBody Company company){
        return companyService.save(company);
    }

    @RequestMapping(value = "/company",method = RequestMethod.GET)
    public Company fetchCustomerById(@RequestParam int id){
        return companyService.fetchCustomerById(id);
    }

    @RequestMapping(value = "/companies",method = RequestMethod.GET)
    public List<Company> fetchAllCustomers(){
        return companyService.fetchAllCustomer();
    }
}
