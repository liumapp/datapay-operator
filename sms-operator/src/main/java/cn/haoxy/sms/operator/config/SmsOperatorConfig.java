package cn.haoxy.sms.operator.config;

import cn.haoxy.sms.operator.bean.SmsApi;
import com.liumapp.qtools.http.HttpTool;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by haoxy on 2018/11/3.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Configuration
public class SmsOperatorConfig {

    @Bean("realnameHttpTool")
    public HttpTool httpTool() {
        return new HttpTool();
    }

    @Bean
    @ConfigurationProperties(prefix = "com.haoxy.sms")
    public SmsApi smsApi() {
        SmsApi smsApi = new SmsApi();
        smsApi.setUserCode("xxxx");//这里填写用户名
        smsApi.setUserPass("xxxx");//这里填写密码
        smsApi.setUrl("http://120.55.197.77:1210/Services/MsgSend.asmx/SendMsg");
        return smsApi;
    }
}
