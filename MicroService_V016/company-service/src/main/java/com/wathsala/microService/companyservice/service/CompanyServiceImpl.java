package com.wathsala.microService.companyservice.service;

import com.wathsala.microService.buyingcloudmodel.company.Company;
import com.wathsala.microService.companyservice.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author acer on 2/13/2021
 */
@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company findById(int id) {
        Optional<Company> company = companyRepository.findById(id);
        return company.get();
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
