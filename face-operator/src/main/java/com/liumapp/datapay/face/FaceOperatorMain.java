package com.liumapp.datapay.face;

import com.liumapp.datapay.face.config.FaceOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * file FaceOperatorMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/23
 */
@EnableAutoConfiguration
@Configuration
@Import({FaceOperatorConfig.class})
public class FaceOperatorMain {

    @Bean
    public FaceOperator faceOperator () {
        return new FaceOperator();
    }
}
