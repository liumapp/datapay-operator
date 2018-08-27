package com.liumapp.datapay.government.bean;

import org.springframework.stereotype.Component;

/**
 * file GovernmentApi.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Component
public class GovernmentApi {

    private String host;

    private String path;

    private String appkey;

    public GovernmentApi() {
    }

    public GovernmentApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public String getHost() {
        return host;
    }

    public GovernmentApi setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPath() {
        return path;
    }

    public GovernmentApi setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAppkey() {
        return appkey;
    }

    public GovernmentApi setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }

}
