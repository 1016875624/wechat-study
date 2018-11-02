package com.example.wechatrobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WechatRobotApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(WechatRobotApplication.class, args);
    }
}
