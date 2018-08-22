package com.liumapp.datapay.bankcard.bean;

import org.springframework.stereotype.Component;

/**
 * file BankcardApi.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/22
 */
@Component
public class BankcardApi {

    private String host;

    private String path;

    private String appkey;

    public BankcardApi() {
    }

    public BankcardApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public String getHost() {
        return host;
    }

    public BankcardApi setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPath() {
        return path;
    }

    public BankcardApi setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAppkey() {
        return appkey;
    }

    public BankcardApi setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
}
