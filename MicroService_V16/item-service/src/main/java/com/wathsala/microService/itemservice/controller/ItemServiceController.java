package com.wathsala.microService.itemservice.controller;

import com.wathsala.microService.buyingcloudmodel.item.Item;
import com.wathsala.microService.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author acer on 2/13/2021
 */
@RestController
@RequestMapping(value = "/services/items")
public class ItemServiceController {
    @Autowired
    ItemService itemService;

    @PostMapping
    public Item save (@RequestBody Item customer){
        return itemService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Item getCustomer(@PathVariable int id) {

        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return itemService.findById(id);
    }

    @GetMapping
    public List<Item> getAllCustomers() {
        return itemService.findAll();
    }
}
