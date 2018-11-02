package com.example.wechatrobot;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatrobot.util.okhttp.CookieJarImpl;
import com.example.wechatrobot.util.okhttp.OkTool;
import com.example.wechatrobot.util.okhttp.persistent.CookieJarPersistent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WechatRobotApplicationTests {

    @Autowired
    private OkTool okTool;
    @Autowired
    private CookieJarImpl cookieJar;

    @Test
    public void contextLoads() throws IOException {
        String html= okTool.url("https://cas.dgut.edu.cn/home/Oauth/getToken/appid/self.html").get();
        String token=html.substring(html.indexOf("var token = \"")+"var token = \"".length());
        token=token.substring(0,token.indexOf("\""));
        String str=okTool.url("https://cas.dgut.edu.cn/home/Oauth/getToken/appid/self.html")
                .addFormData("username", "201541404303").addFormData("password", "ZhuHongJie0")
                .addFormData("__token__", token)
                .addFormData("wechat_verify", "").post();
        System.out.println(str);
        JSONObject jo=JSON.parseObject(str);
        if (jo.getInteger("code")==1){
            System.out.println(jo.getString("info"));
            //System.out.println(okTool.url(jo.getString("info")).get());
        }

        CookieJarPersistent persistent=CookieJarPersistent.toPersistent(cookieJar);
        persistent.saveObject();
        //cookieJar.saveObject();
    }

    @Test
    public void test1(){
        try {
            System.out.println(okTool.url("http://self.dgut.edu.cn/Home/Login?token=self-z-973e9cdb472e413644e7796eba93c551").get());
            CookieJarPersistent persistent=CookieJarPersistent.toPersistent(cookieJar);
            persistent.saveObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2(){
        try {
            System.out.println(okTool.url("http://self.dgut.edu.cn").get());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
