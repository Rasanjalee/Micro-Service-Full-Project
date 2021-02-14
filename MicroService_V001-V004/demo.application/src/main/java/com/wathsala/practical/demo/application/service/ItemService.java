package com.wathsala.practical.demo.application.service;

import com.wathsala.practical.demo.application.model.Item;

/**
 * @author acer on 2/7/2021
 */
public interface ItemService {
    public Item save(Item item);
    public Item fetchItemById(int id);

}
