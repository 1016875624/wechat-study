package com.example.wechatrobot.robot.message.entity;

import lombok.Data;

@Data
public class RecommendInfoEntity {
    private String UserName;
    private String NickName;
    private int QQNum;
    private String Province;
    private String City;
    private String Content;
    private String Signature;
    private String Alias;
    private int Scene;
    private int VerifyFlag;
    private int AttrStatus;
    private int Sex;
    private String Ticket;
    private int OpCode;
}
