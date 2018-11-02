package com.example.wechatrobot.util.okhttp.persistent;

import com.example.wechatrobot.util.okhttp.CookieJarImpl;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Cookie;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gray
 */
@Data
@Slf4j
public class CookieJarPersistent implements Serializable {
    /**
     * @Fields serialVersionUID :序列化id
     */
    private static final long serialVersionUID = 1L;

    private Map<String, List<OkCookiePO>> cookieStore = new ConcurrentHashMap<>();

    /**
     * @return cookie存储地址
     */
    public static String getStorePath(){
        //获取运行时的路径
        //String path = this.getClass().getClassLoader().getResource("").getPath();
        //获取jar包的路径
        String path = CookieJarPersistent.class.getProtectionDomain().getCodeSource().getLocation().getFile();
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
        log.info("保存cookie");
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
    public static void saveObject(CookieJarPersistent cookieJar) throws IOException {
        log.info("保存cookie");
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
    }

    public static boolean isOverTime(){
        File file=new File(getStorePath());
        if (file.exists())
        {
            long lastModifyTimes=file.lastModified();
            LocalDateTime now=LocalDateTime.now();
            LocalDateTime last=LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModifyTimes),ZoneId.systemDefault());
            if (now.minusMinutes(30).isAfter(last))
            {

                file.delete();
                return true;
            }
        }
        else {
            return true;
        }
        return false;
    }

    /**
     * @param path 存放对象的路径
     * @return 如果已经超时 则返回true 如果没有超时 则返回false
     */
    public static boolean isOverTime(String path){
        File file=new File(path);
        if (file.exists())
        {
            //获取最后的修改时间
            long lastModifyTimes=file.lastModified();
            //获取现在时间
            LocalDateTime now=LocalDateTime.now();
            //转换为最后的修改时间
            LocalDateTime last=LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModifyTimes),ZoneId.systemDefault());
            //如果最后修改时间 超过30分钟 则说明已经超时了，所以要返回false，同时不再进行读取cookie
            if (now.minusMinutes(30).isAfter(last))
            {
                log.info("cookie 已经超时");
                file.delete();
                return true;
            }
        }
        else {
            log.info("cookie 文件不存在");
            return true;
        }

        return false;
    }

    /**
     * 读取对象
     * @return 默认存储的cookie
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static CookieJarPersistent getObject() throws IOException, ClassNotFoundException {
        //判断是否已经超时
        if (isOverTime()){
            return new CookieJarPersistent();
        }
        log.info("读取cookie");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(getStorePath()));
        CookieJarPersistent cookieJar=(CookieJarPersistent) ois.readObject();
        ois.close();
        return cookieJar;
    }

    /**
     * 读取对象
     * @param path cookie类保存的路径
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static CookieJarPersistent getObject(String path) throws IOException, ClassNotFoundException {
        //判断是否已经超时
        if (isOverTime(path)){
            return new CookieJarPersistent();
        }
        log.info("读取cookie" +path);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
        CookieJarPersistent cookieJar=(CookieJarPersistent) ois.readObject();
        ois.close();
        return cookieJar;
    }

    /**
     * 转换为cookiejar
     * @param persistent 此类的对象
     * @return 转换后的cookiejar
     */
    public static CookieJarImpl toCookieJar(CookieJarPersistent persistent){
        log.info("转换为 cookiejar");
        CookieJarImpl cookieJar=new CookieJarImpl();
        Set<String> urls=persistent.cookieStore.keySet();
        for (Iterator<String> iterator = urls.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            if (persistent.cookieStore.get(next)!=null)
            {
                /*if (!persistent.cookieStore.get(next).isEmpty()){
                    cookieJar.
                }*/
                List<OkCookiePO> pos=persistent.cookieStore.get(next);
                List<Cookie>cookies=new ArrayList<>();
                for (Iterator<OkCookiePO> okCookiePOIterator = pos.iterator(); okCookiePOIterator.hasNext(); ) {
                    OkCookiePO okCookiePO =  okCookiePOIterator.next();
                    cookies.add(OkCookiePO.toCookie(okCookiePO));
                }
                cookieJar.getCookieStore().put(next,cookies);
            }
        }
        cookieJar.setIsLoad(true);
        return cookieJar;
    }

    public static CookieJarPersistent toPersistent(CookieJarImpl cookieJar){
        log.info("转换为 cookie persistent");
        CookieJarPersistent persistent=new CookieJarPersistent();
        Set<String> urls=cookieJar.getCookieStore().keySet();
        for (Iterator<String> iterator = urls.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            if (cookieJar.getCookieStore().get(next)!=null){
                List<Cookie> cookies=cookieJar.getCookieStore().get(next);
                List<OkCookiePO> pos=new ArrayList<>();
                for (Iterator<Cookie> cookieIterator = cookies.iterator(); cookieIterator.hasNext(); ) {
                    Cookie cookie =  cookieIterator.next();
                    pos.add(OkCookiePO.toPO(cookie));
                }
                persistent.cookieStore.put(next,pos);
            }
        }
        return persistent;
    }
}
