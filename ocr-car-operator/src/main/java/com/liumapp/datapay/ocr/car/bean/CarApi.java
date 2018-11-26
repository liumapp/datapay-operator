package com.liumapp.datapay.ocr.car.bean;

import org.springframework.stereotype.Component;

/**
 * Created by haoxy on 2018/11/23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Component
public class CarApi {

    private String host;

    private String path;

    private String appkey;

    public CarApi() {
    }

    public CarApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public String getHost() {
        return host;
    }

    public CarApi setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPath() {
        return path;
    }

    public CarApi setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAppkey() {
        return appkey;
    }

    public CarApi setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
}
