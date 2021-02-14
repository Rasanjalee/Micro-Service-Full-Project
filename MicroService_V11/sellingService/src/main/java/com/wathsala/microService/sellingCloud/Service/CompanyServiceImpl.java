package com.wathsala.microService.sellingCloud.Service;

import com.wathsala.microService.sellingCloud.Repository.CompanyRepository;
import com.wathsala.microService.sellingCloud.data.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author acer on 2/9/2021
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;


    @Override
    public Company save(Company company){
        return companyRepository.save(company);
    }


    @Override
    public Company fetchCompanyById(int id) {
        Optional<Company> customer = companyRepository.findById(id);
        if(customer.isPresent())
        {
            return customer.get();
        }
        else
            return null;
    }

    @Override
    public List<Company> fetchAllCompanies() {
        return companyRepository.findAll();
    }
}
