package com.example.demo.contrller;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wz on 2018/3/4.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 根据username查找数据
     * @param username
     * @return
     */
    @RequestMapping("/findAll/{username}")
    public List<User> findAll(@PathVariable("username") String username){
        return userService.findByUsername(username);
    }

    /**
     * 添加数据
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/saveUser")
    public User saveUser(@RequestParam("username") String username,@RequestParam("password") String password) {

        User u=new User();
        u.setUsername(username);
        u.setPassword(password);
        return userService.insert(u);


    }

    /**
     * 查询个数
     * @return
     */
    @RequestMapping("/findCount")
    public Long find(){
      return  userService.findCount();
    }
}
