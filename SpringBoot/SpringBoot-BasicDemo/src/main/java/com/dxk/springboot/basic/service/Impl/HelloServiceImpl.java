package com.dxk.springboot.basic.service.Impl;

import com.dxk.springboot.basic.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Date: 2021/10/8 22:35
 * @Author: DingXingKai
 * @Description: 实现类
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "您好吗？" + name;
    }
}
