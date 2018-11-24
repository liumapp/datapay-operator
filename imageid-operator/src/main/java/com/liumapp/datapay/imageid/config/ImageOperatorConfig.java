package com.liumapp.datapay.imageid.config;

import com.liumapp.datapay.imageid.bean.ImageApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by haoxy on 2018/11/24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Configuration
public class ImageOperatorConfig {

    @Bean("ocrHttpTool")
    public HttpTool httpTool() {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.haoxy.image")
    public ImageApi imageApi() {
        ImageApi imageApi = new ImageApi();
        imageApi.setHost("https://file.chinadatapay.com");
        imageApi.setPath("/img/upload");
        return imageApi;
    }
}
