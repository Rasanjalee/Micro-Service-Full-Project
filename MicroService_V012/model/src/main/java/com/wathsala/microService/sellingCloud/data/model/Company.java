package com.wathsala.microService.sellingCloud.data.model;

import javax.persistence.*;

/**
 * @author acer on 2/9/2021
 */
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String companyName;
    String companyType;
    String companyLocation;

    public Company(){

    }
    public Company(String companyName, String companyType, String companyLocation) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyLocation = companyLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }
}
