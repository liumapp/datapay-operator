package com.liumapp.datapay.bankcard;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * file BankcardOperatorTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BankcardOperatorMain.class})
public class BankcardOperatorTest {

    private boolean debug = false;

    @Autowired
    private BankcardOperator bankcardOperator;

    /**
     * 银行卡四要素
     */
    @Test
    public void testHandle () throws Exception {
        if (debug) {
            JSONObject result = bankcardOperator.handle(
                    "姓名",
                    "身份证号码",
                    "银行卡号码",
                    "手机号码");
            System.out.println(result.toJSONString());
        }
    }

    /**
     * 银行卡三要素
     */
    @Test
    public void testHandle2 () throws Exception {
        if (debug) {
            JSONObject result = bankcardOperator.handle(
                    "姓名",
                    "身份证号码",
                    "银行卡号码");
            System.out.println(result.toJSONString());
        }
    }

}
