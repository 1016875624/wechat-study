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
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileOutputStream;
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
    public void sendTextMsg(String username,String textContent) {
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxsendmsg";
        if (param.getUrl().getWebwxsendmsg().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getWebwxsendmsg();
        }
        else {
            url=param.getUrl().getWebwxsendmsg();
        }
        String temp=url+"?pass_ticket="+param.getPass_ticket();
        JSONObject jo=baseReqeust.toJson();
        JSONObject msg=new JSONObject();
        msg.put("Type","1");
        msg.put("Content",textContent);
        msg.put("FromUserName",param.getUserName());
        msg.put("ToUserName",username);
        msg.put("LocalID",System.currentTimeMillis());
        msg.put("ClientMsgId",System.currentTimeMillis());
        jo.put("Msg",msg);
        jo.put("Scene",0);
        try {
            okTool.url(temp).json(jo.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveVoice(String msgId,String path) {
        File file=new File(path);
        File parentFile=file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();
        }
        String url = "https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxgetvoice";

        if (param.getUrl().getWebwxgetvoice().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getWebwxgetvoice();
        }
        else {
            url=param.getUrl().getWebwxgetvoice();
        }
        StringBuffer sb=new StringBuffer(url);
        sb.append("?msgid=").append(msgId);
        sb.append("&skey=").append(param.getSkey());

        try {
            Response response = okTool.url(sb.toString()).getResponse();
            FileCopyUtils.copy(response.body().byteStream(),new FileOutputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void saveVideo(String msgId, String path) {
        File file=new File(path);
        File parentFile=file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();
        }
        String url = "https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxgetvideo";

        if (param.getUrl().getWebwxgetvideo().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getWebwxgetvideo();
        }
        else {
            url=param.getUrl().getWebwxgetvideo();
        }
        StringBuffer sb=new StringBuffer(url);
        sb.append("?msgid=").append(msgId);
        sb.append("&skey=").append(param.getSkey());
        try {
            Response response = okTool.url(sb.toString()).getResponse();
            FileCopyUtils.copy(response.body().byteStream(),new FileOutputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveImg(String msgId,String path) {
        File file=new File(path);
        File parentFile=file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();
        }
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxgetmsgimg";
        if (param.getUrl().getWebwxgetmsgimg().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getWebwxgetmsgimg();
        }
        else {
            url=param.getUrl().getWebwxgetmsgimg();
        }
        StringBuffer sb=new StringBuffer(url);
        sb.append("?MsgID=").append(msgId);
        sb.append("&skey=").append(param.getSkey());
        try {
            Response response = okTool.url(sb.toString()).getResponse();
            FileCopyUtils.copy(response.body().byteStream(),new FileOutputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveImgSlave(String msgId,String path) {
        File file=new File(path);
        File parentFile=file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();
        }
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxgetmsgimg";
        if (param.getUrl().getWebwxgetmsgimg().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getWebwxgetmsgimg();
        }
        else {
            url=param.getUrl().getWebwxgetmsgimg();
        }
        StringBuffer sb=new StringBuffer(url);
        sb.append("?MsgID=").append(msgId);
        sb.append("&type=").append("slave");
        sb.append("&skey=").append(param.getSkey());
        try {
            Response response = okTool.url(sb.toString()).getResponse();
            FileCopyUtils.copy(response.body().byteStream(),new FileOutputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveFile(Message msg,String path) {
        File file=new File(path);
        File parentFile=file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();
        }
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxgetmedia";
        if (param.getUrl().getWebwxdownloadmedia().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getWebwxdownloadmedia();
        }
        else {
            url=param.getUrl().getWebwxdownloadmedia();
        }
        StringBuffer sb=new StringBuffer(url);
        sb.append("?sender=").append(msg.getFromUserName());
        sb.append("&mediaid=").append(msg.getMediaId());
        sb.append("&encryfilename=").append(msg.getEncryFileName());
        sb.append("&encryfilename=").append(msg.getEncryFileName());
        try {
            Response response = okTool.url(sb.toString()).getResponse();
            FileCopyUtils.copy(response.body().byteStream(),new FileOutputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addFriend() {

    }

    @Override
    public void getMessage() {
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxsync";
        if (param.getUrl().getWebwxsync().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getWebwxsync();
        }
        else {
            url = param.getUrl().getWebwxsync();
        }
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
                handleMsg(next);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 处理消息
     */
    private void handleMsg(Message msg){
        log.info("msgid"+msg.getMsgId());
        log.info("msgtype"+msg.getMsgType());
        //文本消息
        if (msg.getMsgType()==1)
        {
            log.info(msg.getContent());
            if (msg.getFromUserName().length()>64){
                //不是群消息
                if (!msg.getFromUserName().contains("@@")){
                    sendTextMsg(msg.getFromUserName(),msg.getContent());
                }
            }
        }
        else if (msg.getMsgType()==53)
        {
            log.info("你在手机上操作了哦");
        }
        else if (msg.getMsgType()==3){
            String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
            if (path.contains(".jar"))
            {
                path=path.substring(0,path.lastIndexOf("/")+1);
            }
            String storePath=path+param.getNickName()+"/img/"+MyRandom.random(6)+".jpg";
            //saveVoice(msg.getMsgId(),storePath);
            saveImg(msg.getMsgId(),storePath);
            log.info("图片消息");
        }
        //语音消息
        else if (msg.getMsgType()==34){
            String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
            if (path.contains(".jar"))
            {
                path=path.substring(0,path.lastIndexOf("/")+1);
            }
            String storePath=path+param.getNickName()+"/voice/"+MyRandom.random(6)+".mp3";
            saveVoice(msg.getMsgId(),storePath);
        }
        //好友确认消息
        else if (msg.getMsgType()==37){
            log.info("好友确认消息");
        }
        //共享名片
        else if(msg.getMsgType()==42){
            log.info("名片消息");
        }
        //视频消息
        else if (msg.getMsgType()==43){
            log.info("视频消息");
        }
        //动画表情
        else if (msg.getMsgType()==47){
            log.info("动画消息");
        }
        //位置消息
        else if (msg.getMsgType()==48){
            log.info("位置消息");
        }
        //分享链接  文件消息
        else if (msg.getMsgType()==49){
            log.info("文件消息");
            String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
            if (path.contains(".jar"))
            {
                path=path.substring(0,path.lastIndexOf("/")+1);
            }
            String storePath=path+param.getNickName()+"/file/"+msg.getFileName();
            saveFile(msg,storePath);
        }
        //小视频
        else if (msg.getMsgType()==62){

        }
        //系统消息
        else if (msg.getMsgType()==10000){

        }
        //撤回消息
        else if (msg.getMsgType()==10002){
            log.info("撤回消息");
        }
    }

    @Override
    public void waitMessage() {
        String url="https://webpush.wx.qq.com/cgi-bin/mmwebwx-bin/synccheck";
        if (param.getUrl().getSynccheck().startsWith("/")){
            url=param.getUrlHead()+param.getUrl().getSynccheck();
        }
        else {
            url=param.getUrl().getSynccheck();
        }
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
                handleWait(result);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 进行处理等待消息的结果
     * @param result
     * @throws InterruptedException
     */
    private void handleWait(String result) throws InterruptedException {
        //返回值为0说明是正常
        if (result.contains("retcode:\"0\"")){
            //没有新消息
            if (result.contains("selector: \"0\"")){
                //continue;
            }
            //有新消息
            else if (result.contains("selector:\"2\"")){
                getMessage();
            }
            //进入/离开聊天界面
            else if (result.contains("selector:\"7\"")){

            }
        }
        //返回值不为0，说明有错误产生
        else {
            if (result.contains("retcode:\"1101")){
                log.info("您已经退出登录");
            }
            else if (result.contains("retcode:\"1102")){
                log.info("cookie 发送错误！");
            }
            log.info(result);
            //System.out.println(result);
            TimeUnit.SECONDS.sleep(10);
        }
    }
}
