package com.liumapp.datapay.ocr.bankcard;

import com.liumapp.datapay.ocr.bankcard.config.CarOperatorConfig;
import com.liumapp.datapay.ocr.bankcard.tool.CarOperator;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by haoxy on 2018/11/23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@EnableAutoConfiguration
@Configuration
@Import({CarOperatorConfig.class})
public class CarOperatorMain {

    @Bean
    public CarOperator carOperator() {
        return new CarOperator();
    }

}
