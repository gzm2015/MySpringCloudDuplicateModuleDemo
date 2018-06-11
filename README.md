#项目说明
玩票性质的spirng cloud 学习用demo 参考依照下面专栏做的

#参考教程  
[方志朋 csdn 专栏](https://blog.csdn.net/forezp/article/category/6830968/2)  
[翟永超Spring Cloud基础教程](https://blog.coding.net/blog/spring-cloud-config)  
[其他参考1](https://yujunhao8831.github.io/2017/05/27/Spring-Cloud-Eureka-%E5%AD%A6%E4%B9%A0%E7%AC%94%E8%AE%B0/)  
[其他参考2](http://blog.didispace.com/Spring-Cloud%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B/)

#项目配置
```
jdk 1.8  
rabbitmq 2.2  
idea 2018.1
```
#各模块说明  
| 模块名        | 端口号    |  服务名  |  作用  |
| ---  | -----  | ---- | ------ |
| ekserver|1111|/|项目注册中心|
| ekclient| 2222|   service-hi    |服务提供者|
| ekclient2|2223|   service-hi    |服务提供者|
| routfeign|2224|   service-feign|服务消费者 ekserver 获取service-hi并消费（自带负载均衡） 熔断测试| 
| hystrixdasboard        | 2225     |  hystrix-dasboard    | 熔断后台查看|
| zuul       | 2226      |   service-zuul    |api 网关  调用对外接口服务 service-feign|
| configserver|2227| config-server      |   配置中心服务提供者  连接git resp 获取配置  |
| configserver        | 2228      | config-server      |   配置中心服务消费者    |
| ekconfigserver        | 2229      |   ekconfig-center    |  配置服务提供中心 总线刷新位置|
| ekconfigclient        | 2230      |   ekconfig-client    |  配置服务消费者|
| ekconfigclient2        | 2231      |   ekconfig-client    |  配置服务消费者|
| sleuth       | 2232      |   trace-1    |  消息追踪1 调用 trace2|
| sleuth2       | 2233      |   trace-2    |  消息追踪2|
| zipkin       | 2234      |   trace-2    |  zipkin 消息追踪控制台 支持trace1 tarce2 调用的查看|
| zipkinstreamserver       | 2235      |   zipkinstream-server    |  trace1 tarce2 rabbitmq 整合|
| stream       |  |  | 消息驱动微服务展示|


#各模块说明  
| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |






