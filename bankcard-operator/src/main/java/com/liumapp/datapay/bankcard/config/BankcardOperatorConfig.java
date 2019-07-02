package com.liumapp.datapay.bankcard.config;

import com.liumapp.datapay.bankcard.bean.BankcardApi;
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
 * date 2018/8/22
 */
@Configuration
public class BankcardOperatorConfig {

    @Bean("bankcardHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.bankcard")
    public BankcardApi bankcardApi () {
        BankcardApi bankcardApi = new BankcardApi();
        bankcardApi.setHost("http://api.chinadatapay.com/");
        bankcardApi.setPath("/communication/personal/1887");
        bankcardApi.setPath2("/communication/personal/1886");
        return bankcardApi;
    }



}
