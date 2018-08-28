package com.liumapp.datapay.phone;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * file PhoneOperatorTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PhoneOperatorMain.class})
public class PhoneOperatorTest {

    private boolean debug = true;

    @Autowired
    private PhoneOperator phoneOperator;

    @Test
    public void testHandle () throws Exception {
        if (debug) {
            JSONObject result = phoneOperator.handle("姓名", "身份证号码", "手机号码");
            System.out.println(result.toJSONString());
        }
    }

}
