package com.liumapp.datapay.pic;

import com.liumapp.datapay.pic.config.PicOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
@Import({PicOperatorConfig.class})
public class PicOperatorMain {

    @Bean
    public PicOperator picOperator () {
        return new PicOperator();
    }

}
