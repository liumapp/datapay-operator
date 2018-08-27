package com.liumapp.datapay.realname.bean;

import org.springframework.stereotype.Component;

/**
 * file RealnameApi.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Component
public class RealnameApi {

    private String host;

    private String path;

    private String appkey;

    public RealnameApi() {
    }

    public RealnameApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public String getHost() {
        return host;
    }

    public RealnameApi setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPath() {
        return path;
    }

    public RealnameApi setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAppkey() {
        return appkey;
    }

    public RealnameApi setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
}
