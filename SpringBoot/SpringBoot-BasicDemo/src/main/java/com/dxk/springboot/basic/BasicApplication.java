package com.dxk.springboot.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Date: 2021/10/8 22:37
 * @Author: DingXingKai
 * @Description: 基础服务启动类
 */
@Slf4j
@SpringBootApplication
public class BasicApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BasicApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        environment.getSystemEnvironment().forEach((environmentKey, environmentValue) -> {
            log.info("环境变量key: {}, value: {}",environmentKey,environmentValue );
        });
    }
}
