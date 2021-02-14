package com.wathsala.practical.demo.application.service;

import com.wathsala.practical.demo.application.model.Item;
import com.wathsala.practical.demo.application.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author acer on 2/7/2021
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public Item fetchItemById(int id){
        Optional<Item> item = itemRepository.findById(id);
        if(item.isPresent()){
           return item.get();
        }
        else
            return null;
    }
}
