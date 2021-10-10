package com.dxk.springmvc.maven.controller;

import com.dxk.springmvc.maven.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Date: 2021/10/8 22:53
 * @Author: DingXingKai
 * @Description: 控制层
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    /**
     * @Description: http://127.0.0.1/hello/dxk
     * @Date: 2021/10/8 23:00
     * @Author: dingxk
     */
    @GetMapping(value = "/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable(name = "name") String name) {
        return helloService.sayHello(name);
    }
}
