package com.liumapp.datapay.imageid.tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.imageid.bean.ImageApi;

import javax.annotation.Resource;
import java.io.IOException;


/**
 * Created by haoxy on 2018/11/24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class ImageOperator implements Constant {

    @Resource
    private ImageApi imageApi;

    public JSONObject handle(String carPath) throws IOException {
        String responseString = HttpPostUtils.HttpPost(
                carPath,
                imageApi.getHost(),
                imageApi.getPath(),
                imageApi.getAppkey()
        );
        return JSON.parseObject(responseString);
    }
}
