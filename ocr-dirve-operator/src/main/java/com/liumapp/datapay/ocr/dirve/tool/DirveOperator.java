package com.liumapp.datapay.ocr.dirve.tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.imageid.tool.ImageOperator;
import com.liumapp.datapay.ocr.dirve.bean.DirveApi;
import com.liumapp.datapay.ocr.dirve.bean.ResBody;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by haoxy on 2018/11/29.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Component
public class DirveOperator {

    @Resource
    private DirveApi dirveApi;

    @Resource(name = "ocrHttpTool")
    private HttpTool httpTool;

    @Autowired
    private ImageOperator imageOperator;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    public JSONObject handle(String carPhoto) throws Exception {
        JSONObject handle = imageOperator.handle(carPhoto);
        ResBody resBody = JSON.parseObject(String.valueOf(handle), ResBody.class);
        if (resBody.getSuccess()) {
            HashMap<String, String> params = new HashMap<>();
            params.put("key", dirveApi.getAppkey());
            params.put("imageId", resBody.getData());
            HttpResponse response = httpTool.doPost(dirveApi.getHost(),
                    dirveApi.getPath(),
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
