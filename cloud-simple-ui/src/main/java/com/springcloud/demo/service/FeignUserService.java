package com.springcloud.demo.service;

import com.springcloud.demo.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 描述：
 * feign远程调用
 *
 * @author chentianlong
 * @create 2017/12/19 14:23
 */
@Component
@FeignClient(value = "cloud-simple-service",fallback = FeignUserServiceFailure.class)
public interface FeignUserService {

    @RequestMapping("/user")
    List<User> searchAll();
}
