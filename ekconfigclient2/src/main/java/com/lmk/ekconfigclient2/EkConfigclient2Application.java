package com.lmk.ekconfigclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EkConfigclient2Application {

    /*版本二  只在 两个模块中添加了 服务总线*/
    /*注意 EkConfigclient2Application 和 EkConfigclient2Application 都在一个 消息总线上
    * 启动 注册中心  配置中心 和 这两个模块以后
    * 修改 git 仓库上面的值
    * 之后使用postman 发送post请求到 任意一个模块上 查看另外一个模块 controller 里面的值已经改变*/
    /*
    * 注意yml钟 spring.application.name 要相同的值和git仓库钟对应
    * */
    public static void main(String[] args) {
        SpringApplication.run(EkConfigclient2Application.class, args);
    }
}
