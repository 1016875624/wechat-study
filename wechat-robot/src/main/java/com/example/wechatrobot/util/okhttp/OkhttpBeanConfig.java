package com.example.wechatrobot.util.okhttp;

import com.example.wechatrobot.util.okhttp.persistent.CookieJarPersistent;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

@Configuration
public class OkhttpBeanConfig {

	@Bean
	public CookieJarImpl cookieJar(){
		CookieJarImpl cookieJar=null;
        try {
            CookieJarPersistent persistent=CookieJarPersistent.getObject();
            cookieJar=CookieJarPersistent.toCookieJar(persistent);
        } catch (Exception e) {
            cookieJar=new CookieJarImpl();
            e.printStackTrace();
        }
		return  cookieJar;
	}

	@Bean
	public OkHttpClient.Builder clientBuilder(@Autowired CookieJarImpl cookieJar) {
		OkHttpClient.Builder builder=new OkHttpClient.Builder();
		builder.cookieJar(cookieJar);
		builder.readTimeout(2,TimeUnit.MINUTES);
		builder.writeTimeout(1,TimeUnit.MINUTES);
		builder.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888)));
		return builder;
	}
	@Bean
	public Headers header(){
	    Headers.Builder builder=new Headers.Builder();
	    builder.add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.84 Safari/537.36");
	    return builder.build();
    }

	@Bean
	@Scope("prototype")
	public Request.Builder requestBuilder() {
		Request.Builder builder=new Request.Builder();
		//builder.addHeader("UserEntity-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.84 Safari/537.36");
		builder.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.84 Safari/537.36");
		return builder;
	}
	@Bean
	public OkHttpClient okHttpClient(@Autowired OkHttpClient.Builder builder) {
		return builder.build();
	}
	
	@Bean
	@Scope("prototype")
	public OkTool okTool() {
		return new OkTool();
	}
}
