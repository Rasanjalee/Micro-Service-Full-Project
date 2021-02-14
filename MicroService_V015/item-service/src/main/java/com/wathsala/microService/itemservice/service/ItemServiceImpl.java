package com.wathsala.microService.itemservice.service;

import com.wathsala.microService.buyingcloudmodel.item.Item;
import com.wathsala.microService.itemservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author acer on 2/13/2021
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item findById(int id) {
        Optional<Item> item = itemRepository.findById(id);
        return item.get();
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}
