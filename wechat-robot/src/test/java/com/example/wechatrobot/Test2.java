package com.example.wechatrobot;

import com.alibaba.fastjson.JSON;
import com.example.wechatrobot.robot.entity.BaseReqeust;
import com.example.wechatrobot.util.random.MyRandom;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class Test2 {
    @Test
    public void test(){
        //目前时间戳的长度为13为
        System.out.println(System.currentTimeMillis());

        System.out.println("1541067985796".length());
        System.out.println(Math.random());
        System.out.println(String.valueOf(Math.random()).substring(2,15));
        System.out.println(String.valueOf(Math.random()).substring(2,17).length());
        System.out.println("0.7273831937599815".length());
        System.out.println(System.getProperties().getProperty("os.name"));
    }

    @Test
    public void test1(){
        System.out.println("@@5ee05e2178509afa53e14b13f3bbf298".length());
        BaseReqeust baseReqeust=new BaseReqeust();
        baseReqeust.setUin("1100|");
        baseReqeust.setSkey("0000");
        baseReqeust.setSid("6666");
        System.out.println(JSON.toJSONString(baseReqeust));
        ObjectMapper om=new ObjectMapper();
        try {
            System.out.println(om.writeValueAsString(baseReqeust));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        System.out.println(MyRandom.random(10).length());
        System.out.println(MyRandom.random(10));
    }
}
