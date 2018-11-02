package com.example.wechatrobot.util.okhttp.persistent;

import lombok.Data;
import okhttp3.Cookie;

import java.io.Serializable;

/**
 * 这是一个OKHTTP的 cookie持久化对象,由于OKHTTP的cookie不支持持久化，所以我们要手动的持久化
 * @author 10168
 */
@Data
public class OkCookiePO implements Serializable {
    /**
     * @Fields serialVersionUID :序列化id
     */
    private static final long serialVersionUID = 1L;

    private  String name;
    private  String value;
    private  long expiresAt;
    private  String domain;
    private  String path;
    private  boolean secure;
    private  boolean httpOnly;
    private  boolean persistent;
    private  boolean hostOnly;

    public static Cookie toCookie(OkCookiePO okCookiePO){
        Cookie.Builder builder=new Cookie.Builder();
        builder.domain(okCookiePO.domain);
        builder.name(okCookiePO.name);
        builder.value(okCookiePO.value);
        builder.expiresAt(okCookiePO.expiresAt);
        builder.path(okCookiePO.path);
        if (okCookiePO.secure){
            builder.secure();
        }
        if (okCookiePO.httpOnly)
        {
            builder.httpOnly();
        }
        if (okCookiePO.httpOnly){
            builder.hostOnlyDomain(okCookiePO.domain);
        }
        return builder.build();
    }

    public static OkCookiePO toPO(Cookie cookie){
        OkCookiePO po=new OkCookiePO();
        po.name=cookie.name();
        po.value=cookie.value();
        po.expiresAt=cookie.expiresAt();
        po.domain=cookie.domain();
        po.path=cookie.path();
        po.secure=cookie.secure();
        po.httpOnly=cookie.httpOnly();
        po.persistent=cookie.persistent();
        po.hostOnly=cookie.hostOnly();
        return po;
    }
}
