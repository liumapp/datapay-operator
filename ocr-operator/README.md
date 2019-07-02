# ocr operator

身份证OCR图片识别

## how to use

* 通过Maven加载依赖
                
        <dependency>
            <groupId>com.liumapp.datapay.ocr</groupId>
            <artifactId>ocr-operator</artifactId>
            <version>v2.0.3</version>
        </dependency>
                    
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                OcrOperatorMain.class
        })        
        
* 配置app key

        com:
          liumapp:
            datapay:
              ocr:
                appkey: your app key here
        
* 使用

      @Autowired
      private OcrOperator ocrOperator;
      
      JSONObject result = ocrOperator.handle(Base64FileTool.filePathToBase64("证书图片文件地址"));
                       
* 返回结果为

        {"code":"10000","data":{"birthday":"1654年05月04日","image":"","address":"北京市东城区景山前街4号紫禁城乾清宫","nation":"满","sex":"男","idcard":"000003165405049842","name":"爱新觉罗·玄烨"},"seqNo":"U7LD6MMV1808281147","message":"成功"}
        
    * birthday 出生日期
    * address 住址
    * nation 名族
    * sex 性别
    * idcard 身份证号码
    * name 姓名
    * seqNo 调用唯一标志

