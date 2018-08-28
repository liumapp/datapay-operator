package com.liumapp.datapay.pic;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * file PicOperatorMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@EnableAutoConfiguration
@Configuration
public class PicOperatorMain {

    @Bean
    public PicOperator picOperator () {
        return new PicOperator();
    }

}
