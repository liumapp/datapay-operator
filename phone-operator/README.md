# phone operator

全网手机三要素认证

## how to use

* 通过Maven加载依赖
                
        <dependency>
            <groupId>com.liumapp.datapay.phone</groupId>
            <artifactId>phone-operator</artifactId>
            <version>v2.0.4</version>
        </dependency>
                    
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                PhoneOperatorMain.class
        })        
        
* 配置app key

        com:
          liumapp:
            datapay:
              phone:
                appkey: your app key here
        
* 使用
      
      @Autowired
      private PhoneOperator phoneOperator;
      
      JSONObject result = phoneOperator.handle("姓名","身份证号码","手机号码");
                       
* 返回结果为

        {"code":"10000","data":{"state":"1"},"seqNo":"6131H3KG1808280851","message":"成功"}
        
        state 1:验证一致 2:验证不一致 3:异常
    
    
