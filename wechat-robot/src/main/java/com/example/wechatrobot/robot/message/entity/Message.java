package com.example.wechatrobot.robot.message.entity;

import lombok.Data;

@Data
public class Message {

    /**
     * MsgId : 2318814520237501922
     * FromUserName : @d2508c018f42cff04eb367a4ba3fd2b2f11c45563ecbcc63fe36f098157c82ca
     * ToUserName : @bdd4adf2199be874698ea0efc6689042390fcb47173b4835a19bcc724e309bab
     * MsgType : 1
     * Content : 111
     * Status : 3
     * ImgStatus : 1
     * CreateTime : 1541144695
     * VoiceLength : 0
     * PlayLength : 0
     * FileName :
     * FileSize :
     * MediaId :
     * Url :
     * AppMsgType : 0
     * StatusNotifyCode : 0
     * StatusNotifyUserName :
     * RecommendInfoEntity : {"UserName":"","NickName":"","QQNum":0,"Province":"","City":"","Content":"","Signature":"","Alias":"","Scene":0,"VerifyFlag":0,"AttrStatus":0,"Sex":0,"Ticket":"","OpCode":0}
     * ForwardFlag : 0
     * AppInfoEntity : {"AppID":"","Type":0}
     * HasProductId : 0
     * Ticket :
     * ImgHeight : 0
     * ImgWidth : 0
     * SubMsgType : 0
     * NewMsgId : 2318814520237501922
     * OriContent :
     * EncryFileName :
     */

    private String MsgId;
    private String FromUserName;
    private String ToUserName;
    private int MsgType;
    private String Content;
    private int Status;
    private int ImgStatus;
    private int CreateTime;
    private int VoiceLength;
    private int PlayLength;
    private String FileName;
    private String FileSize;
    private String MediaId;
    private String Url;
    private int AppMsgType;
    private int StatusNotifyCode;
    private String StatusNotifyUserName;
    private RecommendInfoEntity RecommendInfo;
    private int ForwardFlag;
    private AppInfoEntity AppInfo;
    private int HasProductId;
    private String Ticket;
    private int ImgHeight;
    private int ImgWidth;
    private int SubMsgType;
    private long NewMsgId;
    private String OriContent;
    private String EncryFileName;

}
