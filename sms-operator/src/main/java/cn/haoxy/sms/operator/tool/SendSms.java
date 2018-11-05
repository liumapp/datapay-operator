package cn.haoxy.sms.operator.tool;

import cn.haoxy.sms.operator.bean.SmsApi;
import cn.haoxy.sms.operator.model.Parameter;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static cn.haoxy.sms.operator.tool.HttpPost.httpPost;

/**
 * Created by haoxy on 2018/11/3.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Component
public class SendSms {

    @Resource
    private SmsApi smsApi;

    /**
     * 单个发送
     * @param parameter
     * @return
     */
    public boolean sendMessage(Parameter parameter) {
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("userCode", smsApi.getUserCode()));
        nvps.add(new BasicNameValuePair("userPass", smsApi.getUserPass()));
        nvps.add(new BasicNameValuePair("DesNo", parameter.getPhone()));
        nvps.add(new BasicNameValuePair("Msg", parameter.getContent()));
        nvps.add(new BasicNameValuePair("Channel", "0"));
        String post = httpPost(smsApi.getUrl(), nvps);  //post请求
        if (post.contains("23")) {
            return true;
        }
        return false;
    }

    /**
     * 群发
     * @param parameter
     * @return
     */
    public boolean sendGroupMessage(Parameter parameter) {
        List<String> phones = parameter.getPhones();
        String post = null;
        for (String phone : phones) {
            List<NameValuePair> nvps = new ArrayList<>();
            nvps.add(new BasicNameValuePair("userCode", smsApi.getUserCode()));
            nvps.add(new BasicNameValuePair("userPass", smsApi.getUserPass()));
            nvps.add(new BasicNameValuePair("DesNo", phone));
            nvps.add(new BasicNameValuePair("Msg", parameter.getContent()));
            nvps.add(new BasicNameValuePair("Channel", "0"));
            post = httpPost(smsApi.getUrl(), nvps);  //post请求
        }
        if (post.contains("23")) {
            return true;
        }
        return false;
    }

    /**
     * 发送语音
     * @param parameter
     * @return
     */
    public boolean sendSpeechMessage(Parameter parameter){
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("userCode", smsApi.getUserCode()));
        nvps.add(new BasicNameValuePair("userPass", smsApi.getUserPass()));
        nvps.add(new BasicNameValuePair("DesNo", parameter.getPhone()));
        nvps.add(new BasicNameValuePair("VoiceCode", parameter.getContent()));
        nvps.add(new BasicNameValuePair("Channel", "999"));
        nvps.add(new BasicNameValuePair("amount", "1"));
        String post=httpPost(smsApi.getUrl(),nvps);  //post请求
        if (post.contains("21")) {
            return true;
        }
        return false;
    }
}
