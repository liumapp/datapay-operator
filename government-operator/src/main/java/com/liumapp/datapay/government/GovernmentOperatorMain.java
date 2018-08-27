package com.liumapp.datapay.government;

import com.liumapp.datapay.government.config.GovernmentOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * file GovernmentOperatorMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@EnableAutoConfiguration
@Configuration
@Import({GovernmentOperatorConfig.class})
public class GovernmentOperatorMain {

    @Bean
    public GovernmentOperator governmentOperator () {
        return new GovernmentOperator();
    }

}
