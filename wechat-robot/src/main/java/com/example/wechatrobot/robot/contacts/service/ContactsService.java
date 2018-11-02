package com.example.wechatrobot.robot.contacts.service;

public interface ContactsService {
    /**
     * 通过昵称查找好友
     */
    void findFriendByNickName();

    /**
     * 通过备注找好友
     */
    void findFriendByRemarkName();

    /**
     * 通过登录的时候的id查找，这个id是动态生成的,并不是一直存在的
     */
    void findFriendById();

    /**
     * 这个函数是通过你传入的值进行自动的查找，查找顺序如下
     * 1.备注名
     * 2.昵称
     * 3.id
     * 没有找到则返回空
     */
    void findFriend();
}
