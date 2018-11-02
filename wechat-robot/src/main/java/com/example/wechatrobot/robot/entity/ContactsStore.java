package com.example.wechatrobot.robot.entity;

import java.util.List;

public class ContactsStore {

    /**
     * BaseResponse : {"Ret":0,"ErrMsg":""}
     * Count : 6
     * ContactList : [{"Uin":0,"UserName":"filehelper","NickName":"文件传输助手","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=650590032&username=filehelper&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44","ContactFlag":2,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"","VerifyFlag":0,"OwnerUin":0,"PYInitial":"WJCSZS","PYQuanPin":"wenjianchuanshuzhushou","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"fil","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@7cf6087c1c9b2012aaec8575a318bbf8446f54d7fc2069a4283c50787a0281fd","NickName":"过眼烟云","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=663660067&username=@7cf6087c1c9b2012aaec8575a318bbf8446f54d7fc2069a4283c50787a0281fd&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44","ContactFlag":2563,"MemberCount":0,"MemberList":[],"RemarkName":"大哥","HideInputBarFlag":0,"Sex":1,"Signature":"被错误的价值观所洗礼","VerifyFlag":0,"OwnerUin":0,"PYInitial":"GYYY","PYQuanPin":"guoyanyanyun","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":16781409,"Province":"广东","City":"韶关","Alias":"","SnsFlag":16,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"weixin","NickName":"微信团队","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=638460023&username=weixin&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44","ContactFlag":3,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"微信团队官方帐号","VerifyFlag":56,"OwnerUin":0,"PYInitial":"WXTD","PYQuanPin":"weixintuandui","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":4,"Province":"","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"wei","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@7bf9d26496bb0704b1a0b5d7576aac56","NickName":"超搞漫画","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=677643749&username=@7bf9d26496bb0704b1a0b5d7576aac56&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44","ContactFlag":3,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"内涵漫画  邪恶漫画  恐怖漫画 各类精品漫画持续更新，给你生活增添色彩！","VerifyFlag":8,"OwnerUin":0,"PYInitial":"CGMH","PYQuanPin":"chaogaomanhua","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"河北","City":"石家庄","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"gh_","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@e44ea4a6de5dd4b1f6476c28d0b836a6","NickName":"韶关东火车站","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=650590188&username=@e44ea4a6de5dd4b1f6476c28d0b836a6&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44","ContactFlag":3,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"韶关东火车站客运信息发布。","VerifyFlag":8,"OwnerUin":0,"PYInitial":"SGDHCZ","PYQuanPin":"shaoguandonghuochezhan","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"广东","City":"韶关","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"gh_","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@92e5fcab501c2788dadee6f0c86db69b","NickName":"追书小说","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=682171658&username=@92e5fcab501c2788dadee6f0c86db69b&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44","ContactFlag":3,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"脑洞更大，欢乐更多~看小说，追网文，一亿人正在使用追书神器！ 商务合作请加qq：317022157","VerifyFlag":24,"OwnerUin":0,"PYInitial":"ZSXS","PYQuanPin":"zhuishuxiaoshuo","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"浙江","City":"杭州","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"gh_","EncryChatRoomId":"","IsOwner":0}]
     * SyncKeyEntity : {"Count":4,"List":[{"Key":1,"Val":682172431},{"Key":2,"Val":682172490},{"Key":3,"Val":682172434},{"Key":1000,"Val":1541060282}]}
     * UserEntity : {"Uin":1040310072,"UserName":"@465afc950c91f2b891de78bc33d97a9cd98ede234214133f27265de5eed0fd51","NickName":"才疏学浅","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=1732630430&username=@465afc950c91f2b891de78bc33d97a9cd98ede234214133f27265de5eed0fd51&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44","RemarkName":"","PYInitial":"","PYQuanPin":"","RemarkPYInitial":"","RemarkPYQuanPin":"","HideInputBarFlag":0,"StarFriend":0,"Sex":0,"Signature":"","AppAccountFlag":0,"VerifyFlag":0,"ContactFlag":0,"WebWxPluginSwitch":0,"HeadImgFlag":0,"SnsFlag":0}
     * ChatSet : filehelper,@7cf6087c1c9b2012aaec8575a318bbf8446f54d7fc2069a4283c50787a0281fd,weixin,@7bf9d26496bb0704b1a0b5d7576aac56,@e44ea4a6de5dd4b1f6476c28d0b836a6,@92e5fcab501c2788dadee6f0c86db69b,
     * SKey : @crypt_7151b1c7_1b19516c45d722c5344dda292721ce44
     * ClientVersion : 637993782
     * SystemTime : 1541066095
     * GrayScale : 1
     * InviteStartCount : 40
     * MPSubscribeMsgCount : 3
     * MPSubscribeMsgList : [{"UserName":"@e44ea4a6de5dd4b1f6476c28d0b836a6","MPArticleCount":2,"MPArticleList":[{"Title":"火车能中途下车么？看完你就知道了","Digest":"出门在外，总是计划赶不上变化行程有变化需要重新选择目的地怎么办？","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/lI8GhE2jrEq4oOOZog6B1CAXtOA8Lot9JADRFLsicMUkHQ9ChXdjnTicyYgeEFsqyzNH8YAkyQsziciaI52H94rXkQ/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzAwNTU5NTkwNg==&mid=2650234685&idx=2&sn=117670e4dcb8494d3927aee3037f09f0&chksm=8319c950b46e4046ed234ef624143d1bd68266b4ef6269dd719dcdbeafb5b1ce9b9815813fb3&scene=0&xtrack=1#rd"},{"Title":"想退票？我们安排~","Digest":"唉！今天走不了了不想改签？只想退票？那么该如何退票呢？重点来啦~","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/lI8GhE2jrEq4oOOZog6B1CAXtOA8Lot9bgpQhZBnZnoeSNFa8fzpTU416dEqIqxH9Sa6UZgQGEszm4tN5fR72A/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzAwNTU5NTkwNg==&mid=2650234685&idx=3&sn=ffbf0d7161ed0839494992ff637d2361&chksm=8319c950b46e40464b50712e0dee76ca66c9c395457d69cd5868d5f0dad04ac1c0b51482b874&scene=0&xtrack=1#rd"}],"Time":1540972393,"NickName":"韶关东火车站"},{"UserName":"@92e5fcab501c2788dadee6f0c86db69b","MPArticleCount":3,"MPArticleList":[{"Title":"金庸先生走了：笑傲江湖成绝响，人间再无侠客行！","Digest":"笑傲江湖成绝响，人间再无侠客行。","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/eyt8KXt0ibfGCyVLu8cteO3XZLhh4ypScKZGsoKeKquQNWnUicDtQibLLQ8pCBFnxWurVqZicx1qGjPHJXUWLfwQqQ/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIwMTE4MzI2Mw==&mid=2655200306&idx=1&sn=01f77ced4f66c7d88b7fcb095c4b4f8e&chksm=8d465d42ba31d4545da3aa7145cd8d19a8cdb307d2b8c9a53cd5001b9bb7bd7210fb509f63a1&scene=0#rd"},{"Title":"签到万圣节，《清道夫》送最高10000书券","Digest":"长按识二维码或【阅读原文】签到万圣节瓜分书券！","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/eyt8KXt0ibfGCyVLu8cteO3XZLhh4ypScxCEE57GwuqFTia032pB1BamicFwyGlGVsheFVngp2CjX5RJzWTOXQLyw/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIwMTE4MzI2Mw==&mid=2655200306&idx=2&sn=bc2709ad49ee7d63bb7150549c64d129&chksm=8d465d42ba31d4546eb7e96deadf24bf80096c95eb6819411bc4ab44a2179f02299f8d360933&scene=0#rd"},{"Title":"美女的刷卡技巧，这波操作真的服气......","Digest":"点击\u201c阅读原文\u201d双击一波666速来传奇一起嗨！","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/eyt8KXt0ibfGCyVLu8cteO3XZLhh4ypScNMCeAicJicJuAtiaUfvBrJeMrWm1bUtDPrz5p8INhicQ8TH49lnNn32lSw/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIwMTE4MzI2Mw==&mid=2655200306&idx=3&sn=1e58ddf8e091f481031ed27e5388294f&chksm=8d465d42ba31d4548e99c5cb994f7b3dea8464104fdfb9edb16a75fdb903079ea83858f2edcc&scene=0#rd"}],"Time":1540962121,"NickName":"追书小说"},{"UserName":"@92e5fcab501c2788dadee6f0c86db69b","MPArticleCount":3,"MPArticleList":[{"Title":"李咏,那个带给我们\u201c幸运52\u201d的主持人走了\u2026\u2026","Digest":"谢谢李咏，为我们来带美好、永恒的回忆。","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/eyt8KXt0ibfGm0eIwfQlrGHWv8XwibmEhoafkZwURJ75a9qomS9xG17YxWzNUNlx2Cb35SK0GI5C9KeSAPqf0HTw/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIwMTE4MzI2Mw==&mid=2655200282&idx=1&sn=85422df57ccffab6593ef52c2224aa6b&chksm=8d465d6aba31d47c2e32ab0d94a36debadbc110881a06ca01912e334659689f3dc941d9cf9d1&scene=0#rd"},{"Title":"最高10000书券：看《清道夫》，签到瓜分5W份书券","Digest":"长按识别下方二维码或【阅读原文】签到瓜分书券！","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/eyt8KXt0ibfGm0eIwfQlrGHWv8XwibmEho2Caa0NMKDoZiaLXSZwWgYjyicHiawFUfib5lwiaK67IZ4bjzkXNYCOYXRaA/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIwMTE4MzI2Mw==&mid=2655200282&idx=2&sn=752652826effb9c23b78bd6b10148966&chksm=8d465d6aba31d47cc1321f17a65e20ea27cde31724f2ae16269ee5e706b7a97c4a2faafe7ade&scene=0#rd"},{"Title":"情侣犯错被老师拉到办公室教育，美女一句话让教导主任都没了脾气","Digest":"点击\u201c阅读原文\u201d双击一波666速来传奇一起嗨！","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/eyt8KXt0ibfGm0eIwfQlrGHWv8XwibmEhor4WZ8PknsnpVFmxw1fO9hHTmFgAge9SYUpScSWMAbKAjnicXe2g5zEg/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIwMTE4MzI2Mw==&mid=2655200282&idx=3&sn=fb9a1d3a10795a516f8cab0bdf1cfaa4&chksm=8d465d6aba31d47c1faa5e61fc7b9d6dc4bebfd6399c264a48bf9491e9f1d03c8e31ddd09210&scene=0#rd"}],"Time":1540812270,"NickName":"追书小说"}]
     * ClickReportInterval : 600000
     */

    private BaseResponseBean BaseResponse;
    private int Count;
    private SyncKeyBean SyncKey;
    private UserBean User;
    private String ChatSet;
    private String SKey;
    private int ClientVersion;
    private int SystemTime;
    private int GrayScale;
    private int InviteStartCount;
    private int MPSubscribeMsgCount;
    private int ClickReportInterval;
    private List<ContactListBean> ContactList;
    private List<MPSubscribeMsgListBean> MPSubscribeMsgList;

    public BaseResponseBean getBaseResponse() {
        return BaseResponse;
    }

    public void setBaseResponse(BaseResponseBean BaseResponse) {
        this.BaseResponse = BaseResponse;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }

    public SyncKeyBean getSyncKey() {
        return SyncKey;
    }

    public void setSyncKey(SyncKeyBean SyncKey) {
        this.SyncKey = SyncKey;
    }

    public UserBean getUser() {
        return User;
    }

    public void setUser(UserBean User) {
        this.User = User;
    }

    public String getChatSet() {
        return ChatSet;
    }

    public void setChatSet(String ChatSet) {
        this.ChatSet = ChatSet;
    }

    public String getSKey() {
        return SKey;
    }

    public void setSKey(String SKey) {
        this.SKey = SKey;
    }

    public int getClientVersion() {
        return ClientVersion;
    }

    public void setClientVersion(int ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    public int getSystemTime() {
        return SystemTime;
    }

    public void setSystemTime(int SystemTime) {
        this.SystemTime = SystemTime;
    }

    public int getGrayScale() {
        return GrayScale;
    }

    public void setGrayScale(int GrayScale) {
        this.GrayScale = GrayScale;
    }

    public int getInviteStartCount() {
        return InviteStartCount;
    }

    public void setInviteStartCount(int InviteStartCount) {
        this.InviteStartCount = InviteStartCount;
    }

    public int getMPSubscribeMsgCount() {
        return MPSubscribeMsgCount;
    }

    public void setMPSubscribeMsgCount(int MPSubscribeMsgCount) {
        this.MPSubscribeMsgCount = MPSubscribeMsgCount;
    }

    public int getClickReportInterval() {
        return ClickReportInterval;
    }

    public void setClickReportInterval(int ClickReportInterval) {
        this.ClickReportInterval = ClickReportInterval;
    }

    public List<ContactListBean> getContactList() {
        return ContactList;
    }

    public void setContactList(List<ContactListBean> ContactList) {
        this.ContactList = ContactList;
    }

    public List<MPSubscribeMsgListBean> getMPSubscribeMsgList() {
        return MPSubscribeMsgList;
    }

    public void setMPSubscribeMsgList(List<MPSubscribeMsgListBean> MPSubscribeMsgList) {
        this.MPSubscribeMsgList = MPSubscribeMsgList;
    }

    public static class BaseResponseBean {
        /**
         * Ret : 0
         * ErrMsg :
         */

        private int Ret;
        private String ErrMsg;

        public int getRet() {
            return Ret;
        }

        public void setRet(int Ret) {
            this.Ret = Ret;
        }

        public String getErrMsg() {
            return ErrMsg;
        }

        public void setErrMsg(String ErrMsg) {
            this.ErrMsg = ErrMsg;
        }
    }

    public static class SyncKeyBean {
        /**
         * Count : 4
         * List : [{"Key":1,"Val":682172431},{"Key":2,"Val":682172490},{"Key":3,"Val":682172434},{"Key":1000,"Val":1541060282}]
         */

        private int Count;
        private java.util.List<ListBean> List;

        public int getCount() {
            return Count;
        }

        public void setCount(int Count) {
            this.Count = Count;
        }

        public List<ListBean> getList() {
            return List;
        }

        public void setList(List<ListBean> List) {
            this.List = List;
        }

        public static class ListBean {
            /**
             * Key : 1
             * Val : 682172431
             */

            private int Key;
            private int Val;

            public int getKey() {
                return Key;
            }

            public void setKey(int Key) {
                this.Key = Key;
            }

            public int getVal() {
                return Val;
            }

            public void setVal(int Val) {
                this.Val = Val;
            }
        }
    }

    public static class UserBean {
        /**
         * Uin : 1040310072
         * UserName : @465afc950c91f2b891de78bc33d97a9cd98ede234214133f27265de5eed0fd51
         * NickName : 才疏学浅
         * HeadImgUrl : /cgi-bin/mmwebwx-bin/webwxgeticon?seq=1732630430&username=@465afc950c91f2b891de78bc33d97a9cd98ede234214133f27265de5eed0fd51&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44
         * RemarkName :
         * PYInitial :
         * PYQuanPin :
         * RemarkPYInitial :
         * RemarkPYQuanPin :
         * HideInputBarFlag : 0
         * StarFriend : 0
         * Sex : 0
         * Signature :
         * AppAccountFlag : 0
         * VerifyFlag : 0
         * ContactFlag : 0
         * WebWxPluginSwitch : 0
         * HeadImgFlag : 0
         * SnsFlag : 0
         */

        private int Uin;
        private String UserName;
        private String NickName;
        private String HeadImgUrl;
        private String RemarkName;
        private String PYInitial;
        private String PYQuanPin;
        private String RemarkPYInitial;
        private String RemarkPYQuanPin;
        private int HideInputBarFlag;
        private int StarFriend;
        private int Sex;
        private String Signature;
        private int AppAccountFlag;
        private int VerifyFlag;
        private int ContactFlag;
        private int WebWxPluginSwitch;
        private int HeadImgFlag;
        private int SnsFlag;

        public int getUin() {
            return Uin;
        }

        public void setUin(int Uin) {
            this.Uin = Uin;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getNickName() {
            return NickName;
        }

        public void setNickName(String NickName) {
            this.NickName = NickName;
        }

        public String getHeadImgUrl() {
            return HeadImgUrl;
        }

        public void setHeadImgUrl(String HeadImgUrl) {
            this.HeadImgUrl = HeadImgUrl;
        }

        public String getRemarkName() {
            return RemarkName;
        }

        public void setRemarkName(String RemarkName) {
            this.RemarkName = RemarkName;
        }

        public String getPYInitial() {
            return PYInitial;
        }

        public void setPYInitial(String PYInitial) {
            this.PYInitial = PYInitial;
        }

        public String getPYQuanPin() {
            return PYQuanPin;
        }

        public void setPYQuanPin(String PYQuanPin) {
            this.PYQuanPin = PYQuanPin;
        }

        public String getRemarkPYInitial() {
            return RemarkPYInitial;
        }

        public void setRemarkPYInitial(String RemarkPYInitial) {
            this.RemarkPYInitial = RemarkPYInitial;
        }

        public String getRemarkPYQuanPin() {
            return RemarkPYQuanPin;
        }

        public void setRemarkPYQuanPin(String RemarkPYQuanPin) {
            this.RemarkPYQuanPin = RemarkPYQuanPin;
        }

        public int getHideInputBarFlag() {
            return HideInputBarFlag;
        }

        public void setHideInputBarFlag(int HideInputBarFlag) {
            this.HideInputBarFlag = HideInputBarFlag;
        }

        public int getStarFriend() {
            return StarFriend;
        }

        public void setStarFriend(int StarFriend) {
            this.StarFriend = StarFriend;
        }

        public int getSex() {
            return Sex;
        }

        public void setSex(int Sex) {
            this.Sex = Sex;
        }

        public String getSignature() {
            return Signature;
        }

        public void setSignature(String Signature) {
            this.Signature = Signature;
        }

        public int getAppAccountFlag() {
            return AppAccountFlag;
        }

        public void setAppAccountFlag(int AppAccountFlag) {
            this.AppAccountFlag = AppAccountFlag;
        }

        public int getVerifyFlag() {
            return VerifyFlag;
        }

        public void setVerifyFlag(int VerifyFlag) {
            this.VerifyFlag = VerifyFlag;
        }

        public int getContactFlag() {
            return ContactFlag;
        }

        public void setContactFlag(int ContactFlag) {
            this.ContactFlag = ContactFlag;
        }

        public int getWebWxPluginSwitch() {
            return WebWxPluginSwitch;
        }

        public void setWebWxPluginSwitch(int WebWxPluginSwitch) {
            this.WebWxPluginSwitch = WebWxPluginSwitch;
        }

        public int getHeadImgFlag() {
            return HeadImgFlag;
        }

        public void setHeadImgFlag(int HeadImgFlag) {
            this.HeadImgFlag = HeadImgFlag;
        }

        public int getSnsFlag() {
            return SnsFlag;
        }

        public void setSnsFlag(int SnsFlag) {
            this.SnsFlag = SnsFlag;
        }
    }

    public static class ContactListBean {
        /**
         * Uin : 0
         * UserName : filehelper
         * NickName : 文件传输助手
         * HeadImgUrl : /cgi-bin/mmwebwx-bin/webwxgeticon?seq=650590032&username=filehelper&skey=@crypt_7151b1c7_1b19516c45d722c5344dda292721ce44
         * ContactFlag : 2
         * MemberCount : 0
         * MemberList : []
         * RemarkName :
         * HideInputBarFlag : 0
         * Sex : 0
         * Signature :
         * VerifyFlag : 0
         * OwnerUin : 0
         * PYInitial : WJCSZS
         * PYQuanPin : wenjianchuanshuzhushou
         * RemarkPYInitial :
         * RemarkPYQuanPin :
         * StarFriend : 0
         * AppAccountFlag : 0
         * Statues : 0
         * AttrStatus : 0
         * Province :
         * City :
         * Alias :
         * SnsFlag : 0
         * UniFriend : 0
         * DisplayName :
         * ChatRoomId : 0
         * KeyWord : fil
         * EncryChatRoomId :
         * IsOwner : 0
         */

        private int Uin;
        private String UserName;
        private String NickName;
        private String HeadImgUrl;
        private int ContactFlag;
        private int MemberCount;
        private String RemarkName;
        private int HideInputBarFlag;
        private int Sex;
        private String Signature;
        private int VerifyFlag;
        private int OwnerUin;
        private String PYInitial;
        private String PYQuanPin;
        private String RemarkPYInitial;
        private String RemarkPYQuanPin;
        private int StarFriend;
        private int AppAccountFlag;
        private int Statues;
        private int AttrStatus;
        private String Province;
        private String City;
        private String Alias;
        private int SnsFlag;
        private int UniFriend;
        private String DisplayName;
        private int ChatRoomId;
        private String KeyWord;
        private String EncryChatRoomId;
        private int IsOwner;
        private List<?> MemberList;

        public int getUin() {
            return Uin;
        }

        public void setUin(int Uin) {
            this.Uin = Uin;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getNickName() {
            return NickName;
        }

        public void setNickName(String NickName) {
            this.NickName = NickName;
        }

        public String getHeadImgUrl() {
            return HeadImgUrl;
        }

        public void setHeadImgUrl(String HeadImgUrl) {
            this.HeadImgUrl = HeadImgUrl;
        }

        public int getContactFlag() {
            return ContactFlag;
        }

        public void setContactFlag(int ContactFlag) {
            this.ContactFlag = ContactFlag;
        }

        public int getMemberCount() {
            return MemberCount;
        }

        public void setMemberCount(int MemberCount) {
            this.MemberCount = MemberCount;
        }

        public String getRemarkName() {
            return RemarkName;
        }

        public void setRemarkName(String RemarkName) {
            this.RemarkName = RemarkName;
        }

        public int getHideInputBarFlag() {
            return HideInputBarFlag;
        }

        public void setHideInputBarFlag(int HideInputBarFlag) {
            this.HideInputBarFlag = HideInputBarFlag;
        }

        public int getSex() {
            return Sex;
        }

        public void setSex(int Sex) {
            this.Sex = Sex;
        }

        public String getSignature() {
            return Signature;
        }

        public void setSignature(String Signature) {
            this.Signature = Signature;
        }

        public int getVerifyFlag() {
            return VerifyFlag;
        }

        public void setVerifyFlag(int VerifyFlag) {
            this.VerifyFlag = VerifyFlag;
        }

        public int getOwnerUin() {
            return OwnerUin;
        }

        public void setOwnerUin(int OwnerUin) {
            this.OwnerUin = OwnerUin;
        }

        public String getPYInitial() {
            return PYInitial;
        }

        public void setPYInitial(String PYInitial) {
            this.PYInitial = PYInitial;
        }

        public String getPYQuanPin() {
            return PYQuanPin;
        }

        public void setPYQuanPin(String PYQuanPin) {
            this.PYQuanPin = PYQuanPin;
        }

        public String getRemarkPYInitial() {
            return RemarkPYInitial;
        }

        public void setRemarkPYInitial(String RemarkPYInitial) {
            this.RemarkPYInitial = RemarkPYInitial;
        }

        public String getRemarkPYQuanPin() {
            return RemarkPYQuanPin;
        }

        public void setRemarkPYQuanPin(String RemarkPYQuanPin) {
            this.RemarkPYQuanPin = RemarkPYQuanPin;
        }

        public int getStarFriend() {
            return StarFriend;
        }

        public void setStarFriend(int StarFriend) {
            this.StarFriend = StarFriend;
        }

        public int getAppAccountFlag() {
            return AppAccountFlag;
        }

        public void setAppAccountFlag(int AppAccountFlag) {
            this.AppAccountFlag = AppAccountFlag;
        }

        public int getStatues() {
            return Statues;
        }

        public void setStatues(int Statues) {
            this.Statues = Statues;
        }

        public int getAttrStatus() {
            return AttrStatus;
        }

        public void setAttrStatus(int AttrStatus) {
            this.AttrStatus = AttrStatus;
        }

        public String getProvince() {
            return Province;
        }

        public void setProvince(String Province) {
            this.Province = Province;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String City) {
            this.City = City;
        }

        public String getAlias() {
            return Alias;
        }

        public void setAlias(String Alias) {
            this.Alias = Alias;
        }

        public int getSnsFlag() {
            return SnsFlag;
        }

        public void setSnsFlag(int SnsFlag) {
            this.SnsFlag = SnsFlag;
        }

        public int getUniFriend() {
            return UniFriend;
        }

        public void setUniFriend(int UniFriend) {
            this.UniFriend = UniFriend;
        }

        public String getDisplayName() {
            return DisplayName;
        }

        public void setDisplayName(String DisplayName) {
            this.DisplayName = DisplayName;
        }

        public int getChatRoomId() {
            return ChatRoomId;
        }

        public void setChatRoomId(int ChatRoomId) {
            this.ChatRoomId = ChatRoomId;
        }

        public String getKeyWord() {
            return KeyWord;
        }

        public void setKeyWord(String KeyWord) {
            this.KeyWord = KeyWord;
        }

        public String getEncryChatRoomId() {
            return EncryChatRoomId;
        }

        public void setEncryChatRoomId(String EncryChatRoomId) {
            this.EncryChatRoomId = EncryChatRoomId;
        }

        public int getIsOwner() {
            return IsOwner;
        }

        public void setIsOwner(int IsOwner) {
            this.IsOwner = IsOwner;
        }

        public List<?> getMemberList() {
            return MemberList;
        }

        public void setMemberList(List<?> MemberList) {
            this.MemberList = MemberList;
        }
    }

    public static class MPSubscribeMsgListBean {
        /**
         * UserName : @e44ea4a6de5dd4b1f6476c28d0b836a6
         * MPArticleCount : 2
         * MPArticleList : [{"Title":"火车能中途下车么？看完你就知道了","Digest":"出门在外，总是计划赶不上变化行程有变化需要重新选择目的地怎么办？","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/lI8GhE2jrEq4oOOZog6B1CAXtOA8Lot9JADRFLsicMUkHQ9ChXdjnTicyYgeEFsqyzNH8YAkyQsziciaI52H94rXkQ/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzAwNTU5NTkwNg==&mid=2650234685&idx=2&sn=117670e4dcb8494d3927aee3037f09f0&chksm=8319c950b46e4046ed234ef624143d1bd68266b4ef6269dd719dcdbeafb5b1ce9b9815813fb3&scene=0&xtrack=1#rd"},{"Title":"想退票？我们安排~","Digest":"唉！今天走不了了不想改签？只想退票？那么该如何退票呢？重点来啦~","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/lI8GhE2jrEq4oOOZog6B1CAXtOA8Lot9bgpQhZBnZnoeSNFa8fzpTU416dEqIqxH9Sa6UZgQGEszm4tN5fR72A/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzAwNTU5NTkwNg==&mid=2650234685&idx=3&sn=ffbf0d7161ed0839494992ff637d2361&chksm=8319c950b46e40464b50712e0dee76ca66c9c395457d69cd5868d5f0dad04ac1c0b51482b874&scene=0&xtrack=1#rd"}]
         * Time : 1540972393
         * NickName : 韶关东火车站
         */

        private String UserName;
        private int MPArticleCount;
        private int Time;
        private String NickName;
        private List<MPArticleListBean> MPArticleList;

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public int getMPArticleCount() {
            return MPArticleCount;
        }

        public void setMPArticleCount(int MPArticleCount) {
            this.MPArticleCount = MPArticleCount;
        }

        public int getTime() {
            return Time;
        }

        public void setTime(int Time) {
            this.Time = Time;
        }

        public String getNickName() {
            return NickName;
        }

        public void setNickName(String NickName) {
            this.NickName = NickName;
        }

        public List<MPArticleListBean> getMPArticleList() {
            return MPArticleList;
        }

        public void setMPArticleList(List<MPArticleListBean> MPArticleList) {
            this.MPArticleList = MPArticleList;
        }

        public static class MPArticleListBean {
            /**
             * Title : 火车能中途下车么？看完你就知道了
             * Digest : 出门在外，总是计划赶不上变化行程有变化需要重新选择目的地怎么办？
             * Cover : http://mmbiz.qpic.cn/mmbiz_jpg/lI8GhE2jrEq4oOOZog6B1CAXtOA8Lot9JADRFLsicMUkHQ9ChXdjnTicyYgeEFsqyzNH8YAkyQsziciaI52H94rXkQ/300?wxtype=jpeg&wxfrom=0
             * Url : http://mp.weixin.qq.com/s?__biz=MzAwNTU5NTkwNg==&mid=2650234685&idx=2&sn=117670e4dcb8494d3927aee3037f09f0&chksm=8319c950b46e4046ed234ef624143d1bd68266b4ef6269dd719dcdbeafb5b1ce9b9815813fb3&scene=0&xtrack=1#rd
             */

            private String Title;
            private String Digest;
            private String Cover;
            private String Url;

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getDigest() {
                return Digest;
            }

            public void setDigest(String Digest) {
                this.Digest = Digest;
            }

            public String getCover() {
                return Cover;
            }

            public void setCover(String Cover) {
                this.Cover = Cover;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }
        }
    }
}
