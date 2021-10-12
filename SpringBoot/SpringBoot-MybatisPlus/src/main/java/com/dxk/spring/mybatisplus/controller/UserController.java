package com.dxk.spring.mybatisplus.controller;

import com.dxk.spring.mybatisplus.domain.User;
import com.dxk.spring.mybatisplus.mapper.UserMapper;
import com.dxk.spring.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2021/10/10 23:43
 * @Author: DingXingKai
 * @Description: 用户控制层
 */
@RestController
public class UserController {
    @Autowired
    private IUserService<User> userService;
    @Autowired
    private UserMapper userMapper;

   /**
    * @Description: 获取所有用户信息
    * @Date: 2021/10/11 0:00
    * @Author: DingXingKai
    */
    @GetMapping(value = "/all/users")
    public String getAllUsers() {
        return userService.list(null).toString();
    }
}
