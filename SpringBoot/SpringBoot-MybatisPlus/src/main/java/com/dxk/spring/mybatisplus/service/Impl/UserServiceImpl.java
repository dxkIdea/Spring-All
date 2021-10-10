package com.dxk.spring.mybatisplus.service.Impl;

import com.dxk.spring.mybatisplus.domain.User;
import com.dxk.spring.mybatisplus.mapper.UserMapper;
import com.dxk.spring.mybatisplus.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date: 2021/10/10 23:45
 * @Author: DingXingKai
 * @Description: 用户操作实现类
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
