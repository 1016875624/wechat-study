package com.example.wechatrobot.robot.login.service;

/**
 * @author 10168
 */
public interface LoginService {
    /**
     * 获取UUID
     */
    String getUUID();

    /**
     * 获取二维码
     */
    void getQrcode();

    /**
     * 显示二维码
     */
    void showQrcode();

    /**
     * 等待登录的函数，将在这里进行等待用手机扫码登录
     * @return 如果登录成功，那么将返回true，否则返回false
     */
    boolean waitLogin();

    /**
     * 保存登录信息
     */
    void saveParam();

    /**
     * 开启微信新消息提醒
     */
    void webwxstatusnotify();

    /**
     * 微信初始化
     */
    void wxinit();
}
