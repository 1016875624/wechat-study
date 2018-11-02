package com.example.wechatrobot.robot.message.entity;

import com.example.wechatrobot.robot.login.entity.SyncKeyEntity;
import com.example.wechatrobot.robot.user.entity.Contact;
import com.example.wechatrobot.robot.user.entity.GroupMember;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GetMessageResponse {

    /**
     * BaseResponse : {"Ret":0,"ErrMsg":""}
     * AddMsgCount : 1
     * AddMsgList : [{"MsgId":"3522007654768255042","FromUserName":"@bdd4adf2199be874698ea0efc6689042390fcb47173b4835a19bcc724e309bab","ToUserName":"@bdd4adf2199be874698ea0efc6689042390fcb47173b4835a19bcc724e309bab","MsgType":51,"Content":"","Status":3,"ImgStatus":1,"CreateTime":1541144646,"VoiceLength":0,"PlayLength":0,"FileName":"","FileSize":"","MediaId":"","Url":"","AppMsgType":0,"StatusNotifyCode":4,"StatusNotifyUserName":"@d2508c018f42cff04eb367a4ba3fd2b2f11c45563ecbcc63fe36f098157c82ca,filehelper,@a7dd63ace8e328b98c22a4418e83f3e7,@9103775be4198b5b0883c2e99f34ef89,@cb0728b57449ec04f6ebd2bd671a562a,@7ccfe9ce541df97fd0688b4b61571d77,@6fb41f1e1710759ae8da8ee47a0e47c9,@61cbb29cf7fdf83541953ce5945af91a,@dec8d14b24c29cf07ce0b5f8def6949d,@04d15b678c7dd7a244e6efe7c28e1e19,@6504ba71350482077a221590f7443b14,weixin","RecommendInfo":{"UserName":"","NickName":"","QQNum":0,"Province":"","City":"","Content":"","Signature":"","Alias":"","Scene":0,"VerifyFlag":0,"AttrStatus":0,"Sex":0,"Ticket":"","OpCode":0},"ForwardFlag":0,"AppInfo":{"AppID":"","Type":0},"HasProductId":0,"Ticket":"","ImgHeight":0,"ImgWidth":0,"SubMsgType":0,"NewMsgId":3522007654768255042,"OriContent":"","EncryFileName":""}]
     * ModContactCount : 0
     * ModContactList : []
     * DelContactCount : 0
     * DelContactList : []
     * ModChatRoomMemberCount : 0
     * ModChatRoomMemberList : []
     * Profile : {"BitFlag":0,"UserName":{"Buff":""},"NickName":{"Buff":""},"BindUin":0,"BindEmail":{"Buff":""},"BindMobile":{"Buff":""},"Status":0,"Sex":0,"PersonalCard":0,"Alias":"","HeadImgUpdateFlag":0,"HeadImgUrl":"","Signature":""}
     * ContinueFlag : 0
     * SyncKey : {"Count":7,"List":[{"Key":1,"Val":682172431},{"Key":2,"Val":682172520},{"Key":3,"Val":682172434},{"Key":11,"Val":682170018},{"Key":201,"Val":1541144646},{"Key":1000,"Val":1541139482},{"Key":1001,"Val":1541139555}]}
     * SKey :
     * SyncCheckKey : {"Count":7,"List":[{"Key":1,"Val":682172431},{"Key":2,"Val":682172520},{"Key":3,"Val":682172434},{"Key":11,"Val":682170018},{"Key":201,"Val":1541144646},{"Key":1000,"Val":1541139482},{"Key":1001,"Val":1541139555}]}
     */

    private int AddMsgCount;

    private int ModContactCount;

    private int DelContactCount;

    private int ModChatRoomMemberCount;

    private int ContinueFlag;

    private List<Contact> ModContactList=new ArrayList<>();

    private List<Contact> DelContactList=new ArrayList<>();

    private List<GroupMember> ModChatRoomMemberList=new ArrayList<>();

    private List<Message> AddMsgList=new ArrayList<>();

    private SyncKeyEntity SyncKey;

    private SyncKeyEntity SyncCheckKey;

}
