package com.lmk.sleuth;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SleuthApplication {

    private final Logger logger = Logger.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /*
    *
    * http://localhost:2232/trace-1
    * trace1 module log
    * INFO [trace-1,6435a71294202eec,6435a71294202eec,false] 16032 --- [nio-2232-exec-6] ication$$EnhancerBySpringCGLIB$$8409b5dd : ===call trace-1===
    * trace2 module log
    * INFO [trace-2,6435a71294202eec,0e259e88eb11c4d9,false] 352 --- [nio-2233-exec-4] ication$$EnhancerBySpringCGLIB$$4d661045 : ===call trace-2===
    *
    * Trace ID 6435a71294202eec
    * */


    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        logger.info("===call trace-1===");
        return restTemplate().getForEntity("http://trace-2/trace-2", String.class).getBody();
    }

}
