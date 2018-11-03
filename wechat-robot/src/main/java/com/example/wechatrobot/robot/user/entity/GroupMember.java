package com.example.wechatrobot.robot.user.entity;

import lombok.Data;

@Data
public class GroupMember {

    /**
     * Uin : 0
     * UserName : @84b419ea3b8e1f8f18b01ef8bd4538ae405c125b16f1bdddc95b0fdfc4f2a73a
     * NickName : 才疏学浅
     * AttrStatus : 135205
     * PYInitial :
     * PYQuanPin :
     * RemarkPYInitial :
     * RemarkPYQuanPin :
     * MemberStatus : 0
     * DisplayName :
     * KeyWord :
     */

    private int Uin;
    private String UserName;
    /**
     * 如果有备注名则是备注名，没有的话，就是昵称
     */
    private String NickName;
    private String AttrStatus;
    private String PYInitial;
    private String PYQuanPin;
    private String RemarkPYInitial;
    private String RemarkPYQuanPin;
    private int MemberStatus;

    /**
     * 群名片
     */
    private String DisplayName;
    private String KeyWord;

}
