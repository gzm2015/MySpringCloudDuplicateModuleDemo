package com.lmk.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EkConfigclientApplication {


    //spring-cloud-starter-config 注意后台的pom.xml的依赖是 spring-cloud-starter-config
    //而不是spring-cloud-config-client

    /*
    spring.application.name=didispace
    spring.cloud.config.profile=dev
    spring.cloud.config.label=master
    spring.cloud.config.uri=http://localhost:7001/
    spring.application.name：对应前配置文件中的{application}部分
    spring.cloud.config.profile：对应前配置文件中的{profile}部分
    spring.cloud.config.label：对应前配置文件的git分支
    spring.cloud.config.uri：配置中心的地址

    如果config client 对应的 服务端的信息 卸载 bootstrap.yml 中
    则默认会去 localhost:8888/寻找


    *************！！！！！！！！！！！！！！！eureka的部分和 spring.cloud.config profile那部分必须都在 bootstrap.yml里面*************
    *
    *
    * http://localhost:2230/ekconfig/hi
    * 结果 kkk
    * 同测试分支上 ekconfig-client-test.properties name = kkk 一致
    * 这个模块 spring.application.name 要和 git resp上面的 properties文件名对应
    */
    public static void main(String[] args) {
        SpringApplication.run(EkConfigclientApplication.class, args);
    }

}
