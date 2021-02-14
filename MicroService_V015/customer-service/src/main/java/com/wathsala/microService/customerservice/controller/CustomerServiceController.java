package com.wathsala.microService.customerservice.controller;

import com.wathsala.microService.buyingcloudmodel.customer.Customer;
import com.wathsala.microService.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author acer on 2/13/2021
 */
@RestController
@RequestMapping("/services/customers")
public class CustomerServiceController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save (@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable int id) {

        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return customerService.findById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }
}
