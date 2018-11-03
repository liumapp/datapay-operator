package com.liumapp.datapay.realname;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.realname.bean.RealnameApi;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * file RealnameOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Component
public class RealnameOperator implements InitializingBean {

    @Resource(name = "realnameHttpTool")
    private HttpTool httpTool;

    @Resource
    private RealnameApi realnameApi;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    /**
     * 公安部实名认证
     *
     * @param name   姓名
     * @param idcard 身份证号码
     * @return json object  {"code":"10000","data":{"result":"1"},"seqNo":"DVGNHTXG1808270952","message":"成功"}
     * result:1 验证结果一致 result:2 验证结果不一致 result:3 出现异常
     */
    public JSONObject handle(
            String name,
            String idcard
    ) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("key", realnameApi.getAppkey());
        params.put("name", name);
        params.put("idcard", idcard);
        HttpResponse response = httpTool.doPost(
                realnameApi.getHost(),
                realnameApi.getPath(),
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
