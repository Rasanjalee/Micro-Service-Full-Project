package com.wathsala.practical.demo.application.controller;

import com.wathsala.practical.demo.application.model.Item;
import com.wathsala.practical.demo.application.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author acer on 2/6/2021
 */
@RestController
public class MainController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getString(){
        return "hello world";
    }

    @RequestMapping(value = "/school",method = RequestMethod.POST)
    public Item save(@RequestBody Item item){
        return itemService.save(item);

    }

    @RequestMapping(value = "/item",method = RequestMethod.GET)
    public ResponseEntity<Item> fetchItem(@RequestParam int id){
        Item item = itemService.fetchItemById(id);
        if(item == null){
            return ResponseEntity.notFound().build();
        }
        else
            return ResponseEntity.ok().body(item);
    }

}
