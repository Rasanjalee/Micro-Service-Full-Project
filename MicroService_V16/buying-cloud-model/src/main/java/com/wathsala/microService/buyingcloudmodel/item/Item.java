package com.wathsala.microService.buyingcloudmodel.item;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author acer on 2/13/2021
 */
@Entity
@Table(name = "item")
@Data
public class Item {

    @Id
    @GeneratedValue
    int id;

    String name;
    String type;

    public Item(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Item(){

    }
}
