package com.liumapp.datapay.phone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.phone.bean.PhoneApi;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * file PhoneOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@Component
public class PhoneOperator implements InitializingBean {

    @Resource(name = "phoneHttpTool")
    private HttpTool httpTool;

    @Resource
    private PhoneApi phoneApi;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    /**
     * 全网手机号码实名验证
     * @param name 姓名
     * @param idcard 身份证号码
     * @param mobile 手机号码
     * @return JSONObject {"code":"10000","data":{"state":"1"},"seqNo":"6131H3KG1808280851","message":"成功"}
     * seqNo 调用唯一标志
     * state 1:验证一致 2:验证不一致 3:异常
     * @throws Exception exception
     */
    public JSONObject handle (
            String name,
            String idcard,
            String mobile
    ) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("key", phoneApi.getAppkey());
        params.put("name", name);
        params.put("idcard", idcard);
        params.put("mobile", mobile);
        HttpResponse response = httpTool.doPost(
                phoneApi.getHost(),
                phoneApi.getPath(),
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
