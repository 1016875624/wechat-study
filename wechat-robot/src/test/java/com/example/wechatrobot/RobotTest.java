package com.example.wechatrobot;

import com.alibaba.fastjson.JSON;
import com.example.wechatrobot.robot.login.service.LoginService;
import com.example.wechatrobot.robot.message.service.MessageService;
import com.example.wechatrobot.robot.user.entity.ContactStore;
import com.example.wechatrobot.robot.user.service.UserService;
import com.example.wechatrobot.util.okhttp.CookieJarImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RobotTest {

    @Autowired
    LoginService loginService;

    @Autowired
    UserService userService;

    @Autowired
    ContactStore contactStore;

    @Autowired
    MessageService messageService;

    @Autowired
    CookieJarImpl cookieJar;

    @Test
    public void contextLoads() throws IOException {
        loginService.getUUID();
        loginService.getQrcode();
        loginService.showQrcode();
        loginService.waitLogin();
        loginService.saveParam();
        loginService.wxinit();
        loginService.webwxstatusnotify();
        userService.getContacts();
        userService.getGroupMembers();
        System.out.println(JSON.toJSONString(contactStore));
        messageService.waitMessage();
    }

}
