package com.example.demo.service.Service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wz on 2018/3/4.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findByUsername(String username) {
        return userMapper.selectUserByName(username);
    }

    @Override
    public User insert(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public Long findCount() {
        return userMapper.findCount();
    }
}
