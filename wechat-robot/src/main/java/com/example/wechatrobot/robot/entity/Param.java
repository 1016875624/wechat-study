package com.example.wechatrobot.robot.entity;

import com.example.wechatrobot.robot.login.entity.SyncKeyEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Param {
    private String uuid;
    private String skey;
    private String wxsid;
    private String wxuin;
    private String pass_ticket;
    private SyncKeyEntity SyncKey;
    private URLEntity url=new URLEntity();
    private String urlHead;
    /**
     * 自己的userName
     */
    private String userName;
    /**
     * 自己的nickName
     */
    private String nickName;
}
