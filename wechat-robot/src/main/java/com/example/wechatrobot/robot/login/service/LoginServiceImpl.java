package com.example.wechatrobot.robot.login.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.wechatrobot.robot.entity.BaseReqeust;
import com.example.wechatrobot.robot.entity.Param;
import com.example.wechatrobot.robot.login.entity.LoginEntity;
import com.example.wechatrobot.util.okhttp.OkTool;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Component
@Slf4j
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginEntity loginEntity;

    @Autowired
    Param param;
    @Autowired
    BaseReqeust baseReqeust;

    String qrName="qrcode.png";

    Process showProcess;

    String redirctUrl;

    String host;

    @Value("${qrCodePath}")
    private String qrCodePath;
    @Autowired
    private OkTool okTool;
    @Override
    public String getUUID() {
        String url="https://login.wx.qq.com/jslogin";
        try {
            String result= okTool.url(url).addFormData("appid","wx782c26e4c19acffb")
                    .addFormData("redirect_uri","https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxnewloginpage")
                    .addFormData("fun","new")
                    .addFormData("lang","zh_CN")
                    .addFormData("_",String.valueOf(System.currentTimeMillis())).get();
            if (result.contains("200")){
                String uuid=result.substring(result.indexOf("window.QRLogin.uuid = \"")+"window.QRLogin.uuid = \"".length(),result.lastIndexOf("\""));
                param.setUuid(uuid);
                return uuid;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public void getQrcode() {
        //处理存放二维码的路径问题
        if (StringUtils.isEmpty(qrCodePath)){
            String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
            if (path.contains(".jar"))
            {
                path=path.substring(0,path.lastIndexOf("/")+1);
            }
            path+="/qrcode/";
            qrCodePath=path;
        }
        String qrcodeUrl="https://login.weixin.qq.com/qrcode/"+param.getUuid();
        try {
            Response response=okTool.url(qrcodeUrl).getResponse();
            File storeDir=new File(qrCodePath);
            //创建文件夹
            if (!storeDir.exists()){
                storeDir.mkdirs();
            }
            if (response.isSuccessful()){
                File png= new File(qrCodePath+qrName);
                if (png.exists()){
                    png.delete();
                }
                //复制文件
                Files.copy(response.body().byteStream(), png.toPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showQrcode() {
        try {
            //window下显示图片 linux下次处理
            if (System.getProperties().getProperty("os.name").toLowerCase().contains("windows"))
            {
                showProcess = Runtime.getRuntime().exec("cmd /c " + qrCodePath.substring(1) + qrName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean waitLogin() {
        String waitUrl="https://login.wx.qq.com/cgi-bin/mmwebwx-bin/login";
        while (true)
        {
            try {
                String result= okTool.url(waitUrl).addFormData("loginicon","true").addFormData("uuid",param.getUuid())
                        .addFormData("tip","0")
                        .addFormData("r",String.valueOf(System.currentTimeMillis()).substring(0,9))
                        .addFormData("_",String.valueOf(System.currentTimeMillis())).get();
                //登录超时
                if (result.contains("400")){
                    //重新登录
                    return false;
                }
                //登录成功
                else if (result.contains("200")){
                    redirctUrl=result.substring(result.indexOf("window.redirect_uri=\"")+"window.redirect_uri=\"".length(),result.lastIndexOf("\""));
                    host=redirctUrl.substring(redirctUrl.indexOf("https://")+"https://".length());
                    host=host.substring(0,host.indexOf("/"));
                    param.getUrl().init(host);
                    showProcess.destroyForcibly();
                    return true;
                }
                //408是在等待登录
                log.info("等待登录中");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveParam() {
        try {
            String response=okTool.url(redirctUrl).addFormData("fun","new").addFormData("version","v2").get();
            String skey=response.substring(response.indexOf("<skey>")+"<skey>".length(),response.indexOf("</skey>"));
            String wxsid=response.substring(response.indexOf("<wxsid>")+"<wxsid>".length(),response.indexOf("</wxsid>"));
            String wxuin=response.substring(response.indexOf("<wxuin>")+"<wxuin>".length(),response.indexOf("</wxuin>"));
            String pass_ticket=response.substring(response.indexOf("<pass_ticket>")+"<pass_ticket>".length(),response.indexOf("</pass_ticket>"));
            param.setSkey(skey);
            param.setWxsid(wxsid);
            param.setWxuin(wxuin);
            param.setPass_ticket(pass_ticket);
            baseReqeust.setDeviceID("e"+String.valueOf(Math.random()).substring(2,17));
            baseReqeust.setSkey(skey);
            baseReqeust.setUin(wxuin);
            baseReqeust.setSid(wxsid);
            log.info(JSON.toJSONString(param));
            log.info(JSON.toJSONString(baseReqeust));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void webwxstatusnotify() {
        //String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxstatusnotify";
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxstatusnotify";
        String temp=url+"?pass_ticket="+param.getPass_ticket();
        JSONObject jo=baseReqeust.toJson();
        jo.put("ClientMsgId",System.currentTimeMillis());
        jo.put("Code","3");
        jo.put("FromUserName",loginEntity.getUser().getUserName());
        jo.put("ToUserName",loginEntity.getUser().getUserName());
        try {
           String result= okTool.url(temp).json(jo.toJSONString());
           log.info(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void wxinit() {
        String url="https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxinit";
        //9位随机数
        String temp=url+"?r="+String.valueOf(Math.random()).substring(2,11);
        temp+="&&pass_ticket="+param.getPass_ticket();
        try {
            String str= okTool.url(temp).json(baseReqeust.toJson().toJSONString());
            BeanUtils.copyProperties(JSON.parseObject(str,loginEntity.getClass()),loginEntity);
            param.setSyncKey(loginEntity.getSyncKey());
            log.info(JSON.toJSONString(loginEntity));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
