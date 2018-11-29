package com.liumapp.datapay.ocr.dirve;

import com.liumapp.datapay.ocr.dirve.config.DriveOperatorConfig;
import com.liumapp.datapay.ocr.dirve.tool.DirveOperator;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by haoxy on 2018/11/29.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@EnableAutoConfiguration
@Configuration
@Import({DriveOperatorConfig.class})
public class DirveOperatorMain {

    @Bean
    public DirveOperator dirveOperator() {
        return new DirveOperator();
    }
}
