package com.liumapp.datapay.ocr.config;

import com.liumapp.datapay.ocr.bean.OcrApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file OcrOperatorConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@Configuration
public class OcrOperatorConfig {

    @Bean("ocrHttpTool")
    public HttpTool httpTool () {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.liumapp.datapay.ocr")
    public OcrApi ocrApi () {
        OcrApi ocrApi = new OcrApi();
        ocrApi.setHost("http://api.chinadatapay.com/");
        ocrApi.setPath("/trade/user/1985");
        return ocrApi;
    }

}
