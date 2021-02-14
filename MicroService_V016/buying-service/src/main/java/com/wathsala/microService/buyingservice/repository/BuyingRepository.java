package com.wathsala.microService.buyingservice.repository;

import com.wathsala.microService.buyingcloudmodel.transaction.Buying;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author acer on 2/14/2021
 */
public interface BuyingRepository extends JpaRepository<Buying,Integer> {
}
