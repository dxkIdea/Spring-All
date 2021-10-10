package com.dxk.spring.mybatisplus.service;

import com.dxk.spring.mybatisplus.domain.User;

import java.util.List;

/**
 * @Date: 2021/10/10 23:44
 * @Author: DingXingKai
 * @Description: 用户操作接口
 */
public interface IUserService {
    List<User> getAllUsers();
}
