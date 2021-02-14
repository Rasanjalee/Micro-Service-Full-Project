package com.wathsala.microService.rentCloud.Repository;

import com.wathsala.microService.rentCloud.memo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author acer on 2/9/2021
 */
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
