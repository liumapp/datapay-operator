package com.liumapp.datapay.pic.config;

import com.liumapp.datapay.pic.bean.PicApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file PicOperatorConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@Configuration
public class PicOperatorConfig {

    @Bean("picHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.pic")
    public PicApi picApi () {
        PicApi picApi = new PicApi();
        picApi.setHost("http://file.chinadatapay.com/");
        picApi.setPath("/img/upload");
        return picApi;
    }

}
