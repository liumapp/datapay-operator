package com.liumapp.datapay.bankcard;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * file BankcardOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/22
 */
@Component
public class BankcardOperator {

    @Resource(name = "bankcardHttpTool")
    private HttpTool httpTool;

    public JSONObject handle () {
        JSONObject results = new JSONObject();

        return results;
    }



}
