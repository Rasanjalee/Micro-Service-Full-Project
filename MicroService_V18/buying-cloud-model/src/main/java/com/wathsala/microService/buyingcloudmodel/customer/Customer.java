package com.wathsala.microService.buyingcloudmodel.customer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author acer on 2/13/2021
 */
@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue
    int id;


    String name;
    int price;
    LocalDateTime date;

    public Customer(int id, String name, int price, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }
    public Customer(){

    }
}
