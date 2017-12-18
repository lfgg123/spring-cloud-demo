package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述：
 * Eureka服务
 *
 * @author chentianlong
 * @create 2017/12/18 16:07
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer.class,args);
    }
}
