# reaulename operator

公安部实名认证接口

## how to use

* 通过Maven加载依赖
        
        <dependency>
            <groupId>com.liumapp.datapay.realname</groupId>
            <artifactId>realname-operator</artifactId>
            <version>v2.0.0</version>
        </dependency>
        
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                RealnameOperatorMain.class
        })        
        
* 配置app key

        com:
          liumapp:
            datapay:
              realname:
                appkey: your app key here
        
* 使用

        @Autowired
        private RealnameOperator realnameOperator;
        
        JSONObject result = realnameOperator.handle("姓名","身份证号码");
                       
* 返回结果为

        {"code":"10000","data":{"result":"1"},"seqNo":"DVGNHTXG1808270952","message":"成功"}
        
        result:1 验证结果一致 result:2 验证结果不一致 result:3 出现异常
    
    
