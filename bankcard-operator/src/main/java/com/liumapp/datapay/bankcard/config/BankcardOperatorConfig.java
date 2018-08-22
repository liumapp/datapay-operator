package com.liumapp.datapay.bankcard.config;

import com.liumapp.qtools.http.HttpTool;
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


}
