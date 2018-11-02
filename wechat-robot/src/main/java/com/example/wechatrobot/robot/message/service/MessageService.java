package com.example.wechatrobot.robot.message.service;

/**
 * @author 10168
 */
public interface MessageService {
    /**
     * 发送信息
     */
    void sendMsg();

    /**
     * 保存消息
     */
    void saveVoice();

    /**
     * 保存图片
     */
    void saveImg();

    /**
     * 保存文件
     */
    void saveFile();

    /**
     * 添加好友
     */
    void addFriend();

    /**
     * 获取消息
     */
    void getMessage();

    /**
     * 等待消息
     */
    void waitMessage();
}
