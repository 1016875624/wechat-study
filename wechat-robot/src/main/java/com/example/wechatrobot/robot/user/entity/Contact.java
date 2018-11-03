package com.example.wechatrobot.robot.user.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Contact {

    /**
     * Uin : 0
     * UserName : @7bf9d26496bb0704b1a0b5d7576aac56
     * NickName : 超搞漫画
     * HeadImgUrl : /cgi-bin/mmwebwx-bin/webwxgeticon?seq=677643749&username=@7bf9d26496bb0704b1a0b5d7576aac56&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44
     * ContactFlag : 3
     * MemberCount : 0
     * MemberList : []
     * RemarkName :
     * HideInputBarFlag : 0
     * Sex : 0
     * Signature : 内涵漫画  邪恶漫画  恐怖漫画 各类精品漫画持续更新，给你生活增添色彩！
     * VerifyFlag : 8
     * OwnerUin : 0
     * PYInitial : CGMH
     * PYQuanPin : chaogaomanhua
     * RemarkPYInitial :
     * RemarkPYQuanPin :
     * StarFriend : 0
     * AppAccountFlag : 0
     * Statues : 0
     * AttrStatus : 0
     * Province : 河北
     * City : 石家庄
     * Alias :
     * SnsFlag : 0
     * UniFriend : 0
     * DisplayName :
     * ChatRoomId : 0
     * KeyWord : gh_
     * EncryChatRoomId :
     * IsOwner : 0
     */

    private int Uin;
    private String UserName;
    private String NickName;
    private String HeadImgUrl;
    /**
     * 联系人标志
     * 正常的为2563
     * 企业号为3
     * 文件助手为2
     *
     */
    private int ContactFlag;
    private int MemberCount;
    private String RemarkName;
    private int HideInputBarFlag;
    private int Sex;
    private String Signature;
    private int VerifyFlag;
    private int OwnerUin;
    private String PYInitial;
    private String PYQuanPin;
    private String RemarkPYInitial;
    private String RemarkPYQuanPin;
    private int StarFriend;
    private int AppAccountFlag;
    private int Statues;
    private String AttrStatus;
    private String Province;
    private String City;
    private String Alias;
    private int SnsFlag;
    private int UniFriend;
    private String DisplayName;
    private int ChatRoomId;
    private String KeyWord;
    private String EncryChatRoomId;
    private int IsOwner;
    private List<GroupMember> MemberList=new ArrayList<>();

}
