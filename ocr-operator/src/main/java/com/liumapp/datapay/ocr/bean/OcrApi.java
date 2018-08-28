package com.liumapp.datapay.ocr.bean;

import org.springframework.stereotype.Component;

/**
 * file OcrApi.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@Component
public class OcrApi {

    private String host;

    private String path;

    private String appkey;

    public OcrApi() {
    }

    public OcrApi(String host, String path, String appkey) {
        this.host = host;
        this.path = path;
        this.appkey = appkey;
    }

    public String getHost() {
        return host;
    }

    public OcrApi setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPath() {
        return path;
    }

    public OcrApi setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAppkey() {
        return appkey;
    }

    public OcrApi setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
}
