package cn.haoxy.sms;

import com.liumapp.datapay.sms.SmsOperatorMain;
import com.liumapp.datapay.sms.model.Parameter;
import com.liumapp.datapay.sms.tool.SendSms;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * Created by haoxy on 2018/11/3.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SmsOperatorMain.class})
public class SMSOperatorTest {

    @Autowired
    private SendSms sendSms;

    /**
     * 测试单个发送
     */
    @Test
    public void sendSmsUtil() {
        Parameter parameter = new Parameter();
        parameter.setPhone("18758177074");
        parameter.setContent("这是短信内容");
        boolean status = sendSms.sendMessage(parameter);
        System.out.println(status);
    }

    /**
     * 测试群发
     */
    @Test
    public void sendGroupMsg() {
        Parameter parameter = new Parameter();
        List<String> phones = new ArrayList();
        phones.add("18758177074");
        phones.add("17754018813");
        parameter.setPhones(phones);
        parameter.setContent("这是短信内容 【放心签】");
        boolean b = sendSms.sendGroupMessage(parameter);
        System.out.println(b);
    }
    /**
     * 测试语音发送
     * 暂时不能使用
     */
    @Test
    public void sendSpeechMessage(){
        Parameter parameter=new Parameter();
        parameter.setContent("23456");
        parameter.setPhone("18758177074");
        boolean b = sendSms.sendSpeechMessage(parameter);
        System.out.println(b);
    }
}
