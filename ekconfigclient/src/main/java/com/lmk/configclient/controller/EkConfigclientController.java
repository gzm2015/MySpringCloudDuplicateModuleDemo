package com.lmk.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuMengKe
 * @create 2018-06-07-15:12
 */
@RefreshScope
@RestController
@RequestMapping("/ekconfig")
public class EkConfigclientController {


    @Value("${name}")
    private String name;



    @RequestMapping(value = "/hi")
    public String hi(){
        return name;
    }

}
