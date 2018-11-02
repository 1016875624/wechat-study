package com.example.wechatrobot.robot.user.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class ContactStore {
    private int MemberCount=0;
    private List<Contact>MemberList=new ArrayList<>();
    private int Seq;
}
