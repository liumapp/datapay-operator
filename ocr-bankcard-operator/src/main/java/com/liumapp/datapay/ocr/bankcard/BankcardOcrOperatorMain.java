package com.liumapp.datapay.ocr.bankcard;

import com.liumapp.datapay.ocr.bankcard.config.BankcardOcrOperatorConfig;
import com.liumapp.datapay.ocr.bankcard.tool.BankcardOcrOperator;
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
@Import({BankcardOcrOperatorConfig.class})
public class BankcardOcrOperatorMain {

    @Bean
    public BankcardOcrOperator bankcardOcrOperator() {
        return new BankcardOcrOperator();
    }

}
