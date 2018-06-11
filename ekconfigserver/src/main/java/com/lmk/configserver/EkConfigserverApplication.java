package com.lmk.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class EkConfigserverApplication {

    /*
    *
    * 参考: http://blog.didispace.com/springcloud4/
    * 参考二: https://blog.coding.net/blog/spring-cloud-config
    * 参考三： https://blog.csdn.net/forezp/article/details/70037291
    * 注意yml uri 后面加空格
    *
    * {application} 与项目中
    *
    * https://github.com/gzm2015/MySpringCloudConfigTestRep.git/config-server-test.properties 内容
    *devMode: true
    loging.file: demo
    spring.application.name: billing
    spring.jdbc.host: localhost
    spring.jdbc.password: 123qwe
    spring.jdbc.port: 3306
    spring.jdbc.user: root
    *
    *
    * 用git 仓库中 config-server-test.properties 分割为对应值
    *
    * {application}=config-server
    * {profile} = test
    * {label} 对应的 分支 当前为 test 分支
    *
    *
     /{application}/{profile}[/{label}]
      /{application}-{profile}.yml
      /{label}/{application}-{profile}.yml
      /{application}-{profile}.properties
      /{label}/{application}-{profile}.properties
    */

    //http://localhost:2229/test/config-server-test.json
    //http://localhost:2229/config-server/test/test
    //http://localhost:2229/config-server-test.properties  主线上啥也没有
    //http://localhost:2229/test/config-server-test.properties


    /*
    *
    * 配置了消息总线连接 ekconfigclient ekconfigclient2
    * 修改 git 中参数以后
    * post http://localhost:2229/bus/refresh
    * 请求
    * http://localhost:2231/ekconfig2/hi
    * http://localhost:2230/ekconfig/hi
    * 发现均被修改
    * */
    //这里ekconfigserver的地位相当于 ekclient 都是注册中心下面的一个 生产者
    public static void main(String[] args) {
        SpringApplication.run(EkConfigserverApplication.class, args);
    }
}
