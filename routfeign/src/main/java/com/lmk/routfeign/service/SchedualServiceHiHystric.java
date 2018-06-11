package com.lmk.routfeign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-06-07-9:12
 */
@Component
public class SchedualServiceHiHystric implements FallbackFactory<FeignService> {


    @Override
    public FeignService create(Throwable throwable) {
       return (x)->"sorry"+x;
    }

    /*@Override
    public String sayHiFromClientOne(String feihua) {
        return "sorry"+feihua;
    }*/
}
