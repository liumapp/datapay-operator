package com.liumapp.datapay.ocr.bankcard;

import com.liumapp.datapay.ocr.bankcard.config.CarOperatorConfig;
import com.liumapp.datapay.ocr.bankcard.tool.BankcardOperator;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * file BankcardOperatorMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/8/5
 */
@EnableAutoConfiguration
@Configuration
@Import({CarOperatorConfig.class})
public class BankcardOperatorMain {

    @Bean
    public BankcardOperator bankcardOperator() {
        return new BankcardOperator();
    }

}
