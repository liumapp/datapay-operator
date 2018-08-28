package com.liumapp.datapay.face;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.face.bean.FaceApi;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * file FaceOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/23
 */
@Component
public class FaceOperator implements InitializingBean {

    @Resource(name = "faceHttpTool")
    private HttpTool httpTool;

    @Resource
    private FaceApi faceApi;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    /**
     * 人脸比对接口
     * @param name 姓名
     * @param idcard 身份证号码
     * @param image 图片Base64值
     * @return JSONObject
     * @throws Exception exception
     */
    public JSONObject handle (
            String name,
            String idcard,
            String image
    ) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("key", faceApi.getAppkey());
        params.put("name", name);
        params.put("idcard", idcard);
        params.put("image", image);
        HttpResponse response = httpTool.doPost(
                faceApi.getHost(),
                faceApi.getPath(),
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
