# ocr dirve operator

行驶证OCR图片识别

## how to use

* 通过Maven加载依赖
                
        <dependency>
            <groupId>com.liumapp.datapay.ocr</groupId>
            <artifactId>ocr-dirve-operator</artifactId>
            <version>v2.0.4</version>
        </dependency>
                    
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                DirveOperatorMain.class,ImageOperatorMain.class
        })        
        
* 配置app key

        com:
          haoxy:
            dirve:
              appkey: your app key here
            image:
              appkey: your app key here  
* 使用

      @Autowired
      private DirveOperator dirveOperator;
      
      JSONObject handle = dirveOperator.handle("行驶证图片地址");
                       
* 返回结果为
  ```
    {
        "code":"10000",
        "message":"成功",
        "data":
        {
            "info_negative":
            {
                "recordId":"520111117121",
                "passengers":"",
                "overall_dimension":"46111111111486",
                "load_weight":"",
                "curb_weight":"",
                "cross_weight":"1675KG",
                "carNumber":"",
                "barcode":"*5261111119597*",
                "towing_capacity":"",
                "inspection_record":"检验有效期至2020年03月贵G(02)汽油",
                "note":""
            },
            "info_Positive":
            {
                "carType":"小型轿车",
                "model":"别克牌SG11111111",
                "address":"贵州省安顺市XXXXXXX13号",
                "engine":"181111104",
                "register_date":"2018-01-01",
                "use_Property":"非营运",
                "vin":"LSGKE54A7JW181031",
                "carNumber":"贵GMB954",
                "owner":"张三",
                "issue_date":"2018-01-01"
            }},
            "seqNo":"8473X9371810161357"
        }
```
    
* 注意

    * 在配置 appkey的时候需要同时配置 imageId-operator 的appkey,两者使用同一个appkey即可,
    
    * 在SpringBoot启动类上同时也要注入imageId-operator的Main.Class (ImageOperatorMain.class)
    
    * 使用imageId-operator目的主要是为了获取 imageId
    