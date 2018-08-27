package com.liumapp.datapay.government.config;

import com.liumapp.datapay.government.bean.GovernmentApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file GovernmentOperatorConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Configuration
public class GovernmentOperatorConfig {

    @Bean("governmentHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.government")
    public GovernmentApi governmentApi () {
        GovernmentApi governmentApi = new GovernmentApi();
        governmentApi.setHost("http://api.chinadatapay.com/");
        governmentApi.setPath("/government/economic/2130");
        return governmentApi;
    }

}
