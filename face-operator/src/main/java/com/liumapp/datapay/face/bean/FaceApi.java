package com.liumapp.datapay.face.bean;

import org.springframework.stereotype.Component;

/**
 * file FaceApi.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/23
 */
@Component
public class FaceApi {

    private String host;

    private String path;

    private String appkey;

    public FaceApi() {
    }

    public FaceApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public String getHost() {
        return host;
    }

    public FaceApi setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPath() {
        return path;
    }

    public FaceApi setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAppkey() {
        return appkey;
    }

    public FaceApi setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
}
