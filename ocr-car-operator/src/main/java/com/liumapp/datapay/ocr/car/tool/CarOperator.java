package com.liumapp.datapay.ocr.car.tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.imageid.tool.ImageOperator;
import com.liumapp.datapay.ocr.bankcard.bean.CarApi;
import com.liumapp.datapay.ocr.bankcard.bean.ResBody;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by haoxy on 2018/11/23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Component
public class CarOperator {

    @Resource(name = "ocrHttpTool")
    private HttpTool httpTool;

    @Resource
    private CarApi carApi;

    @Autowired
    private ImageOperator imageOperator;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    public JSONObject handle(String carPhoto) throws Exception {
        JSONObject handle = imageOperator.handle(carPhoto);
        ResBody resBody = JSON.parseObject(String.valueOf(handle), ResBody.class);
        if (resBody.getSuccess()) {
            HashMap<String, String> params = new HashMap<>();
            params.put("key", carApi.getAppkey());
            params.put("imageId", resBody.getData());
            HttpResponse response = httpTool.doPost(carApi.getHost(),
                    carApi.getPath(),
                    "POST",
                    headers,
                    querys,
                    params);
            String res = EntityUtils.toString(response.getEntity());
            return JSON.parseObject(res);
        }
        return JSON.parseObject(String.valueOf(resBody));
    }
}
