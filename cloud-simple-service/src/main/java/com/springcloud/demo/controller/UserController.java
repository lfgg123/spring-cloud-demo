package com.springcloud.demo.controller;

import com.springcloud.demo.model.User;
import com.springcloud.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author chentianlong
 * @create 2017/12/15 15:29
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> finall(){
        return userService.findAll();
    }
}
