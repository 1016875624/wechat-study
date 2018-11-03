package com.example.wechatrobot.robot.entity;

import lombok.Data;

@Data
public class URLEntity {
    private String host;
    private String fileHost;
    private String pushHost;
    private String loginHost;
    private String jsLogin;
    private String login;
    private String synccheck;
    private String webwxdownloadmedia;
    private String webwxuploadmedia;
    private String webwxinit="/cgi-bin/mmwebwx-bin/webwxinit";
    private String webwxgetcontact="/cgi-bin/mmwebwx-bin/webwxgetcontact";
    private String webwxsync="/cgi-bin/mmwebwx-bin/webwxsync";
    private String webwxbatchgetcontact="/cgi-bin/mmwebwx-bin/webwxbatchgetcontact";
    private String webwxgeticon="/cgi-bin/mmwebwx-bin/webwxgeticon";
    private String webwxsendmsg="/cgi-bin/mmwebwx-bin/webwxsendmsgimg";
    private String webwxsendmsgimg="/cgi-bin/mmwebwx-bin/webwxsendvideomsg";
    private String webwxsendmsgvedio="/cgi-bin/mmwebwx-bin/webwxsendvideomsg";
    private String webwxsendemoticon="/cgi-bin/mmwebwx-bin/webwxsendemoticon";
    private String webwxsendappmsg="/cgi-bin/mmwebwx-bin/webwxsendappmsg";
    private String webwxgetheadimg="/cgi-bin/mmwebwx-bin/webwxgetheadimg";
    private String webwxgetmsgimg="/cgi-bin/mmwebwx-bin/webwxgetmsgimg";
    private String webwxgetmedia="/cgi-bin/mmwebwx-bin/webwxgetmedia";
    private String webwxgetvideo="/cgi-bin/mmwebwx-bin/webwxgetvideo";
    private String webwxlogout="/cgi-bin/mmwebwx-bin/webwxlogout";
    private String webwxgetvoice="/cgi-bin/mmwebwx-bin/webwxgetvoice";
    private String webwxverifyuser="/cgi-bin/mmwebwx-bin/webwxverifyuser";
    private String webwxrevokemsg="/cgi-bin/mmwebwx-bin/webwxrevokemsg";
    private String webwxpushloginurl="/cgi-bin/mmwebwx-bin/webwxpushloginurl";
    private String webwxstatusnotify="/cgi-bin/mmwebwx-bin/webwxstatusnotify";
    public void init(String host){
        this.host=host;
        loginHost="login.weixin.qq.com";
        fileHost="file.wx.qq.com";
        pushHost="webpush.weixin.qq.com";
        /*if (host.contains("wx.qq.com"))
        {
            loginHost="login.weixin.qq.com";
            fileHost="file.wx.qq.com";
            pushHost="webpush.weixin.qq.com";
        }*/
        if (host.contains("wx2.qq.com")){
            loginHost="login.wx2.qq.com";
            fileHost="file.wx2.qq.com";
            pushHost="webpush.wx2.qq.com";
        }
        else if (host.contains("wx8.qq.com")){
            loginHost="login.wx8.qq.com";
            fileHost="file.wx8.qq.com";
            pushHost="webpush.wx8.qq.com";
        }
        else if (host.contains("qq.com")){
            loginHost="login.wx.qq.com";
            fileHost="file.wx.qq.com";
            pushHost="webpush.wx.qq.com";
        }
        else if (host.contains("web2.wechat.com")){
            loginHost="login.web2.wechat.com";
            fileHost="file.web2.wechat.com";
            pushHost="webpush.web2.wechat.com";
        }
        else if (host.contains("wechat.com")){
            loginHost="login.web.wechat.com";
            fileHost="file.web.wechat.com";
            pushHost="webpush.web.wechat.com";
        }
        synccheck="https://"+pushHost+"/cgi-bin/mmwebwx-bin/synccheck";
        webwxdownloadmedia = "https://"+fileHost+"/cgi-bin/mmwebwx-bin/webwxgetmedia";
        webwxuploadmedia = "https://" + fileHost + "/cgi-bin/mmwebwx-bin/webwxuploadmedia";

    }
}
