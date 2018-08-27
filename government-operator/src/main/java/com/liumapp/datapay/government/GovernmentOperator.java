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
     * @return json object  {"code":"10000","data":{"basic":{"esdate":"成立日期","regno":"注册号","creditcode":"统一信用代码","dom":"住址","zsopscope":"经营业务范围","reccap":"实收资本","oriregno":"原注册号码","entnameeng":"企业英文名称","enttype":"企业类型","ancheyear":"最后年检时间","opto":"经营期限至","regcapcur":"注册资本币种","opfrom":"经营期限自","orgcodes":"组织机构代码","candate":"注销日期","entname":"企业名称","regcap":"注册资本（万元）","regorg":"登记机关","tel":"联系人电话","revdate":"吊销日期","entstatus":"经营状态","regorgcode":"注册地址行政编号","abuitem":"许可经营项目","frname":"法定代表人"}},"seqNo":"6B7UASIK1808271435","message":"成功"}
     * code 10000:成功; 10001:查询失败; 10002:企业数据为空
     * esdate 成立日期
     * regno 注册号
     * creditcode 统一信用代码
     * dom 住址
     * zsopscope 经营业务范围
     * reccap 实收资本
     * oriregno 原注册号
     * entnameeng 企业英文名称
     * enttype 企业类型
     * ancheyear 最后年检时间
     * opto 经营期限至
     * regcapcur 注册资本币种
     * opfrom 经营期限自
     * orgcodes 组织机构代码
     * candate 注销日期
     * entname 企业名称
     * regcap 注册资本（万元）
     * regorg 登记机关
     * tel 联系人电话
     * revdate 吊销日期
     * entstatus 经营状态
     * regorgcode 注册地址行政编号
     * abuitem 许可经营项目
     * frname 法定代表人
     * seqNo 调用唯一标志
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
