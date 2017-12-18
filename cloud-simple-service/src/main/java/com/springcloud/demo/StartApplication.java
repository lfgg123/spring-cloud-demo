package com.springcloud.demo;

import com.springcloud.demo.configuration.DataSourceProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 描述：
 * 启动
 *
 * @author chentianlong
 * @create 2017/12/15 15:13
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(DataSourceProperties.class)
@MapperScan(basePackages = {"com.springcloud.demo.dao"})
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}
