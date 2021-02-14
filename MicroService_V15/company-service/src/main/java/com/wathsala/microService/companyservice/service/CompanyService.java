package com.wathsala.microService.companyservice.service;

import com.wathsala.microService.buyingcloudmodel.company.Company;

import java.util.List;

/**
 * @author acer on 2/13/2021
 */
public interface CompanyService {
    Company save(Company company);

    Company findById(int id);

    List<Company> findAll();
}
