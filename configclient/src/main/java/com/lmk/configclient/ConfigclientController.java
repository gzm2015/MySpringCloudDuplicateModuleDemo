package com.lmk.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuMengKe
 * @create 2018-06-07-15:12
 */
@RefreshScope
@RestController
public class ConfigclientController {


    @Value("${devMode}")
    private String devMode;



    @RequestMapping(value = "/hi")
    public String hi(){
        return devMode;
    }

}
