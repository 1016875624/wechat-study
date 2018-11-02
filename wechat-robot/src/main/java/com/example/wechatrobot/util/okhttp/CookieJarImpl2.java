package com.example.wechatrobot.util.okhttp;

import lombok.Data;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author gray
 */
@Data
public class CookieJarImpl2 implements CookieJar, Serializable {
    /**
     * @Fields serialVersionUID :序列化id
     */
    private static final long serialVersionUID = 1L;

    private Boolean isLoad=false;

    private ConcurrentHashMap<String, List<Cookie>> cookieStore = new ConcurrentHashMap<>();

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        //根据host来获取cookie
        //according to the host to get cookie.
        if (cookieStore == null) {
            return new ArrayList<Cookie>();
        }
        if (cookieStore.get(url.host()) == null) {
            return new ArrayList<Cookie>();
        }
        System.out.println(url.host());
        return cookieStore.get(url.host());
    }

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        //如果已经有cookie 那么就直接在尾部添加就好了
        if (cookieStore.get(url.host()) != null) {
            cookieStore.get(url.host()).addAll(transferToList(cookies));
        }
        //如果没有的话 直接添加
        else {
            cookieStore.put(url.host(), transferToList(cookies));
        }
    }

    private List transferToList(List list){
        List result=new CopyOnWriteArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();
            result.add(next);
        }
        return result;
    }

    /**
     * @return cookie存储地址
     */
    public static String getStorePath(){
        //获取运行时的路径
        //String path = this.getClass().getClassLoader().getResource("").getPath();
        //获取jar包的路径
        String path = CookieJarImpl2.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        if (path.contains(".jar"))
        {
            path=path.substring(0,path.lastIndexOf("/")+1);
        }


        String storePath=path+"object/"+"cookie.obj";
        File file=new File(storePath.substring(0,storePath.lastIndexOf("/")+1));
        if (!file.exists())
        {
            file.mkdirs();
        }
        return  storePath;
    }

    /**
     * 持久化类
     * @throws IOException
     *
     */
    public void saveObject() throws IOException {
        String storePath=getStorePath();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(storePath));
        oos.writeObject(this);
        oos.close();
    }

    /**
     * 静态方法持久化cookie
     * @param cookieJar
     * @throws IOException
     */
    public static void saveObject(CookieJarImpl2 cookieJar) throws IOException {
        String storePath=getStorePath();

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(storePath));
        oos.writeObject(cookieJar);
        oos.close();
    }

    /**
     * 清除所有的cookie
     */
    public void clearCookies(){
        cookieStore.clear();
        isLoad=false;
    }

    /**
     * 读取对象
     * @return 默认存储的cookie
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static CookieJarImpl2 getObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(getStorePath()));
        CookieJarImpl2 cookieJar=(CookieJarImpl2) ois.readObject();
        ois.close();
        cookieJar.isLoad=true;
        return cookieJar;
    }

    /**
     * 读取对象
     * @param path cookie类保存的路径
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static CookieJarImpl2 getObject(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
        CookieJarImpl2 cookieJar=(CookieJarImpl2) ois.readObject();
        ois.close();
        cookieJar.isLoad=true;
        return cookieJar;
    }
}
