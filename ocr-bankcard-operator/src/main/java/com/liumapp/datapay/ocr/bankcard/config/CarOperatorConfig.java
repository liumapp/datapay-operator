package com.liumapp.datapay.ocr.bankcard.config;

import com.liumapp.datapay.ocr.bankcard.bean.CarApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by haoxy on 2018/11/23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Configuration
public class CarOperatorConfig {

    @Bean("ocrHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }
    @Bean
    @ConfigurationProperties(prefix = "com.haoxy.bankcard")
    public CarApi carApi(){
        CarApi carApi=new CarApi();
        carApi.setHost("http://api.chinadatapay.com/");
        carApi.setPath("trade/user/2009");
        return carApi;
    }
}
