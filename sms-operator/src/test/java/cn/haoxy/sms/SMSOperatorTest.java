package cn.haoxy.sms;

import cn.haoxy.sms.operator.SmsOperatorMain;
import cn.haoxy.sms.operator.model.Parameter;
import cn.haoxy.sms.operator.tool.SendSms;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    @Test
    public void sendSmsUtil(){
        Parameter parameter =new Parameter();
        parameter.setPhone("18758177074");
        parameter.setContent("您的验证码是：123456【放心签】");
        boolean status = sendSms.sendMessage(parameter);
        System.out.println(status);
    }

}
