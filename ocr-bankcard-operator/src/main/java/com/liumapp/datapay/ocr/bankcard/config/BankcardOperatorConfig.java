package com.liumapp.datapay.ocr.bankcard.config;

import com.liumapp.datapay.ocr.bankcard.bean.BankcardApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file BankcardOperatorConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/8/5
 */
@Configuration
public class BankcardOperatorConfig {

    @Bean("ocrHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }
    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.bankcard")
    public BankcardApi carApi(){
        BankcardApi bankcardApi = new BankcardApi();
        bankcardApi.setHost("http://api.chinadatapay.com/");
        bankcardApi.setPath("trade/user/1986");
        return bankcardApi;
    }
}
