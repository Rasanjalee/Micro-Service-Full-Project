package com.wathsala.microService.buyingcloudmodel.company;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author acer on 2/13/2021
 */
@Entity
@Table(name = "company")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    String name;
    String location;
    String registrationNo;

    @OneToMany(mappedBy = "company")
    private List<Loyality> loyalities;

    public Company(){

    }

    public Company(int id, String name, String location, String registrationNo) {
        Id = id;
        this.name = name;
        this.location = location;
        this.registrationNo = registrationNo;
    }
}
