package com.springcloud.demo.service;

import com.springcloud.demo.model.User;

import java.util.List;

/**
 * 描述：
 *
 * @author chentianlong
 * @create 2017/12/15 15:27
 */
public interface UserService {
    public List<User> findAll();
}
