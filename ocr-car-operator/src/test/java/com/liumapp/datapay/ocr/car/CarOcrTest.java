package com.liumapp.datapay.ocr.car;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.imageid.ImageOperatorMain;
import com.liumapp.datapay.ocr.car.tool.CarOperator;
import com.liumapp.qtools.file.base64.Base64FileTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;


/**
 * Created by haoxy on 2018/11/23.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CarOperatorMain.class,ImageOperatorMain.class})
public class CarOcrTest {

    @Autowired
    private CarOperator carOperator;

    private String DATA_PATH = "/Users/haoxiaoyong/Desktop";

    @Test
    public void carOcrTest() throws Exception {
        JSONObject handle = carOperator.handle(DATA_PATH + File.separator+ "car2.jpeg");
        System.out.println(handle);
    }
}
