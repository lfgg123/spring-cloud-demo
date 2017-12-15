package com.springcloud.demo.service.impl;

import com.springcloud.demo.dao.UserMapper;
import com.springcloud.demo.model.User;
import com.springcloud.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @author chentianlong
 * @create 2017/12/15 15:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
