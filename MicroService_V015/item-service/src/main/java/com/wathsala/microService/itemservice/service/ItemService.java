package com.wathsala.microService.itemservice.service;

import com.wathsala.microService.buyingcloudmodel.item.Item;

import java.util.List;

/**
 * @author acer on 2/13/2021
 */
public interface ItemService {
    Item save(Item customer);

    Item findById(int id);

    List<Item> findAll();
}
