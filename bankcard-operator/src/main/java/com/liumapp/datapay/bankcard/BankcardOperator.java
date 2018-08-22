package com.liumapp.datapay.bankcard;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.bankcard.config.BankcardOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * file BankcardOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/22
 */
@EnableAutoConfiguration
@Configuration
@Import({BankcardOperatorConfig.class})
public class BankcardOperator {

    public JSONObject handle () {
        JSONObject results = new JSONObject();
        return results;
    }

}
