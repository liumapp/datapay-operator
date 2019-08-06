# ocr car operator

驾驶证OCR图片识别

## how to use

* 通过Maven加载依赖
                
        <dependency>
            <groupId>com.liumapp.datapay.ocr</groupId>
            <artifactId>ocr-car-operator</artifactId>
            <version>v2.0.5</version>
        </dependency>
                    
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                CarOperatorMain.class,ImageOperatorMain.class
        })        
        
* 配置app key

        com:
          haoxy:
            car:
              appkey: your app key here
            image:
              appkey: your app key here  
* 使用

      @Autowired
      private CarOperator carOperator;
      
      JSONObject handle = carOperator.handle("驾驶证图片地址");
                       
* 返回结果为

  
    {"code":"10000","data":{"info_negative":{},"info_Positive":{"birthday":"1973-10-27","end_date":"2025-09-18","address":"山西省定襄县横山村673号","nationality":"中国","firstGetDocDate":"2003-09-18","sex":"男","idcard":"14222219***0271214","begin_date":"2015-09-18","name":"小王","type":"A2"}},"seqNo":"ACB4L6B81811241608","message":"成功"}
        
  
  
    {
      "code": "10000",
      "message": "成功",
      "info_Positive": {
        "birthday": "1973-10-27",
        "sex": "男",
        "address": "山西省定**山村673号",
        "name": "小王",
        "idcard":"142222****271214",
        "image": "",
        "nation": "汉",
        "end_date":"2025-09-18",
        "nationality":"中国",
        "firstGetDocDate":"2003-09-18",
        "type":"A2"
      },
      "seqNo": "58J089A41709121914"
    }

* 注意

    * 在配置 appkey的时候需要同时配置 imageId-operator 的appkey,两者使用同一个appkey即可,
    
    * 在SpringBoot启动类上同时也要注入imageId-operator的Main.Class (ImageOperatorMain.class)
    
    * 使用imageId-operator目的主要是为了获取 imageId
    