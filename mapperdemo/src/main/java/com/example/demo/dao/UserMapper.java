package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by wz on 2018/3/4.
 */
@Mapper
@Repository
public interface UserMapper{
    @Select("SELECT * FROM user WHERE username = #{username}")
    List<User> selectUserByName(String username);
    @Insert("INSERT INTO user(username,password) VALUES(#{username}, #{password})")
    User saveUser(User user);
    @Select("SELECT COUNT(*) FROM user")
    Long findCount();


}
