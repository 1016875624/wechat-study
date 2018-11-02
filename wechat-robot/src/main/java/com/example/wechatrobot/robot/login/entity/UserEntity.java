package com.example.wechatrobot.robot.login.entity;

import lombok.Data;

@Data
public class UserEntity {


    private String Uin;

    /**
     * 临时id
     */
    private String UserName;
    /**
     * 昵称
     */
    private String NickName;
    /**
     * 头像地址
     */
    private String HeadImgUrl;
    /**
     * 备注名
     */
    private String RemarkName;
    /**
     * 拼音首字母
     */
    private String PYInitial;
    /**
     * 拼音全拼
     */
    private String PYQuanPin;
    /**
     * 备注名首字母
     */
    private String RemarkPYInitial;
    /**
     * 备注名全拼
     */
    private String RemarkPYQuanPin;
    private int HideInputBarFlag;
    private int StarFriend;
    private int Sex;
    private String Signature;
    private int AppAccountFlag;
    private int VerifyFlag;
    private int ContactFlag;
    private int WebWxPluginSwitch;
    private int HeadImgFlag;
    private int SnsFlag;
}
