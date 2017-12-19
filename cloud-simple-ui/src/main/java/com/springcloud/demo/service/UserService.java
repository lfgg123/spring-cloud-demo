package com.springcloud.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author chentianlong
 * @create 2017/12/19 10:09
 */
@Service
public class UserService {
    /*@Autowired
    private RestTemplate restTemplate;
    final String SERVICE_NAME="cloud-simple-service";

    @HystrixCommand(fallbackMethod = "fallbackGetAll")
    public List<User> getAll(){
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user", List.class);
    }*/

    private List<User> fallbackGetAll(){
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<User> ls = new ArrayList<User>();
        User user = new User();
        user.setUsername("TestHystrix");
        ls.add(user);
        return ls;
    }
}
