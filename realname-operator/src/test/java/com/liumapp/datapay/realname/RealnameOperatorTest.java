package com.liumapp.datapay.realname;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * file RealnameOperatorTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RealnameOperatorMain.class})
public class RealnameOperatorTest {

    private boolean debug = true;

    @Autowired
    private RealnameOperator realnameOperator;

    @Test
    public void testHandle () throws Exception {
        if (debug) {
            JSONObject result = realnameOperator.handle("姓名","身份证号码");
            System.out.println(result.toJSONString());
        }
    }

}
