package com.wathsala.microService.companyservice.repository;

import com.wathsala.microService.buyingcloudmodel.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author acer on 2/13/2021
 */
public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
