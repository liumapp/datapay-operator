package com.liumapp.datapay.phone;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
public class PhoneOperatorMain {

    @Bean
    public PhoneOperator phoneOperator () {
        return new PhoneOperator();
    }

}
