package com.wathsala.microServie.sellingprocesstask.service;

import org.springframework.stereotype.Service;

/**
 * @author acer on 2/13/2021
 */
@Service
public class SellingProcessServiceImpl implements SellingProcessService{
    @Override
    public boolean validateRegistrationNo(String registrationNo) {
        return registrationNo.length()==10;
    }
}
