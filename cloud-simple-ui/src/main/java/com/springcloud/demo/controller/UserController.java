package com.springcloud.demo.controller;

import com.springcloud.demo.model.User;
import com.springcloud.demo.service.FeignUserService;
import com.springcloud.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author chentianlong
 * @create 2017/12/19 10:09
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private FeignUserService feignUserService;

    /*@GetMapping("/users")
    public ResponseEntity<List<User>> readUserInfo(){
        List<User> users=userService.getAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }*/

    @GetMapping("/searchAll")
    public ResponseEntity<List<User>> searchAll(){
        List<User> users=feignUserService.searchAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}
