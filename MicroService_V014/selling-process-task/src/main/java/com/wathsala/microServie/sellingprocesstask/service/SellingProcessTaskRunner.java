package com.wathsala.microServie.sellingprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @author acer on 2/13/2021
 */
public class SellingProcessTaskRunner implements CommandLineRunner {
    @Autowired
    SellingProcessService sellingProcessService;

    @Override
    public void run(String... args) throws Exception {
        if(args.length>0){
            System.out.println("task running with arguments");
            if(sellingProcessService.validateRegistrationNo(args[0]))
                System.out.println("valid argument");
            else
                System.out.println("invalid argument");
        }
        else
            System.out.println("task running without arguments");
    }
}
