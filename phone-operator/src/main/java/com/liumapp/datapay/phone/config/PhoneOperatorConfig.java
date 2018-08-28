package com.liumapp.datapay.phone.config;

import com.liumapp.datapay.phone.bean.PhoneApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file PhoneOperatorConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Configuration
public class PhoneOperatorConfig {

    @Bean("phoneHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.phone")
    public PhoneApi phoneApi () {
        PhoneApi phoneApi = new PhoneApi();
        phoneApi.setHost("http://api.chinadatapay.com/");
        phoneApi.setPath("/communication/personal/1979");
        return phoneApi;
    }

}
