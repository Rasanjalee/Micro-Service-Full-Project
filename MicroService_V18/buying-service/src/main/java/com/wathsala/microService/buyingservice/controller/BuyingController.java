package com.wathsala.microService.buyingservice.controller;

import com.wathsala.microService.buyingcloudmodel.transaction.Buying;
import com.wathsala.microService.buyingservice.model.Response;
import com.wathsala.microService.buyingservice.model.SimpleResponse;
import com.wathsala.microService.buyingservice.service.BuyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author acer on 2/14/2021
 */
@RestController
@RequestMapping("/services/buying")
public class BuyingController {

    @Autowired
    BuyingService buyingService;

    @PostMapping
    public Buying save(@RequestBody Buying buying) {
        return buyingService.save(buying);
    }

    @GetMapping(value = "/{id}")
    public Response getBuying(@PathVariable int id, @RequestParam(required = false) String type) throws ExecutionException, InterruptedException {


        if(type==null){
            return  new SimpleResponse(buyingService.findById(id));
        }else{
            return   buyingService.findDetailResponse(id);
        }



    }

    @GetMapping
    public List<Buying> getAllBuying() {
        return buyingService.findAll();
    }



}
