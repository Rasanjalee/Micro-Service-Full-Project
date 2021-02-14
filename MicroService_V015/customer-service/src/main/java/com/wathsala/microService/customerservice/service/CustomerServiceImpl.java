package com.wathsala.microService.customerservice.service;


import com.wathsala.microService.buyingcloudmodel.customer.Customer;
import com.wathsala.microService.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author acer on 2/13/2021
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.get();
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
