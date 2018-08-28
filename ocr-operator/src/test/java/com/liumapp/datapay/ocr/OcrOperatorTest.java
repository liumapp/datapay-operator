package com.liumapp.datapay.ocr;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.qtools.file.base64.Base64FileTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * file OcrOperatorTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OcrOperatorMain.class})
public class OcrOperatorTest {

    private boolean debug = true;

    private String dataPath = "/usr/local/tomcat/project/datapay-operator/data/";

    @Autowired
    private OcrOperator ocrOperator;

    @Test
    public void testHandle () throws Exception {
        if (debug) {
            JSONObject result = ocrOperator.handle(Base64FileTool.filePathToBase64(dataPath + "testIdCard.jpeg"));
            System.out.println(result.toJSONString());
        }
    }

}
