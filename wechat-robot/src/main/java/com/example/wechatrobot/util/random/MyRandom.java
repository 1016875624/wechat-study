package com.example.wechatrobot.util.random;

import java.util.Random;

public class MyRandom {
    public static String random(int length){
        StringBuffer sb=new StringBuffer();
        Random random=new Random(System.currentTimeMillis());
        for (int i = 0; i < length; i++) {
             sb.append(random.nextInt(9));
        }
        return sb.toString();
    }
}
