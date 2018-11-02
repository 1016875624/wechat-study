package com.example.wechatrobot.robot.user.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatrobot.robot.entity.BaseReqeust;
import com.example.wechatrobot.robot.entity.Param;
import com.example.wechatrobot.robot.login.entity.LoginEntity;
import com.example.wechatrobot.robot.user.entity.Contact;
import com.example.wechatrobot.robot.user.entity.ContactStore;
import com.example.wechatrobot.util.okhttp.OkTool;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    ContactStore contactStore;

    @Autowired
    OkTool okTool;
    @Autowired
    LoginEntity loginEntity;

    @Autowired
    Param param;
    @Autowired
    BaseReqeust baseReqeust;
    @Override
    /*
    * 参数说明
    * r为时间戳
    * seq:0固定
    * pass_ticket
    * skey
    * */
    public void getContacts() {

        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxgetcontact";

        try {

            String result=okTool.url(url).addFormData("pass_ticket",param.getPass_ticket())
                    .addFormData("r",String.valueOf(System.currentTimeMillis()))
                    .addFormData("seq","0")
                    .addFormData("skey",param.getSkey()).get();
            ContactStore contactStore=JSON.parseObject(result,ContactStore.class);
            BeanUtils.copyProperties(contactStore,this.contactStore);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * get参数说明
     * r 时间戳
     * type=ex 固定
     * pass_ticket
     * post 参数说明
     * {
     * 	"BaseRequest": {
     * 		"Uin": 1040310072,
     * 		"Sid": "MLivG0dMhBWk06vX",
     * 		"Skey": "@crypt_7151b1c7_baf048ce03f7f303a2ba0e5f5e75cb8c",
     * 		"DeviceID": "e517793807610687"
     *        },
     * 	"Count": 1,
     * 	"List": [{
     * 		"UserName": "@@9dfe37a44ac1bec6be6aab352119aae6ed14c3dbb345c68e6e43ad6896a7ad6a",
     * 		"EncryChatRoomId": ""
     *    }]
     * }
     */
    @Override
    public void getGroupMembers() {
        List<Contact> contacts= contactStore.getMemberList();
        for (Iterator<Contact> iterator = contacts.iterator(); iterator.hasNext(); ) {
            Contact next =  iterator.next();
            if (next.getUserName().contains("@@")&&next.getUserName().length()>64){
                String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxbatchgetcontact";
                String temp=url+"?type=ex&r="+String.valueOf(System.currentTimeMillis())+"&pass_ticket="+param.getPass_ticket();
                JSONObject jo=baseReqeust.toJson();
                jo.put("count",1);
                JSONArray jsonArray=new JSONArray();
                JSONObject jl=new JSONObject();
                jl.put("UserName",next.getUserName());
                jl.put("EncryChatRoomId","");
                jsonArray.add(jl);
                jo.put("List",jsonArray);
                try {
                    String str=okTool.url(temp).json(jo.toJSONString());
                    System.out.println(str);
                    JSONArray ja=JSON.parseObject(str).getJSONArray("ContactList");
                    if (!ja.isEmpty()){
                        Contact c=ja.getJSONObject(0).toJavaObject(Contact.class);
                        BeanUtils.copyProperties(c,next);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
