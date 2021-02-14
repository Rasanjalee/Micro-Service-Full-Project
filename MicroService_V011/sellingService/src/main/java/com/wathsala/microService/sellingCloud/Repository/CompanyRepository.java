package com.wathsala.microService.sellingCloud.Repository;

import com.wathsala.microService.sellingCloud.data.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author acer on 2/9/2021
 */
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
