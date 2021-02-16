package com.wathsala.microService.buyingservice.service;

import com.wathsala.microService.buyingcloudmodel.transaction.Buying;
import com.wathsala.microService.buyingservice.model.DetailResponse;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author acer on 2/14/2021
 */
public interface BuyingService {
    Buying save(Buying customer);

    Buying findById(int id);

    List<Buying> findAll();

    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;
}
