# bankcard ocr operator

银行卡OCR图片识别

## how to use

* 通过Maven加载依赖
                
        <dependency>
            <groupId>com.liumapp.datapay.ocr.bankcard</groupId>
            <artifactId>ocr-bankcard-operator</artifactId>
            <version>v2.0.5</version>
        </dependency>
                    
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                BankcardOcrOperatorMain.class,ImageOperatorMain.class
        })        
        
* 配置app key

        com:
          haoxy:
            image:
              appkey:
          liumapp:
            datapay:
              ocr:
                bankcard:
                  appKey:
        
          
* 使用

      @Autowired
      private BankcardOcrOperator bankcardOcrOperator;
      
      JSONObject handle = bankcardOcrOperator.handle("银行卡图片地址");
                       
* 返回结果为

  
    {"code":"10000","data":{"cardname":"甲秀卡","acc_no":"8888888888888888","exp_month":0,"bankname":"贵阳银行股份有限公司(04437010)","exp_year":0,"type":"借记卡"},"seqNo":"1H33F4U31908051509","message":"成功"}

* 注意

    * 在配置 appkey的时候需要同时配置 imageId-operator 的appkey,两者使用同一个appkey即可,
    
    * 在SpringBoot启动类上同时也要注入imageId-operator的Main.Class (ImageOperatorMain.class)
    
    * 使用imageId-operator目的主要是为了获取 imageId
    