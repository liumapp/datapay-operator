package com.liumapp.datapay.ocr;

import com.liumapp.datapay.ocr.config.OcrOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * file OcrOperatorMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@EnableAutoConfiguration
@Configuration
@Import({OcrOperatorConfig.class})
public class OcrOperatorMain {

    @Bean
    public OcrOperator ocrOperator () {
        return new OcrOperator();
    }

}
