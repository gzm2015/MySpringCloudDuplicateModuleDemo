package com.lmk.routfeign.service;

import com.lmk.routfeign.RoutfeignApplication;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by LiuMengKe on 2018/6/6.
 */
//指定调用的服务
@FeignClient(value = "SERVICE-HI",fallbackFactory = SchedualServiceHiHystric.class)
public interface FeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "feihua") String feihua);


}
