package com.wathsala.microService.customerservice.repository;

import com.wathsala.microService.buyingcloudmodel.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author acer on 2/13/2021
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
