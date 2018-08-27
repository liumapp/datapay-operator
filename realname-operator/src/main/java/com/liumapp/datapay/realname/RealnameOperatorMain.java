package com.liumapp.datapay.realname;

import com.liumapp.datapay.realname.config.RealnameOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * file RealnameOperatorMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@EnableAutoConfiguration
@Configuration
@Import({RealnameOperatorConfig.class})
public class RealnameOperatorMain {

    @Bean
    public RealnameOperator realnameOperator () {
        return new RealnameOperator();
    }

}
