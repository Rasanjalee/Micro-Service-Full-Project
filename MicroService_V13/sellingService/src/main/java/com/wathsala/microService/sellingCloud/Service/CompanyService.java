package com.wathsala.microService.sellingCloud.Service;

import com.wathsala.microService.sellingCloud.data.model.Company;

import java.util.List;

/**
 * @author acer on 2/9/2021
 */
public interface CompanyService {
    Company save(Company company);
    Company fetchCompanyById(int id);
    List<Company> fetchAllCompanies();

}
