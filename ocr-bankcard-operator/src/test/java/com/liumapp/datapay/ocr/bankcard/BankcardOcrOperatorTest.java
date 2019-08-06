package com.liumapp.datapay.ocr.bankcard;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.imageid.ImageOperatorMain;
import com.liumapp.datapay.ocr.bankcard.tool.BankcardOcrOperator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * file BankcardOcrOperatorTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/8/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BankcardOcrOperatorMain.class,ImageOperatorMain.class})
public class BankcardOcrOperatorTest {

    @Autowired
    private BankcardOcrOperator bankcardOcrOperator;

    private String DATA_PATH = "../data/";

    /**
     * {"code":"10000","data":{"cardname":"甲秀卡","acc_no":"8888888888888888","exp_month":0,"bankname":"贵阳银行股份有限公司(04437010)","exp_year":0,"type":"借记卡"},"seqNo":"1H33F4U31908051509","message":"成功"}
     */
    @Test
    public void carOcrTest() throws Exception {
        JSONObject handle = bankcardOcrOperator.handle(DATA_PATH + "bankcard.png");
        System.out.println(handle);
    }
}
