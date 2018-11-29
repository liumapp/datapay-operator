package com.liumapp.datapay.ocr.dirve.bean;

import org.springframework.stereotype.Component;

/**
 * Created by haoxy on 2018/11/29.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Component
public class DirveApi {

    private String host;

    private String path;

    private String appkey;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    @Override
    public String toString() {
        return "DirveApi{" +
                "host='" + host + '\'' +
                ", path='" + path + '\'' +
                ", appkey='" + appkey + '\'' +
                '}';
    }
}
