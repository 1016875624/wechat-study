package com.example.wechatrobot.robot.message.service;

import com.example.wechatrobot.robot.message.entity.Message;

/**
 * @author 10168
 */
public interface MessageService {
    /**
     * 发送信息
     */
    void sendTextMsg(String username,String textContent);

    /**
     * 保存消息
     */
    void saveVoice(String msgId,String path);

    void saveVideo(String msgId,String path);

    /**
     * 获取原图
     * @param msgId 消息id
     */
    void saveImg(String msgId,String path);

    /**
     * 获取缩略图
     * @param msgId 消息id
     */
    void saveImgSlave(String msgId,String path);


    /**
     * 保存文件
     */
    void saveFile(Message msg,String path);

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
