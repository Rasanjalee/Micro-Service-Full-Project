package com.wathsala.practical.demo.application.repository;

import com.wathsala.practical.demo.application.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author acer on 2/7/2021
 */
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
