package com.liumapp.datapay.ocr.dirve;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.imageid.ImageOperatorMain;
import com.liumapp.datapay.ocr.dirve.tool.DirveOperator;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by haoxy on 2018/11/29.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DirveOperatorMain.class,ImageOperatorMain.class})
public class TestDirveOperator {

    @Autowired
    private DirveOperator dirveOperator;

    private String DATA_PATH = "/Users/haoxiaoyong/Desktop";

    public void test() throws Exception {
        JSONObject handle = dirveOperator.handle(DATA_PATH + "car2.jpeg");
        System.out.println(handle);
    }
}
