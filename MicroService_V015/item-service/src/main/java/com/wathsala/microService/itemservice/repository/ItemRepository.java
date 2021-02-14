package com.wathsala.microService.itemservice.repository;

import com.wathsala.microService.buyingcloudmodel.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author acer on 2/13/2021
 */
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
