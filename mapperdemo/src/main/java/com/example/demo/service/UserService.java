package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

/**
 * Created by wz on 2018/3/4.
 */
public interface UserService {
    List<User> findByUsername(String username);
    User insert(User user);
    Long findCount();
    //com.example.demo.service.Service.impl.UserServiceImpl
}
