package com.wathsala.microService.buyingservice.service;

import com.wathsala.microService.buyingcloudmodel.company.Company;
import com.wathsala.microService.buyingcloudmodel.item.Item;
import com.wathsala.microService.buyingcloudmodel.transaction.Buying;
import com.wathsala.microService.buyingservice.model.DetailResponse;
import com.wathsala.microService.buyingservice.repository.BuyingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * @author acer on 2/14/2021
 */
@Service
public class BuyingServiceImpl implements BuyingService{
    @Autowired
    BuyingRepository buyingRepository;

    @Autowired
    RestTemplate restTemplate;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Override
    public Buying save(Buying company) {
        return buyingRepository.save(company);
    }

    @Override
    public Buying findById(int id) {
         Optional<Buying> buying=buyingRepository.findById(id);
         if (buying.isPresent())
        return buying.get();
         else
             return new Buying();

    }

    @Override
    public List<Buying> findAll() {
        return buyingRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) {
        Buying buying = findById(id);
        Company company= getCompany(buying.getCompanyId());
        Item item =  getItem(buying.getItemId());

        return new DetailResponse(buying,company,item);
    }

    private Company getCompany(int companyId){

        return restTemplate.getForObject("http://localhost:8080/services/companies/"+companyId,Company.class);

    }

    private Item getItem(int itemId){

        return restTemplate.getForObject("http://localhost:9191/services/items/"+itemId,Item.class);


    }
}
