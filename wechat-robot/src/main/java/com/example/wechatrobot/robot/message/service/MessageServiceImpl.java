package com.example.wechatrobot.robot.message.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatrobot.robot.entity.BaseReqeust;
import com.example.wechatrobot.robot.entity.Param;
import com.example.wechatrobot.robot.message.entity.GetMessageResponse;
import com.example.wechatrobot.robot.message.entity.Message;
import com.example.wechatrobot.util.okhttp.OkTool;
import com.example.wechatrobot.util.random.MyRandom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 10168
 */
@Component
@Slf4j
public class MessageServiceImpl implements MessageService {
    @Autowired
    OkTool okTool;

    @Autowired
    Param param;

    @Autowired
    BaseReqeust baseReqeust;
    @Override
    public void sendMsg() {

    }

    @Override
    public void saveVoice() {

    }

    @Override
    public void saveImg() {

    }

    @Override
    public void saveFile() {

    }

    @Override
    public void addFriend() {

    }

    @Override
    public void getMessage() {
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxsync";
        StringBuffer sb=new StringBuffer(url);
        sb.append("?sid=").append(param.getWxsid());
        sb.append("&skey=").append(param.getSkey());
        sb.append("&lang=zh_CN");
        sb.append("&pass_ticket=").append(param.getPass_ticket());
        JSONObject jo=baseReqeust.toJson();
        jo.put("SyncKey",param.getSyncKey().toJson());
        jo.put("rr",String.valueOf(Math.random()).substring(2,11));
        try {
            String resutl=okTool.url(sb.toString()).json(jo.toJSONString());
            GetMessageResponse response=JSON.parseObject(resutl,GetMessageResponse.class);
            param.setSyncKey(response.getSyncKey());
            log.info("有新消息");
            List<Message> messages=response.getAddMsgList();
            for (Iterator<Message> iterator = messages.iterator(); iterator.hasNext(); ) {
                Message next =  iterator.next();
                log.info("msgid"+next.getMsgId());
                log.info("msgtype"+next.getMsgType());
                //文本消息
                if (next.getMsgType()==1)
                {
                    log.info(next.getContent());
                }
                else if (next.getMsgType()==53)
                {
                    log.info("你在手机上操作了哦");
                }
                else if (next.getMsgType()==3){
                    log.info("图片消息");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void waitMessage() {
        String url="https://webpush.wx.qq.com/cgi-bin/mmwebwx-bin/synccheck";
        while (true)
        {
            try {
                String random= MyRandom.random(15);
                String result=okTool.url(url).addFormData("r",String.valueOf(System.currentTimeMillis()))
                        .addFormData("skey",param.getSkey())
                        .addFormData("sid",param.getWxsid())
                        .addFormData("uin",param.getWxuin())
                        .addFormData("deviceid","e"+random)
                        .addFormData("synckey",param.getSyncKey().toGetStr())
                        .addFormData("_",String.valueOf(System.currentTimeMillis()))
                        .get();
                if (result.contains("retcode: \"0\"")){
                    //没有新消息
                    if (result.contains("selector: \"0\"")){
                        continue;
                    }
                    //有新消息
                    else if (result.contains("selector: \"2\"")){
                        getMessage();
                    }
                }
                else {
                    System.out.println(result);
                    TimeUnit.SECONDS.sleep(10);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
