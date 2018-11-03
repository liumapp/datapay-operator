package cn.haoxy.sms.operator;

import cn.haoxy.sms.operator.config.SmsOperatorConfig;
import cn.haoxy.sms.operator.tool.SendSms;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by haoxy on 2018/11/3.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@EnableAutoConfiguration
@Configuration
@Import({SmsOperatorConfig.class})
public class SmsOperatorMain {

    @Bean
    public SendSms sendSms(){
       return new SendSms();
    }
}
