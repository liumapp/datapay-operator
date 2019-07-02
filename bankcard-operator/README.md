# bankcard-operator 

银行卡四要素实名认证

## how to use

* 通过Maven加载依赖
        
        <dependency>
            <groupId>com.liumapp.datapay.bankcard</groupId>
            <artifactId>bankcard-operator</artifactId>
            <version>v2.0.3</version>
        </dependency>
        
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                BankcardOperatorMain.class
        })        
        
* 配置app key

        com:
          liumapp:
            datapay:
              bankcard:
                appkey: your app key here

* 使用

    银行卡四要素使用
        
        @Autowired
        private BankcardOperator bankcardOperator;

        JSONObject result = bankcardOperator.handle(
                       "姓名",
                       "身份证号码",
                       "银行卡号码",
                       "手机号码");  
                       
    返回结果为

        {"code":"10000","data":{"state":"1"},"seqNo":"IQ4M30TT1808230932","message":"成功"}
                
         state:1 验证结果一致 state:2 验证结果不一致 state:3 出现异常
    
    银行卡三要素使用
    
        @Autowired
        private BankcardOperator bankcardOperator;

        JSONObject result = bankcardOperator.handle(
                       "姓名",
                       "身份证号码",
                       "银行卡号码");
                       
    返回结果为：                       

        {"code":"10000","data":{"state":"1"},"seqNo":"IQ4M30TT1808230932","message":"成功"}
                    
        state:1 验证结果一致 state:2 验证结果不一致 state:3 出现异常
                                
