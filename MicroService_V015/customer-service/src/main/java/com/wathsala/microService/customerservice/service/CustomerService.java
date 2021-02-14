package com.wathsala.microService.customerservice.service;

import com.wathsala.microService.buyingcloudmodel.customer.Customer;

import java.util.List;

/**
 * @author acer on 2/13/2021
 */
public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
