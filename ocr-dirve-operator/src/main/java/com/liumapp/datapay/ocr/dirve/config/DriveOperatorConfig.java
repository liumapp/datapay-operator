package com.liumapp.datapay.ocr.dirve.config;

import com.liumapp.datapay.ocr.dirve.bean.DirveApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by haoxy on 2018/11/29.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Configuration
public class DriveOperatorConfig {

    @Bean("ocrHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.haoxy.drive")
    public DirveApi dirveApi(){
        DirveApi dirveApi=new DirveApi();
        dirveApi.setHost("http://api.chinadatapay.com/");
        dirveApi.setPath("trade/user/2132");
        return dirveApi;
    }

}
