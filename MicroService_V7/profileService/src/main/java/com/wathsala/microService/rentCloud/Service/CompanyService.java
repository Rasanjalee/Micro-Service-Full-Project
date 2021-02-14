package com.wathsala.microService.rentCloud.Service;

import com.wathsala.microService.rentCloud.memo.model.Company;

import java.util.List;

/**
 * @author acer on 2/9/2021
 */
public interface CompanyService {
    Company save(Company company);
    Company fetchCustomerById(int id);
    List<Company> fetchAllCustomer();

}
