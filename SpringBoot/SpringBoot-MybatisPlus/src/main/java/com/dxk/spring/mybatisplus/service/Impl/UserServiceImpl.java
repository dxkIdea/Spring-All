package com.dxk.spring.mybatisplus.service.Impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dxk.spring.mybatisplus.domain.User;
import com.dxk.spring.mybatisplus.mapper.UserMapper;
import com.dxk.spring.mybatisplus.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Date: 2021/10/10 23:45
 * @Author: DingXingKai
 * @Description: 用户操作实现类
 */
@Slf4j
@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService<User> {

}
