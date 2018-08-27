package com.liumapp.datapay.phone.bean;

import org.springframework.stereotype.Component;

/**
 * file PhoneApi.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Component
public class PhoneApi {

    private String host;

    private String path;

    private String appkey;

    public PhoneApi() {
    }

    public PhoneApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public String getHost() {
        return host;
    }

    public PhoneApi setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPath() {
        return path;
    }

    public PhoneApi setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAppkey() {
        return appkey;
    }

    public PhoneApi setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
}
