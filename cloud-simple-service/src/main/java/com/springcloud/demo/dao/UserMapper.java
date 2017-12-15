package com.springcloud.demo.dao;

import com.springcloud.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 描述：
 *
 * @author chentianlong
 * @create 2017/12/15 15:26
 */
public interface UserMapper {

    public List<User> findAll();
}
