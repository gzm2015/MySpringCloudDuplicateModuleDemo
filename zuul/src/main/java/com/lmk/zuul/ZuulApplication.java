package com.lmk.zuul;

import com.lmk.zuul.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {

    //http://localhost:2226/api-b/feign/happy?feihua=lmk
    //添加过滤器后只有加了accessToken参数的才不会被拦截
    //http://localhost:2226/api-b/feign/happy?feihua=lmk&accessToken=abc
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }


    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
