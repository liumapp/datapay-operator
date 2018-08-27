package com.liumapp.datapay.government;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.government.bean.GovernmentApi;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * file GovernmentOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Component
public class GovernmentOperator implements InitializingBean {

    @Resource(name = "governmentHttpTool")
    private HttpTool httpTool;

    @Resource
    private GovernmentApi governmentApi;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    /**
     * 处理银行验证信息
     * @param name 企业名称
     * @return json object  {"code":"10000","data":{"result":"1"},"seqNo":"DVGNHTXG1808270952","message":"成功"}
     * result:1 验证结果一致 result:2 验证结果不一致 result:3 出现异常
     */
    public JSONObject handle (
            String name
    ) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("key", governmentApi.getAppkey());
        params.put("name", name);
        HttpResponse response = httpTool.doPost(
                governmentApi.getHost(),
                governmentApi.getPath(),
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
