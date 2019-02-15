package com.mgp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableDiscoveryClient  //服务注册
@EnableZuulProxy  //服务网关
public class GateWayItem {

    public static void main(String[] args) {
        SpringApplication.run(GateWayItem.class, args);
    }

}
