package com.wathsala.microService.buyingservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import java.util.function.Supplier;

/**
 * @author acer on 2/15/2021
 */
public class CommonHystrixCommad <T> extends HystrixCommand<T> {
    Supplier<T> execute;
    Supplier<T> fallback;

    public CommonHystrixCommad(String group,Supplier<T> execute){
        super(HystrixCommandGroupKey.Factory.asKey(group));
        this.execute=execute;
    }
    public CommonHystrixCommad(Setter config,Supplier<T> execute){
        super(config);
        this.execute=execute;
    }
    public CommonHystrixCommad(String group,Supplier<T> execute,Supplier<T> fallback){
        super(HystrixCommandGroupKey.Factory.asKey(group));
        this.execute=execute;
        this.fallback=fallback;
    }
    public CommonHystrixCommad(Setter config,Supplier<T> execute,Supplier<T> fallback){
        super(config);
        this.execute=execute;
        this.fallback=fallback;

    }

    @Override
    protected T run() throws Exception {
        return execute.get();
    }

    @Override
    protected T getFallback() {
        if(fallback!=null){
            return fallback.get();
        }
        return super.getFallback();
    }
}
