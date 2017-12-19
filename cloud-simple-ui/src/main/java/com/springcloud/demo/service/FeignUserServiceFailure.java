package com.springcloud.demo.service;

import com.springcloud.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * 熔断机制类
 *
 * @author chentianlong
 * @create 2017/12/19 14:34
 */
@Component
public class FeignUserServiceFailure implements FeignUserService {

    public List<User> searchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<User> ls = new ArrayList<User>();
        User user = new User();
        user.setUsername("TestHystrix");
        ls.add(user);
        return ls;
    }
}
