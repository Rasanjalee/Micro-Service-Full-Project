package com.wathsala.microService.buyingservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.wathsala.microService.buyingcloudmodel.item.Item;
import org.springframework.web.client.RestTemplate;

/**
 * @author acer on 2/15/2021
 */
public class ItemCommand extends HystrixCommand<Item> {

    RestTemplate restTemplate;
    int itemId;

    public ItemCommand(RestTemplate restTemplate,int itemId){

        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.itemId=itemId;
        this.restTemplate=restTemplate;
    }
    @Override
    protected Item run() throws Exception {
        return restTemplate.getForObject("http://item/services/items/"+itemId,Item.class);
    }

    @Override
    protected Item getFallback() {
        return new Item();
    }
}
