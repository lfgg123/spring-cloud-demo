package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 * 启动
 *
 * @author chentianlong
 * @create 2017/12/21 11:58
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home(){
        return "Hello Docker World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
