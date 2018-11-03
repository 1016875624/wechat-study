package com.example.wechatrobot.robot.entity;

import com.alibaba.fastjson.JSONObject;
import com.example.wechatrobot.util.random.MyRandom;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class BaseReqeust {
    private String Uin;
    private String Sid;
    private String Skey;
    private String DeviceID;

    public JSONObject toJson(){
        JSONObject jsonObject=new JSONObject();
        //DeviceID="e"+String.valueOf(Math.random()).substring(2,17);
        DeviceID="e"+MyRandom.random(15);
        JSONObject jo=new JSONObject();
        jo.put("Uin",Uin);
        jo.put("Sid",Sid);
        jo.put("Skey", Skey);
        jo.put("DeviceID", DeviceID);
        jsonObject.put("BaseRequest",jo);
        return jsonObject;
    }
}
