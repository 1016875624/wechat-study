package com.example.wechatrobot.robot.login.entity;

import com.example.wechatrobot.robot.user.entity.Contact;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class LoginEntity {

    /**
     * ChatSet : filehelper,@7cf6087c1c9b2012aaec8575a318bbf8446f54d7fc2069a4283c50787a0281fd,weixin,@7bf9d26496bb0704b1a0b5d7576aac56,@e44ea4a6de5dd4b1f6476c28d0b836a6,@92e5fcab501c2788dadee6f0c86db69b,
     * SKey : @crypt_7151b1c7_1b19516c45d722c5344dda292721ce44
     * ClientVersion : 637993782
     * SystemTime : 1541066095
     * GrayScale : 1
     * InviteStartCount : 40
     * MPSubscribeMsgCount : 3
     */

    private String ChatSet;
    private String SKey;
    private int ClientVersion;
    private int SystemTime;
    private int GrayScale;
    private int InviteStartCount;
    private int MPSubscribeMsgCount;

    private List<Contact>ContactList=new ArrayList<>();
    private SyncKeyEntity SyncKey;
    private UserEntity User;
}
