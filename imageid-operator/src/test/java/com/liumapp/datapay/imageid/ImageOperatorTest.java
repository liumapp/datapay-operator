package com.liumapp.datapay.imageid;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.datapay.imageid.tool.ImageOperator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;

/**
 * Created by haoxy on 2018/11/24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ImageOperatorMain.class})
public class ImageOperatorTest {

    @Autowired
    private ImageOperator imageOperator;

    private String carPath = "/Users/haoxiaoyong/Desktop";

    @Test
    public void imageOperatorTest() throws IOException {
        JSONObject handle = imageOperator.handle(carPath + File.separator + "car2.jpeg");
        System.out.println(handle);
    }
}
