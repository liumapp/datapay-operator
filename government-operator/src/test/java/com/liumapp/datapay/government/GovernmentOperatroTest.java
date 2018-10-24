package com.liumapp.datapay.government;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.government.status.EntTypeEnum;
import com.liumapp.datapay.government.status.TypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * file GovernmentOperatroTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GovernmentOperatorMain.class})
public class GovernmentOperatroTest {

    private boolean debug = false;

    @Autowired
    private GovernmentOperator governmentOperator;

    @Test
    public void testHandle () throws Exception {
        if (debug) {
            JSONObject result = governmentOperator.handle("企业名称", TypeEnum.NAME, EntTypeEnum.COMPANY);
            System.out.println(result.toJSONString());
        }
    }


}
