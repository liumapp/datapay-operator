package com.liumapp.datapay.ocr;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.ocr.bean.OcrApi;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * file OcrOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@Component
public class OcrOperator implements InitializingBean {

    @Resource(name = "ocrHttpTool")
    private HttpTool httpTool;

    @Resource
    private OcrApi ocrApi;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    /**
     * OCR 识别图片文字信息
     * @param photo 图片的Base64
     * @return JSONObject
     * @throws Exception exception
     *
     */
    public JSONObject handle (
            String photo
    ) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("key", ocrApi.getAppkey());
        params.put("photo", photo);
        HttpResponse response = httpTool.doPost(
                ocrApi.getHost(),
                ocrApi.getPath(),
                "POST",
                headers,
                querys,
                params);
        String res = EntityUtils.toString(response.getEntity());
        return JSON.parseObject(res);
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }


}
