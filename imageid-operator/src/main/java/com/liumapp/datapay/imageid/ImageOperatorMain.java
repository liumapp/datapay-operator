package com.liumapp.datapay.imageid;

import com.liumapp.datapay.imageid.config.ImageOperatorConfig;
import com.liumapp.datapay.imageid.tool.ImageOperator;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by haoxy on 2018/11/24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Configuration
@EnableAutoConfiguration
@Import({ImageOperatorConfig.class})
public class ImageOperatorMain {

    @Bean
    public ImageOperator imageOperator() {

        return new ImageOperator();
    }
}
