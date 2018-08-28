package com.liumapp.datapay.face.config;

import com.liumapp.datapay.face.bean.FaceApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file FaceOperatorConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@Configuration
public class FaceOperatorConfig {

    @Bean("faceHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.face")
    public FaceApi faceApi () {
        FaceApi faceApi = new FaceApi();
        faceApi.setHost("http://api.chinadatapay.com/");
        faceApi.setPath("/communication/personal/2061");
        return faceApi;
    }

}
