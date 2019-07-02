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

    /**
     * 银行卡四要素接口地址
     */
    private String path;

    /**
     * 银行卡三要素接口地址
     */
    private String path2;

    private String appkey;

    public BankcardApi() {
    }

    public BankcardApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public BankcardApi(String host, String path, String path2, String appkey) {
        this.host = host;
        this.path = path;
        this.path2 = path2;
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

    public String getPath2() {
        return path2;
    }

    public BankcardApi setPath2(String path2) {
        this.path2 = path2;
        return this;
    }
}
