package com.liumapp.datapay.phone;

import com.liumapp.datapay.phone.config.PhoneOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * file PhoneOperatorMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@EnableAutoConfiguration
@Configuration
@Import({PhoneOperatorConfig.class})
public class PhoneOperatorMain {

    @Bean
    public PhoneOperator phoneOperator () {
        return new PhoneOperator();
    }

}
