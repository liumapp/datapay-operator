package com.liumapp.datapay.bankcard;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.bankcard.bean.BankcardApi;
import com.liumapp.qtools.http.HttpTool;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * file BankcardOperator.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/22
 */
@Component
public class BankcardOperator implements InitializingBean {

    @Resource(name = "bankcardHttpTool")
    private HttpTool httpTool;

    @Resource
    private BankcardApi bankcardApi;

    public Map<String, String> headers = new HashMap<String, String>();

    public Map<String, String> querys = new HashMap<String, String>();

    /**
     * 处理银行验证信息
     * @param name 姓名
     * @param idcard 身份证号码
     * @param accNo 银行卡号
     * @param mobile 手机号
     * @return json object
     */
    public JSONObject handle (
            String name,
            String idcard,
            String accNo,
            String mobile
    ) throws Exception {
        JSONObject params = new JSONObject();
        params.put("name", name);
        params.put("idcard", idcard);
        params.put("acc_no", accNo);
        params.put("mobile", mobile);
        String bodys = params.toJSONString();
        HttpResponse response = httpTool.doPost(
                bankcardApi.getHost(),
                bankcardApi.getPath(),
                "POST",
                headers,
                querys,
                bodys);
        String res = EntityUtils.toString(response.getEntity());
        return JSON.parseObject(res);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        headers.put("Content-Type", "application/json");
    }
}
