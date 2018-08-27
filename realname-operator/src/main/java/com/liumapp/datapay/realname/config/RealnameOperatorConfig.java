package com.liumapp.datapay.realname.config;

import com.liumapp.datapay.realname.bean.RealnameApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file RealnameOperatorConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Configuration
public class RealnameOperatorConfig {

    @Bean("realnameHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.realname")
    public RealnameApi realnameApi () {
        RealnameApi realnameApi = new RealnameApi();
        realnameApi.setHost("http://api.chinadatapay.com/");
        realnameApi.setPath("/communication/personal/1882");
        return realnameApi;
    }

}
