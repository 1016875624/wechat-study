package com.example.wechatrobot.robot.login.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Data
public class SyncKeyEntity {


    private int Count;
    private List<SyncKeyBean> List=new ArrayList<>();

    /**
     * 这个返回的是 内容 也就是没有皮的内容，要自己手动加入 jo.put("SyncKey",返回值)继续使用
     * @return
     */
    public JSONObject toJson(){
        JSONObject jsonObject=new JSONObject();
        JSONArray jlist=new JSONArray();
        for (Iterator<SyncKeyBean> iterator = List.iterator(); iterator.hasNext(); ) {
            SyncKeyBean next =  iterator.next();
            JSONObject temp=new JSONObject();
            temp.put("Key",next.getKey());
            temp.put("Val",next.getVal());
            jlist.add(temp);
        }
        jsonObject.put("Count",Count);
        jsonObject.put("List",jlist);
        return jsonObject;
    }
    
    public String toGetStr(){
        StringBuffer sb=new StringBuffer();
        for (Iterator<SyncKeyBean> iterator = List.iterator(); iterator.hasNext(); ) {
            SyncKeyBean next =  iterator.next();
            sb.append(next.getKey()).append("_").append(next.getVal()).append("|");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}
