package com.lmk.routfeign.controller;

import com.lmk.routfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class HiController {

    @Autowired
    FeignService feignService;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello world";
    }

    @RequestMapping(value = "/happy",method = RequestMethod.GET)
    public String sayHi(@RequestParam String feihua){
        System.out.println("happy");
        return feignService.sayHiFromClientOne(feihua);
    }
}