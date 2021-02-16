package com.wathsala.microService.buyingservice.model;

import com.wathsala.microService.buyingcloudmodel.company.Company;
import com.wathsala.microService.buyingcloudmodel.item.Item;
import com.wathsala.microService.buyingcloudmodel.transaction.Buying;

/**
 * @author acer on 2/14/2021
 */
public class DetailResponse  implements Response{
    Buying buying;
    Company company;
    Item item;

    public DetailResponse(Buying buying, Company company, Item item) {
        this.buying = buying;
        this.company = company;
        this.item = item;
    }

    public Buying getBuying() {
        return buying;
    }

    public void setBuying(Buying buying) {
        this.buying = buying;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
